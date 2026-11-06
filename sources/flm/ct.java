package flm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ct {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final cn b;
    private volatile bw c;

    public ct(cn cnVar) {
        this.b = cnVar;
    }

    public abstract String a();

    private final bw c() {
        return this.b.a(a());
    }

    public final bw b() {
        this.b.c();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = c();
            }
            return this.c;
        }
        return c();
    }

    public final void a(bw bwVar) {
        if (bwVar == this.c) {
            this.a.set(false);
        }
    }
}
