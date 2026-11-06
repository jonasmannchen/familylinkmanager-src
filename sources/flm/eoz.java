package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eoz implements fiy {
    UNSPECIFIED_TIME_LIMIT_STATE(0),
    TIME_LIMIT_OFF(1),
    TIME_LIMIT_ON(2);

    public final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static eoz a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED_TIME_LIMIT_STATE;
            case 1:
                return TIME_LIMIT_OFF;
            case 2:
                return TIME_LIMIT_ON;
            default:
                return null;
        }
    }

    public static fiz b() {
        return epa.a;
    }

    eoz(int i) {
        this.d = i;
    }
}
