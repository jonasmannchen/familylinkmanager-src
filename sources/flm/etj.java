package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum etj implements fiy {
    STATUS_UNKNOWN(0),
    STATUS_ENABLED(1),
    STATUS_DISABLED(2);

    private final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static etj a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return STATUS_UNKNOWN;
            case 1:
                return STATUS_ENABLED;
            case 2:
                return STATUS_DISABLED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return etk.a;
    }

    etj(int i) {
        this.d = i;
    }
}
