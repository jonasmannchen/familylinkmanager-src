package flm;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.chimeraresources.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drz {
    static ArrayList a(String str, String str2) {
        String[] strArrSplit = str.split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str3 : strArrSplit) {
            int iIndexOf = str3.indexOf(32);
            String[] strArrSplit2 = str3.substring(0, iIndexOf).split(":");
            boolean z = strArrSplit2.length == 2 && iIndexOf > 0;
            String strValueOf = String.valueOf(str3);
            dse.b(z, strValueOf.length() != 0 ? "Invalid license meta-data line:\n".concat(strValueOf) : new String("Invalid license meta-data line:\n"));
            arrayList.add(new drs(str3.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]), str2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String a(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return a(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String a(String str, String str2, long j, int i) throws Throwable {
        JarFile jarFile;
        Throwable th;
        IOException e;
        String strA = null;
        try {
            jarFile = new JarFile(str2);
            try {
                try {
                    JarEntry jarEntry = jarFile.getJarEntry(str);
                    if (jarEntry == null) {
                        try {
                            jarFile.close();
                        } catch (IOException e2) {
                        }
                    } else {
                        strA = a(jarFile.getInputStream(jarEntry), j, i);
                        try {
                            jarFile.close();
                        } catch (IOException e3) {
                        }
                    }
                    return strA;
                } catch (Throwable th2) {
                    th = th2;
                    if (jarFile != null) {
                        try {
                            jarFile.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                throw new RuntimeException("Failed to read license text.", e);
            }
        } catch (IOException e6) {
            jarFile = null;
            e = e6;
        } catch (Throwable th3) {
            jarFile = null;
            th = th3;
            if (jarFile != null) {
                jarFile.close();
            }
            throw th;
        }
    }

    private static String a(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int i2 = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }
}
