package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum evv implements fiy {
    UNKNOWN_CONSENT_STATUS(0),
    VALID(1),
    INVALID(2);

    private final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static evv a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_CONSENT_STATUS;
            case 1:
                return VALID;
            case 2:
                return INVALID;
            default:
                return null;
        }
    }

    public static fiz b() {
        return evw.a;
    }

    evv(int i) {
        this.d = i;
    }
}
