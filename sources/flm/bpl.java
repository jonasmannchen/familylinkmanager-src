package flm;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bpl implements ThreadFactory {
    bpl() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable(runnable) { // from class: flm.bpm
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = this.a;
                Process.setThreadPriority(10);
                dts dtsVar = bpj.a;
                dtq dtqVarA = dtsVar.b.a("common_PhantomFutures", dtsVar.c, dtsVar.a.a(), dtsVar.a.b());
                try {
                    runnable2.run();
                    if (dtqVarA != null) {
                        dtqVarA.close();
                    }
                } catch (Throwable th) {
                    if (dtqVarA != null) {
                        if (0 != 0) {
                            try {
                                dtqVarA.close();
                            } catch (Throwable th2) {
                                ehh.a((Throwable) null, th2);
                            }
                        } else {
                            dtqVarA.close();
                        }
                    }
                    throw th;
                }
            }
        }, "common_PhantomFutures");
    }
}
