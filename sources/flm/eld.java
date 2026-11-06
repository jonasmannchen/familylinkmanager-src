package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eld implements fiy {
    UNKNOWN_STATUS(0),
    INIT_SETUP(1),
    INIT_SUPERVISION(2),
    ENFORCE_SUPERVISION(3);

    public final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static eld a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_STATUS;
            case 1:
                return INIT_SETUP;
            case 2:
                return INIT_SUPERVISION;
            case 3:
                return ENFORCE_SUPERVISION;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ele.a;
    }

    eld(int i) {
        this.d = i;
    }
}
