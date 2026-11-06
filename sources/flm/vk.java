package flm;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class vk extends ViewGroup.MarginLayoutParams {
    public int a;

    public vk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xl.b);
        this.a = typedArrayObtainStyledAttributes.getInt(xl.c, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public vk(int i, int i2) {
        super(i, i2);
        this.a = 0;
        this.a = 8388627;
    }

    public vk(vk vkVar) {
        super((ViewGroup.MarginLayoutParams) vkVar);
        this.a = 0;
        this.a = vkVar.a;
    }

    public vk(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
