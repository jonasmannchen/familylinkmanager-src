package flm;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bhn implements Runnable {
    private Runnable a;
    private Thread b;
    private dte c;
    private final /* synthetic */ bhl d;

    public bhn(bhl bhlVar, Runnable runnable, dte dteVar) {
        this.d = bhlVar;
        this.b = null;
        this.c = null;
        this.a = runnable;
        this.c = dteVar;
    }

    public bhn(bhl bhlVar, Runnable runnable) {
        this(bhlVar, runnable, bhm.a(runnable));
    }

    private final void a() {
        boolean z;
        this.d.d.lock();
        try {
            this.d.b.remove(this.b);
            Runnable runnable = (Runnable) this.d.c.poll();
            if (runnable != null) {
                this.d.a.execute(new bhn(this.d, runnable));
                z = false;
            } else {
                this.d.f--;
                if (this.d.f != 0) {
                    z = false;
                } else {
                    this.d.e.signalAll();
                    z = true;
                }
            }
            if (z) {
                this.d.a();
            }
        } finally {
            this.d.d.unlock();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        dte dteVarA;
        if (this.c != null) {
            duj.a(this.c, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        }
        try {
            this.b = Thread.currentThread();
            this.d.d.lock();
            try {
                if (this.d.i && this.a != null) {
                    this.a = null;
                }
                this.d.b.add(this.b);
                this.d.h = Math.max(this.d.h, this.d.b.size());
                this.d.d.unlock();
                while (true) {
                    try {
                        if (this.a != null) {
                            Runnable runnable2 = this.a;
                            this.a = null;
                            runnable = runnable2;
                        } else {
                            Runnable runnable3 = (Runnable) this.d.c.poll();
                            if (runnable3 != null && (dteVarA = bhm.a(runnable3)) != this.c) {
                                this.c = dteVarA;
                                duj.a(dteVarA, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                            }
                            runnable = runnable3;
                        }
                        if (runnable == null) {
                            break;
                        }
                        String string = runnable.toString();
                        if (string.length() > 120) {
                            string = string.substring(0, 120);
                        }
                        Trace.beginSection(string);
                        try {
                            this.d.beforeExecute(this.b, runnable);
                            try {
                                runnable.run();
                                this.d.afterExecute(runnable, null);
                                Trace.endSection();
                                this.d.g.incrementAndGet();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    this.d.afterExecute(runnable, th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            if (Build.VERSION.SDK_INT >= 18) {
                                Trace.endSection();
                            }
                            this.d.g.incrementAndGet();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        a();
                        throw th4;
                    }
                }
                a();
                if (this.c != null) {
                    duj.a((dte) null, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                    this.c = null;
                }
            } catch (Throwable th5) {
                this.d.d.unlock();
                throw th5;
            }
        } catch (Throwable th6) {
            if (this.c != null) {
                duj.a((dte) null, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                this.c = null;
            }
            throw th6;
        }
    }
}
