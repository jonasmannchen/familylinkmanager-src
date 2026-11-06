package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddc extends ddf {
    private final /* synthetic */ dcq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddc(atp atpVar, dcq dcqVar) {
        super(atpVar);
        this.a = dcqVar;
    }

    @Override // flm.ddf
    protected final void a(dcw dcwVar) {
        dcwVar.a(new ddd(this), this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return status;
    }
}
