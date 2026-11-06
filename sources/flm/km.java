package flm;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class km {
    public static final ks a;
    public static final Property b;
    private static Field c;
    private static boolean d;

    /* JADX WARN: Type inference failed for: r0v0, types: [flm.kx, flm.ky] */
    static ky a(View view) {
        return new kx(view);
    }

    static void a(View view, float f) {
        a.a(view, f);
    }

    static void b(View view) {
    }

    static void c(View view) {
    }

    static void a(View view, int i) {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                c.setInt(view, (c.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException e2) {
            }
        }
    }

    static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            a = new kr();
        } else {
            a = new kq();
        }
        b = new kn(Float.class, "translationAlpha");
        new ko(Rect.class, "clipBounds");
    }
}
