package flm;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cqc extends BaseAdapter {
    private int a = 0;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();

    public abstract int a(int i);

    public abstract View a(int i, int i2, View view);

    public abstract View a(int i, View view);

    public abstract View a(ViewGroup viewGroup);

    public abstract Object a(int i, int i2);

    public abstract void a();

    public abstract int b();

    public abstract Object b(int i);

    public abstract View c();

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return !c(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() <= 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return c(i) ? 1 : 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (c(i)) {
            return b(d(i));
        }
        return a(d(i), e(i));
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (c(i)) {
            return a(d(i), view);
        }
        return a(d(i), e(i), view);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        d();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        d();
        super.notifyDataSetInvalidated();
    }

    public final boolean c(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    public final int d(int i) {
        if (i < 0 || i >= this.c.size()) {
            return -1;
        }
        return ((Integer) this.c.get(i)).intValue();
    }

    private final int e(int i) {
        return (i - ((Integer) this.b.get(d(i))).intValue()) - 1;
    }

    private final void d() {
        int iB = b();
        this.a = 0;
        this.b.clear();
        this.c.clear();
        for (int i = 0; i < iB; i++) {
            this.b.add(i, Integer.valueOf(this.a));
            int iA = a(i) + 1;
            this.c.addAll(Collections.nCopies(iA, Integer.valueOf(i)));
            this.a = iA + this.a;
        }
    }
}
