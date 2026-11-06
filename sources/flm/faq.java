package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum faq implements fiy {
    UNKNOWN_CANCELLATION_REASON(0),
    INITIATOR_REJECTED(1),
    ACCEPTOR_QUIT(2),
    INITIATOR_FAMILY_FULL(3),
    INITIATOR_INVITATION_FAILED(7),
    ACCEPTOR_PLAY_COUNTRY_MISMATCH(4),
    ACCEPTOR_SWITCH_LIMIT_REACHED(5),
    ACCEPTOR_IN_DIFFERENT_FAMILY(6),
    INITIATOR_BLOCKED_BY_ACCEPTOR(8);

    private final int j;

    @Override // flm.fiy
    public final int a() {
        return this.j;
    }

    public static faq a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_CANCELLATION_REASON;
            case 1:
                return INITIATOR_REJECTED;
            case 2:
                return ACCEPTOR_QUIT;
            case 3:
                return INITIATOR_FAMILY_FULL;
            case 4:
                return ACCEPTOR_PLAY_COUNTRY_MISMATCH;
            case 5:
                return ACCEPTOR_SWITCH_LIMIT_REACHED;
            case 6:
                return ACCEPTOR_IN_DIFFERENT_FAMILY;
            case 7:
                return INITIATOR_INVITATION_FAILED;
            case 8:
                return INITIATOR_BLOCKED_BY_ACCEPTOR;
            default:
                return null;
        }
    }

    public static fiz b() {
        return far.a;
    }

    faq(int i) {
        this.j = i;
    }
}
