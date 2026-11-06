package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class bmz extends auv {
    public bmz(atp atpVar) {
        super(bmw.a, atpVar);
    }

    @Override // flm.auv, flm.auw
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((aty) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ aty createFailedResult(Status status) {
        if (status == null) {
            return Status.c;
        }
        return status;
    }
}
