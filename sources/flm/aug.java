package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aug extends UnsupportedOperationException {
    private final aqb a;

    public aug(aqb aqbVar) {
        this.a = aqbVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strValueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 8).append("Missing ").append(strValueOf).toString();
    }
}
