package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class att {
    public abstract aty await();

    public abstract aty await(long j, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(atz atzVar);

    public abstract void setResultCallback(atz atzVar, long j, TimeUnit timeUnit);

    public void store(aub aubVar, int i) {
        throw new UnsupportedOperationException();
    }

    public void addStatusListener(atu atuVar) {
        throw new UnsupportedOperationException();
    }

    public auf then(auc aucVar) {
        throw new UnsupportedOperationException();
    }

    public void setResultId(int i) {
        throw new UnsupportedOperationException();
    }

    public Integer getResultId() {
        throw new UnsupportedOperationException();
    }
}
