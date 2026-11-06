package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fnk implements fiy {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);

    public final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    fnk(int i) {
        this.d = i;
    }
}
