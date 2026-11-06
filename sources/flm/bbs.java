package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bbs implements bal {
    public final /* synthetic */ ats val$callbacks;

    bbs(ats atsVar) {
        this.val$callbacks = atsVar;
    }

    @Override // flm.bal
    public final void onConnectionFailed(apx apxVar) {
        this.val$callbacks.a(apxVar);
    }
}
