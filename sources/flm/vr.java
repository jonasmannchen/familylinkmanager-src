package flm;

import android.support.v7.app.AlertController;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class vr implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ View b;
    private final /* synthetic */ AlertController c;

    vr(AlertController alertController, View view, View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.a(this.c.g, this.a, this.b);
    }
}
