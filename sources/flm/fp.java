package flm;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fp {
    private static final int[] a = {R.attr.colorPrimary};
    private static final int[] b = {R.attr.colorPrimaryVariant};
    private static final int[] c = {android.R.attr.theme, R.attr.theme};
    private static final int[] d = {R.attr.materialThemeOverlay};

    public static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        b(context, attributeSet, i, i2);
        c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static ahe b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        b(context, attributeSet, i, i2);
        c(context, attributeSet, iArr, i, i2, iArr2);
        return ahe.a(context, attributeSet, iArr, i, i2);
    }

    private static void b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fo.e, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(fo.g, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                a(context, b, "Theme.MaterialComponents");
            }
        }
        a(context);
    }

    private static void c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fo.e, i, i2);
        if (!typedArrayObtainStyledAttributes.getBoolean(fo.h, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = typedArrayObtainStyledAttributes.getResourceId(fo.f, -1) != -1;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                } else {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void a(Context context) {
        a(context, a, "Theme.AppCompat");
    }

    public static boolean b(Context context) {
        return a(context, b);
    }

    private static boolean a(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static void a(Context context, int[] iArr, String str) {
        if (!a(context, iArr)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 77).append("The style on this component requires your app theme to be ").append(str).append(" (or a descendant).").toString());
        }
    }

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            if (!(context instanceof yj) || ((yj) context).a != resourceId) {
                yj yjVar = new yj(context, resourceId);
                TypedArray typedArrayObtainStyledAttributes2 = yjVar.obtainStyledAttributes(attributeSet, c);
                int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId2 == 0) {
                    resourceId2 = resourceId3;
                }
                return resourceId2 != 0 ? new yj(yjVar, resourceId2) : yjVar;
            }
            return context;
        }
        return context;
    }
}
