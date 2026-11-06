package flm;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ua {
    public final AccessibilityNodeInfo a;
    public int b = -1;

    private ua(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static ua a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new ua(accessibilityNodeInfo);
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public final void a(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void b(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void c(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void d(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void a(boolean z) {
        this.a.setCheckable(z);
    }

    @Deprecated
    public final void b(boolean z) {
        this.a.setFocusable(true);
    }

    public final void c(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    @Deprecated
    public final void d(boolean z) {
        this.a.setScrollable(true);
    }

    public final void a(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void a(Object obj) {
        this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((uc) obj).a);
    }

    public final void e(boolean z) {
        this.a.setDismissable(z);
    }

    public final int hashCode() {
        if (this.a == null) {
            return 0;
        }
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ua uaVar = (ua) obj;
            if (this.a == null) {
                return uaVar.a == null;
            }
            return this.a.equals(uaVar.a);
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(this.a.getPackageName());
        sb.append("; className: ").append(this.a.getClassName());
        sb.append("; text: ").append(this.a.getText());
        sb.append("; contentDescription: ").append(this.a.getContentDescription());
        sb.append("; viewId: ").append(this.a.getViewIdResourceName());
        sb.append("; checkable: ").append(this.a.isCheckable());
        sb.append("; checked: ").append(this.a.isChecked());
        sb.append("; focusable: ").append(this.a.isFocusable());
        sb.append("; focused: ").append(this.a.isFocused());
        sb.append("; selected: ").append(this.a.isSelected());
        sb.append("; clickable: ").append(this.a.isClickable());
        sb.append("; longClickable: ").append(this.a.isLongClickable());
        sb.append("; enabled: ").append(this.a.isEnabled());
        sb.append("; password: ").append(this.a.isPassword());
        sb.append("; scrollable: " + this.a.isScrollable());
        sb.append("; [");
        int actions = this.a.getActions();
        while (actions != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            int i = (iNumberOfTrailingZeros ^ (-1)) & actions;
            switch (iNumberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            sb.append(str);
            if (i != 0) {
                sb.append(", ");
            }
            actions = i;
        }
        sb.append("]");
        return sb.toString();
    }

    public final void a(int i, boolean z) {
        Bundle extras = this.a.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i);
        }
    }
}
