package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dda extends ddf {
    private final /* synthetic */ dch a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dda(atp atpVar, dch dchVar) {
        super(atpVar);
        this.a = dchVar;
    }

    @Override // flm.ddf
    protected final void a(dcw dcwVar) {
        dcwVar.a(new ddb(this), this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return new ddg(status, null);
    }
}
