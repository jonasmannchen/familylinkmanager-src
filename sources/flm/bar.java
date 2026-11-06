package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bar implements bao {
    public final /* synthetic */ bai this$0;

    public bar(bai baiVar) {
        this.this$0 = baiVar;
    }

    @Override // flm.bao
    public final void onReportServiceBinding(apx apxVar) {
        if (apxVar.b()) {
            this.this$0.getRemoteService(null, this.this$0.getScopes());
        } else if (this.this$0.mConnectionFailedListener != null) {
            this.this$0.mConnectionFailedListener.onConnectionFailed(apxVar);
        }
    }
}
