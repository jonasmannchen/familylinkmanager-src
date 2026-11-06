package flm;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iq {
    public static final Matrix a = new Matrix();
    public Paint b;
    public Paint c;
    public final in d;
    public float e;
    public float f;
    public float g;
    public float h;
    public String i;
    public Boolean j;
    public final rt k;
    private final Path l;
    private final Path m;
    private final Matrix n;
    private PathMeasure o;
    private int p;
    private int q;

    public iq() {
        this.n = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.q = 255;
        this.i = null;
        this.j = null;
        this.k = new rt();
        this.d = new in();
        this.l = new Path();
        this.m = new Path();
    }

    public final void setRootAlpha(int i) {
        this.q = i;
    }

    public final int getRootAlpha() {
        return this.q;
    }

    public final void setAlpha(float f) {
        setRootAlpha((int) (255.0f * f));
    }

    public final float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public iq(iq iqVar) {
        this.n = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.q = 255;
        this.i = null;
        this.j = null;
        this.k = new rt();
        this.d = new in(iqVar.d, this.k);
        this.l = new Path(iqVar.l);
        this.m = new Path(iqVar.m);
        this.e = iqVar.e;
        this.f = iqVar.f;
        this.g = iqVar.g;
        this.h = iqVar.h;
        this.p = iqVar.p;
        this.q = iqVar.q;
        this.i = iqVar.i;
        if (iqVar.i != null) {
            this.k.put(iqVar.i, this);
        }
        this.j = iqVar.j;
    }

    final void a(in inVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        float fAbs;
        inVar.a.set(matrix);
        inVar.a.preConcat(inVar.j);
        canvas.save();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < inVar.b.size()) {
                io ioVar = (io) inVar.b.get(i4);
                if (ioVar instanceof in) {
                    a((in) ioVar, inVar.a, canvas, i, i2, colorFilter);
                } else if (ioVar instanceof ip) {
                    ip ipVar = (ip) ioVar;
                    float f = i / this.g;
                    float f2 = i2 / this.h;
                    float fMin = Math.min(f, f2);
                    Matrix matrix2 = inVar.a;
                    this.n.set(matrix2);
                    this.n.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f3 = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    if (fMax <= 0.0f) {
                        fAbs = 0.0f;
                    } else {
                        fAbs = Math.abs(f3) / fMax;
                    }
                    if (fAbs != 0.0f) {
                        Path path = this.l;
                        path.reset();
                        if (ipVar.n != null) {
                            pr.a(ipVar.n, path);
                        }
                        Path path2 = this.l;
                        this.m.reset();
                        if (ipVar.a()) {
                            this.m.addPath(path2, this.n);
                            canvas.clipPath(this.m);
                        } else {
                            im imVar = (im) ipVar;
                            if (imVar.h != 0.0f || imVar.i != 1.0f) {
                                float f4 = (imVar.h + imVar.j) % 1.0f;
                                float f5 = (imVar.i + imVar.j) % 1.0f;
                                if (this.o == null) {
                                    this.o = new PathMeasure();
                                }
                                this.o.setPath(this.l, false);
                                float length = this.o.getLength();
                                float f6 = f4 * length;
                                float f7 = f5 * length;
                                path2.reset();
                                if (f6 > f7) {
                                    this.o.getSegment(f6, length, path2, true);
                                    this.o.getSegment(0.0f, f7, path2, true);
                                } else {
                                    this.o.getSegment(f6, f7, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.m.addPath(path2, this.n);
                            if (imVar.d.c()) {
                                pa paVar = imVar.d;
                                if (this.c == null) {
                                    this.c = new Paint(1);
                                    this.c.setStyle(Paint.Style.FILL);
                                }
                                Paint paint = this.c;
                                if (paVar.a()) {
                                    Shader shader = paVar.a;
                                    shader.setLocalMatrix(this.n);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(imVar.g * 255.0f));
                                } else {
                                    paint.setColor(ik.a(paVar.b, imVar.g));
                                }
                                paint.setColorFilter(colorFilter);
                                this.m.setFillType(imVar.f == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(this.m, paint);
                            }
                            if (imVar.b.c()) {
                                pa paVar2 = imVar.b;
                                if (this.b == null) {
                                    this.b = new Paint(1);
                                    this.b.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint2 = this.b;
                                if (imVar.l != null) {
                                    paint2.setStrokeJoin(imVar.l);
                                }
                                if (imVar.k != null) {
                                    paint2.setStrokeCap(imVar.k);
                                }
                                paint2.setStrokeMiter(imVar.m);
                                if (paVar2.a()) {
                                    Shader shader2 = paVar2.a;
                                    shader2.setLocalMatrix(this.n);
                                    paint2.setShader(shader2);
                                    paint2.setAlpha(Math.round(imVar.e * 255.0f));
                                } else {
                                    paint2.setColor(ik.a(paVar2.b, imVar.e));
                                }
                                paint2.setColorFilter(colorFilter);
                                paint2.setStrokeWidth(imVar.c * fMin * fAbs);
                                canvas.drawPath(this.m, paint2);
                            }
                        }
                    }
                }
                i3 = i4 + 1;
            } else {
                canvas.restore();
                return;
            }
        }
    }
}
