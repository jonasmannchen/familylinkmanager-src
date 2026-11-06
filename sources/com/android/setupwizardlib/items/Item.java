package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.chimeraresources.R;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Item extends AbstractItem {
    private boolean a;

    public Item() {
        this.a = true;
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aio.G);
        typedArrayObtainStyledAttributes.getBoolean(aio.H, true);
        typedArrayObtainStyledAttributes.getDrawable(aio.I);
        typedArrayObtainStyledAttributes.getText(aio.L);
        typedArrayObtainStyledAttributes.getText(aio.K);
        typedArrayObtainStyledAttributes.getResourceId(aio.J, a());
        this.a = typedArrayObtainStyledAttributes.getBoolean(aio.M, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected int a() {
        return R.layout.suw_items_default;
    }
}
