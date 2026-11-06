package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ewt implements fiy {
    UNKNOWN_TYPE(0),
    TIMEOUT_UNLOCKED(1),
    POLICY_APPLIED(2),
    APP_INSTALLED(3),
    TIME_LIMIT_LOCAL_OVERRIDE(4),
    PARENT_ACCESS_CODE_USED(5);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static ewt a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_TYPE;
            case 1:
                return TIMEOUT_UNLOCKED;
            case 2:
                return POLICY_APPLIED;
            case 3:
                return APP_INSTALLED;
            case 4:
                return TIME_LIMIT_LOCAL_OVERRIDE;
            case 5:
                return PARENT_ACCESS_CODE_USED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ewu.a;
    }

    ewt(int i) {
        this.e = i;
    }
}
