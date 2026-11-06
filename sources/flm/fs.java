package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fs extends acc {
    private final int[][] a;

    public fs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    private fs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new int[][]{new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        TypedArray typedArrayA = fp.a(context, attributeSet, ft.a, i, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        boolean z = typedArrayA.getBoolean(ft.b, false);
        typedArrayA.recycle();
        if (z && uo.a(this) == null) {
            int iA = fg.a(this, R.attr.colorSecondary);
            int iA2 = fg.a(this, R.attr.colorOnSurface);
            int iA3 = fg.a(this, R.attr.colorSurface);
            int[] iArr = new int[this.a.length];
            iArr[0] = fg.a(iA3, iA, 1.0f);
            iArr[1] = fg.a(iA3, iA2, 0.54f);
            iArr[2] = fg.a(iA3, iA2, 0.38f);
            iArr[3] = fg.a(iA3, iA2, 0.38f);
            uo.a(this, new ColorStateList(this.a, iArr));
        }
    }
}
