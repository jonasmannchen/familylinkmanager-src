package flm;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class vt implements AdapterView.OnItemClickListener {
    private final /* synthetic */ AlertController a;
    private final /* synthetic */ vs b;

    vt(vs vsVar, AlertController alertController) {
        this.b = vsVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.p.onClick(this.a.b, i);
        this.a.b.dismiss();
    }
}
