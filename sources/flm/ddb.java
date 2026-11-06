package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ddb extends dde {
    private final /* synthetic */ dda a;

    ddb(dda ddaVar) {
        this.a = ddaVar;
    }

    @Override // flm.dde, flm.dcu
    public final void a(Status status, dcj dcjVar) {
        this.a.setResult((aty) new ddg(status, dcjVar));
    }
}
