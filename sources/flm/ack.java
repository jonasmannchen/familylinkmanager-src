package flm;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ack implements AdapterView.OnItemClickListener {
    private final /* synthetic */ acj a;

    ack(acj acjVar, acg acgVar) {
        this.a = acjVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            this.a.d.performItemClick(view, i, this.a.b.getItemId(i));
        }
        this.a.c();
    }
}
