package flm;

import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dth implements Closeable, Runnable {
    private static final dsa d = new dsa("SpanEndSignal");
    public final Throwable b;
    public final String c;
    private Future e;
    private dtq f;
    public final AtomicReference a = new AtomicReference(dtk.OPEN);
    private final boolean g = dsg.a();

    dth(dtq dtqVar) {
        this.f = dtqVar;
        this.c = dtqVar.c();
        if (dsd.a(d)) {
            this.b = new RuntimeException();
        } else {
            this.b = null;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        if (dsd.a(d)) {
            dtk dtkVar = (dtk) this.a.get();
            if (!(dtkVar.equals(dtk.CLOSED) || dtkVar.equals(dtk.CLOSED_BY_FUTURE))) {
                dsg.a(new Runnable(this) { // from class: flm.dti
                    private final dth a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dth dthVar = this.a;
                        if (dtk.ATTACHED == dthVar.a.get()) {
                            String strValueOf = String.valueOf((Object) null);
                            throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf).length() + 51).append("Attached to a future that never completed! future: ").append(strValueOf).toString(), dthVar.b);
                        }
                        String strValueOf2 = String.valueOf(dthVar.a.get());
                        String strValueOf3 = String.valueOf((Object) null);
                        throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf2).length() + 40 + String.valueOf(strValueOf3).length()).append("Leaked span end signal! State: ").append(strValueOf2).append(" future: ").append(strValueOf3).toString(), dthVar.b);
                    }
                });
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!((dtk) this.a.getAndSet(dtk.CLOSED_BY_FUTURE)).equals(dtk.ATTACHED)) {
            dsg.a(dtj.a);
        } else {
            c();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            a();
        } finally {
            duj.b(this.c);
        }
    }

    final void a() {
        if (!this.a.compareAndSet(dtk.OPEN, dtk.CLOSED)) {
            if (((dtk) this.a.get()).equals(dtk.CLOSED)) {
                throw new IllegalStateException("Span was already closed!");
            }
        } else {
            c();
        }
    }

    private final void c() {
        this.f.a(this.g && ((dtk) this.a.get()).equals(dtk.CLOSED) && dsg.a());
        this.f = null;
        this.e = null;
    }

    static final /* synthetic */ void b() {
        throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
    }
}
