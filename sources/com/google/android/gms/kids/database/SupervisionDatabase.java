package com.google.android.gms.kids.database;

import android.util.Log;
import com.google.android.gms.common.app.BaseApplicationContext;
import flm.ayt;
import flm.bo;
import flm.buy;
import flm.bvf;
import flm.bvj;
import flm.bvp;
import flm.bvt;
import flm.bvx;
import flm.bwb;
import flm.bwj;
import flm.bwt;
import flm.bwu;
import flm.bwv;
import flm.bww;
import flm.bwx;
import flm.bwy;
import flm.bwz;
import flm.bxa;
import flm.bxb;
import flm.bxc;
import flm.bxd;
import flm.bxe;
import flm.bxf;
import flm.bxg;
import flm.bxh;
import flm.cc;
import flm.cf;
import flm.cm;
import flm.cn;
import flm.co;
import flm.cp;
import flm.cu;
import flm.sp;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class SupervisionDatabase extends cn {
    private static final cu[] f = {new bwt(), new bxa(), new bxb(), new bxc(), new bxd(), new bxe(), new bxf(), new bxg(), new bxh(), new bwu(), new bwv(), new bww(), new bwx(), new bwy(), new bwz()};
    private static volatile SupervisionDatabase g;

    public abstract buy j();

    public abstract bvp k();

    public abstract bwb l();

    public abstract bvj m();

    public abstract bvt n();

    public abstract bvx o();

    public abstract bwj p();

    public abstract bvf q();

    public static synchronized SupervisionDatabase h() {
        sp spVar;
        if (g == null) {
            BaseApplicationContext baseApplicationContextA = ayt.a();
            if ("kids_supervision".trim().length() == 0) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            co coVar = new co(baseApplicationContextA, SupervisionDatabase.class, "kids_supervision");
            cu[] cuVarArr = f;
            if (coVar.g == null) {
                coVar.g = new HashSet();
            }
            for (cu cuVar : cuVarArr) {
                coVar.g.add(Integer.valueOf(cuVar.a));
                coVar.g.add(Integer.valueOf(cuVar.b));
            }
            cp cpVar = coVar.f;
            for (cu cuVar2 : cuVarArr) {
                int i = cuVar2.a;
                int i2 = cuVar2.b;
                sp spVar2 = (sp) cpVar.a.a(i, null);
                if (spVar2 == null) {
                    sp spVar3 = new sp();
                    cpVar.a.b(i, spVar3);
                    spVar = spVar3;
                } else {
                    spVar = spVar2;
                }
                cu cuVar3 = (cu) spVar.a(i2, null);
                if (cuVar3 != null) {
                    Log.w("ROOM", "Overriding migration " + cuVar3 + " with " + cuVar2);
                }
                spVar.c(i2, cuVar2);
            }
            coVar.e = false;
            if (coVar.c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (coVar.a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            if (coVar.d == null) {
                coVar.d = new cc();
            }
            cf cfVar = new cf(coVar.c, coVar.b, coVar.d, coVar.f, null, false, coVar.e, null);
            cn cnVar = (cn) cm.a(coVar.a, "_Impl");
            cnVar.b = cnVar.a(cfVar);
            cnVar.d = cfVar.e;
            cnVar.c = cfVar.f;
            g = (SupervisionDatabase) cnVar;
        }
        return g;
    }

    public static synchronized void i() {
        SupervisionDatabase supervisionDatabaseH = h();
        bo boVarA = supervisionDatabaseH.b.a();
        boVarA.a();
        try {
            String[] strArr = {"ActivitySampleEntity", "AppPendingDisableEntity", "AppStateEntity", "ConsentStatusEntity", "DeviceEventEntity", "GeonotificationStateEntity", "KeyValue", "KidsModuleInfo", "LocationSampleEntity", "PartialConsentForSecondaryAccountSignIn", "PolicyEntity", "TimeLimitKeyValueEntity", "TimeLimitLocalOverrideEntity", "TrackedPlace"};
            for (int i = 0; i < 14; i++) {
                String strValueOf = String.valueOf(strArr[i]);
                boVarA.c(strValueOf.length() != 0 ? "DELETE FROM ".concat(strValueOf) : new String("DELETE FROM "));
            }
            boVarA.c();
            boVarA.b();
            boVarA.b("PRAGMA wal_checkpoint(FULL)").close();
            if (!boVarA.d()) {
                boVarA.c("VACUUM");
            }
            if (supervisionDatabaseH.b()) {
                try {
                    supervisionDatabaseH.e.lock();
                    supervisionDatabaseH.b.b();
                    supervisionDatabaseH.e.unlock();
                } catch (Throwable th) {
                    supervisionDatabaseH.e.unlock();
                    throw th;
                }
            }
            g = null;
        } catch (Throwable th2) {
            boVarA.b();
            boVarA.b("PRAGMA wal_checkpoint(FULL)").close();
            if (!boVarA.d()) {
                boVarA.c("VACUUM");
            }
            throw th2;
        }
    }
}
