package flm;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egt implements Runnable {
    private final Future a;
    private final egr b;

    public egt(Future future, egr egrVar) {
        this.a = future;
        this.b = egrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a(egs.a(this.a));
        } catch (Error e) {
            e = e;
            this.b.a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.b.a(e);
        } catch (ExecutionException e3) {
            this.b.a(e3.getCause());
        }
    }

    public final String toString() {
        dvf dvfVarA = dve.a(this);
        dvfVarA.a().b = this.b;
        return dvfVarA.toString();
    }
}
