package flm;

import android.support.v7.widget.Toolbar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahg implements Runnable {
    private final /* synthetic */ Toolbar a;

    public ahg(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c();
    }
}
