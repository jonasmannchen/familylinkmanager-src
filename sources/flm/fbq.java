package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fbq implements fiy {
    UNKNOWN_HIDE_REASON(0),
    PARENT(1),
    BLACKLIST(2);

    private final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static fbq a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_HIDE_REASON;
            case 1:
                return PARENT;
            case 2:
                return BLACKLIST;
            default:
                return null;
        }
    }

    public static fiz b() {
        return fbr.a;
    }

    fbq(int i) {
        this.d = i;
    }
}
