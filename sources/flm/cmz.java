package flm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmz extends ArrayAdapter {
    public cmz(Context context) {
        super(context, 0, new ArrayList());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        cpm cpmVar;
        if (view instanceof cpm) {
            cpmVar = (cpm) view;
        } else {
            cpmVar = new cpm(getContext());
        }
        evd evdVar = (evd) dvl.a((evd) getItem(i));
        return cpmVar.a(evdVar.b).a(evdVar.d).b(evdVar.c);
    }
}
