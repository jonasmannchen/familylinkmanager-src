package flm;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qb {
    public static File a(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 100) {
                return null;
            }
            File file = new File(context.getCacheDir(), str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i = i2 + 1;
            } catch (IOException e) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e A[Catch: IOException -> 0x0026, TRY_LEAVE, TryCatch #2 {IOException -> 0x0026, blocks: (B:3:0x0001, B:5:0x0016, B:12:0x0022, B:13:0x0025, B:18:0x002e, B:17:0x002a), top: B:22:0x0001, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static ByteBuffer a(File file) throws Throwable {
        Throwable th;
        Throwable th2;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    th = th3;
                    th2 = th4;
                    if (th == null) {
                        fileInputStream.close();
                        throw th2;
                    }
                    fileInputStream.close();
                    throw th2;
                }
            }
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x005b A[Catch: Throwable -> 0x0045, all -> 0x0058, TRY_LEAVE, TryCatch #5 {all -> 0x0058, blocks: (B:9:0x0014, B:11:0x002d, B:22:0x0041, B:23:0x0044, B:36:0x005b, B:33:0x0054), top: B:51:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0064 A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #1 {IOException -> 0x0036, blocks: (B:3:0x0005, B:6:0x000f, B:13:0x0032, B:30:0x004f, B:40:0x0064, B:39:0x0060, B:31:0x0052), top: B:46:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[Catch: IOException -> 0x0036, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0036, blocks: (B:3:0x0005, B:6:0x000f, B:13:0x0032, B:30:0x004f, B:40:0x0064, B:39:0x0060, B:31:0x0052), top: B:46:0x0005, inners: #0 }] */
    public static ByteBuffer a(Context context, CancellationSignal cancellationSignal, Uri uri) throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        FileChannel channel = fileInputStream.getChannel();
                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        fileInputStream.close();
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            return map;
                        }
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return map;
                    } catch (Throwable th4) {
                        th = th4;
                        th3 = null;
                        if (th3 == null) {
                            fileInputStream.close();
                            throw th;
                        }
                        fileInputStream.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        th = th5;
                        th2 = th6;
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            throw th2;
                        }
                        if (th == null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            throw th2;
                        }
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            throw th2;
                        } catch (Throwable th7) {
                            ehh.a(th, th7);
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th8) {
                th2 = th8;
                th = null;
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    throw th2;
                }
                if (th == null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th2;
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                throw th2;
            }
        } catch (IOException e) {
            return null;
        }
    }

    public static ByteBuffer a(Context context, Resources resources, int i) {
        ByteBuffer byteBufferA = null;
        File fileA = a(context);
        if (fileA != null) {
            try {
                if (a(fileA, resources, i)) {
                    byteBufferA = a(fileA);
                }
            } finally {
                fileA.delete();
            }
        }
        return byteBufferA;
    }

    public static boolean a(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            a(fileOutputStream);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                a((Closeable) null);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) null);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean a(File file, Resources resources, int i) {
        InputStream inputStreamOpenRawResource = null;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            return a(file, inputStreamOpenRawResource);
        } finally {
            a(inputStreamOpenRawResource);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
