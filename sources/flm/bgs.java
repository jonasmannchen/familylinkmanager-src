package flm;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgs {
    public static egv a(final egv egvVar) {
        egvVar.a(new Runnable(egvVar) { // from class: flm.bgt
            private final egv a;

            {
                this.a = egvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                egv egvVar2 = this.a;
                if (egvVar2.isCancelled()) {
                    return;
                }
                try {
                    egs.a(egvVar2);
                } catch (ExecutionException e) {
                    final String name = Thread.currentThread().getName();
                    new Handler(Looper.getMainLooper()).post(new Runnable(e, name) { // from class: flm.bgu
                        private final ExecutionException a;
                        private final String b;

                        {
                            this.a = e;
                            this.b = name;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ExecutionException executionException = this.a;
                            String str = this.b;
                            Throwable cause = executionException.getCause();
                            if (cause instanceof Error) {
                                String strValueOf = String.valueOf(str);
                                throw new ego(strValueOf.length() != 0 ? "rethrowing error from ".concat(strValueOf) : new String("rethrowing error from "), (Error) cause);
                            }
                            String strValueOf2 = String.valueOf(str);
                            throw new ehe(strValueOf2.length() != 0 ? "rethrowing exception from ".concat(strValueOf2) : new String("rethrowing exception from "), cause);
                        }
                    });
                }
            }
        }, egn.INSTANCE);
        return egvVar;
    }
}
