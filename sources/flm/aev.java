package flm;

import android.widget.AbsListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aev implements AbsListView.OnScrollListener {
    private final /* synthetic */ aeq a;

    aev(aeq aeqVar) {
        this.a = aeqVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.h() && this.a.s.getContentView() != null) {
            this.a.p.removeCallbacks(this.a.o);
            this.a.o.run();
        }
    }
}
