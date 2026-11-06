package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fy {
    public final float a;
    public final ColorStateList b;
    public final int c;
    public final String d;
    public final ColorStateList e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public boolean j = false;
    public Typeface k;
    private final int l;

    public fy(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, fx.a);
        this.a = typedArrayObtainStyledAttributes.getDimension(fx.j, 0.0f);
        this.b = fw.a(context, typedArrayObtainStyledAttributes, fx.g);
        fw.a(context, typedArrayObtainStyledAttributes, fx.h);
        fw.a(context, typedArrayObtainStyledAttributes, fx.i);
        this.c = typedArrayObtainStyledAttributes.getInt(fx.k, 0);
        this.l = typedArrayObtainStyledAttributes.getInt(fx.l, 1);
        int i2 = fx.m;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : fx.b;
        this.i = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.d = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(fx.n, false);
        this.e = fw.a(context, typedArrayObtainStyledAttributes, fx.c);
        this.f = typedArrayObtainStyledAttributes.getFloat(fx.d, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(fx.e, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(fx.f, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        if (this.k == null && this.d != null) {
            this.k = Typeface.create(this.d, this.c);
        }
        if (this.k == null) {
            switch (this.l) {
                case 1:
                    this.k = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.k = Typeface.SERIF;
                    break;
                case 3:
                    this.k = Typeface.MONOSPACE;
                    break;
                default:
                    this.k = Typeface.DEFAULT;
                    break;
            }
            this.k = Typeface.create(this.k, this.c);
        }
    }
}
