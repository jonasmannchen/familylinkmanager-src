package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import flm.aio;
import flm.ais;
import flm.ait;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractItemHierarchy implements ais {
    private final ArrayList a = new ArrayList();

    public AbstractItemHierarchy() {
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aio.a);
        typedArrayObtainStyledAttributes.getResourceId(aio.b, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(int i, int i2) {
        if (i < 0) {
            Log.w("AbstractItemHierarchy", new StringBuilder(52).append("notifyItemRangeChanged: Invalid position=").append(i).toString());
            return;
        }
        if (i2 < 0) {
            Log.w("AbstractItemHierarchy", new StringBuilder(53).append("notifyItemRangeChanged: Invalid itemCount=").append(i2).toString());
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((ait) obj).a(this, i, i2);
        }
    }
}
