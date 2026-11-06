package flm;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class kp extends ks {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    kp() {
    }

    @Override // flm.ks
    public final void a(View view, float f) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            b = true;
        }
        if (a == null) {
            view.setAlpha(f);
            return;
        }
        try {
            a.invoke(view, Float.valueOf(f));
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    @Override // flm.ks
    public final float a(View view) {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                return ((Float) c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.a(view);
    }
}
