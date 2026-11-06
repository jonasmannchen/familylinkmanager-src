package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.chimeraresources.R;
import flm.cec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class KidSetupNavBar extends FrameLayout {
    public Button a;
    public Button b;
    public Button c;
    public Button d;

    public KidSetupNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cec.g);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(cec.h, false);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, z ? R.layout.view_kidsetup_nav_bar_glif : R.layout.view_kidsetup_nav_bar, this);
        this.a = (Button) findViewById(R.id.kidsetup_nav_bar_button_back);
        this.b = (Button) findViewById(R.id.kidsetup_nav_bar_button_next);
        this.c = (Button) findViewById(R.id.kidsetup_nav_bar_button_right_colorless);
        this.d = (Button) findViewById(R.id.kidsetup_nav_bar_button_more);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
        this.d.setEnabled(z);
    }
}
