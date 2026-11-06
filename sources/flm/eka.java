package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eka implements fiy {
    ROLE_UNSPECIFIED(0),
    ACTOR(1),
    TARGET(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static eka a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return ROLE_UNSPECIFIED;
            case 1:
                return ACTOR;
            case 2:
                return TARGET;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ekb.a;
    }

    eka(int i) {
        this.c = i;
    }
}
