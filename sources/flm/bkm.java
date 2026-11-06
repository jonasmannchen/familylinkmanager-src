package flm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkm extends bkx {
    private final bkt a;
    private auw b;
    private auw c;
    private auw d;
    private auw e;
    private auw f;
    private auw g;
    private auw h;

    public static bkm a(auw auwVar, bkt bktVar) {
        return new bkm(auwVar, null, null, null, null, null, null, bktVar);
    }

    protected bkm() {
        this.a = null;
    }

    private bkm(auw auwVar, auw auwVar2, auw auwVar3, auw auwVar4, auw auwVar5, auw auwVar6, auw auwVar7, bkt bktVar) {
        this.b = auwVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.a = bktVar;
    }

    @Override // flm.bkw
    public final void a(Status status) {
        if (this.b == null) {
            alc.a("ContextManagerPendingResult", "Unexpected callback to onStatusResult.");
            return;
        }
        this.b.setResult(status);
        this.b = null;
        b(status);
    }

    @Override // flm.bkw
    public final void a(Status status, DataHolder dataHolder) {
        if (this.c == null) {
            alc.a("ContextManagerPendingResult", "Unexpected callback to onReadResult.");
            return;
        }
        this.c.setResult(new bkn(dataHolder, status));
        this.c = null;
        b(status);
    }

    @Override // flm.bkw
    public final void a(Status status, blo bloVar) {
        if (this.d == null) {
            alc.a("ContextManagerPendingResult", "Unexpected callback to onWriteBatchResult");
            return;
        }
        this.d.setResult(new bko(status, bloVar));
        this.d = null;
        b(status);
    }

    @Override // flm.bkw
    public final void b(Status status, DataHolder dataHolder) {
        if (this.e == null) {
            alc.a("ContextManagerPendingResult", "Unexpected callback to onStateResult");
            return;
        }
        this.e.setResult(new bkp(dataHolder, status));
        this.e = null;
        b(status);
    }

    @Override // flm.bkw
    public final void a(Status status, ane aneVar) {
        if (this.f == null) {
            alc.a("ContextManagerPendingResult", "Unexpected callback to onSnapshotResult");
            return;
        }
        this.f.setResult(new bkq(status, aneVar));
        this.f = null;
        b(status);
    }

    @Override // flm.bkw
    public final void a(Status status, bjy bjyVar) {
        if (this.g == null) {
            alc.a("ContextManagerPendingResult", "Unexpected callback to onFenceQueryResult");
            return;
        }
        this.g.setResult(new bkr(bjyVar, status));
        this.g = null;
        b(status);
    }

    @Override // flm.bkw
    public final void a(Status status, bjw bjwVar) {
        if (this.h == null) {
            alc.a("ContextManagerPendingResult", "Unexpected callback to onFenceEvaluateResult");
            return;
        }
        this.h.setResult(new bks(bjwVar, status));
        this.h = null;
        b(status);
    }

    private final void b(Status status) {
        if (this.a != null) {
            this.a.a(status);
        }
    }
}
