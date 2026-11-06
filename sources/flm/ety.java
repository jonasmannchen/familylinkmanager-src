package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ety implements fiy {
    UNSPECIFIED(0),
    DEFAULT(1),
    CANCELLED_BY_OVERRIDE(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static ety a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED;
            case 1:
                return DEFAULT;
            case 2:
                return CANCELLED_BY_OVERRIDE;
            default:
                return null;
        }
    }

    public static fiz b() {
        return etz.a;
    }

    ety(int i) {
        this.c = i;
    }
}
