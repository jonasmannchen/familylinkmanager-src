package flm;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hu implements ViewGroup.OnHierarchyChangeListener {
    private final /* synthetic */ CoordinatorLayout a;

    public hu(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (this.a.e != null) {
            this.a.e.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        this.a.a(2);
        if (this.a.e != null) {
            this.a.e.onChildViewRemoved(view, view2);
        }
    }
}
