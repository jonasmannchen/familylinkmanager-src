package flm;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ur extends su {
    private static final Rect g = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager b;
    public final View c;
    private uu l;
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    private final int[] k = new int[2];
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;
    public int f = Integer.MIN_VALUE;

    public ur(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.c = view;
        this.b = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (ti.e(view) == 0) {
            ti.b(view, 1);
        }
    }

    public abstract int a(float f, float f2);

    public abstract void a(int i, ua uaVar);

    public abstract void a(List list);

    public abstract boolean b(int i, int i2);

    @Override // flm.su
    public final ud a(View view) {
        if (this.l == null) {
            this.l = new uu(this);
        }
        return this.l;
    }

    public final boolean a(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.b.isEnabled() || (parent = this.c.getParent()) == null) {
            return false;
        }
        switch (i) {
            case -1:
                accessibilityEventObtain = AccessibilityEvent.obtain(i2);
                this.c.onInitializeAccessibilityEvent(accessibilityEventObtain);
                break;
            default:
                accessibilityEventObtain = AccessibilityEvent.obtain(i2);
                ua uaVarB = b(i);
                accessibilityEventObtain.getText().add(uaVarB.a.getText());
                accessibilityEventObtain.setContentDescription(uaVarB.a.getContentDescription());
                accessibilityEventObtain.setScrollable(uaVarB.a.isScrollable());
                accessibilityEventObtain.setPassword(uaVarB.a.isPassword());
                accessibilityEventObtain.setEnabled(uaVarB.a.isEnabled());
                accessibilityEventObtain.setChecked(uaVarB.a.isChecked());
                a(i, accessibilityEventObtain);
                if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                accessibilityEventObtain.setClassName(uaVarB.a.getClassName());
                accessibilityEventObtain.setSource(this.c, i);
                accessibilityEventObtain.setPackageName(this.c.getContext().getPackageName());
                break;
                break;
        }
        return parent.requestSendAccessibilityEvent(this.c, accessibilityEventObtain);
    }

    public final void a(int i) {
        if (this.f != i) {
            int i2 = this.f;
            this.f = i;
            a(i, 128);
            a(i2, 256);
        }
    }

    final ua b(int i) {
        boolean z;
        if (i == -1) {
            ua uaVarA = ua.a(AccessibilityNodeInfo.obtain(this.c));
            ti.a(this.c, uaVarA);
            ArrayList arrayList = new ArrayList();
            a(arrayList);
            if (uaVarA.a.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                uaVarA.a.addChild(this.c, ((Integer) arrayList.get(i2)).intValue());
            }
            return uaVarA;
        }
        ua uaVarA2 = ua.a(AccessibilityNodeInfo.obtain());
        uaVarA2.a.setEnabled(true);
        uaVarA2.b(true);
        uaVarA2.a("android.view.View");
        uaVarA2.b(g);
        uaVarA2.d(g);
        uaVarA2.a.setParent(this.c);
        a(i, uaVarA2);
        if (uaVarA2.a.getText() == null && uaVarA2.a.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        uaVarA2.a(this.i);
        if (this.i.equals(g)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = uaVarA2.a.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        uaVarA2.a.setPackageName(this.c.getContext().getPackageName());
        uaVarA2.a.setSource(this.c, i);
        if (this.d == i) {
            uaVarA2.c(true);
            uaVarA2.a(128);
        } else {
            uaVarA2.c(false);
            uaVarA2.a(64);
        }
        boolean z2 = this.e == i;
        if (z2) {
            uaVarA2.a(2);
        } else if (uaVarA2.a.isFocusable()) {
            uaVarA2.a(1);
        }
        uaVarA2.a.setFocused(z2);
        this.c.getLocationOnScreen(this.k);
        uaVarA2.c(this.h);
        if (this.h.equals(g)) {
            uaVarA2.a(this.h);
            if (uaVarA2.b != -1) {
                ua uaVarA3 = ua.a(AccessibilityNodeInfo.obtain());
                for (int i3 = uaVarA2.b; i3 != -1; i3 = uaVarA3.b) {
                    View view = this.c;
                    uaVarA3.b = -1;
                    uaVarA3.a.setParent(view, -1);
                    uaVarA3.b(g);
                    a(i3, uaVarA3);
                    uaVarA3.a(this.i);
                    this.h.offset(this.i.left, this.i.top);
                }
                uaVarA3.a.recycle();
            }
            this.h.offset(this.k[0] - this.c.getScrollX(), this.k[1] - this.c.getScrollY());
        }
        if (this.c.getLocalVisibleRect(this.j)) {
            this.j.offset(this.k[0] - this.c.getScrollX(), this.k[1] - this.c.getScrollY());
            if (this.h.intersect(this.j)) {
                uaVarA2.d(this.h);
                Rect rect = this.h;
                if (rect != null && !rect.isEmpty() && this.c.getWindowVisibility() == 0) {
                    Object parent = this.c.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                z = false;
                                break;
                            }
                            parent = view2.getParent();
                        } else {
                            if (parent == null) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    uaVarA2.a.setVisibleToUser(true);
                }
            }
        }
        return uaVarA2;
    }

    final boolean c(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        this.c.invalidate();
        a(i, 65536);
        return true;
    }

    public final boolean d(int i) {
        if (this.e != i) {
            return false;
        }
        this.e = Integer.MIN_VALUE;
        a(i, 8);
        return true;
    }

    public void a(int i, AccessibilityEvent accessibilityEvent) {
    }

    static {
        new us();
        new ut();
    }
}
