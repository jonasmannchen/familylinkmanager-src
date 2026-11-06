package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eyo implements fiy {
    UNKNOWN_ICON_TYPE(0),
    PRODUCT(1),
    SYSTEM(2);

    private final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static eyo a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_ICON_TYPE;
            case 1:
                return PRODUCT;
            case 2:
                return SYSTEM;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eyp.a;
    }

    eyo(int i) {
        this.d = i;
    }
}
