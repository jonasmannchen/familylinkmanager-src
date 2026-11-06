package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum exo implements fiy {
    UNKNOWN_GENDER(0),
    MALE(1),
    FEMALE(2),
    OTHER(3);

    private final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static exo a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_GENDER;
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            case 3:
                return OTHER;
            default:
                return null;
        }
    }

    public static fiz b() {
        return exp.a;
    }

    exo(int i) {
        this.e = i;
    }
}
