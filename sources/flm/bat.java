package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bat extends baj {
    public final /* synthetic */ bai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bat(bai baiVar, int i, Bundle bundle) {
        super(baiVar, i, bundle);
        this.this$0 = baiVar;
    }

    @Override // flm.baj
    protected final void handleServiceFailure(apx apxVar) {
        if (!this.this$0.enableLocalFallback() || !this.this$0.isLocalServicePresent()) {
            this.this$0.mConnectionProgressReportCallbacks.onReportServiceBinding(apxVar);
            this.this$0.onConnectionFailed(apxVar);
        } else {
            this.this$0.triggerServiceNotAvailable(16);
        }
    }

    @Override // flm.baj
    protected final boolean handleServiceSuccess() {
        this.this$0.mConnectionProgressReportCallbacks.onReportServiceBinding(apx.a);
        return true;
    }
}
