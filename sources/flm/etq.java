package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum etq implements fiy {
    STATE_UNKNOWN(0),
    STATE_UNAVAILABLE(1),
    STATE_ON(2),
    STATE_OFF(3),
    STATE_BLACKLISTED(4);

    public final int f;

    @Override // flm.fiy
    public final int a() {
        return this.f;
    }

    public static etq a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return STATE_UNKNOWN;
            case 1:
                return STATE_UNAVAILABLE;
            case 2:
                return STATE_ON;
            case 3:
                return STATE_OFF;
            case 4:
                return STATE_BLACKLISTED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return etr.a;
    }

    etq(int i) {
        this.f = i;
    }
}
