package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fgi implements fiy {
    UNKNOWN_DAY_TYPE(0),
    WEEKDAY(1),
    WEEKEND(2),
    HOLIDAY(3);

    private final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static fgi a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_DAY_TYPE;
            case 1:
                return WEEKDAY;
            case 2:
                return WEEKEND;
            case 3:
                return HOLIDAY;
            default:
                return null;
        }
    }

    fgi(int i) {
        this.e = i;
    }
}
