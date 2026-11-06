package flm;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class egk extends ega {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    egk() {
    }

    @Override // flm.ega
    final void a(egm egmVar, Thread thread) {
        a.putObject(egmVar, e, thread);
    }

    @Override // flm.ega
    final void a(egm egmVar, egm egmVar2) {
        a.putObject(egmVar, f, egmVar2);
    }

    @Override // flm.ega
    final boolean a(efz efzVar, egm egmVar, egm egmVar2) {
        return a.compareAndSwapObject(efzVar, c, egmVar, egmVar2);
    }

    @Override // flm.ega
    final boolean a(efz efzVar, ege egeVar, ege egeVar2) {
        return a.compareAndSwapObject(efzVar, b, egeVar, egeVar2);
    }

    @Override // flm.ega
    final boolean a(efz efzVar, Object obj, Object obj2) {
        return a.compareAndSwapObject(efzVar, d, obj, obj2);
    }

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e2) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new egl());
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }
        try {
            c = unsafe.objectFieldOffset(efz.class.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(efz.class.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(efz.class.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(egm.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(egm.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Exception e4) {
            dwe.a(e4);
            throw new RuntimeException(e4);
        }
    }
}
