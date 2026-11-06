package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fdx implements fiy {
    UNSPECIFIED_SUPPORTED_FEATURE(0),
    SUPPORT_SMS(6),
    SUPPORT_VOICE(7),
    SUPPORTS_PASSWORD_CHANGE(8),
    DEPRECATED_SUPPORTED_FEATURE_1(1),
    DEPRECATED_SUPPORTED_FEATURE_2(2),
    DEPRECATED_SUPPORTED_FEATURE_3(3),
    DEPRECATED_SUPPORTED_FEATURE_4(4),
    DEPRECATED_SUPPORTED_FEATURE_5(5);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static fdx a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED_SUPPORTED_FEATURE;
            case 1:
                return DEPRECATED_SUPPORTED_FEATURE_1;
            case 2:
                return DEPRECATED_SUPPORTED_FEATURE_2;
            case 3:
                return DEPRECATED_SUPPORTED_FEATURE_3;
            case 4:
                return DEPRECATED_SUPPORTED_FEATURE_4;
            case 5:
                return DEPRECATED_SUPPORTED_FEATURE_5;
            case 6:
                return SUPPORT_SMS;
            case 7:
                return SUPPORT_VOICE;
            case 8:
                return SUPPORTS_PASSWORD_CHANGE;
            default:
                return null;
        }
    }

    public static fiz b() {
        return fdy.a;
    }

    fdx(int i) {
        this.e = i;
    }
}
