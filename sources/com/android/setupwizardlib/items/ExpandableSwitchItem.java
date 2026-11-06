package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.chimeraresources.R;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ExpandableSwitchItem extends SwitchItem implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private boolean a;

    public ExpandableSwitchItem() {
        this.a = false;
    }

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aio.i);
        typedArrayObtainStyledAttributes.getText(aio.j);
        typedArrayObtainStyledAttributes.getText(aio.k);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.android.setupwizardlib.items.SwitchItem, com.android.setupwizardlib.items.Item
    protected final int a() {
        return R.layout.suw_items_expandable_switch;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z = !this.a;
        if (this.a != z) {
            this.a = z;
            a(0, 1);
        }
    }
}
