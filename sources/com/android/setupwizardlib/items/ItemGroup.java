package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import flm.ais;
import flm.ait;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ItemGroup extends AbstractItemHierarchy implements ait {
    private final List a;
    private final SparseIntArray b;
    private int c;
    private boolean d;

    public ItemGroup() {
        this.a = new ArrayList();
        this.b = new SparseIntArray();
        this.c = 0;
        this.d = false;
    }

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new SparseIntArray();
        this.c = 0;
        this.d = false;
    }

    @Override // flm.ait
    public final void a(ais aisVar, int i, int i2) {
        int i3;
        List list = this.a;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (list.get(i4) == aisVar) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 != -1) {
            int size2 = this.a.size();
            int i5 = i4;
            i3 = -1;
            while (i3 < 0 && i5 < size2) {
                int i6 = this.b.get(i5, -1);
                i5++;
                i3 = i6;
            }
            if (i3 < 0) {
                i3 = this.c;
            }
        } else {
            i3 = -1;
        }
        if (i3 >= 0) {
            a(i3 + i, i2);
        } else {
            String strValueOf = String.valueOf(aisVar);
            Log.e("ItemGroup", new StringBuilder(String.valueOf(strValueOf).length() + 24).append("Unexpected child change ").append(strValueOf).toString());
        }
    }
}
