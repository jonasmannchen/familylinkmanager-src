package flm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvj extends fsj {
    private static final Logger a = Logger.getLogger(fvj.class.getName());
    private static final ThreadLocal b = new ThreadLocal();

    fvj() {
    }

    @Override // flm.fsj
    public final fsc a(fsc fscVar) {
        fsc fscVarA = a();
        b.set(fscVar);
        return fscVarA;
    }

    @Override // flm.fsj
    public final void a(fsc fscVar, fsc fscVar2) {
        if (a() != fscVar) {
            a.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        a(fscVar2);
    }

    @Override // flm.fsj
    public final fsc a() {
        return (fsc) b.get();
    }
}
