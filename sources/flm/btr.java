package flm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import com.google.android.chimera.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btr {
    private static final int[] a = {Color.argb(0, 233, 233, 233), Color.argb(0, 233, 233, 233), Color.argb(255, 233, 233, 233), Color.argb(0, 233, 233, 233)};
    private static final float[] b = {0.0f, 0.6222f, 0.4222f, 1.0f};

    public static Bitmap a(Activity activity, int i) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        return a(activity, i, new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels));
    }

    public static Bitmap a(Activity activity, int i, Rect rect) {
        int iWidth = rect.width();
        int iMax = Math.max(btm.a((Context) activity, 110), (int) ((Math.max(rect.width(), rect.height()) * 25) / 100.0f));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, iMax, a, b, Shader.TileMode.CLAMP));
        canvas.drawRect(new Rect(0, 0, iWidth, iMax), paint);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(activity.getResources(), i);
        int height = (int) ((iMax / bitmapDecodeResource.getHeight()) * bitmapDecodeResource.getWidth());
        BitmapDrawable bitmapDrawable = new BitmapDrawable(activity.getResources(), Bitmap.createScaledBitmap(bitmapDecodeResource, height, iMax, true));
        int i2 = (int) (0.43f * (iWidth - height));
        int i3 = (int) ((-0.03f) * iMax);
        bitmapDrawable.setBounds(i2, i3, bitmapDrawable.getIntrinsicWidth() + i2, bitmapDrawable.getIntrinsicHeight() + i3);
        bitmapDrawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
