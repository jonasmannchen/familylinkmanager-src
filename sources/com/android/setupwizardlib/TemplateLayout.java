package com.android.setupwizardlib;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Keep;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.chimeraresources.R;
import flm.aio;
import flm.air;
import flm.ajc;
import flm.ajh;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TemplateLayout extends FrameLayout {
    public float a;
    public ViewTreeObserver.OnPreDrawListener b;
    private ViewGroup c;
    private final Map d;

    public TemplateLayout(Context context, int i, int i2) {
        super(context);
        this.d = new HashMap();
        a(i, i2, null, R.attr.suwLayoutTheme);
    }

    public TemplateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new HashMap();
        a(0, 0, attributeSet, R.attr.suwLayoutTheme);
    }

    @TargetApi(11)
    public TemplateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new HashMap();
        a(0, 0, attributeSet, i);
    }

    private final void a(int i, int i2, AttributeSet attributeSet, int i3) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aio.ab, i3, 0);
        if (i == 0) {
            i = typedArrayObtainStyledAttributes.getResourceId(aio.ac, 0);
        }
        if (i2 == 0) {
            i2 = typedArrayObtainStyledAttributes.getResourceId(aio.ad, 0);
        }
        super.addView(a(LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        this.c = a(i2);
        if (this.c == null) {
            throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    protected final void a(Class cls, ajc ajcVar) {
        this.d.put(cls, ajcVar);
    }

    public final ajc a(Class cls) {
        return (ajc) this.d.get(cls);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.c.addView(view, i, layoutParams);
    }

    protected final View a(LayoutInflater layoutInflater, int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
        }
        if (i != 0) {
            layoutInflater = LayoutInflater.from(new ajh(layoutInflater.getContext(), i));
        }
        return layoutInflater.inflate(i2, (ViewGroup) this, false);
    }

    protected View a(LayoutInflater layoutInflater, int i) {
        return a(layoutInflater, 0, i);
    }

    protected ViewGroup a(int i) {
        if (i == 0) {
            i = 0;
        }
        return (ViewGroup) findViewById(i);
    }

    @Keep
    @TargetApi(11)
    public void setXFraction(float f) {
        this.a = f;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(width * f);
        } else if (this.b == null) {
            this.b = new air(this);
            getViewTreeObserver().addOnPreDrawListener(this.b);
        }
    }

    @Keep
    @TargetApi(11)
    public float getXFraction() {
        return this.a;
    }
}
