package flm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahj extends vk {
    public int b;

    public ahj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public ahj(int i, int i2) {
        super(-2, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public ahj(ahj ahjVar) {
        super((vk) ahjVar);
        this.b = 0;
        this.b = ahjVar.b;
    }

    public ahj(vk vkVar) {
        super(vkVar);
        this.b = 0;
    }

    public ahj(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public ahj(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }
}
