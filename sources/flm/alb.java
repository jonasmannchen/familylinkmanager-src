package flm;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class alb implements ala {
    alb() {
    }

    @Override // flm.ala
    public final Handler a(Looper looper) {
        return new cqr(looper);
    }
}
