package flm;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bix {
    private static String a = null;
    private static int b = 0;

    public static String a() {
        if (a == null) {
            if (b == 0) {
                b = Process.myPid();
            }
            a = a(b);
        }
        return a;
    }

    private static String a(int i) throws Throwable {
        BufferedReader bufferedReaderA;
        Throwable th;
        String strTrim = null;
        if (i > 0) {
            try {
                bufferedReaderA = a(new StringBuilder(25).append("/proc/").append(i).append("/cmdline").toString());
                try {
                    strTrim = bufferedReaderA.readLine().trim();
                    bir.a(bufferedReaderA);
                } catch (IOException e) {
                    bir.a(bufferedReaderA);
                } catch (Throwable th2) {
                    th = th2;
                    bir.a(bufferedReaderA);
                    throw th;
                }
            } catch (IOException e2) {
                bufferedReaderA = null;
            } catch (Throwable th3) {
                bufferedReaderA = null;
                th = th3;
            }
        }
        return strTrim;
    }

    private static BufferedReader a(String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
