package android.support.design.theme;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import flm.abl;
import flm.acc;
import flm.fa;
import flm.fe;
import flm.fs;
import flm.wu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class MaterialComponentsViewInflater extends wu {
    public static int floatingToolbarItemBackgroundResId = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.wu
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return (Build.VERSION.SDK_INT == 23 && isFloatingToolbarItemButton(context, attributeSet)) ? new AppCompatButton(context, attributeSet) : new fa(context, attributeSet);
    }

    private boolean isFloatingToolbarItemButton(Context context, AttributeSet attributeSet) {
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        if (floatingToolbarItemBackgroundResId == 0 || floatingToolbarItemBackgroundResId == -1) {
            return false;
        }
        for (int i = 0; i < attributeSet.getAttributeCount(); i++) {
            if (attributeSet.getAttributeNameResource(i) == 16842964) {
                if (floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i, null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.wu
    public abl createCheckBox(Context context, AttributeSet attributeSet) {
        return new fe(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.wu
    public acc createRadioButton(Context context, AttributeSet attributeSet) {
        return new fs(context, attributeSet);
    }
}
