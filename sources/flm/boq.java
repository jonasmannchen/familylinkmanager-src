package flm;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class boq implements Runnable {
    public final bol a;
    public final /* synthetic */ boo b;
    private final dme c = div.a().b();

    public boq(boo booVar, bol bolVar) {
        this.b = booVar;
        this.a = bolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Status statusA;
        div.a().a(this.c, new StringBuilder(31).append(this.a.a).append("-AsyncOp-Dispatching").toString());
        Status status = Status.a;
        dth dthVarA = duj.a("AsyncOpTask");
        try {
            try {
                try {
                    this.b.e.onBeforeDispatching();
                    dth dthVarA2 = duj.a("GlobalPreProcessing");
                    try {
                        Iterator it = boo.a.iterator();
                        while (it.hasNext()) {
                            if (!((bov) it.next()).a()) {
                                this.b.e.onAfterExecution();
                                duj.a(dthVarA2);
                                duj.a(dthVarA);
                                return;
                            }
                        }
                        duj.a(dthVarA2);
                        dth dthVarA3 = duj.a("ServicePreProcessing");
                        try {
                            Iterator it2 = this.b.g.iterator();
                            while (it2.hasNext()) {
                                if (!((bov) it2.next()).a()) {
                                    this.b.e.onAfterExecution();
                                    duj.a(dthVarA3);
                                    duj.a(dthVarA);
                                    return;
                                }
                            }
                            duj.a(dthVarA3);
                            dth dthVarA4 = duj.a("AsyncOpImpl");
                            try {
                                bol bolVar = this.a;
                                Context context = this.b.d;
                                bolVar.a();
                                duj.a(dthVarA4);
                                duj.a(dthVarA);
                                statusA = status;
                                boo.c.execute(duc.a(new Runnable(this, statusA) { // from class: flm.bor
                                    private final boq a;
                                    private final Status b;

                                    {
                                        this.a = this;
                                        this.b = statusA;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boq boqVar = this.a;
                                        Status status2 = this.b;
                                        try {
                                            dth dthVarA5 = duj.a("ServicePostProcessing");
                                            try {
                                                Iterator it3 = boqVar.b.h.iterator();
                                                while (it3.hasNext()) {
                                                    ((bou) it3.next()).a(boqVar.a, status2);
                                                }
                                                duj.a(dthVarA5);
                                                dth dthVarA6 = duj.a("GlobalPostProcessing");
                                                try {
                                                    Iterator it4 = boo.b.iterator();
                                                    while (it4.hasNext()) {
                                                        ((bou) it4.next()).a(boqVar.a, status2);
                                                    }
                                                    duj.a(dthVarA6);
                                                    boqVar.b.e.onAfterExecution();
                                                } catch (Throwable th) {
                                                    duj.a(dthVarA6);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                duj.a(dthVarA5);
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            boqVar.b.e.onAfterExecution();
                                            throw th3;
                                        }
                                    }
                                }));
                            } catch (Throwable th) {
                                duj.a(dthVarA4);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            duj.a(dthVarA3);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        duj.a(dthVarA2);
                        throw th3;
                    }
                } catch (bot e) {
                    statusA = this.a.a(e);
                    duj.a(dthVarA);
                }
            } catch (RemoteException e2) {
                statusA = Status.f;
                duj.a(dthVarA);
            }
        } catch (Throwable th4) {
            duj.a(dthVarA);
            throw th4;
        }
    }
}
