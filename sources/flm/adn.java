package flm;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adn {
    public static final Rect a = new Rect();
    private static Class b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[Catch: Exception -> 0x0078, TRY_LEAVE, TryCatch #0 {Exception -> 0x0078, blocks: (B:4:0x0005, B:6:0x0009, B:7:0x000f, B:9:0x0025, B:11:0x0034, B:12:0x003f, B:13:0x0042, B:14:0x0045, B:27:0x0071, B:33:0x0083, B:34:0x008a, B:35:0x0091, B:15:0x0049, B:18:0x0053, B:21:0x005d, B:24:0x0067), top: B:37:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[Catch: Exception -> 0x0078, TRY_ENTER, TryCatch #0 {Exception -> 0x0078, blocks: (B:4:0x0005, B:6:0x0009, B:7:0x000f, B:9:0x0025, B:11:0x0034, B:12:0x003f, B:13:0x0042, B:14:0x0045, B:27:0x0071, B:33:0x0083, B:34:0x008a, B:35:0x0091, B:15:0x0049, B:18:0x0053, B:21:0x005d, B:24:0x0067), top: B:37:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:4:0x0005, B:6:0x0009, B:7:0x000f, B:9:0x0025, B:11:0x0034, B:12:0x003f, B:13:0x0042, B:14:0x0045, B:27:0x0071, B:33:0x0083, B:34:0x008a, B:35:0x0091, B:15:0x0049, B:18:0x0053, B:21:0x005d, B:24:0x0067), top: B:37:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[Catch: Exception -> 0x0078, TRY_LEAVE, TryCatch #0 {Exception -> 0x0078, blocks: (B:4:0x0005, B:6:0x0009, B:7:0x000f, B:9:0x0025, B:11:0x0034, B:12:0x003f, B:13:0x0042, B:14:0x0045, B:27:0x0071, B:33:0x0083, B:34:0x008a, B:35:0x0091, B:15:0x0049, B:18:0x0053, B:21:0x005d, B:24:0x0067), top: B:37:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0045 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static Rect a(Drawable drawable) {
        if (b != null) {
            try {
                boolean z = drawable instanceof qe;
                Object objA = drawable;
                if (z) {
                    objA = ((qe) drawable).a();
                }
                Object objInvoke = objA.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(objA, new Object[0]);
                if (objInvoke != null) {
                    Rect rect = new Rect();
                    Field[] fields = b.getFields();
                    int length = fields.length;
                    int i = 0;
                    while (i < length) {
                        Field field = fields[i];
                        byte b2 = -1;
                        switch (field.getName()) {
                            case "bottom":
                                b2 = 3;
                            case "top":
                                b2 = 1;
                            case "left":
                                b2 = 0;
                            case "right":
                                b2 = 2;
                            default:
                                switch (b2) {
                                    case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                        rect.left = field.getInt(objInvoke);
                                        break;
                                    case 1:
                                        rect.top = field.getInt(objInvoke);
                                        break;
                                    case 2:
                                        rect.right = field.getInt(objInvoke);
                                        break;
                                    case 3:
                                        rect.bottom = field.getInt(objInvoke);
                                        break;
                                }
                        }
                    }
                    return rect;
                }
            } catch (Exception e) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return a;
    }

    static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(agz.d);
            } else {
                drawable.setState(agz.e);
            }
            drawable.setState(state);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(Drawable drawable) {
        Drawable drawableA = drawable;
        while (!(drawableA instanceof DrawableContainer)) {
            if (drawableA instanceof qe) {
                drawableA = ((qe) drawableA).a();
            } else if (drawableA instanceof ya) {
                drawableA = ((ya) drawableA).a;
            } else if (drawableA instanceof ScaleDrawable) {
                drawableA = ((ScaleDrawable) drawableA).getDrawable();
            } else {
                return true;
            }
        }
        Drawable.ConstantState constantState = drawableA.getConstantState();
        if (constantState instanceof DrawableContainer.DrawableContainerState) {
            Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
            for (Drawable drawable2 : children) {
                if (!c(drawable2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return mode;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
        }
    }

    static {
        try {
            b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }
}
