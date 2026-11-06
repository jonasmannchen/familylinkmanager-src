package flm;

import android.support.design.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gl implements hb {
    private final /* synthetic */ BaseTransientBottomBar a;

    public gl(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // flm.hb
    public final void a() {
        BaseTransientBottomBar.a.sendMessage(BaseTransientBottomBar.a.obtainMessage(0, this.a));
    }

    @Override // flm.hb
    public final void a(int i) {
        BaseTransientBottomBar.a.sendMessage(BaseTransientBottomBar.a.obtainMessage(1, i, 0, this.a));
    }
}
