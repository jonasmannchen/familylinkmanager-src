package flm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ps {
    public static final px a;
    public static final sb b;

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface a(Context context, pc pcVar, Resources resources, int i, int i2, pk pkVar, Handler handler, boolean z) throws Throwable {
        Typeface typefaceA;
        boolean z2 = true;
        if (pcVar instanceof pf) {
            pf pfVar = (pf) pcVar;
            if (z) {
                if (pfVar.c != 0) {
                    z2 = false;
                }
            } else if (pkVar != null) {
                z2 = false;
            }
            typefaceA = qu.a(context, pfVar.a, pkVar, handler, z2, z ? pfVar.b : -1, i2);
        } else {
            typefaceA = a.a(context, (pd) pcVar, resources, i2);
            if (pkVar != null) {
                if (typefaceA != null) {
                    pkVar.a(typefaceA, handler);
                } else {
                    pkVar.a(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            b.put(a(resources, i, i2), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceA = a.a(context, resources, i, str, i2);
        if (typefaceA != null) {
            b.put(a(resources, i, i2), typefaceA);
        }
        return typefaceA;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    static {
        if (Build.VERSION.SDK_INT >= 28) {
            a = new pw();
        } else if (Build.VERSION.SDK_INT >= 26) {
            a = new pv();
        } else if (Build.VERSION.SDK_INT >= 24) {
            if (pu.a == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (pu.a != null) {
                a = new pu();
            } else {
                a = new pt();
            }
        } else {
            a = new pt();
        }
        b = new sb(16);
    }
}
