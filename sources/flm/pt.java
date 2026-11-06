package flm;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class pt extends px {
    pt() {
    }

    private static File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[Catch: Throwable -> 0x0041, all -> 0x0056, TryCatch #3 {all -> 0x0056, blocks: (B:7:0x0015, B:9:0x001b, B:38:0x005d, B:11:0x0021, B:13:0x002e, B:21:0x003d, B:22:0x0040, B:37:0x0059, B:34:0x0052), top: B:52:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x006d A[Catch: IOException -> 0x004f, TRY_LEAVE, TryCatch #6 {IOException -> 0x004f, blocks: (B:6:0x000d, B:40:0x0063, B:15:0x0033, B:29:0x004b, B:44:0x006d, B:43:0x0069, B:30:0x004e), top: B:55:0x000d, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[Catch: IOException -> 0x004f, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x004f, blocks: (B:6:0x000d, B:40:0x0063, B:15:0x0033, B:29:0x004b, B:44:0x006d, B:43:0x0069, B:30:0x004e), top: B:55:0x000d, inners: #7 }] */
    @Override // flm.px
    public Typeface a(Context context, CancellationSignal cancellationSignal, ra[] raVarArr, int i) throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3;
        if (raVarArr.length <= 0) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(a(raVarArr, i).a, "r", cancellationSignal);
            try {
                try {
                    File fileA = a(parcelFileDescriptorOpenFileDescriptor);
                    if (fileA != null && fileA.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(fileA);
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceA = px.a(context, fileInputStream);
                        fileInputStream.close();
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        return typefaceA;
                    } catch (Throwable th4) {
                        th = th4;
                        th3 = null;
                        if (th3 != null) {
                            fileInputStream.close();
                        } else {
                            fileInputStream.close();
                        }
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
}
