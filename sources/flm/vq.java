package flm;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class vq implements AbsListView.OnScrollListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ View b;

    vq(AlertController alertController, View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.a(absListView, this.a, this.b);
    }
}
