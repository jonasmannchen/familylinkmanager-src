package flm;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hv extends ViewGroup.MarginLayoutParams {
    public hs a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public final Rect o;
    private boolean p;
    private boolean q;

    public hv(int i, int i2) {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
    }

    public hv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dy.b);
        this.c = typedArrayObtainStyledAttributes.getInteger(dy.c, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(dy.d, -1);
        this.d = typedArrayObtainStyledAttributes.getInteger(dy.e, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(dy.i, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(dy.h, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(dy.g, 0);
        this.b = typedArrayObtainStyledAttributes.hasValue(dy.f);
        if (this.b) {
            this.a = CoordinatorLayout.a(context, attributeSet, typedArrayObtainStyledAttributes.getString(dy.f));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (this.a != null) {
            this.a.a(this);
        }
    }

    public hv(hv hvVar) {
        super((ViewGroup.MarginLayoutParams) hvVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
    }

    public hv(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
    }

    public hv(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
    }

    public final void a(hs hsVar) {
        if (this.a != hsVar) {
            this.a = hsVar;
            this.b = true;
            if (hsVar != null) {
                hsVar.a(this);
            }
        }
    }

    public final void a(int i, boolean z) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                this.p = z;
                break;
            case 1:
                this.q = z;
                break;
        }
    }

    public final boolean a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return this.p;
            case 1:
                return this.q;
            default:
                return false;
        }
    }
}
