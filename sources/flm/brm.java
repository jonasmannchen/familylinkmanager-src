package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class brm extends brl {
    public brm(atp atpVar) {
        super(atpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ aty createFailedResult(Status status) {
        if (status == null) {
            return Status.c;
        }
        return status;
    }
}
