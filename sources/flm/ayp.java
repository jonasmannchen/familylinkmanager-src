package flm;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ayp implements ayr {
    private final /* synthetic */ ayo a;

    ayp(ayo ayoVar) {
        this.a = ayoVar;
    }

    @Override // flm.ayr
    public final void a(BasePendingResult basePendingResult) {
        this.a.c.remove(basePendingResult);
        if (basePendingResult.getResultId() != null) {
            ayo ayoVar = this.a;
        }
    }
}
