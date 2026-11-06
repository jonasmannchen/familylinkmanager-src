package flm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cja extends ArrayAdapter {
    public cja(Context context, List list) {
        super(context, 0, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        cpe cpeVar;
        if (view != null) {
            cpeVar = (cpe) view;
        } else {
            cpeVar = new cpe(getContext());
        }
        etm etmVar = (etm) getItem(i);
        coj.a(cpeVar.a, etmVar.d);
        cpeVar.b.setText(etmVar.b);
        cpeVar.c.setText(etmVar.c);
        return cpeVar;
    }
}
