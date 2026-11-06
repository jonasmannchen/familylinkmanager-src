package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebm extends Exception {
    ebm(Throwable th, ebt ebtVar, StackTraceElement[] stackTraceElementArr) {
        super(ebtVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
