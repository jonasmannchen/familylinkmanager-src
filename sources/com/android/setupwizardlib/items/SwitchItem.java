package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.chimeraresources.R;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {
    public SwitchItem() {
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aio.Z);
        typedArrayObtainStyledAttributes.getBoolean(aio.aa, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.android.setupwizardlib.items.Item
    protected int a() {
        return R.layout.suw_items_switch;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }
}
