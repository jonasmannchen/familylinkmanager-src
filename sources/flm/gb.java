package flm;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gb {
    private static final boolean a = true;
    private static final int[] b = {R.attr.state_pressed};
    private static final int[] c = {R.attr.state_hovered, R.attr.state_focused};
    private static final int[] d = {R.attr.state_focused};
    private static final int[] e = {R.attr.state_hovered};
    private static final int[] f = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    private static final int[] h = {R.attr.state_selected, R.attr.state_focused};
    private static final int[] i = {R.attr.state_selected, R.attr.state_hovered};
    private static final int[] j = {R.attr.state_selected};

    public static ColorStateList a(ColorStateList colorStateList) {
        return a ? new ColorStateList(new int[][]{j, StateSet.NOTHING}, new int[]{a(colorStateList, f), a(colorStateList, b)}) : new ColorStateList(new int[][]{f, g, h, i, j, b, c, d, e, StateSet.NOTHING}, new int[]{a(colorStateList, f), a(colorStateList, g), a(colorStateList, h), a(colorStateList, i), 0, a(colorStateList, b), a(colorStateList, c), a(colorStateList, d), a(colorStateList, e), 0});
    }

    private static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            colorForState = 0;
        }
        if (a) {
            return po.b(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
        }
        return colorForState;
    }
}
