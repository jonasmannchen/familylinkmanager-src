package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bkh extends auv {
    public bkh(atp atpVar) {
        super(bjr.a, atpVar);
    }

    @Override // flm.auv, flm.auw
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((aty) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ aty createFailedResult(Status status) {
        return status;
    }
}
