package com.google.android.gms.kids.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import flm.cec;
import flm.dvl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class CollapsibleInfoSectionView extends LinearLayout implements View.OnClickListener {
    public final FrameLayout a;
    public TextView b;
    private final TextView c;
    private boolean d;
    private View.OnClickListener e;

    public CollapsibleInfoSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = null;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.collapsible_info_section, this);
        findViewById(R.id.collapsible_info_section).setFocusable(false);
        ImageView imageView = (ImageView) findViewById(R.id.collapsible_info_section_icon);
        this.c = (TextView) findViewById(R.id.collapsible_info_section_header);
        this.a = (FrameLayout) findViewById(R.id.collapsible_info_section_container);
        this.b = (TextView) findViewById(R.id.collapsible_info_section_details);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cec.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(cec.d);
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
        this.c.setText(typedArrayObtainStyledAttributes.getString(cec.c));
        b();
        a(typedArrayObtainStyledAttributes.getString(cec.b));
        typedArrayObtainStyledAttributes.recycle();
        super.setOnClickListener(this);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state", super.onSaveInstanceState());
        bundle.putBoolean("is_collapsed", this.d);
        return bundle;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
        a(bundle.getBoolean("is_collapsed", this.d));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.e != null) {
            this.e.onClick(view);
        }
        a(!this.d);
        announceForAccessibility(getContentDescription());
    }

    public final void a(CharSequence charSequence) {
        ((TextView) dvl.a(this.b)).setText(charSequence);
    }

    public final TextView a() {
        return (TextView) dvl.a(this.b);
    }

    private final void a(boolean z) {
        this.d = z;
        if (z) {
            this.c.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, 0);
            this.a.setVisibility(8);
        } else {
            this.c.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_keyboard_arrow_up_grey600_24, 0);
            this.a.setVisibility(0);
        }
        b();
    }

    private final void b() {
        setContentDescription(getContext().getString(this.d ? R.string.cd_section_collapsed_icu : R.string.cd_section_expanded_icu, this.c.getText()));
    }
}
