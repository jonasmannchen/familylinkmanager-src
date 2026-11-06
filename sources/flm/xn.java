package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class xn {
    private static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList colorStateListD = d(context, i);
        if (colorStateListD != null) {
            return colorStateListD;
        }
        ColorStateList colorStateListC = c(context, i);
        if (colorStateListC == null) {
            return oo.b(context, i);
        }
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new xo(colorStateListC, context.getResources().getConfiguration()));
        }
        return colorStateListC;
    }

    public static Drawable b(Context context, int i) {
        return abo.a().a(context, i);
    }

    private static ColorStateList c(Context context, int i) {
        int next;
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return null;
        }
        Resources resources2 = context.getResources();
        XmlResourceParser xml = resources2.getXml(i);
        try {
            Resources.Theme theme = context.getTheme();
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return oz.a(resources2, xml, attributeSetAsAttributeSet, theme);
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static ColorStateList d(Context context, int i) {
        xo xoVar;
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (xoVar = (xo) sparseArray.get(i)) != null) {
                if (xoVar.b.equals(context.getResources().getConfiguration())) {
                    return xoVar.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }
}
