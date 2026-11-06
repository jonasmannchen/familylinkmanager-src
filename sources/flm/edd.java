package flm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edd {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a(edc edcVar) {
        if (edcVar == null) {
            edcVar = new edm();
        }
        if (!edi.b.compareAndSet(null, edcVar)) {
            throw new IllegalStateException("Logger backends can only be configured once.");
        }
        edi.b();
    }
}
