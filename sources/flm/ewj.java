package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ewj implements fiy {
    UNKNOWN_PROFILE_TYPE(0),
    PRIMARY(1),
    SECONDARY(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static ewj a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_PROFILE_TYPE;
            case 1:
                return PRIMARY;
            case 2:
                return SECONDARY;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ewk.a;
    }

    ewj(int i) {
        this.c = i;
    }
}
