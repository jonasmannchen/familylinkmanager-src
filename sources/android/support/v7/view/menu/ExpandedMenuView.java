package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import flm.aaa;
import flm.ahe;
import flm.zi;
import flm.zk;
import flm.zm;
import flm.zy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, aaa, zk {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private zi b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ahe aheVarA = ahe.a(context, attributeSet, a, i, 0);
        if (aheVarA.f(0)) {
            setBackgroundDrawable(aheVarA.a(0));
        }
        if (aheVarA.f(1)) {
            setDivider(aheVarA.a(1));
        }
        aheVarA.b.recycle();
    }

    @Override // flm.aaa
    public final void a(zi ziVar) {
        this.b = ziVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // flm.zk
    public final boolean a(zm zmVar) {
        return this.b.a(zmVar, (zy) null, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((zm) getAdapter().getItem(i));
    }
}
