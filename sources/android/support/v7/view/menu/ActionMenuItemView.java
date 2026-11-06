package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import flm.aab;
import flm.abb;
import flm.acp;
import flm.adx;
import flm.ahq;
import flm.xl;
import flm.yu;
import flm.yv;
import flm.zk;
import flm.zm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends acp implements View.OnClickListener, aab, abb {
    public zm b;
    public zk c;
    public yv d;
    private CharSequence e;
    private Drawable f;
    private adx g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.h = f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xl.v, i, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(xl.w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = f();
        g();
    }

    private final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // flm.aab
    public final zm a() {
        return this.b;
    }

    @Override // flm.aab
    public final void a(zm zmVar, int i) {
        this.b = zmVar;
        Drawable icon = zmVar.getIcon();
        this.f = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            if (intrinsicWidth > this.k) {
                float f = this.k / intrinsicWidth;
                intrinsicWidth = this.k;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.k) {
                float f2 = this.k / intrinsicHeight;
                intrinsicHeight = this.k;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, null, null, null);
        g();
        this.e = zmVar.a(this);
        g();
        setId(zmVar.getItemId());
        setVisibility(zmVar.isVisible() ? 0 : 8);
        setEnabled(zmVar.isEnabled());
        if (zmVar.hasSubMenu() && this.g == null) {
            this.g = new yu(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.hasSubMenu() && this.g != null && this.g.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.c != null) {
            this.c.a(this.b);
        }
    }

    @Override // flm.aab
    public final boolean b() {
        return true;
    }

    private final void g() {
        boolean z = false;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f == null || ((this.b.e & 4) == 4 && this.h)) {
            z = true;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.e : null);
        CharSequence contentDescription = this.b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            ahq.a(this, z3 ? null : this.b.getTitle());
        } else {
            ahq.a(this, tooltipText);
        }
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // flm.abb
    public final boolean d() {
        return c() && this.b.getIcon() == null;
    }

    @Override // flm.abb
    public final boolean e() {
        return c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.acp, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean zC = c();
        if (zC && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zC && this.f != null) {
            super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
