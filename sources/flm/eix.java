package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eix implements fiy {
    RELEASE_TYPE_UNSPECIFIED(0),
    DEV(1),
    DOGFOOD(2),
    PROD(3);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static eix a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return RELEASE_TYPE_UNSPECIFIED;
            case 1:
                return DEV;
            case 2:
                return DOGFOOD;
            case 3:
                return PROD;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eiy.a;
    }

    eix(int i) {
        this.c = i;
    }
}
