package flm;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class za implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ yz a;

    za(yz yzVar) {
        this.a = yzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.d() || this.a.b.size() <= 0 || ((ze) this.a.b.get(0)).a.r) {
            return;
        }
        View view = this.a.d;
        if (view == null || !view.isShown()) {
            this.a.c();
            return;
        }
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((ze) it.next()).a.b();
        }
    }
}
