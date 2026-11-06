package flm;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class uw extends su {
    @Override // flm.su
    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        switch (i) {
            case 4096:
                int iMin = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.a());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(0, iMin);
                return true;
            case 8192:
                int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(0, iMax);
                return true;
            default:
                return false;
        }
    }

    @Override // flm.su
    public final void a(View view, ua uaVar) {
        int iA;
        super.a(view, uaVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        uaVar.a((CharSequence) ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (iA = nestedScrollView.a()) > 0) {
            uaVar.d(true);
            if (nestedScrollView.getScrollY() > 0) {
                uaVar.a(8192);
            }
            if (nestedScrollView.getScrollY() < iA) {
                uaVar.a(4096);
            }
        }
    }

    @Override // flm.su
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.a() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.a());
    }
}
