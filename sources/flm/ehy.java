package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ehy implements fiy {
    UNKNOWN_CLIENT(0),
    ANDROID_PARENT_APP(1),
    IOS_PARENT_APP(2),
    ANDROID_KID_SETUP_APP(3),
    ANDROID_PLAY(4),
    ANDROID_FAMILYLINK_APP(5),
    IOS_FAMILYLINK_APP(6),
    ANDROID_GMSCORE(7),
    GOOGLE_ADMIN(8),
    IOS_FAMILY_MANAGEMENT(9),
    WEB_FAMILY_PRODUCT_PAGE(10),
    G1_MARKETING_PAGE(11),
    ANDROID_FAMILYLINK_HELPER_APP(12),
    ANDROID_ASSISTANT(13);

    public final int b;

    @Override // flm.fiy
    public final int a() {
        return this.b;
    }

    public static ehy a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_CLIENT;
            case 1:
                return ANDROID_PARENT_APP;
            case 2:
                return IOS_PARENT_APP;
            case 3:
                return ANDROID_KID_SETUP_APP;
            case 4:
                return ANDROID_PLAY;
            case 5:
                return ANDROID_FAMILYLINK_APP;
            case 6:
                return IOS_FAMILYLINK_APP;
            case 7:
                return ANDROID_GMSCORE;
            case 8:
                return GOOGLE_ADMIN;
            case 9:
                return IOS_FAMILY_MANAGEMENT;
            case 10:
                return WEB_FAMILY_PRODUCT_PAGE;
            case 11:
                return G1_MARKETING_PAGE;
            case 12:
                return ANDROID_FAMILYLINK_HELPER_APP;
            case 13:
                return ANDROID_ASSISTANT;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ehz.a;
    }

    ehy(int i) {
        this.b = i;
    }
}
