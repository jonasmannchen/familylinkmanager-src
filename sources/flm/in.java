package flm;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class in extends io {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public int k;
    public int[] l;
    public String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(in inVar, rt rtVar) {
        ip ilVar;
        super((byte) 0);
        int i = 0;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
        this.c = inVar.c;
        this.d = inVar.d;
        this.e = inVar.e;
        this.f = inVar.f;
        this.g = inVar.g;
        this.h = inVar.h;
        this.i = inVar.i;
        this.l = inVar.l;
        this.m = inVar.m;
        this.k = inVar.k;
        if (this.m != null) {
            rtVar.put(this.m, this);
        }
        this.j.set(inVar.j);
        ArrayList arrayList = inVar.b;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i2);
            if (obj instanceof in) {
                this.b.add(new in((in) obj, rtVar));
            } else {
                if (obj instanceof im) {
                    ilVar = new im((im) obj);
                } else {
                    if (!(obj instanceof il)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    ilVar = new il((il) obj);
                }
                this.b.add(ilVar);
                if (ilVar.o != null) {
                    rtVar.put(ilVar.o, ilVar);
                }
            }
            i = i2 + 1;
        }
    }

    public in() {
        super((byte) 0);
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public final String getGroupName() {
        return this.m;
    }

    public final Matrix getLocalMatrix() {
        return this.j;
    }

    final void a() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public final float getRotation() {
        return this.c;
    }

    public final void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            a();
        }
    }

    public final float getPivotX() {
        return this.d;
    }

    public final void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            a();
        }
    }

    public final float getPivotY() {
        return this.e;
    }

    public final void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            a();
        }
    }

    public final float getScaleX() {
        return this.f;
    }

    public final void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            a();
        }
    }

    public final float getScaleY() {
        return this.g;
    }

    public final void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            a();
        }
    }

    public final float getTranslateX() {
        return this.h;
    }

    public final void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            a();
        }
    }

    public final float getTranslateY() {
        return this.i;
    }

    public final void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            a();
        }
    }

    @Override // flm.io
    public final boolean b() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((io) this.b.get(i)).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // flm.io
    public final boolean a(int[] iArr) {
        boolean zA = false;
        for (int i = 0; i < this.b.size(); i++) {
            zA |= ((io) this.b.get(i)).a(iArr);
        }
        return zA;
    }
}
