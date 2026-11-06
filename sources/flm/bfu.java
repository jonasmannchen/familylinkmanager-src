package flm;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfu {
    private static volatile bfu c;
    private static Integer i;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private bgc h;
    private static final Object b = new Object();
    public static boolean a = bav.IS_PACKAGE_SIDE;

    public static bfu a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new bfu();
                }
            }
        }
        return c;
    }

    private bfu() {
        if (b()) {
            this.d = Collections.EMPTY_LIST;
            this.e = Collections.EMPTY_LIST;
            this.f = Collections.EMPTY_LIST;
            this.g = Collections.EMPTY_LIST;
            return;
        }
        bgi bgiVar = null;
        Bundle bundleB = bgiVar.b();
        List stringArrayList = bundleB.getStringArrayList("ct_icp");
        ArrayList<String> stringArrayList2 = bundleB.getStringArrayList("ct_ics");
        ArrayList<String> stringArrayList3 = bundleB.getStringArrayList("ct_itp");
        ArrayList<String> stringArrayList4 = bundleB.getStringArrayList("ct_its");
        this.d = stringArrayList == null ? Collections.EMPTY_LIST : stringArrayList;
        this.e = stringArrayList2 == null ? Collections.EMPTY_LIST : stringArrayList2;
        this.f = stringArrayList3 == null ? Collections.EMPTY_LIST : stringArrayList3;
        this.g = stringArrayList4 == null ? Collections.EMPTY_LIST : stringArrayList4;
        long j = bundleB.getLong("ct_st");
        this.h = new bgc(1024, j);
        new bgc(1024, j);
    }

    public static boolean a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        return bif.b(context, component.getPackageName());
    }

    @SuppressLint({"UntrackedBindService"})
    public final void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        if (a) {
            a(context, a(serviceConnection), null, null, 1);
        }
    }

    public final void a(Context context, String str, String str2, Intent intent, int i2) {
        String str3;
        String str4;
        String strA;
        ConnectionEvent connectionEvent;
        ServiceInfo serviceInfo;
        boolean z;
        if (!b() && this.h != null) {
            if (i2 == 4 || i2 == 1) {
                if (this.h.b(str)) {
                    str3 = null;
                    str4 = null;
                    strA = null;
                } else {
                    return;
                }
            } else {
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
                if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
                    Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", intent.toUri(0), a(3, 20)));
                    serviceInfo = null;
                } else if (listQueryIntentServices.size() > 1) {
                    Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", intent.toUri(0), a(3, 20)));
                    Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                    while (it.hasNext()) {
                        Log.w("ConnectionTracker", it.next().serviceInfo.name);
                    }
                    serviceInfo = null;
                } else {
                    serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                }
                if (serviceInfo == null) {
                    Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", str2, intent.toUri(0)));
                    return;
                }
                str3 = serviceInfo.processName;
                str4 = serviceInfo.name;
                strA = bix.a();
                int iC = c();
                if (this.d.contains(strA) || this.e.contains(str2) || this.f.contains(str3) || this.g.contains(str4) || (str3.equals(strA) && (iC & bgb.g) != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.h.a(str);
                } else {
                    return;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strA2 = null;
            if ((c() & bgb.f) != 0 && i2 != 13) {
                strA2 = a(3, 5);
            }
            long nativeHeapAllocatedSize = 0;
            if ((c() & bgb.h) != 0) {
                nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            }
            if (i2 == 1 || i2 == 4 || i2 == 14) {
                connectionEvent = new ConnectionEvent(jCurrentTimeMillis, i2, null, null, null, null, strA2, str, SystemClock.elapsedRealtime(), nativeHeapAllocatedSize);
            } else {
                connectionEvent = new ConnectionEvent(jCurrentTimeMillis, i2, strA, str2, str3, str4, strA2, str, SystemClock.elapsedRealtime(), nativeHeapAllocatedSize);
            }
            bgi bgiVar = null;
            if (0 != 0) {
                bgiVar.a(connectionEvent);
            }
        }
    }

    private static boolean b() {
        return !a || c() == bgb.b;
    }

    public static String a(ServiceConnection serviceConnection) {
        return String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(serviceConnection)));
    }

    private static int c() {
        if (!a) {
            return bgb.b;
        }
        if (i == null) {
            bgi bgiVar = null;
            if (0 != 0) {
                i = Integer.valueOf(bgiVar.a(2));
            } else {
                i = Integer.valueOf(bgb.b);
            }
        }
        return i.intValue();
    }

    private static String a(int i2, int i3) {
        String string;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i4 = i3 + 3;
        for (int i5 = 3; i5 < i4; i5++) {
            if (i5 + 4 >= stackTrace.length) {
                string = "<bottom of call stack>";
            } else {
                StackTraceElement stackTraceElement = stackTrace[i5 + 4];
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                string = new StringBuilder(String.valueOf(className).length() + 13 + String.valueOf(methodName).length()).append(className).append(".").append(methodName).append(":").append(stackTraceElement.getLineNumber()).toString();
            }
            sb.append(string).append(" ");
        }
        return sb.toString();
    }
}
