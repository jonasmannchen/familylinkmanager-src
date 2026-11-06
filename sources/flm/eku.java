package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eku implements fiy {
    UNKNOWN_BACKGROUND_TASK(0),
    VERIFY_PAIRING_CODE(1),
    VERIFY_PASSWORD(14),
    CHECK_INITIATOR(2),
    ACCEPT_FAMILY_INVITE(3),
    REMOVE_ADDITIONAL_ACCOUNTS(4),
    OPT_IN_SUPERVISION(5),
    SET_POLICY_LEVEL(6),
    REPORT_DEVICE_INFO(7),
    INITIALIZE_DEVICE_SETUP(8),
    SYNC_SUPERVISION(9),
    FINISH_DEVICE_SETUP(10),
    CANCEL_ONBOARDING(15),
    OPT_OUT_SUPERVISION(11),
    VERIFY_PARENT_ACCESS_CODE(12),
    REVOKE_SUPERVISION(13);

    public final int k;

    @Override // flm.fiy
    public final int a() {
        return this.k;
    }

    public static eku a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_BACKGROUND_TASK;
            case 1:
                return VERIFY_PAIRING_CODE;
            case 2:
                return CHECK_INITIATOR;
            case 3:
                return ACCEPT_FAMILY_INVITE;
            case 4:
                return REMOVE_ADDITIONAL_ACCOUNTS;
            case 5:
                return OPT_IN_SUPERVISION;
            case 6:
                return SET_POLICY_LEVEL;
            case 7:
                return REPORT_DEVICE_INFO;
            case 8:
                return INITIALIZE_DEVICE_SETUP;
            case 9:
                return SYNC_SUPERVISION;
            case 10:
                return FINISH_DEVICE_SETUP;
            case 11:
                return OPT_OUT_SUPERVISION;
            case 12:
                return VERIFY_PARENT_ACCESS_CODE;
            case 13:
                return REVOKE_SUPERVISION;
            case 14:
                return VERIFY_PASSWORD;
            case 15:
                return CANCEL_ONBOARDING;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ekv.a;
    }

    eku(int i) {
        this.k = i;
    }
}
