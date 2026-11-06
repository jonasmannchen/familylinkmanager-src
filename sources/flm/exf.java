package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum exf implements fiy {
    UNSPECIFIED_EFFECTIVE_DAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    public final int i;

    @Override // flm.fiy
    public final int a() {
        return this.i;
    }

    public static exf a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED_EFFECTIVE_DAY;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    public static fiz b() {
        return exg.a;
    }

    exf(int i) {
        this.i = i;
    }
}
