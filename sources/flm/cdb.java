package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum cdb {
    FORCE_APPLY(true, true),
    BOOTSTRAP(false, true),
    NORMAL(false, false);

    public final boolean d;
    public final boolean e;

    cdb(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
