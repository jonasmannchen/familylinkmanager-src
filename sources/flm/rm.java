package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rm {
    public static final rl a = new rr(null, false);
    public static final rl b = new rr(null, true);
    public static final rl c = new rr(ro.a, false);
    public static final rl d = new rr(ro.a, true);

    static int a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    static int b(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }

    static {
        new rr(rn.a, false);
    }
}
