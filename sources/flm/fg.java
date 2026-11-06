package flm;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fg {
    public static int a(View view, int i) {
        TypedValue typedValue = new TypedValue();
        Context context = view.getContext();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        throw new IllegalArgumentException(String.format("The %1$s view requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", view.getClass().getCanonicalName(), context.getResources().getResourceName(i)));
    }

    public static int a(int i, int i2, float f) {
        return po.a(po.b(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
