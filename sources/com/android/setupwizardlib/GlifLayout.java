package com.android.setupwizardlib;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ScrollView;
import com.android.setupwizardlib.view.StatusBarBackgroundLayout;
import com.google.android.chimeraresources.R;
import flm.ain;
import flm.aio;
import flm.aiy;
import flm.aiz;
import flm.aja;
import flm.ajb;
import flm.aje;
import flm.ajf;
import flm.ajg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GlifLayout extends TemplateLayout {
    private ColorStateList c;
    private boolean d;
    private ColorStateList e;
    private boolean f;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.d = true;
        this.f = true;
        a((AttributeSet) null, R.attr.suwLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.f = true;
        a(attributeSet, R.attr.suwLayoutTheme);
    }

    @TargetApi(11)
    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.f = true;
        a(attributeSet, i);
    }

    private final void a(AttributeSet attributeSet, int i) {
        a(aja.class, new aiz(this, attributeSet, i));
        a(ajb.class, new ajb(this, attributeSet, i));
        a(aje.class, new aje(this));
        a(aiy.class, new aiy(this));
        ajf ajfVar = new ajf();
        a(ajf.class, ajfVar);
        View viewFindViewById = findViewById(R.id.suw_scroll_view);
        ScrollView scrollView = viewFindViewById instanceof ScrollView ? (ScrollView) viewFindViewById : null;
        if (scrollView != null) {
            new ajg(ajfVar, scrollView);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aio.o, i, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(aio.r);
        if (colorStateList != null) {
            this.c = colorStateList;
            a();
            ((aje) a(aje.class)).a(colorStateList);
        }
        this.e = typedArrayObtainStyledAttributes.getColorStateList(aio.p);
        a();
        this.d = typedArrayObtainStyledAttributes.getBoolean(aio.q, true);
        a();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(aio.s, 0);
        if (resourceId != 0) {
            b(resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(aio.u, 0);
        if (resourceId2 != 0) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.suw_layout_sticky_header);
            viewStub.setLayoutResource(resourceId2);
            viewStub.inflate();
        }
        this.f = typedArrayObtainStyledAttributes.getBoolean(aio.t, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f) {
            setSystemUiVisibility(1024);
        }
    }

    @Override // com.android.setupwizardlib.TemplateLayout
    protected final View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.suw_glif_template;
        }
        return a(layoutInflater, R.style.SuwThemeGlif_Light, i);
    }

    @Override // com.android.setupwizardlib.TemplateLayout
    protected final ViewGroup a(int i) {
        if (i == 0) {
            i = R.id.suw_layout_content;
        }
        return super.a(i);
    }

    public final View b(int i) {
        ViewStub viewStub = (ViewStub) findViewById(R.id.suw_layout_footer);
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    private final void a() {
        Drawable colorDrawable;
        View viewFindViewById = findViewById(R.id.suw_pattern_bg);
        if (viewFindViewById != null) {
            int defaultColor = 0;
            if (this.e != null) {
                defaultColor = this.e.getDefaultColor();
            } else if (this.c != null) {
                defaultColor = this.c.getDefaultColor();
            }
            if (this.d) {
                colorDrawable = new ain(defaultColor);
            } else {
                colorDrawable = new ColorDrawable(defaultColor);
            }
            if (viewFindViewById instanceof StatusBarBackgroundLayout) {
                ((StatusBarBackgroundLayout) viewFindViewById).a(colorDrawable);
            } else {
                viewFindViewById.setBackgroundDrawable(colorDrawable);
            }
        }
    }
}
