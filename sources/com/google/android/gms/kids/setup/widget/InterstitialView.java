package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.chimeraresources.R;
import flm.cec;
import flm.cps;
import flm.oo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InterstitialView extends FrameLayout {
    private int a;

    public InterstitialView(Context context) {
        this(context, null);
    }

    public InterstitialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cec.e);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(cec.f, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            View.inflate(context, R.layout.view_interstitial_glif, this);
        } else {
            View.inflate(context, R.layout.view_interstitial, this);
        }
        setBackgroundColor(oo.c(context, android.R.color.background_light));
        setOnClickListener(cps.a);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.a = i;
        super.setBackgroundColor(i);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state", super.onSaveInstanceState());
        bundle.putInt("background_color", this.a);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
        setBackgroundColor(bundle.getInt("background_color"));
    }
}
