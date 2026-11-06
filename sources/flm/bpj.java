package flm;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpj {
    public static final dts a;
    public static volatile dts b;

    public static synchronized void a(dll dllVar) {
        if (dllVar.a || ((fpu) fpt.a.a()).k()) {
            bdi.checkState(b == a, "Duplicate init");
            bpa bpaVar = bpb.a;
            if (((fpu) fpt.a.a()).q()) {
                if (bpaVar.a) {
                    throw new IllegalStateException("DeviceStateMonitor initialized more than once.");
                }
                BaseApplicationContext baseApplicationContextA = ayt.a();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                if (biw.a()) {
                    intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
                }
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                baseApplicationContextA.registerReceiver(bpaVar, intentFilter);
                Intent intentRegisterReceiver = baseApplicationContextA.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver != null) {
                    bpaVar.b = Boolean.valueOf(intentRegisterReceiver.getIntExtra("plugged", 0) > 0);
                    bpaVar.d = Boolean.valueOf(intentRegisterReceiver.getBooleanExtra("battery_low", false));
                }
                PowerManager powerManager = (PowerManager) baseApplicationContextA.getSystemService("power");
                if (powerManager != null) {
                    bpaVar.c = Boolean.valueOf(bil.a(powerManager));
                }
                bpaVar.e = bpa.a(baseApplicationContextA);
                bpaVar.f = bpa.b(baseApplicationContextA);
                bpaVar.a = true;
            }
            a(dllVar, false);
        }
    }

    private static synchronized void a(final dll dllVar, boolean z) {
        ExecutorService executorServiceNewSingleThreadExecutor;
        dui duiVar = new dui();
        duh duhVar = new duh();
        if (!((fpu) fpt.a.a()).u()) {
            executorServiceNewSingleThreadExecutor = bgy.a(5, 10);
        } else {
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new bpl());
        }
        bhc bhcVarB = bgy.b(1, 10);
        dtt dttVar = new dtt();
        dttVar.a = executorServiceNewSingleThreadExecutor;
        dttVar.b = bhcVarB;
        dttVar.d = true;
        dttVar.f = duhVar;
        dttVar.e = duiVar;
        if (dllVar.a) {
            dttVar.a(new dup(new fol(dllVar) { // from class: flm.bpk
                private final dll a;

                {
                    this.a = dllVar;
                }

                @Override // flm.fol
                public final Object a() {
                    return dvi.b(this.a);
                }
            }, duhVar));
        }
        duiVar.a = ((fpu) fpt.a.a()).b() / 1000.0f;
        if (((fpu) fpt.a.a()).l()) {
            bpc bpcVar = new bpc(new dfi());
            bpcVar.a((int) ((fpu) fpt.a.a()).n(), (int) ((fpu) fpt.a.a()).m());
            dttVar.a(bpcVar);
        }
        if (((fpu) fpt.a.a()).e()) {
            dttVar.a(new bpg(bgy.b(1, 10)));
        }
        b = dttVar.a();
    }

    public static dtn a(bof bofVar) {
        gps gpsVar = (gps) ((fio) gpr.c.a(dp.au, (Object) null));
        if (bofVar != null) {
            gpsVar.c();
            gpr gprVar = (gpr) gpsVar.a;
            if (bofVar == null) {
                throw new NullPointerException();
            }
            gprVar.b = bofVar;
            gprVar.a |= 128;
        }
        return new dtp(dtp.d, new so()).a(duq.a, (gpr) ((fin) gpsVar.h())).a();
    }

    public static bof a() {
        dtl dtlVarA = duj.a(duq.a);
        if (dtlVarA.b()) {
            gpr gprVar = (gpr) dtlVarA.a();
            if ((gprVar.a & 128) == 128) {
                if ((gprVar.a & 128) != 128) {
                    return null;
                }
                if (gprVar.b == null) {
                    return bof.f;
                }
                return gprVar.b;
            }
        }
        return null;
    }

    public static boolean b() {
        return bpn.a || duj.c(duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
    }

    public static boolean c() {
        return bpn.a;
    }

    static {
        dts dtsVarA = new dtt().a();
        a = dtsVarA;
        b = dtsVarA;
    }
}
