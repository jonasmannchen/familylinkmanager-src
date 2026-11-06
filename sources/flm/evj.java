package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum evj implements fiy {
    UNKNOWN_CONSENT_TYPE(0),
    SIGN_IN(1),
    SIGN_OUT(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static evj a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_CONSENT_TYPE;
            case 1:
                return SIGN_IN;
            case 2:
                return SIGN_OUT;
            default:
                return null;
        }
    }

    public static fiz b() {
        return evk.a;
    }

    evj(int i) {
        this.c = i;
    }
}
