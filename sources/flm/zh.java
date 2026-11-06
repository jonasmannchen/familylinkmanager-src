package flm;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class zh extends BaseAdapter {
    public zi a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public zh(zi ziVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = ziVar;
        this.f = i;
        a();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK = this.d ? this.a.k() : this.a.i();
        if (this.c < 0) {
            return arrayListK.size();
        }
        return arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = view == null ? this.e.inflate(this.f, viewGroup, false) : view;
        int groupId = ((zm) getItem(i)).getGroupId();
        ListMenuItemView listMenuItemView = (ListMenuItemView) viewInflate;
        boolean z = this.a.b() && groupId != (i + (-1) >= 0 ? ((zm) getItem(i + (-1))).getGroupId() : groupId);
        if (listMenuItemView.b != null) {
            listMenuItemView.b.setVisibility((listMenuItemView.d || !z) ? 8 : 0);
        }
        aab aabVar = (aab) viewInflate;
        if (this.b) {
            ListMenuItemView listMenuItemView2 = (ListMenuItemView) viewInflate;
            listMenuItemView2.e = true;
            listMenuItemView2.c = true;
        }
        aabVar.a((zm) getItem(i), 0);
        return viewInflate;
    }

    private final void a() {
        zm zmVar = this.a.i;
        if (zmVar != null) {
            ArrayList arrayListK = this.a.k();
            int size = arrayListK.size();
            for (int i = 0; i < size; i++) {
                if (((zm) arrayListK.get(i)) == zmVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        ArrayList arrayListK = this.d ? this.a.k() : this.a.i();
        if (this.c >= 0 && i >= this.c) {
            i++;
        }
        return (zm) arrayListK.get(i);
    }
}
