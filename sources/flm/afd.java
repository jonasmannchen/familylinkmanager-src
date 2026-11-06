package flm;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class afd {
    public final afw a;
    public int b;
    public final Rect c;

    private afd(afw afwVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = afwVar;
    }

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    public final int a() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return e() - this.b;
    }

    /* synthetic */ afd(afw afwVar, byte b) {
        this(afwVar);
    }
}
