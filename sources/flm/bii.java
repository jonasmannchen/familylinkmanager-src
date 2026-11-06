package flm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Debug;
import android.os.DropBoxManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bii {
    private static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static DropBoxManager b = null;
    private static boolean c = false;
    private static int d = -1;
    private static int e = 0;
    private static int f = 0;

    public static boolean a(Context context, Throwable th) {
        return a(context, th, 536870912);
    }

    private static boolean a(Context context, Throwable th, int i) throws Exception {
        boolean zA;
        try {
            bdi.checkNotNull(context);
            bdi.checkNotNull(th);
            if (!bav.IS_PACKAGE_SIDE) {
                return false;
            }
            if (bif.a() || (th = a(th)) != null) {
                return a(context, Log.getStackTraceString(th), bix.a(), 536870912, th);
            }
            return false;
        } catch (Exception e2) {
            try {
                zA = bif.a();
            } catch (Exception e3) {
                Log.e("CrashUtils", "Error determining which process we're running in!", e3);
                zA = false;
            }
            if (zA) {
                throw e2;
            }
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }

    private static synchronized boolean a(Context context, String str, String str2, int i, Throwable th) {
        boolean z;
        bdi.checkNotNull(context);
        if (!bav.IS_PACKAGE_SIDE || biy.b(str)) {
            z = false;
        } else {
            int iHashCode = str.hashCode();
            int iHashCode2 = th == null ? f : th.hashCode();
            if (e == iHashCode && f == iHashCode2) {
                z = false;
            } else {
                e = iHashCode;
                f = iHashCode2;
                DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
                if (dropBoxManager == null || !dropBoxManager.isTagEnabled("system_app_crash")) {
                    z = false;
                } else {
                    dropBoxManager.addText("system_app_crash", a(context, str, str2, i));
                    z = true;
                }
            }
        }
        return z;
    }

    private static synchronized Throwable a(Throwable th) {
        Throwable th2;
        boolean z;
        boolean z2;
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        th2 = null;
        z = false;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z3 = z;
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                String fileName = stackTraceElement.getFileName();
                boolean z4 = (!TextUtils.isEmpty(fileName) && fileName.startsWith(":com.google.android.gms")) || bif.a();
                z3 |= z4;
                if (!z4) {
                    if (TextUtils.isEmpty(className)) {
                        z2 = false;
                    } else {
                        String[] strArr = a;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (className.startsWith(strArr[i])) {
                                    z2 = true;
                                    break;
                                }
                                i++;
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    if (!z2) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                }
                arrayList.add(stackTraceElement);
            }
            if (th2 == null) {
                th2 = new Throwable("<filtered>");
            } else {
                th2 = new Throwable("<filtered>", th2);
            }
            th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            z = z3;
        }
        return !z ? null : th2;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private static synchronized String a(Context context, String str, String str2, int i) {
        StringBuilder sb;
        int i2;
        InputStreamReader inputStreamReader;
        char[] cArr;
        sb = new StringBuilder(1024);
        sb.append("Process: ").append(biy.a(str2)).append("\n");
        sb.append("Package: com.google.android.gms");
        int i3 = bav.APK_BUILD_VERSION_CODE;
        String strConcat = bav.APK_BUILD_VERSION_NAME;
        if (bif.a()) {
            try {
                PackageInfo packageInfoB = bjj.a.a(context).b(context.getPackageName(), 0);
                i3 = packageInfoB.versionCode;
                if (packageInfoB.versionName != null) {
                    strConcat = packageInfoB.versionName;
                }
            } catch (Exception e2) {
                Log.w("CrashUtils", "Error while trying to get the package information! Using static version.", e2);
            }
        }
        sb.append(" v").append(i3);
        if (!TextUtils.isEmpty(strConcat)) {
            if (strConcat.contains("(") && !strConcat.contains(")")) {
                if (strConcat.endsWith("-")) {
                    strConcat = String.valueOf(strConcat).concat("111111111");
                }
                strConcat = String.valueOf(strConcat).concat(")");
            }
            sb.append(" (").append(strConcat).append(")");
        }
        sb.append("\n");
        sb.append("Build: ").append(Build.FINGERPRINT).append("\n");
        if (Debug.isDebuggerConnected()) {
            sb.append("Debugger: Connected\n");
        }
        if (i != 0) {
            sb.append("DD-EDD: ").append(i).append("\n");
        }
        sb.append("\n");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!bif.a()) {
            i2 = 0;
        } else if (d < 0) {
            i2 = Settings.Secure.getInt(context.getContentResolver(), "logcat_for_system_app_crash", 0);
        } else {
            i2 = d;
        }
        if (i2 > 0) {
            sb.append("\n");
            FileReader fileReader = 0;
            try {
                try {
                    try {
                        Process processStart = new ProcessBuilder("/system/bin/logcat", "-v", "time", "-b", "events", "-b", "system", "-b", "main", "-b", "crash", "-t", String.valueOf(i2)).redirectErrorStream(true).start();
                        try {
                            try {
                                try {
                                    processStart.getOutputStream().close();
                                    while (true) {
                                        int i4 = inputStreamReader.read(cArr);
                                        if (i4 > 0) {
                                            sb.append(cArr, 0, i4);
                                        } else {
                                            try {
                                                break;
                                            } catch (IOException e3) {
                                            }
                                        }
                                    }
                                } catch (IOException e4) {
                                }
                                processStart.getErrorStream().close();
                            } catch (IOException e5) {
                            }
                            cArr = new char[8192];
                            inputStreamReader.close();
                        } catch (IOException e6) {
                            e = e6;
                            Log.e("CrashUtils", "Error running logcat", e);
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (IOException e7) {
                                }
                            }
                        }
                        inputStreamReader = new InputStreamReader(processStart.getInputStream());
                    } catch (IOException e8) {
                        e = e8;
                        inputStreamReader = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileReader != 0) {
                        try {
                            fileReader.close();
                        } catch (IOException e9) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileReader = "\n";
                if (fileReader != 0) {
                    fileReader.close();
                }
                throw th;
            }
        }
        return sb.toString();
    }
}
