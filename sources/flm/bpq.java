package flm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.gcm.Task;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bpq {
    private static bpq b;
    public final Context a;
    private final Map c = new rt();

    public static bpq a(Context context) {
        bpq bpqVar;
        synchronized (bpq.class) {
            if (b == null) {
                b = new bpq(context.getApplicationContext());
            }
            bpqVar = b;
        }
        return bpqVar;
    }

    private bpq(Context context) {
        this.a = context;
    }

    public final bqg a() {
        if (bpv.a(this.a) >= 5000000) {
            return new bqf(this.a);
        }
        Log.e("GcmNetworkManager", "Google Play services is not available, dropping all GcmNetworkManager requests");
        return new bqh();
    }

    public final synchronized void a(Task task) {
        Map map;
        Throwable th = null;
        synchronized (this) {
            String strValueOf = String.valueOf("nts:client:schedule:");
            String strValueOf2 = String.valueOf(task.b);
            bqk bqkVar = new bqk(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
            try {
                a(task.a);
                if (a().a(task) && (map = (Map) this.c.get(task.a)) != null && map.containsKey(task.b)) {
                    map.put(task.b, true);
                }
                a((Throwable) null, bqkVar);
            } catch (Throwable th2) {
                th = th2;
                a(th, bqkVar);
                throw th;
            }
        }
    }

    public final boolean a(String str) {
        Intent className;
        List<ResolveInfo> listQueryIntentServices;
        bdi.checkNotNull(str, "GcmTaskService must not be null.");
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            listQueryIntentServices = Collections.emptyList();
        } else {
            if (str != null) {
                className = new Intent(bpr.SERVICE_ACTION_EXECUTE_TASK).setClassName(this.a, str);
            } else {
                className = new Intent(bpr.SERVICE_ACTION_EXECUTE_TASK).setPackage(this.a.getPackageName());
            }
            listQueryIntentServices = packageManager.queryIntentServices(className, 0);
        }
        if (listQueryIntentServices == null ? true : listQueryIntentServices.isEmpty()) {
            Log.e("GcmNetworkManager", String.valueOf(str).concat(" is not available. This may cause the task to be lost."));
        } else {
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (resolveInfo.serviceInfo == null || !resolveInfo.serviceInfo.enabled) {
                }
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 118).append("The GcmTaskService class you provided ").append(str).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY").toString());
        }
        return true;
    }

    final synchronized boolean a(String str, String str2) {
        Map rtVar;
        rtVar = (Map) this.c.get(str2);
        if (rtVar == null) {
            rtVar = new rt();
            this.c.put(str2, rtVar);
        }
        return rtVar.put(str, false) == null;
    }

    final synchronized void b(String str, String str2) {
        Map map = (Map) this.c.get(str2);
        if (map != null) {
            if ((map.remove(str) != null) && map.isEmpty()) {
                this.c.remove(str2);
            }
        }
    }

    final synchronized boolean c(String str, String str2) {
        boolean zBooleanValue;
        Boolean bool;
        Map map = (Map) this.c.get(str2);
        zBooleanValue = (map == null || (bool = (Boolean) map.get(str)) == null) ? false : bool.booleanValue();
        return zBooleanValue;
    }

    final synchronized boolean b(String str) {
        return this.c.containsKey(str);
    }

    public static /* synthetic */ void a(Throwable th, bqk bqkVar) {
        if (th == null) {
            bqkVar.close();
            return;
        }
        try {
            bqkVar.close();
        } catch (Throwable th2) {
            ehh.a(th, th2);
        }
    }
}
