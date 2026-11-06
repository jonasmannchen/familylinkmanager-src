package flm;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class su {
    private static final View.AccessibilityDelegate b = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a = new sv(this);

    public void a(View view, int i) {
        b.sendAccessibilityEvent(view, i);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean d(View view, AccessibilityEvent accessibilityEvent) {
        return b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, ua uaVar) {
        b.onInitializeAccessibilityNodeInfo(view, uaVar.a);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public ud a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new ud(accessibilityNodeProvider);
        }
        return null;
    }

    public boolean a(View view, int i, Bundle bundle) {
        return b.performAccessibilityAction(view, i, bundle);
    }
}
