package flm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjd {
    private static final int a = Process.myUid();
    private static final Method b = a();
    private static final Method c = b();
    private static final Method d = c();
    private static final Method e;
    private static final Method f;
    private static final Method g;

    private static WorkSource a(int i, String str) {
        WorkSource workSource = new WorkSource();
        a(workSource, i, str);
        return workSource;
    }

    public static WorkSource a(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        if (bav.IS_PACKAGE_SIDE && "com.google.android.gms".equals(str)) {
            return a(Process.myUid(), str);
        }
        try {
            ApplicationInfo applicationInfoA = bjj.a.a(context).a(str, 0);
            if (applicationInfoA == null) {
                String strValueOf = String.valueOf(str);
                Log.e("WorkSourceUtil", strValueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(strValueOf) : new String("Could not get applicationInfo from package: "));
                return null;
            }
            return a(applicationInfoA.uid, str);
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf2 = String.valueOf(str);
            Log.e("WorkSourceUtil", strValueOf2.length() != 0 ? "Could not find package: ".concat(strValueOf2) : new String("Could not find package: "));
            return null;
        }
    }

    private static void a(WorkSource workSource, int i, String str) {
        if (c != null) {
            if (str == null) {
                str = "";
            }
            try {
                c.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        if (b != null) {
            try {
                b.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    private static int b(WorkSource workSource) {
        if (d != null) {
            try {
                return ((Integer) d.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return 0;
    }

    private static String a(WorkSource workSource, int i) {
        if (e != null) {
            try {
                return (String) e.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return null;
    }

    public static List a(WorkSource workSource) {
        int iB = workSource == null ? 0 : b(workSource);
        if (iB == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iB; i++) {
            String strA = a(workSource, i);
            if (!biy.b(strA)) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    public static boolean a(Context context) {
        return (context == null || context.getPackageManager() == null || bjj.a.a(context).a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    private static Method a() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception e2) {
            return null;
        }
    }

    private static Method b() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception e2) {
            return null;
        }
    }

    private static Method c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e2) {
            return null;
        }
    }

    private static Method d() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception e2) {
            return null;
        }
    }

    private static Method e() {
        try {
            return WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception e2) {
            return null;
        }
    }

    private static final Method f() {
        if (!biw.e()) {
            return null;
        }
        try {
            return WorkSource.class.getMethod("createWorkChain", new Class[0]);
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static final Method g() {
        if (!biw.e()) {
            return null;
        }
        try {
            return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            return null;
        }
    }

    static {
        d();
        e = e();
        f = f();
        g = g();
    }
}
