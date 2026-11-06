package flm;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class zv implements AdapterView.OnItemClickListener, aae, zy {
    public Rect g;

    zv() {
    }

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(PopupWindow.OnDismissListener onDismissListener);

    public abstract void a(zi ziVar);

    public abstract void b(int i);

    public abstract void b(boolean z);

    public abstract void c(int i);

    public abstract void c(boolean z);

    @Override // flm.zy
    public final void a(Context context, zi ziVar) {
    }

    @Override // flm.zy
    public final boolean b(zm zmVar) {
        return false;
    }

    @Override // flm.zy
    public final boolean c(zm zmVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        a(listAdapter).a.a((MenuItem) listAdapter.getItem(i), this, f() ? 0 : 4);
    }

    protected static int a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            ViewGroup frameLayout = viewGroup2 == null ? new FrameLayout(context) : viewGroup2;
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth < i) {
                if (measuredWidth <= i4) {
                    measuredWidth = i4;
                }
                i2++;
                i4 = measuredWidth;
                viewGroup2 = frameLayout;
            } else {
                return i;
            }
        }
        return i4;
    }

    protected static zh a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (zh) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (zh) listAdapter;
    }

    protected static boolean b(zi ziVar) {
        int size = ziVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = ziVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected boolean f() {
        return true;
    }
}
