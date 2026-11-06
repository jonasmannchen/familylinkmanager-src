package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eoo implements fiy {
    NO_ACTIVE_POLICY(0),
    OVERRIDE(1),
    FIXED_LIMIT(2),
    USAGE_LIMIT(3);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static eoo a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return NO_ACTIVE_POLICY;
            case 1:
                return OVERRIDE;
            case 2:
                return FIXED_LIMIT;
            case 3:
                return USAGE_LIMIT;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eop.a;
    }

    eoo(int i) {
        this.e = i;
    }
}
