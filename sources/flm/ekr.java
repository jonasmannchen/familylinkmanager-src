package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ekr implements fiy {
    UNKNOWN(0),
    POLICY_PARENT(100),
    POLICY_BLACKLIST(101),
    POLICY_MIN_VERSION(102);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    ekr(int i) {
        this.e = i;
    }
}
