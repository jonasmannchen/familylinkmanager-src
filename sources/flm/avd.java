package flm;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avd {
    private final /* synthetic */ BasePendingResult a;

    public avd(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult.maybeReleaseResult(this.a.mResult);
        super.finalize();
    }
}
