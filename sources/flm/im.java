package flm;

import android.graphics.Paint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class im extends ip {
    public int[] a;
    public pa b;
    public float c;
    public pa d;
    public float e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public Paint.Cap k;
    public Paint.Join l;
    public float m;

    public im() {
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 0;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = Paint.Cap.BUTT;
        this.l = Paint.Join.MITER;
        this.m = 4.0f;
    }

    public im(im imVar) {
        super(imVar);
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 0;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = Paint.Cap.BUTT;
        this.l = Paint.Join.MITER;
        this.m = 4.0f;
        this.a = imVar.a;
        this.b = imVar.b;
        this.c = imVar.c;
        this.e = imVar.e;
        this.d = imVar.d;
        this.f = imVar.f;
        this.g = imVar.g;
        this.h = imVar.h;
        this.i = imVar.i;
        this.j = imVar.j;
        this.k = imVar.k;
        this.l = imVar.l;
        this.m = imVar.m;
    }

    @Override // flm.io
    public final boolean b() {
        return this.d.b() || this.b.b();
    }

    @Override // flm.io
    public final boolean a(int[] iArr) {
        return this.d.a(iArr) | this.b.a(iArr);
    }

    final int getStrokeColor() {
        return this.b.b;
    }

    final void setStrokeColor(int i) {
        this.b.b = i;
    }

    final float getStrokeWidth() {
        return this.c;
    }

    final void setStrokeWidth(float f) {
        this.c = f;
    }

    final float getStrokeAlpha() {
        return this.e;
    }

    final void setStrokeAlpha(float f) {
        this.e = f;
    }

    final int getFillColor() {
        return this.d.b;
    }

    final void setFillColor(int i) {
        this.d.b = i;
    }

    final float getFillAlpha() {
        return this.g;
    }

    final void setFillAlpha(float f) {
        this.g = f;
    }

    final float getTrimPathStart() {
        return this.h;
    }

    final void setTrimPathStart(float f) {
        this.h = f;
    }

    final float getTrimPathEnd() {
        return this.i;
    }

    final void setTrimPathEnd(float f) {
        this.i = f;
    }

    final float getTrimPathOffset() {
        return this.j;
    }

    final void setTrimPathOffset(float f) {
        this.j = f;
    }
}
