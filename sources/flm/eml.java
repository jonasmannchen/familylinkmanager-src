package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eml implements fiy {
    UNKNOWN_STATUS(0),
    UNSUPERVISED_ACCOUNT(1),
    MISSING_PROFILE_OWNER(2),
    FINISH_SETUP(3),
    NO_OP(4);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static eml a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_STATUS;
            case 1:
                return UNSUPERVISED_ACCOUNT;
            case 2:
                return MISSING_PROFILE_OWNER;
            case 3:
                return FINISH_SETUP;
            case 4:
                return NO_OP;
            default:
                return null;
        }
    }

    public static fiz b() {
        return emm.a;
    }

    eml(int i) {
        this.e = i;
    }
}
