package flm;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class zf implements AdapterView.OnItemClickListener, zy {
    public LayoutInflater a;
    public zi b;
    public ExpandedMenuView c;
    public int d;
    public zz e;
    public zg f;
    private Context g;
    private int h;

    public zf(Context context, int i) {
        this(i, 0);
        this.g = context;
        this.a = LayoutInflater.from(this.g);
    }

    private zf(int i, int i2) {
        this.d = i;
        this.h = 0;
    }

    @Override // flm.zy
    public final void a(Context context, zi ziVar) {
        if (this.h != 0) {
            this.g = new ContextThemeWrapper(context, this.h);
            this.a = LayoutInflater.from(this.g);
        } else if (this.g != null) {
            this.g = context;
            if (this.a == null) {
                this.a = LayoutInflater.from(this.g);
            }
        }
        this.b = ziVar;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public final ListAdapter b() {
        if (this.f == null) {
            this.f = new zg(this);
        }
        return this.f;
    }

    @Override // flm.zy
    public final void a(boolean z) {
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    @Override // flm.zy
    public final void a(zz zzVar) {
        this.e = zzVar;
    }

    @Override // flm.zy
    public final boolean a(aai aaiVar) {
        if (!aaiVar.hasVisibleItems()) {
            return false;
        }
        zl zlVar = new zl(aaiVar);
        zi ziVar = zlVar.a;
        vx vxVar = new vx(ziVar.a);
        zlVar.c = new zf(vxVar.a.a, R.layout.abc_list_menu_item_layout);
        zlVar.c.e = zlVar;
        zlVar.a.a(zlVar.c);
        vxVar.a.o = zlVar.c.b();
        vxVar.a.p = zlVar;
        View view = ziVar.h;
        if (view != null) {
            vxVar.a.e = view;
        } else {
            vxVar.a.c = ziVar.g;
            vxVar.a.d = ziVar.f;
        }
        vxVar.a.n = zlVar;
        zlVar.b = vxVar.a();
        zlVar.b.setOnDismissListener(zlVar);
        WindowManager.LayoutParams attributes = zlVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        zlVar.b.show();
        if (this.e != null) {
            this.e.a(aaiVar);
        }
        return true;
    }

    @Override // flm.zy
    public final void a(zi ziVar, boolean z) {
        if (this.e != null) {
            this.e.a(ziVar, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.a((zm) this.f.getItem(i), this, 0);
    }

    @Override // flm.zy
    public final boolean a() {
        return false;
    }

    @Override // flm.zy
    public final boolean b(zm zmVar) {
        return false;
    }

    @Override // flm.zy
    public final boolean c(zm zmVar) {
        return false;
    }
}
