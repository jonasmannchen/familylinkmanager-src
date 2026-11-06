package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cxe extends cvd {
    private final /* synthetic */ cuy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cxe(atp atpVar, cuy cuyVar) {
        super(atpVar);
        this.a = cuyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        boolean z = this.a.b;
        cuy cuyVar = this.a;
        ((cws) asyVar).a(this, false, z, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return new cxf(status);
    }
}
