package flm;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class zg extends BaseAdapter {
    private int a = -1;
    private final /* synthetic */ zf b;

    public zg(zf zfVar) {
        this.b = zfVar;
        a();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.b.b.k().size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = view == null ? this.b.a.inflate(this.b.d, viewGroup, false) : view;
        ((aab) viewInflate).a((zm) getItem(i), 0);
        return viewInflate;
    }

    private final void a() {
        zm zmVar = this.b.b.i;
        if (zmVar != null) {
            ArrayList arrayListK = this.b.b.k();
            int size = arrayListK.size();
            for (int i = 0; i < size; i++) {
                if (((zm) arrayListK.get(i)) == zmVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        ArrayList arrayListK = this.b.b.k();
        if (this.a >= 0 && i >= this.a) {
            i++;
        }
        return (zm) arrayListK.get(i);
    }
}
