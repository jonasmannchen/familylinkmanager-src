package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum bod implements fiy {
    UNKNOWN(0),
    ZERO_PARTY(1),
    FIRST_PARTY(2),
    THIRD_PARTY(3);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static bod a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return ZERO_PARTY;
            case 2:
                return FIRST_PARTY;
            case 3:
                return THIRD_PARTY;
            default:
                return null;
        }
    }

    public static fiz b() {
        return boe.a;
    }

    bod(int i) {
        this.e = i;
    }
}
