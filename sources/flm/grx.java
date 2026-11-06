package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum grx implements fiy {
    UNKNOWN_HARDWARE_VARIANT(0),
    PHONE_OR_TABLET(1),
    WATCH(2),
    LEANBACK(3);

    public final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static grx a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_HARDWARE_VARIANT;
            case 1:
                return PHONE_OR_TABLET;
            case 2:
                return WATCH;
            case 3:
                return LEANBACK;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gry.a;
    }

    grx(int i) {
        this.d = i;
    }
}
