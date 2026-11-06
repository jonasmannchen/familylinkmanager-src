package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum chx implements fiy {
    NORMAL(0),
    UPDATING(1),
    DISABLED(2);

    public final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static chx a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return NORMAL;
            case 1:
                return UPDATING;
            case 2:
                return DISABLED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return chy.a;
    }

    chx(int i) {
        this.d = i;
    }
}
