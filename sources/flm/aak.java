package flm;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aak extends ViewGroup {
    public final Context a;
    public ActionMenuView b;
    public aat c;
    public int d;
    public tt e;
    private final aal f;
    private boolean g;
    private boolean h;

    aak(Context context) {
        this(context, null);
    }

    aak(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aak(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new aal(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.a = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.a = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, xl.a, R.attr.actionBarStyle, 0);
        a(typedArrayObtainStyledAttributes.getLayoutDimension(xl.l, 0));
        typedArrayObtainStyledAttributes.recycle();
        if (this.c != null) {
            aat aatVar = this.c;
            aatVar.g = yf.a(aatVar.b).a();
            if (aatVar.c != null) {
                aatVar.c.b(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public void a(int i) {
        this.d = i;
        requestLayout();
    }

    public tt a(int i, long j) {
        if (this.e != null) {
            this.e.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            tt ttVarA = ti.l(this).a(1.0f);
            ttVarA.a(j);
            ttVarA.a(this.f.a(ttVarA, i));
            return ttVarA;
        }
        tt ttVarA2 = ti.l(this).a(0.0f);
        ttVarA2.a(j);
        ttVarA2.a(this.f.a(ttVarA2, i));
        return ttVarA2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.e != null) {
                this.e.a();
            }
            super.setVisibility(i);
        }
    }

    public boolean a() {
        if (this.c != null) {
            return this.c.b();
        }
        return false;
    }

    public static int a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
