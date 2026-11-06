package flm;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class vo implements ux {
    private final /* synthetic */ View a;
    private final /* synthetic */ View b;

    vo(AlertController alertController, View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // flm.ux
    public final void a(NestedScrollView nestedScrollView) {
        AlertController.a(nestedScrollView, this.a, this.b);
    }
}
