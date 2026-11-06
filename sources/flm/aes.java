package flm;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aes implements AdapterView.OnItemSelectedListener {
    private final /* synthetic */ aeq a;

    aes(aeq aeqVar) {
        this.a = aeqVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ado adoVar;
        if (i == -1 || (adoVar = this.a.e) == null) {
            return;
        }
        adoVar.a = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
