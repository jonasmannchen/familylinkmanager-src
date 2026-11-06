package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddg implements aty, dcg {
    private final Status a;
    private final dcj b;

    public ddg(Status status, dcj dcjVar) {
        this.a = status;
        this.b = dcjVar;
    }

    @Override // flm.dcg
    public final dcj a() {
        return this.b;
    }

    @Override // flm.aty
    public final Status b() {
        return this.a;
    }
}
