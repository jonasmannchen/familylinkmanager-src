package flm;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class drd extends ContentObserver {
    drd(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        drf.a.incrementAndGet();
    }
}
