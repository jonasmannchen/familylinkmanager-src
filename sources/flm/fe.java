package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fe extends abl {
    private final int[][] a;

    public fe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private fe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new int[][]{new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        TypedArray typedArrayA = fp.a(context, attributeSet, ff.a, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        boolean z = typedArrayA.getBoolean(ff.b, false);
        typedArrayA.recycle();
        if (z && uo.a(this) == null) {
            int[] iArr = new int[this.a.length];
            int iA = fg.a(this, R.attr.colorSecondary);
            int iA2 = fg.a(this, R.attr.colorSurface);
            int iA3 = fg.a(this, R.attr.colorOnSurface);
            iArr[0] = fg.a(iA2, iA, 1.0f);
            iArr[1] = fg.a(iA2, iA3, 0.54f);
            iArr[2] = fg.a(iA2, iA3, 0.38f);
            iArr[3] = fg.a(iA2, iA3, 0.38f);
            uo.a(this, new ColorStateList(this.a, iArr));
        }
    }
}
