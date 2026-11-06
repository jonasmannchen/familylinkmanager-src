package flm;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aej extends ViewGroup.MarginLayoutParams {
    public float g;
    public int h;

    public aej(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xl.aX);
        this.g = typedArrayObtainStyledAttributes.getFloat(xl.aZ, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getInt(xl.aY, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public aej(int i, int i2) {
        super(i, i2);
        this.h = -1;
        this.g = 0.0f;
    }

    public aej(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
