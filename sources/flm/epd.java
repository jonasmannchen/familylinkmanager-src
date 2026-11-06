package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum epd implements fiy {
    UNKNOWN_FLOW_TYPE(0),
    SIGN_IN(1),
    SIGN_OUT(2),
    OOB_SIGN_IN(3),
    OOB_TAIL(4),
    AUTH_SIGN_IN(5),
    AUTH_SIGN_OUT(6),
    MEMBER_SV_ONBOARDING(10),
    MEMBER_SV_ABOUT_SUPERVISION(11),
    MEMBER_SV_EXIT(12),
    SECONDARY_SIGN_IN(20),
    SECONDARY_SIGN_OUT(21);

    public final int j;

    @Override // flm.fiy
    public final int a() {
        return this.j;
    }

    public static epd a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_FLOW_TYPE;
            case 1:
                return SIGN_IN;
            case 2:
                return SIGN_OUT;
            case 3:
                return OOB_SIGN_IN;
            case 4:
                return OOB_TAIL;
            case 5:
                return AUTH_SIGN_IN;
            case 6:
                return AUTH_SIGN_OUT;
            case 7:
            case 8:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return null;
            case 10:
                return MEMBER_SV_ONBOARDING;
            case 11:
                return MEMBER_SV_ABOUT_SUPERVISION;
            case 12:
                return MEMBER_SV_EXIT;
            case 20:
                return SECONDARY_SIGN_IN;
            case 21:
                return SECONDARY_SIGN_OUT;
        }
    }

    public static fiz b() {
        return epe.a;
    }

    epd(int i) {
        this.j = i;
    }
}
