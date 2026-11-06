package flm;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.setupwizardlib.TemplateLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aiz extends aja {
    public aiz(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView textViewA;
        super(templateLayout, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, aio.g, i, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(aio.h);
        if (colorStateList != null && (textViewA = a()) != null) {
            textViewA.setTextColor(colorStateList);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
