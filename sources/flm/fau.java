package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fau implements fiy {
    UNKNOWN_INITIATOR_STATE(0),
    INITIATOR_CANCELLED(1),
    PAIRED_WITH_ACCEPTOR(2),
    CONFIRMED_ACCEPTOR(3);

    private final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static fau a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_INITIATOR_STATE;
            case 1:
                return INITIATOR_CANCELLED;
            case 2:
                return PAIRED_WITH_ACCEPTOR;
            case 3:
                return CONFIRMED_ACCEPTOR;
            default:
                return null;
        }
    }

    public static fiz b() {
        return fav.a;
    }

    fau(int i) {
        this.e = i;
    }
}
