package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahe {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public static ahe a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new ahe(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static ahe a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new ahe(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static ahe a(Context context, int i, int[] iArr) {
        return new ahe(context, context.obtainStyledAttributes(i, iArr));
    }

    private ahe(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public final Drawable a(int i) {
        int resourceId;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) ? this.b.getDrawable(i) : xn.b(this.a, resourceId);
    }

    public final Drawable b(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return abo.a().a(this.a, resourceId, true);
    }

    public final CharSequence c(int i) {
        return this.b.getText(i);
    }

    public final String d(int i) {
        return this.b.getString(i);
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final int a(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final int b(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public final ColorStateList e(int i) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (colorStateListA = xn.a(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : colorStateListA;
    }

    public final int c(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public final float a(int i, float f) {
        return this.b.getDimension(i, 0.0f);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int e(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final int f(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public final int g(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final boolean f(int i) {
        return this.b.hasValue(i);
    }
}
