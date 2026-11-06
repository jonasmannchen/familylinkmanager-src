package flm;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class agz {
    private static final ThreadLocal f = new ThreadLocal();
    public static final int[] a = {-16842910};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_pressed};
    public static final int[] d = {R.attr.state_checked};
    public static final int[] e = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        g[0] = i;
        ahe aheVarA = ahe.a(context, (AttributeSet) null, g);
        try {
            return aheVarA.b(0, 0);
        } finally {
            aheVarA.b.recycle();
        }
    }

    public static ColorStateList b(Context context, int i) {
        g[0] = i;
        ahe aheVarA = ahe.a(context, (AttributeSet) null, g);
        try {
            return aheVarA.e(0);
        } finally {
            aheVarA.b.recycle();
        }
    }

    public static int c(Context context, int i) {
        ColorStateList colorStateListB = b(context, i);
        if (colorStateListB != null && colorStateListB.isStateful()) {
            return colorStateListB.getColorForState(a, colorStateListB.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        int iA = a(context, i);
        return po.b(iA, Math.round(f2 * Color.alpha(iA)));
    }
}
