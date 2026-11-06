package flm;

import android.app.admin.DevicePolicyManager;
import android.content.pm.PackageManager;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsy {
    private static final dvo a;
    private static final dvo b;
    private static volatile Boolean c;

    public static boolean a() {
        if (c == null) {
            b();
        }
        return c.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0079  */
    public static synchronized void b() {
        boolean z;
        boolean z2;
        synchronized (bsy.class) {
            btv.b("Coexistence", "<<<<CoexistenceFlagsDebug.Start>>>> ", new Object[0]);
            btv.b("Coexistence", "(Coexistence__coexistence_enabled): (%s)", Boolean.valueOf(fpy.b()));
            btv.b("Coexistence", "(Coexistence__coexistence_secondary_account_sign_in_enabled): (%s)", Boolean.valueOf(fpy.d()));
            btv.b("Coexistence", "<<<<CoexistenceFlagsDebug.End>>>> ", new Object[0]);
            if (fpy.b()) {
                Iterable iterableA = a.a((CharSequence) fpy.c());
                dvm dvmVar = bsz.a;
                Iterator it = iterableA.iterator();
                dvl.a(dvmVar);
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    } else if (!dvmVar.a(it.next())) {
                        z2 = false;
                        break;
                    }
                }
                z = z2;
            }
            c = Boolean.valueOf(z);
        }
    }

    public static boolean c() {
        return a() && fpy.d();
    }

    public static void a(String str) {
        if (fpy.c().contains(str)) {
            b();
            bte.c((DevicePolicyManager) ayt.a().getSystemService("device_policy"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str) {
        List listC = b.c(str);
        if (listC.size() < 2) {
            btv.e("Coexistence", "Bad coexistence min package version config: %s", str);
            return true;
        }
        String str2 = (String) listC.get(0);
        try {
            int i = Integer.parseInt((String) listC.get(1));
            try {
                int i2 = ayt.a().getPackageManager().getPackageInfo(str2, 0).versionCode;
                btv.c("Coexistence", "%s version: %s. Coexistence min required: %s", str2, Integer.valueOf(i2), Integer.valueOf(i));
                return i2 >= i;
            } catch (PackageManager.NameNotFoundException e) {
                btv.c("Coexistence", "%s not installed, not blocking Coexistence", str2);
                return true;
            }
        } catch (NumberFormatException e2) {
            btv.c("Coexistence", e2, "Bad coexistence min package version config: %s", str);
            return true;
        }
    }

    public static int a(List list, SupervisionDatabase supervisionDatabase) {
        bvw bvwVarA = supervisionDatabase.o().a();
        if (bvwVarA != null) {
            if (bvwVarA.e > btj.b() - TimeUnit.HOURS.toMillis(1L)) {
                return 1;
            }
            supervisionDatabase.o().a(bvwVarA.c);
        }
        long jB = btj.b() - TimeUnit.DAYS.toMillis(1L);
        bvf bvfVarQ = supervisionDatabase.q();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!(bvfVarQ.a((String) it.next(), jB) == 1)) {
                return 2;
            }
        }
        return bvfVarQ.c(list).isEmpty() ? 0 : 3;
    }

    static {
        duw duwVar = new duw(',');
        dvl.a(duwVar);
        a = new dvo(new dvp(duwVar));
        duw duwVar2 = new duw(':');
        dvl.a(duwVar2);
        b = new dvo(new dvp(duwVar2));
    }
}
