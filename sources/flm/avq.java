package flm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avq implements atu {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ avp b;

    avq(avp avpVar, BasePendingResult basePendingResult) {
        this.b = avpVar;
        this.a = basePendingResult;
    }

    @Override // flm.atu
    public final void onComplete(Status status) {
        this.b.a.remove(this.a);
    }
}
