package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum etg implements fiy {
    UNKNOWN_APP_SOURCE(0),
    GOOGLE_PLAY(1);

    private final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static etg a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_APP_SOURCE;
            case 1:
                return GOOGLE_PLAY;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eth.a;
    }

    etg(int i) {
        this.c = i;
    }
}
