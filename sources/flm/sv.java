package flm;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sv extends View.AccessibilityDelegate {
    private final su a;

    sv(su suVar) {
        this.a = suVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        ua uaVarA = ua.a(accessibilityNodeInfo);
        Boolean bool = (Boolean) ti.a().b(view);
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        if (Build.VERSION.SDK_INT >= 28) {
            uaVarA.a.setScreenReaderFocusable(zBooleanValue);
        } else {
            uaVarA.a(1, zBooleanValue);
        }
        Boolean bool2 = (Boolean) ti.b().b(view);
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        if (Build.VERSION.SDK_INT >= 28) {
            uaVarA.a.setHeading(zBooleanValue2);
        } else {
            uaVarA.a(2, zBooleanValue2);
        }
        CharSequence charSequenceC = ti.C(view);
        if (Build.VERSION.SDK_INT >= 28) {
            uaVarA.a.setPaneTitle(charSequenceC);
        } else {
            uaVarA.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceC);
        }
        this.a.a(view, uaVarA);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.a(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ud udVarA = this.a.a(view);
        if (udVarA != null) {
            return (AccessibilityNodeProvider) udVarA.a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.a(view, i, bundle);
    }
}
