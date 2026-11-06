package flm;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdl extends cdc {
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) throws bxi {
        if (((fbw) fin.b(fbw.c, bwgVar.f)).b) {
            BaseApplicationContext baseApplicationContextA = ayt.a();
            Account accountC = bts.c();
            if (((fqj) fqi.a.a()).a()) {
                dcf dcfVar = new dcf();
                dcfVar.a = accountC;
                bdi.checkNotNull(dcfVar.a, "Must provide a valid account!");
                final dcn dcnVarA = dcc.a(baseApplicationContextA, new dce(dcfVar));
                dch dchVar = new dch(new int[]{10, 9});
                dcz dczVar = dcnVarA.g;
                atp atpVar = dcnVarA.e;
                dbh dbhVarB = bda.toTask(atpVar.a(new dda(atpVar, dchVar)), new dco()).b(bur.a, new dap(dcnVarA) { // from class: flm.cdm
                    private final dcn a;

                    {
                        this.a = dcnVarA;
                    }

                    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
                    @Override // flm.dap
                    public final Object a(dbh dbhVar) {
                        boolean z;
                        boolean z2;
                        dcn dcnVar = this.a;
                        dcj dcjVar = (dcj) dbhVar.d();
                        if (dcjVar == null) {
                            z = false;
                            z2 = false;
                        } else if (dcjVar.a != null) {
                            z = false;
                            z2 = false;
                            for (dcl dclVar : dcjVar.a) {
                                if (dclVar.a == 10) {
                                    z2 = dclVar.b == 2;
                                }
                                z = dclVar.a == 9 ? dclVar.b == 2 : z;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2 && z) {
                            dbo dboVar = new dbo();
                            dboVar.a((Object) null);
                            return dboVar;
                        }
                        dcq dcqVar = new dcq((dcs[]) new dcr().a(new dcs(9, true)).a(new dcs(10, true)).a.toArray(new dcs[0]));
                        dcz dczVar2 = dcnVar.g;
                        atp atpVar2 = dcnVar.e;
                        return bda.toVoidTask(atpVar2.a(new ddc(atpVar2, dcqVar))).a(bur.a, cdn.a);
                    }
                });
                try {
                    bdi.checkNotMainThread();
                    bdi.checkNotNull(dbhVarB, "Task must not be null");
                    if (dbhVarB.a()) {
                        dbp.a(dbhVarB);
                    } else {
                        dbq dbqVar = new dbq();
                        dbp.a(dbhVarB, dbqVar);
                        dbqVar.a.await();
                        dbp.a(dbhVarB);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new bxi("Updating Lockbox UDC settings is interrupted", e);
                } catch (ExecutionException e2) {
                    throw new bxi("Failed to update Lockbox UDC settings", e2);
                }
            } else {
                atq atqVarA = new atq(baseApplicationContextA).a(cuc.a);
                atqVarA.a = accountC;
                atp atpVarB = atqVarA.b();
                apx apxVarC = atpVarB.c();
                if (!apxVarC.b()) {
                    throw new bxj(String.format("Connection Lockbox failed, code: %s", apxVarC));
                }
                try {
                    cuh cuhVar = (cuh) cuc.b.a(atpVarB, accountC).await();
                    if (!cuhVar.b().a()) {
                        throw new bxj(String.format("Failed getting Lockbox settings: %s", cuhVar.b()));
                    }
                    if (cuhVar.a() && cuhVar.c()) {
                        btv.a("Policy", "No need to update Lockbox settings.", new Object[0]);
                        atpVarB.d();
                    } else {
                        cuj cujVar = new cuj();
                        cujVar.a = 1;
                        cujVar.b = 1;
                        if (!((Status) cuc.b.a(atpVarB, accountC, new cui(cujVar.a, cujVar.b)).await()).a()) {
                            throw new bxj(String.format("Failed to update Lockbox settings: %s", cuhVar.b()));
                        }
                        btt.g();
                        atpVarB.d();
                    }
                } catch (Throwable th) {
                    atpVarB.d();
                    throw th;
                }
            }
        } else {
            btv.d("Policy", "LockBox is not opt in, ignore", new Object[0]);
        }
        return 2;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
    }
}
