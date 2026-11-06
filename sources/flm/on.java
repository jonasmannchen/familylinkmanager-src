package flm;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class on extends or implements Runnable {
    public boolean a;
    private final CountDownLatch h = new CountDownLatch(1);
    private final /* synthetic */ om i;

    on(om omVar) {
        this.i = omVar;
    }

    private final Object b() {
        try {
            return this.i.d();
        } catch (qr e) {
            if (!this.f.get()) {
                throw e;
            }
            return null;
        }
    }

    @Override // flm.or
    protected final void a(Object obj) {
        try {
            om omVar = this.i;
            if (omVar.a != this) {
                omVar.a(this, obj);
            } else if (!omVar.g) {
                omVar.j = false;
                omVar.b = SystemClock.uptimeMillis();
                omVar.a = null;
                omVar.a(obj);
            }
        } finally {
            this.h.countDown();
        }
    }

    @Override // flm.or
    protected final void b(Object obj) {
        try {
            this.i.a(this, obj);
        } finally {
            this.h.countDown();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.i.c();
    }

    @Override // flm.or
    protected final /* synthetic */ Object a(Object[] objArr) {
        return b();
    }
}
