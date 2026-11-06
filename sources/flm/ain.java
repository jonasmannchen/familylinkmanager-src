package flm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ain extends Drawable {
    private static SoftReference a;
    private static Path[] b;
    private static int[] c;
    private int d;
    private final Paint e = new Paint(1);

    public ain(int i) {
        this.d = Color.argb(204, Color.red(i), Color.green(i), Color.blue(i));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Bitmap bitmap = null;
        if (a != null) {
            bitmap = (Bitmap) a.get();
        }
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (iWidth > width && width < 2049.0f) {
                bitmap = null;
            } else if (iHeight > height && height < 1152.0f) {
                bitmap = null;
            }
        }
        if (bitmap == null) {
            this.e.reset();
            float fMin = Math.min(1.5f, Math.max(iWidth / 1366.0f, iHeight / 768.0f));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (1366.0f * fMin), (int) (768.0f * fMin), Bitmap.Config.ALPHA_8);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.save();
            canvas2.scale(fMin, fMin);
            this.e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            if (b == null) {
                b = new Path[7];
                c = new int[]{10, 40, 51, 66, 91, 112, 130};
                Path[] pathArr = b;
                Path path = new Path();
                pathArr[0] = path;
                path.moveTo(1029.4f, 357.5f);
                path.lineTo(1366.0f, 759.1f);
                path.lineTo(1366.0f, 0.0f);
                path.lineTo(1137.7f, 0.0f);
                path.close();
                Path[] pathArr2 = b;
                Path path2 = new Path();
                pathArr2[1] = path2;
                path2.moveTo(1138.1f, 0.0f);
                path2.rLineTo(-144.8f, 768.0f);
                path2.rLineTo(372.7f, 0.0f);
                path2.rLineTo(0.0f, -524.0f);
                path2.cubicTo(1290.7f, 121.6f, 1219.2f, 41.1f, 1178.7f, 0.0f);
                path2.close();
                Path[] pathArr3 = b;
                Path path3 = new Path();
                pathArr3[2] = path3;
                path3.moveTo(949.8f, 768.0f);
                path3.rCubicTo(92.6f, -170.6f, 213.0f, -440.3f, 269.4f, -768.0f);
                path3.lineTo(585.0f, 0.0f);
                path3.rLineTo(2.1f, 766.0f);
                path3.close();
                Path[] pathArr4 = b;
                Path path4 = new Path();
                pathArr4[3] = path4;
                path4.moveTo(471.1f, 768.0f);
                path4.rMoveTo(704.5f, 0.0f);
                path4.cubicTo(1123.6f, 563.3f, 1027.4f, 275.2f, 856.2f, 0.0f);
                path4.lineTo(476.4f, 0.0f);
                path4.rLineTo(-5.3f, 768.0f);
                path4.close();
                Path[] pathArr5 = b;
                Path path5 = new Path();
                pathArr5[4] = path5;
                path5.moveTo(323.1f, 768.0f);
                path5.moveTo(777.5f, 768.0f);
                path5.cubicTo(661.9f, 348.8f, 427.2f, 21.4f, 401.2f, 25.4f);
                path5.lineTo(323.1f, 768.0f);
                path5.close();
                Path[] pathArr6 = b;
                Path path6 = new Path();
                pathArr6[5] = path6;
                path6.moveTo(178.44286f, 766.8571f);
                path6.lineTo(308.7f, 768.0f);
                path6.cubicTo(381.7f, 604.6f, 481.6f, 344.3f, 562.2f, 0.0f);
                path6.lineTo(0.0f, 0.0f);
                path6.close();
                Path[] pathArr7 = b;
                Path path7 = new Path();
                pathArr7[6] = path7;
                path7.moveTo(146.0f, 0.0f);
                path7.lineTo(0.0f, 0.0f);
                path7.lineTo(0.0f, 768.0f);
                path7.lineTo(394.2f, 768.0f);
                path7.cubicTo(327.7f, 475.3f, 228.5f, 201.0f, 146.0f, 0.0f);
                path7.close();
            }
            for (int i = 0; i < 7; i++) {
                this.e.setColor(c[i] << 24);
                canvas2.drawPath(b[i], this.e);
            }
            canvas2.restore();
            this.e.reset();
            a = new SoftReference(bitmapCreateBitmap);
            this.e.reset();
            bitmap = bitmapCreateBitmap;
        }
        canvas.save();
        canvas.clipRect(bounds);
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        float fWidth = bounds.width() / width2;
        float fHeight = bounds.height() / height2;
        canvas.scale(fWidth, fHeight);
        if (fHeight > fWidth) {
            canvas.scale(fHeight / fWidth, 1.0f, width2 * 0.146f, 0.0f);
        } else if (fWidth > fHeight) {
            canvas.scale(1.0f, fWidth / fHeight, 0.0f, height2 * 0.228f);
        }
        canvas.drawColor(-16777216);
        this.e.setColor(-1);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.e);
        canvas.drawColor(this.d);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }
}
