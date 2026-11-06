package flm;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccx {
    public static synchronized void a(fcy fcyVar) {
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        bwb bwbVarL = supervisionDatabaseH.l();
        fdc fdcVarA = fdc.a((fcyVar.b == null ? fda.d : fcyVar.b).b);
        if (fdcVarA == null) {
            fdcVarA = fdc.TYPE_UNKNOWN;
        }
        if (cda.a(fdcVarA) == null) {
            btv.d("Policy", "Unknown policy type:%s", fdcVarA);
        } else {
            String str = (fcyVar.b == null ? fda.d : fcyVar.b).c;
            supervisionDatabaseH.d();
            try {
                try {
                    bwbVarL.a(new bwg(fdcVarA, str, bwbVarL.c(), fcyVar.d, (fcyVar.c == null ? fde.c : fcyVar.c).b.c()));
                    supervisionDatabaseH.f();
                    supervisionDatabaseH.e();
                    btt.a(fdcVarA, str, true);
                    a(euz.SERVER_CHANGE, new fdc[0]);
                } catch (Exception e) {
                    btt.a(fdcVarA, str, false);
                    throw new bxi("parse entry failed", e);
                }
            } catch (Throwable th) {
                supervisionDatabaseH.e();
                throw th;
            }
        }
    }

    public static synchronized void a(euz euzVar) {
        esy esyVar;
        esy esyVar2;
        fcw fcwVar;
        fda fdaVar;
        fda fdaVar2;
        fda fdaVar3;
        fde fdeVar;
        btt.a("Policy", "syncPolicy", "Fetching policies", new Object[0]);
        ezl ezlVarB = b(euzVar);
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        bwb bwbVarL = supervisionDatabaseH.l();
        if (ezlVarB.b == null) {
            esyVar = esy.c;
        } else {
            esyVar = ezlVarB.b;
        }
        btj.a(esyVar.b);
        btt.a("Policy", "syncPolicy", "Saving policies to database", new Object[0]);
        if (ezlVarB.b == null) {
            esyVar2 = esy.c;
        } else {
            esyVar2 = ezlVarB.b;
        }
        long j = esyVar2.b;
        ArrayList arrayList = new ArrayList();
        supervisionDatabaseH.d();
        try {
            if (ezlVarB.c == null) {
                fcwVar = fcw.c;
            } else {
                fcwVar = ezlVarB.c;
            }
            for (fcy fcyVar : fcwVar.b) {
                if (fcyVar.b == null) {
                    fdaVar = fda.d;
                } else {
                    fdaVar = fcyVar.b;
                }
                arrayList.add(fdaVar);
                if (fcyVar.b == null) {
                    fdaVar2 = fda.d;
                } else {
                    fdaVar2 = fcyVar.b;
                }
                fdc fdcVarA = fdc.a(fdaVar2.b);
                if (fdcVarA == null) {
                    fdcVarA = fdc.TYPE_UNKNOWN;
                }
                if (cda.a(fdcVarA) == null) {
                    btv.d("Policy", "Unknown policy type:%s", fdcVarA);
                } else {
                    if (fcyVar.b == null) {
                        fdaVar3 = fda.d;
                    } else {
                        fdaVar3 = fcyVar.b;
                    }
                    String str = fdaVar3.c;
                    String str2 = fcyVar.d;
                    if (fcyVar.c == null) {
                        fdeVar = fde.c;
                    } else {
                        fdeVar = fcyVar.c;
                    }
                    bwbVarL.a(new bwg(fdcVarA, str, j, str2, fdeVar.b.c()));
                }
            }
            bwbVarL.a(j);
            supervisionDatabaseH.f();
            supervisionDatabaseH.e();
            btv.c("Policy", "[%s] Synced %s policies", euzVar, Integer.valueOf(arrayList.size()));
            btt.a(euzVar);
        } catch (Throwable th) {
            supervisionDatabaseH.e();
            throw th;
        }
    }

    public static synchronized void a(euz euzVar, fdc... fdcVarArr) {
        Object[] objArrCopyOf;
        int i;
        int i2;
        int i3;
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        fdc[] fdcVarArrA = supervisionDatabaseH.l().a();
        if (fdcVarArrA == null) {
            objArrCopyOf = null;
        } else if (fdcVarArr == null || fdcVarArr.length == 0) {
            objArrCopyOf = Arrays.copyOf(fdcVarArrA, fdcVarArrA.length);
        } else {
            objArrCopyOf = (Object[]) Array.newInstance(fdcVarArr.getClass().getComponentType(), fdcVarArrA.length);
            if (fdcVarArr.length == 1) {
                int length = fdcVarArrA.length;
                int i4 = 0;
                i = 0;
                while (i4 < length) {
                    fdc fdcVar = fdcVarArrA[i4];
                    if (bcx.equal(fdcVarArr[0], fdcVar)) {
                        i3 = i;
                    } else {
                        i3 = i + 1;
                        objArrCopyOf[i] = fdcVar;
                    }
                    i4++;
                    i = i3;
                }
            } else {
                int length2 = fdcVarArrA.length;
                int i5 = 0;
                i = 0;
                while (i5 < length2) {
                    fdc fdcVar2 = fdcVarArrA[i5];
                    if (bhz.a(fdcVarArr, fdcVar2)) {
                        i2 = i;
                    } else {
                        i2 = i + 1;
                        objArrCopyOf[i] = fdcVar2;
                    }
                    i5++;
                    i = i2;
                }
            }
            if (objArrCopyOf == null) {
                objArrCopyOf = null;
            } else if (i != objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
            }
        }
        ccz cczVarA = a(euzVar, supervisionDatabaseH, (fdc[]) objArrCopyOf);
        if (!cczVarA.b.isEmpty()) {
            if (cczVarA.a) {
                throw new bxj("Not all policies are applied, some can be retried.");
            }
            throw new bxi("Not all policies are applied");
        }
    }

    public static synchronized List a(euz euzVar, fdc fdcVar) {
        return a(euzVar, SupervisionDatabase.h(), fdcVar).b;
    }

    public static synchronized void a() {
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        bwb bwbVarL = supervisionDatabaseH.l();
        bwbVarL.a(Long.MAX_VALUE);
        ccz cczVarA = a(supervisionDatabaseH, bwbVarL, true);
        if (!cczVarA.b.isEmpty()) {
            if (cczVarA.a) {
                throw new bxj("Not all policies are revoked, some can be retried.");
            }
            throw new bxi("Not all policies are revoked");
        }
    }

    private static ezl b(euz euzVar) throws bxj {
        ezk ezkVar = (ezk) ((fio) ezj.f.a(dp.au, (Object) null));
        ezkVar.c();
        ezj ezjVar = (ezj) ezkVar.a;
        if ("me" == 0) {
            throw new NullPointerException();
        }
        ezjVar.a |= 4;
        ezjVar.c = "me";
        String strA = btl.a();
        ezkVar.c();
        ezj ezjVar2 = (ezj) ezkVar.a;
        if (strA == null) {
            throw new NullPointerException();
        }
        ezjVar2.a |= 8;
        ezjVar2.d = strA;
        euy euyVarA = ((euy) ((fio) eux.c.a(dp.au, (Object) null))).a(euzVar);
        ezkVar.c();
        ezj ezjVar3 = (ezj) ezkVar.a;
        ezjVar3.b = (eux) ((fin) euyVarA.h());
        ezjVar3.a |= 2;
        ezkVar.c();
        ezj ezjVar4 = (ezj) ezkVar.a;
        if ("" == 0) {
            throw new NullPointerException();
        }
        ezjVar4.a |= 16;
        ezjVar4.e = "";
        ezj ezjVar5 = (ezj) ((fin) ezkVar.h());
        try {
            String strB = bts.b();
            String strA2 = strB == null ? SupervisionDatabase.h().k().a("key_supervised_account") : strB;
            dvl.b(!TextUtils.isEmpty(strA2), "No supervised account found for sending gRPCs.");
            baw bawVarA = cal.a(strA2);
            car carVarA = cal.a();
            if (car.f == null) {
                car.f = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/ListDevicePolicies", gkn.a(ezj.f), gkn.a(ezl.d));
            }
            return (ezl) carVarA.a.a(car.f, bawVarA, ezjVar5, 10000L, TimeUnit.MILLISECONDS);
        } catch (alt | fvg e) {
            throw new bxj("Auth exception during sync policies!", e);
        }
    }

    private static ccz a(euz euzVar, SupervisionDatabase supervisionDatabase, fdc... fdcVarArr) {
        cdb cdbVar;
        bwg[] bwgVarArrB;
        boolean z;
        switch (euzVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 3:
            case 5:
            case 14:
                cdbVar = cdb.FORCE_APPLY;
                break;
            case 1:
                cdbVar = cdb.BOOTSTRAP;
                break;
            case 2:
            case 4:
            case 7:
            case 9:
                cdbVar = cdb.NORMAL;
                break;
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                btv.d("Policy", "Unexpected sync trigger:%s", euzVar);
                cdbVar = cdb.NORMAL;
                break;
        }
        bwb bwbVarL = supervisionDatabase.l();
        bvj bvjVarM = supervisionDatabase.m();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z2 = false;
        supervisionDatabase.d();
        try {
            int length = fdcVarArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < length) {
                    fdc fdcVar = fdcVarArr[i2];
                    cdc cdcVarA = cda.a(fdcVar);
                    if (cdcVarA == null) {
                        btv.d("Policy", "Unknown type:%s", fdcVar);
                    } else {
                        if (cdbVar.d) {
                            bwgVarArrB = bwbVarL.a(fdcVar);
                        } else {
                            bwgVarArrB = bwbVarL.b(fdcVar);
                        }
                        int length2 = bwgVarArrB.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            bwg bwgVar = bwgVarArrB[i3];
                            fda fdaVar = (fda) ((fin) ((fdb) ((fio) fda.d.a(dp.au, (Object) null))).a(bwgVar.a).a(bwgVar.b).h());
                            arrayList2.add(fdaVar);
                            try {
                                bwbVarL.a(fdcVar, bwgVar.b, cdcVarA.a(bwgVar, cdbVar));
                                fcv fcvVar = (fcv) ((fio) fcu.d.a(dp.au, (Object) null));
                                fcvVar.c();
                                fcu fcuVar = (fcu) fcvVar.a;
                                if (fdaVar == null) {
                                    throw new NullPointerException();
                                }
                                fcuVar.b = fdaVar;
                                fcuVar.a |= 1;
                                String str = bwgVar.d;
                                fcvVar.c();
                                fcu fcuVar2 = (fcu) fcvVar.a;
                                if (str == null) {
                                    throw new NullPointerException();
                                }
                                fcuVar2.a |= 2;
                                fcuVar2.c = str;
                                fcu fcuVar3 = (fcu) ((fin) fcvVar.h());
                                ews ewsVar = (ews) ((fio) ewr.d.a(dp.au, (Object) null));
                                ewsVar.c();
                                ewr ewrVar = (ewr) ewsVar.a;
                                if (fcuVar3 == null) {
                                    throw new NullPointerException();
                                }
                                ewrVar.c = fcuVar3;
                                ewrVar.b = 1;
                                arrayList.add((ewr) ((fin) ewsVar.h()));
                                z = z2;
                                i3++;
                                z2 = z;
                            } catch (Exception e) {
                                arrayList3.add(fdaVar);
                                btv.c("Policy", e, "Failed apply policy:%s, %s", bwgVar.a, bwgVar.b);
                                btt.a("Policy", e, "apply failed:%s, %s", bwgVar.a, bwgVar.b);
                                a(e);
                                z = (e instanceof bxj) | z2;
                            }
                        }
                    }
                    i = i2 + 1;
                } else {
                    bvjVarM.a(12, btj.b(), (ewr[]) arrayList.toArray(new ewr[0]));
                    supervisionDatabase.f();
                    supervisionDatabase.e();
                    btv.c("Policy", "[%s] Applying %s policies, %s failed, generated %s events", euzVar, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList3.size()), Integer.valueOf(arrayList.size()));
                    btt.a(arrayList2, arrayList3);
                    if (!arrayList.isEmpty()) {
                        if (cdbVar.d) {
                            caw.a(euzVar);
                        } else {
                            cav.a(euzVar);
                        }
                    }
                    return new ccz(a(supervisionDatabase, bwbVarL, false).a | z2, arrayList3);
                }
            }
        } catch (Throwable th) {
            supervisionDatabase.e();
            throw th;
        }
    }

    private static ccz a(SupervisionDatabase supervisionDatabase, bwb bwbVar, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z3 = false;
        if (z) {
        }
        supervisionDatabase.d();
        try {
            bwg[] bwgVarArrB = bwbVar.b();
            int length = bwgVarArrB.length;
            int i = 0;
            while (i < length) {
                bwg bwgVar = bwgVarArrB[i];
                fda fdaVar = (fda) ((fin) ((fdb) ((fio) fda.d.a(dp.au, (Object) null))).a(bwgVar.a).a(bwgVar.b).h());
                arrayList.add(fdaVar);
                fdc fdcVar = bwgVar.a;
                cdc cdcVarA = cda.a(fdcVar);
                if (cdcVarA == null) {
                    btv.d("Policy", "Unknown type:%s", fdcVar);
                    z2 = z3;
                } else {
                    try {
                        cdcVarA.a(bwgVar);
                        bwbVar.a(fdcVar, bwgVar.b);
                        z2 = z3;
                    } catch (Exception e) {
                        arrayList2.add(fdaVar);
                        btv.c("Policy", e, "Failed revoke policy type:%s, %s", fdcVar, bwgVar.b);
                        btt.a("Policy", e, "revoke failed:%s, %s", fdcVar, bwgVar.b);
                        a(e);
                        z2 = z3 | (e instanceof bxj);
                    }
                }
                i++;
                z3 = z2;
            }
            supervisionDatabase.f();
            supervisionDatabase.e();
            Object[] objArr = new Object[3];
            objArr[0] = z ? "all " : "";
            objArr[1] = Integer.valueOf(arrayList.size());
            objArr[2] = Integer.valueOf(arrayList2.size());
            btv.c("Policy", "Revoked %s%s policies, %s failed", objArr);
            btt.b(arrayList, arrayList2);
            return new ccz(z3, arrayList2);
        } catch (Throwable th) {
            supervisionDatabase.e();
            throw th;
        }
    }

    private static void a(Exception exc) {
        if (((fqv) fqu.a.a()).a()) {
            bne bneVar = new bne(exc);
            bneVar.d = "com.google.android.gms.kids";
            bneVar.a = "com.google.android.gms.kids.SILENT_FEEDBACK";
            bneVar.b = true;
            bnc bncVarA = bneVar.a();
            BaseApplicationContext baseApplicationContextA = ayt.a();
            if (bus.a(baseApplicationContextA) >= 11200000) {
                bmw.a(baseApplicationContextA).a(bncVarA);
                return;
            }
            final atp atpVarB = new atq(baseApplicationContextA).a(bmw.a).b();
            atpVarB.b();
            bmw.a(atpVarB, bncVarA).setResultCallback(new atz(atpVarB) { // from class: flm.ccy
                private final atp a;

                {
                    this.a = atpVarB;
                }

                @Override // flm.atz
                public final void a(aty atyVar) {
                    atp atpVar = this.a;
                    btv.c("Policy", "Silent feedback result status code: %s", Integer.valueOf(((Status) atyVar).h));
                    atpVar.d();
                }
            });
        }
    }
}
