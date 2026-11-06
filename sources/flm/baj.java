package flm;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class baj extends ban {
    public final Bundle resolution;
    public final int statusCode;
    public final /* synthetic */ bai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected baj(bai baiVar, int i, Bundle bundle) {
        super(baiVar, true);
        this.this$0 = baiVar;
        this.statusCode = i;
        this.resolution = bundle;
    }

    protected abstract void handleServiceFailure(apx apxVar);

    protected abstract boolean handleServiceSuccess();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ban
    public void deliverCallback(Boolean bool) {
        if (bool != null) {
            switch (this.statusCode) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    if (handleServiceSuccess()) {
                        return;
                    }
                    this.this$0.setConnectState(1, null);
                    handleServiceFailure(new apx(8, null));
                    return;
                case 10:
                    this.this$0.setConnectState(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), this.this$0.getStartServiceAction(), this.this$0.getServiceDescriptor()));
                default:
                    this.this$0.setConnectState(1, null);
                    handleServiceFailure(new apx(this.statusCode, this.resolution != null ? (PendingIntent) this.resolution.getParcelable(bai.KEY_PENDING_INTENT) : null));
                    return;
            }
        }
        this.this$0.setConnectState(1, null);
    }

    @Override // flm.ban
    protected void onDeliverCallbackFailed() {
    }
}
