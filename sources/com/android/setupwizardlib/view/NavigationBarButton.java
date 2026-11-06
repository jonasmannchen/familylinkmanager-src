package com.android.setupwizardlib.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import flm.ajo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class NavigationBarButton extends Button {
    public NavigationBarButton(Context context) {
        super(context);
        a();
    }

    public NavigationBarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private final void a() {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (int i = 0; i < compoundDrawablesRelative.length; i++) {
            if (compoundDrawablesRelative[i] != null) {
                compoundDrawablesRelative[i] = ajo.a(compoundDrawablesRelative[i]);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = ajo.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = ajo.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = ajo.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = ajo.a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = ajo.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = ajo.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = ajo.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = ajo.a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        b();
    }

    private final void b() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable[] drawableArr = {compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3], compoundDrawablesRelative[0], compoundDrawablesRelative[2]};
            for (Drawable drawable : drawableArr) {
                if (drawable instanceof ajo) {
                    ajo ajoVar = (ajo) drawable;
                    ajoVar.a = textColors;
                    if (ajoVar.a()) {
                        ajoVar.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }
}
