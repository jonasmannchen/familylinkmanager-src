package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class deh extends ddq {
    deh(atp atpVar) {
        super(atpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        ((dec) ((dei) asyVar).getService()).a(new del(this));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return new def(status, null);
    }
}
