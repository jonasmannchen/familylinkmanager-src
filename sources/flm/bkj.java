package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkj implements bkt {
    private final /* synthetic */ bke a;

    public bkj(bke bkeVar) {
        this.a = bkeVar;
    }

    @Override // flm.bkt
    public final void a(Status status) {
        if (!status.a() || this.a == null) {
            return;
        }
        bke bkeVar = this.a;
        synchronized (bkeVar.d) {
            bkeVar.b = null;
            bkeVar.c = null;
        }
    }
}
