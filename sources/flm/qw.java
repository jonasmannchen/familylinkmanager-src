package flm;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qw implements rh {
    private final /* synthetic */ pk a;
    private final /* synthetic */ Handler b;

    qw(pk pkVar, Handler handler) {
        this.a = pkVar;
        this.b = handler;
    }

    @Override // flm.rh
    public final /* synthetic */ void a(Object obj) {
        rb rbVar = (rb) obj;
        if (rbVar == null) {
            this.a.a(1, this.b);
        } else if (rbVar.b == 0) {
            this.a.a(rbVar.a, this.b);
        } else {
            this.a.a(rbVar.b, this.b);
        }
    }
}
