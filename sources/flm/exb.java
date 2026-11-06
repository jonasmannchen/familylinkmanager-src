package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum exb implements fiy {
    UNKNOWN_CATEGORY_ID(0),
    ESRB_UNKNOWN(199),
    FORCE_ENABLED(bbx.LOG_WTF_CONNECTIONS_THRESHOLD),
    FORCE_DISABLED(201),
    ESRB_EVERYONE(101),
    ESRB_EVERYONE_TEN_PLUS(102),
    ESRB_TEEN(103),
    ESRB_MATURE(104),
    ESRB_ADULTS_ONLY(105),
    GOOGLE_RATING_3(300),
    GOOGLE_RATING_7(301),
    GOOGLE_RATING_12(302),
    GOOGLE_RATING_16(303),
    GOOGLE_RATING_18(304),
    GOOGLE_RATING_17(305),
    GENERIC_IARC_3(320),
    GENERIC_IARC_7(321),
    GENERIC_IARC_12(322),
    GENERIC_IARC_16(323),
    GENERIC_IARC_18(324),
    ACB_G(341),
    ACB_PG(342),
    ACB_M(343),
    ACB_MA_15_PLUS(344),
    ACB_R_18_PLUS(345),
    ACB_UNRATED(346),
    CLASS_IND_L(360),
    CLASS_IND_10(361),
    CLASS_IND_12(362),
    CLASS_IND_14(363),
    CLASS_IND_16(364),
    CLASS_IND_18(365),
    PEGI_3(380),
    PEGI_7(381),
    PEGI_12(382),
    PEGI_EXCLAMATION(383),
    PEGI_16(384),
    PEGI_18(385),
    USK_0(400),
    USK_6(401),
    USK_12(402),
    USK_16(403),
    USK_18(404);

    private final int R;

    @Override // flm.fiy
    public final int a() {
        return this.R;
    }

    public static exb a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_CATEGORY_ID;
            case 101:
                return ESRB_EVERYONE;
            case 102:
                return ESRB_EVERYONE_TEN_PLUS;
            case 103:
                return ESRB_TEEN;
            case 104:
                return ESRB_MATURE;
            case 105:
                return ESRB_ADULTS_ONLY;
            case 199:
                return ESRB_UNKNOWN;
            case bbx.LOG_WTF_CONNECTIONS_THRESHOLD /* 200 */:
                return FORCE_ENABLED;
            case 201:
                return FORCE_DISABLED;
            case 300:
                return GOOGLE_RATING_3;
            case 301:
                return GOOGLE_RATING_7;
            case 302:
                return GOOGLE_RATING_12;
            case 303:
                return GOOGLE_RATING_16;
            case 304:
                return GOOGLE_RATING_18;
            case 305:
                return GOOGLE_RATING_17;
            case 320:
                return GENERIC_IARC_3;
            case 321:
                return GENERIC_IARC_7;
            case 322:
                return GENERIC_IARC_12;
            case 323:
                return GENERIC_IARC_16;
            case 324:
                return GENERIC_IARC_18;
            case 341:
                return ACB_G;
            case 342:
                return ACB_PG;
            case 343:
                return ACB_M;
            case 344:
                return ACB_MA_15_PLUS;
            case 345:
                return ACB_R_18_PLUS;
            case 346:
                return ACB_UNRATED;
            case 360:
                return CLASS_IND_L;
            case 361:
                return CLASS_IND_10;
            case 362:
                return CLASS_IND_12;
            case 363:
                return CLASS_IND_14;
            case 364:
                return CLASS_IND_16;
            case 365:
                return CLASS_IND_18;
            case 380:
                return PEGI_3;
            case 381:
                return PEGI_7;
            case 382:
                return PEGI_12;
            case 383:
                return PEGI_EXCLAMATION;
            case 384:
                return PEGI_16;
            case 385:
                return PEGI_18;
            case 400:
                return USK_0;
            case 401:
                return USK_6;
            case 402:
                return USK_12;
            case 403:
                return USK_16;
            case 404:
                return USK_18;
            default:
                return null;
        }
    }

    public static fiz b() {
        return exc.a;
    }

    exb(int i) {
        this.R = i;
    }
}
