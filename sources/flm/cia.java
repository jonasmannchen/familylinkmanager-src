package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum cia implements fiy {
    UNSPECIFIED(0),
    ABORT_WITH_RESULT_CANCELED(1),
    ABORT_WITH_RESULT_OK(13),
    ADD_ACCOUNT_FLOW(2),
    OUT_OF_BOX_FLOW(3),
    SYNC_TAIL_FLOW(4),
    DEFERRED_SETUP_FLOW(5),
    SIGN_OUT_FLOW(6),
    GELLER_FLOW(7),
    GELLER_EXIT_FLOW(8),
    SECONDARY_SIGN_IN_FLOW(9),
    SECONDARY_SIGN_OUT_FLOW(10),
    AUTH_ADD_FLOW(11),
    AUTH_REMOVE_FLOW(12);

    public final int o;

    @Override // flm.fiy
    public final int a() {
        return this.o;
    }

    public static cia a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED;
            case 1:
                return ABORT_WITH_RESULT_CANCELED;
            case 2:
                return ADD_ACCOUNT_FLOW;
            case 3:
                return OUT_OF_BOX_FLOW;
            case 4:
                return SYNC_TAIL_FLOW;
            case 5:
                return DEFERRED_SETUP_FLOW;
            case 6:
                return SIGN_OUT_FLOW;
            case 7:
                return GELLER_FLOW;
            case 8:
                return GELLER_EXIT_FLOW;
            case 9:
                return SECONDARY_SIGN_IN_FLOW;
            case 10:
                return SECONDARY_SIGN_OUT_FLOW;
            case 11:
                return AUTH_ADD_FLOW;
            case 12:
                return AUTH_REMOVE_FLOW;
            case 13:
                return ABORT_WITH_RESULT_OK;
            default:
                return null;
        }
    }

    public static fiz b() {
        return cib.a;
    }

    cia(int i) {
        this.o = i;
    }
}
