package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.VolleyLog;
import flm.aka;
import flm.akb;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DiskBasedCache implements Cache {
    private final Map a;
    private long b;
    private final File c;
    private final int d;

    public DiskBasedCache(File file, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = file;
        this.d = i;
    }

    public DiskBasedCache(File file) {
        this(file, 5242880);
    }

    @Override // com.android.volley.Cache
    public synchronized Cache.Entry get(String str) {
        Cache.Entry entry;
        aka akaVar = (aka) this.a.get(str);
        if (akaVar == null) {
            entry = null;
        } else {
            File fileForKey = getFileForKey(str);
            try {
                akb akbVar = new akb(new BufferedInputStream(a(fileForKey)), fileForKey.length());
                try {
                    aka akaVarA = aka.a(akbVar);
                    if (!TextUtils.equals(str, akaVarA.b)) {
                        VolleyLog.d("%s: key=%s, found=%s", fileForKey.getAbsolutePath(), str, akaVarA.b);
                        b(str);
                        akbVar.close();
                        entry = null;
                    } else {
                        byte[] bArrA = a(akbVar, akbVar.a());
                        Cache.Entry entry2 = new Cache.Entry();
                        entry2.data = bArrA;
                        entry2.etag = akaVar.c;
                        entry2.serverDate = akaVar.d;
                        entry2.lastModified = akaVar.e;
                        entry2.ttl = akaVar.f;
                        entry2.softTtl = akaVar.g;
                        List<Header> list = akaVar.h;
                        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                        for (Header header : list) {
                            treeMap.put(header.getName(), header.getValue());
                        }
                        entry2.responseHeaders = treeMap;
                        entry2.allResponseHeaders = Collections.unmodifiableList(akaVar.h);
                        akbVar.close();
                        entry = entry2;
                    }
                } catch (Throwable th) {
                    akbVar.close();
                    throw th;
                }
            } catch (IOException e) {
                VolleyLog.d("%s: %s", fileForKey.getAbsolutePath(), e.toString());
                remove(str);
                entry = null;
            }
        }
        return entry;
    }

    @Override // com.android.volley.Cache
    public synchronized void initialize() {
        if (!this.c.exists()) {
            if (!this.c.mkdirs()) {
                VolleyLog.e("Unable to create cache dir %s", this.c.getAbsolutePath());
            }
        } else {
            File[] fileArrListFiles = this.c.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        akb akbVar = new akb(new BufferedInputStream(a(file)), length);
                        try {
                            aka akaVarA = aka.a(akbVar);
                            akaVarA.a = length;
                            a(akaVarA.b, akaVarA);
                            akbVar.close();
                        } catch (Throwable th) {
                            akbVar.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        file.delete();
                    }
                }
            }
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void put(String str, Cache.Entry entry) {
        int i;
        int i2 = 0;
        synchronized (this) {
            if (this.b + ((long) entry.data.length) <= this.d || entry.data.length <= this.d * 0.9f) {
                File fileForKey = getFileForKey(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileForKey));
                    aka akaVar = new aka(str, entry);
                    if (!akaVar.a(bufferedOutputStream)) {
                        bufferedOutputStream.close();
                        VolleyLog.d("Failed to write header for %s", fileForKey.getAbsolutePath());
                        throw new IOException();
                    }
                    bufferedOutputStream.write(entry.data);
                    bufferedOutputStream.close();
                    akaVar.a = fileForKey.length();
                    a(str, akaVar);
                    if (this.b >= this.d) {
                        if (VolleyLog.DEBUG) {
                            VolleyLog.v("Pruning old cache entries.", new Object[0]);
                        }
                        long j = this.b;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.a.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i = i2;
                                break;
                            }
                            aka akaVar2 = (aka) ((Map.Entry) it.next()).getValue();
                            if (getFileForKey(akaVar2.b).delete()) {
                                this.b -= akaVar2.a;
                            } else {
                                VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", akaVar2.b, a(akaVar2.b));
                            }
                            it.remove();
                            i = i2 + 1;
                            if (this.b < this.d * 0.9f) {
                                break;
                            } else {
                                i2 = i;
                            }
                        }
                        if (VolleyLog.DEBUG) {
                            VolleyLog.v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.b - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    if (!fileForKey.delete()) {
                        VolleyLog.d("Could not clean up file %s", fileForKey.getAbsolutePath());
                    }
                }
            }
        }
    }

    public synchronized void remove(String str) {
        boolean zDelete = getFileForKey(str).delete();
        b(str);
        if (!zDelete) {
            VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", str, a(str));
        }
    }

    private static String a(String str) {
        int length = str.length() / 2;
        String strValueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String strValueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    public File getFileForKey(String str) {
        return new File(this.c, a(str));
    }

    private final void a(String str, aka akaVar) {
        if (!this.a.containsKey(str)) {
            this.b += akaVar.a;
        } else {
            this.b = (akaVar.a - ((aka) this.a.get(str)).a) + this.b;
        }
        this.a.put(str, akaVar);
    }

    private final void b(String str) {
        aka akaVar = (aka) this.a.remove(str);
        if (akaVar != null) {
            this.b -= akaVar.a;
        }
    }

    private static byte[] a(akb akbVar, long j) throws IOException {
        long jA = akbVar.a();
        if (j < 0 || j > jA || ((int) j) != j) {
            throw new IOException(new StringBuilder(73).append("streamToBytes length=").append(j).append(", maxLength=").append(jA).toString());
        }
        byte[] bArr = new byte[(int) j];
        new DataInputStream(akbVar).readFully(bArr);
        return bArr;
    }

    private static InputStream a(File file) {
        return new FileInputStream(file);
    }

    private static int c(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            throw new EOFException();
        }
        return i;
    }

    public static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    public static int a(InputStream inputStream) {
        return c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16) | (c(inputStream) << 24);
    }

    public static void a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static long b(InputStream inputStream) {
        return 0 | (((long) c(inputStream)) & 255) | ((((long) c(inputStream)) & 255) << 8) | ((((long) c(inputStream)) & 255) << 16) | ((((long) c(inputStream)) & 255) << 24) | ((((long) c(inputStream)) & 255) << 32) | ((((long) c(inputStream)) & 255) << 40) | ((((long) c(inputStream)) & 255) << 48) | ((((long) c(inputStream)) & 255) << 56);
    }

    public static void a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    public static String a(akb akbVar) {
        return new String(a(akbVar, b(akbVar)), "UTF-8");
    }
}
