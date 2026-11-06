package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edv extends edo implements ecp {
    edv(ecf ecfVar) {
        super(ecfVar);
        eco.a(ecfVar, this);
    }

    edv(RuntimeException runtimeException, ecf ecfVar) {
        super(runtimeException, ecfVar);
    }

    @Override // flm.ecp
    public final void a(Level level, String str, Throwable th) {
        setMessage(str);
        setThrown(th);
    }
}
