package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ell implements fiy {
    INTENT_TYPE_UNKNOWN(0),
    PROFILE_OWNER(1);

    public final int b;

    @Override // flm.fiy
    public final int a() {
        return this.b;
    }

    public static ell a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return INTENT_TYPE_UNKNOWN;
            case 1:
                return PROFILE_OWNER;
            default:
                return null;
        }
    }

    public static fiz b() {
        return elm.a;
    }

    ell(int i) {
        this.b = i;
    }
}
