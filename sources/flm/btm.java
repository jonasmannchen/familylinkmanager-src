package flm;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btm {
    private static final float a = Resources.getSystem().getDisplayMetrics().density;

    public static int a(int i) {
        return (int) Math.ceil(i * a);
    }

    public static int a(Context context, int i) {
        return (int) (TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static int a(Resources.Theme theme) {
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    private static Drawable a(Drawable drawable, int i) {
        qc.a(drawable.mutate(), i);
        return drawable;
    }

    public static Drawable b(Context context, int i) {
        return a(oo.a(context, i), a(context.getTheme()));
    }

    public static Drawable a(Context context, Drawable drawable) {
        return a(drawable, a(context.getTheme()));
    }
}
