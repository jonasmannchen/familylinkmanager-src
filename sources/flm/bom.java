package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bom implements bou {
    private final Object a = new Object();
    private aon b;

    public bom() {
        aob aobVar = new aob(ayt.a(), "GMSCORE_API_COUNTERS", null);
        aobVar.a(fnk.UNMETERED_OR_DAILY);
        this.b = new aon(aobVar, aobVar.e, 1000);
        this.b.a();
    }

    @Override // flm.bou
    public final void a(bol bolVar, Status status) {
        bof bofVarA;
        if (fom.b()) {
            if (!((fpk) fpj.a.a()).a()) {
                bofVarA = null;
            } else {
                bofVarA = bpj.a();
            }
            synchronized (this.a) {
                if (bofVarA != null) {
                    aon aonVar = this.b;
                    byte[] bArrB = bofVarA.b();
                    aonVar.h.writeLock().lock();
                    try {
                        aonVar.j = bArrB;
                        aonVar.k = (Integer) aonVar.l.get(aonVar.j);
                        aonVar.h.writeLock().unlock();
                    } catch (Throwable th) {
                        aonVar.h.writeLock().unlock();
                        throw th;
                    }
                }
                this.b.c(bolVar.b()).a(status.h);
            }
        }
    }

    @Override // flm.bou
    public final void a() {
        if (fom.b()) {
            this.b.c();
        }
    }
}
