package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum evf implements fiy {
    UNKNOWN(0),
    SUPERVISABLE_WITH_ACTION(1),
    UNSUPERVISABLE_BUT_ALLOWED(2),
    NOT_ALLOWED(3);

    private final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static evf a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return SUPERVISABLE_WITH_ACTION;
            case 2:
                return UNSUPERVISABLE_BUT_ALLOWED;
            case 3:
                return NOT_ALLOWED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return evg.a;
    }

    evf(int i) {
        this.e = i;
    }
}
