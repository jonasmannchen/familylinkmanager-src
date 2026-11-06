package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.chimeraresources.R;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ButtonItem extends AbstractItem implements View.OnClickListener {
    public ButtonItem() {
    }

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aio.c);
        typedArrayObtainStyledAttributes.getBoolean(aio.d, true);
        typedArrayObtainStyledAttributes.getText(aio.e);
        typedArrayObtainStyledAttributes.getResourceId(aio.f, R.style.SuwButtonItem);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
