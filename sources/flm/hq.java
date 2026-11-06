package flm;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hq implements th {
    private final /* synthetic */ CoordinatorLayout a;

    public hq(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // flm.th
    public final tz a(View view, tz tzVar) {
        int i = 0;
        CoordinatorLayout coordinatorLayout = this.a;
        if (!si.a(coordinatorLayout.c, tzVar)) {
            coordinatorLayout.c = tzVar;
            coordinatorLayout.d = tzVar != null && tzVar.b() > 0;
            coordinatorLayout.setWillNotDraw(!coordinatorLayout.d && coordinatorLayout.getBackground() == null);
            if (!tzVar.e()) {
                int childCount = coordinatorLayout.getChildCount();
                tz tzVar2 = tzVar;
                while (i < childCount) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (ti.p(childAt) && ((hv) childAt.getLayoutParams()).a != null && tzVar2.e()) {
                        break;
                    }
                    i++;
                    tzVar2 = tzVar2;
                }
                tzVar = tzVar2;
            }
            coordinatorLayout.requestLayout();
        }
        return tzVar;
    }
}
