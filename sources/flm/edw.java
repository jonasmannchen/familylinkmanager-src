package flm;

import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edw extends edn {
    public edw(Logger logger) {
        super(logger);
    }

    @Override // flm.ecg
    public final void a(ecf ecfVar) {
        a(new edv(ecfVar), ecfVar.k());
    }

    @Override // flm.ecg
    public final void a(RuntimeException runtimeException, ecf ecfVar) {
        a(new edv(runtimeException, ecfVar), ecfVar.k());
    }
}
