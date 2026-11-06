package com.android.setupwizardlib;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.android.setupwizardlib.view.Illustration;
import com.google.android.chimeraresources.R;
import flm.aio;
import flm.aip;
import flm.aja;
import flm.ajd;
import flm.aje;
import flm.ajf;
import flm.ajg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SetupWizardLayout extends TemplateLayout {
    public SetupWizardLayout(Context context) {
        super(context, 0, 0);
        a((AttributeSet) null, R.attr.suwLayoutTheme);
    }

    public SetupWizardLayout(Context context, int i) {
        this(context, i, 0);
    }

    public SetupWizardLayout(Context context, int i, int i2) {
        super(context, i, i2);
        a((AttributeSet) null, R.attr.suwLayoutTheme);
    }

    public SetupWizardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, R.attr.suwLayoutTheme);
    }

    @TargetApi(11)
    public SetupWizardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }

    private final void a(AttributeSet attributeSet, int i) {
        float f;
        a(aja.class, new aja(this, attributeSet, i));
        a(aje.class, new aje(this));
        a(ajd.class, new ajd(this));
        ajf ajfVar = new ajf();
        a(ajf.class, ajfVar);
        View viewFindViewById = findViewById(R.id.suw_bottom_scroll_view);
        ScrollView scrollView = viewFindViewById instanceof ScrollView ? (ScrollView) viewFindViewById : null;
        if (scrollView != null) {
            new ajg(ajfVar, scrollView);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aio.N, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(aio.O);
        if (drawable != null) {
            a(drawable);
        } else {
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(aio.P);
            if (drawable2 != null) {
                if (drawable2 instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable2).setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                }
                a(drawable2);
            }
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(aio.R);
        if (drawable3 != null) {
            View viewFindViewById2 = findViewById(R.id.suw_layout_decor);
            if (viewFindViewById2 instanceof Illustration) {
                ((Illustration) viewFindViewById2).a(drawable3);
            }
        } else {
            Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(aio.U);
            Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(aio.T);
            if (drawable4 != null && drawable5 != null) {
                View viewFindViewById3 = findViewById(R.id.suw_layout_decor);
                if (viewFindViewById3 instanceof Illustration) {
                    Illustration illustration = (Illustration) viewFindViewById3;
                    if (getContext().getResources().getBoolean(R.bool.suwUseTabletLayout)) {
                        if (drawable5 instanceof BitmapDrawable) {
                            ((BitmapDrawable) drawable5).setTileModeX(Shader.TileMode.REPEAT);
                            ((BitmapDrawable) drawable5).setGravity(48);
                        }
                        if (drawable4 instanceof BitmapDrawable) {
                            ((BitmapDrawable) drawable4).setGravity(51);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable5, drawable4});
                        layerDrawable.setAutoMirrored(true);
                        drawable4 = layerDrawable;
                    } else {
                        drawable4.setAutoMirrored(true);
                    }
                    illustration.a(drawable4);
                }
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(aio.Q, -1);
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.suw_decor_padding_top);
        }
        View viewFindViewById4 = findViewById(R.id.suw_layout_decor);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setPadding(viewFindViewById4.getPaddingLeft(), dimensionPixelSize, viewFindViewById4.getPaddingRight(), viewFindViewById4.getPaddingBottom());
        }
        float f2 = typedArrayObtainStyledAttributes.getFloat(aio.S, -1.0f);
        if (f2 == -1.0f) {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(R.dimen.suw_illustration_aspect_ratio, typedValue, true);
            f = typedValue.getFloat();
        } else {
            f = f2;
        }
        View viewFindViewById5 = findViewById(R.id.suw_layout_decor);
        if (viewFindViewById5 instanceof Illustration) {
            Illustration illustration2 = (Illustration) viewFindViewById5;
            illustration2.a = f;
            illustration2.invalidate();
            illustration2.requestLayout();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        aip aipVar = new aip(super.onSaveInstanceState());
        aipVar.a = ((aje) a(aje.class)).a();
        return aipVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aip)) {
            String strValueOf = String.valueOf(parcelable);
            Log.w("SetupWizardLayout", new StringBuilder(String.valueOf(strValueOf).length() + 32).append("Ignoring restore instance state ").append(strValueOf).toString());
            super.onRestoreInstanceState(parcelable);
        } else {
            aip aipVar = (aip) parcelable;
            super.onRestoreInstanceState(aipVar.getSuperState());
            ((aje) a(aje.class)).a(aipVar.a);
        }
    }

    @Override // com.android.setupwizardlib.TemplateLayout
    protected final View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.suw_template;
        }
        return a(layoutInflater, R.style.SuwThemeMaterial_Light, i);
    }

    @Override // com.android.setupwizardlib.TemplateLayout
    protected final ViewGroup a(int i) {
        if (i == 0) {
            i = R.id.suw_layout_content;
        }
        return super.a(i);
    }

    private final void a(Drawable drawable) {
        View viewFindViewById = findViewById(R.id.suw_layout_decor);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundDrawable(drawable);
        }
    }
}
