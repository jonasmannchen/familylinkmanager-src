package flm;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dpl {
    private static volatile ActivityManager a = null;

    public static ActivityManager a(Context context) {
        if (a == null) {
            synchronized (dpl.class) {
                if (a == null) {
                    a = (ActivityManager) context.getSystemService("activity");
                }
            }
        }
        return a;
    }

    public static boolean b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    if (Build.VERSION.SDK_INT < 23 ? c(context) : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }

    public static boolean d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = a(context).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    public static String e(Context context) {
        String packageName = context.getPackageName();
        String strA = a();
        if (strA != null && packageName != null && strA.startsWith(packageName)) {
            int length = packageName.length();
            if (strA.length() == length) {
                return null;
            }
            return strA.substring(length + 1);
        }
        return strA;
    }

    public static String a() {
        return a(Process.myPid());
    }

    private static String a(int i) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        String strTrim = null;
        if (i > 0) {
            try {
                bufferedReader = new BufferedReader(new FileReader(new StringBuilder(25).append("/proc/").append(i).append("/cmdline").toString()));
                try {
                    strTrim = bufferedReader.readLine().trim();
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                    }
                } catch (IOException e2) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                bufferedReader = null;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        }
        return strTrim;
    }
}
