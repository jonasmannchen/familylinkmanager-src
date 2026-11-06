package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum grl implements fiy {
    NONE(0),
    TRACE(1),
    SCENARIO(2),
    METRIC(3);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static grl a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return NONE;
            case 1:
                return TRACE;
            case 2:
                return SCENARIO;
            case 3:
                return METRIC;
            default:
                return null;
        }
    }

    public static fiz b() {
        return grm.a;
    }

    grl(int i) {
        this.c = i;
    }
}
