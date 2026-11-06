package flm;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dez extends ContentObserver {
    private final /* synthetic */ dfb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dez(Handler handler, dfb dfbVar) {
        super(null);
        this.a = dfbVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b.set(true);
    }
}
