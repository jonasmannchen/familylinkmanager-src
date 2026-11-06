package flm;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dfd extends ContentObserver {
    dfd(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        dfc.d.set(true);
    }
}
