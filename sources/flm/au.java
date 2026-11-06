package flm;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class au implements af {
    public static final au i = new au();
    public Handler e;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final ag f = new ag(this);
    public Runnable g = new av(this);
    public ba h = new aw(this);

    final void a() {
        if (this.a == 0 && this.c) {
            this.f.a(y.ON_STOP);
            this.d = true;
        }
    }

    private au() {
    }

    @Override // flm.af
    public final x getLifecycle() {
        return this.f;
    }
}
