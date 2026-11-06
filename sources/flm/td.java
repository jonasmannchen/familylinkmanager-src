package flm;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class td {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public td(View view) {
        this.d = view;
    }

    public final void a(boolean z) {
        if (this.a) {
            ti.v(this.d);
        }
        this.a = z;
    }

    public final boolean a(int i) {
        return c(i) != null;
    }

    public final boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (this.a) {
            View view = this.d;
            for (ViewParent parent = this.d.getParent(); parent != null; parent = parent.getParent()) {
                if (ts.a(parent, view, this.d, i, i2)) {
                    a(i2, parent);
                    View view2 = this.d;
                    if (parent instanceof te) {
                        ((te) parent).b(view, view2, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view2, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void b(int i) {
        ViewParent viewParentC = c(i);
        if (viewParentC != null) {
            View view = this.d;
            if (viewParentC instanceof te) {
                ((te) viewParentC).b(view, i);
            } else if (i == 0) {
                try {
                    viewParentC.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e);
                }
            }
            a(i, (ViewParent) null);
        }
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return b(i, i2, i3, i4, iArr, 0, null);
    }

    public final void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentC;
        int i6;
        int i7;
        if (!this.a || (viewParentC = c(i5)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            if (iArr == null) {
                i6 = 0;
                i7 = 0;
            } else {
                this.d.getLocationInWindow(iArr);
                int i8 = iArr[0];
                i6 = iArr[1];
                i7 = i8;
            }
            if (iArr2 == null) {
                iArr2 = a();
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            View view = this.d;
            if (viewParentC instanceof tf) {
                ((tf) viewParentC).a(i4, i5, iArr2);
            } else {
                iArr2[0] = iArr2[0] + i3;
                iArr2[1] = iArr2[1] + i4;
                if (viewParentC instanceof te) {
                    ((te) viewParentC).a(view, i, i2, i3, i4, i5);
                } else if (i5 == 0) {
                    try {
                        viewParentC.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedScroll", e);
                    }
                }
            }
            if (iArr != null) {
                this.d.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i7;
                iArr[1] = iArr[1] - i6;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (this.a) {
            ViewParent viewParentC = c(i3);
            if (viewParentC == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    int i6 = iArr2[0];
                    i4 = iArr2[1];
                    i5 = i6;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int[] iArrA = iArr == null ? a() : iArr;
                iArrA[0] = 0;
                iArrA[1] = 0;
                View view = this.d;
                if (viewParentC instanceof te) {
                    ((te) viewParentC).a(view, i, i2, iArrA, i3);
                } else if (i3 == 0) {
                    try {
                        viewParentC.onNestedPreScroll(view, i, i2, iArrA);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreScroll", e);
                    }
                }
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArrA[0] == 0 && iArrA[1] == 0) ? false : true;
            }
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent viewParentC;
        if (!this.a || (viewParentC = c(0)) == null) {
            return false;
        }
        return ts.a(viewParentC, this.d, f, f2, z);
    }

    public final boolean a(float f, float f2) {
        ViewParent viewParentC;
        if (!this.a || (viewParentC = c(0)) == null) {
            return false;
        }
        return ts.a(viewParentC, this.d, f, f2);
    }

    private final ViewParent c(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return this.b;
            case 1:
                return this.c;
            default:
                return null;
        }
    }

    private final void a(int i, ViewParent viewParent) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                this.b = viewParent;
                break;
            case 1:
                this.c = viewParent;
                break;
        }
    }

    private final int[] a() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }
}
