package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eus implements fiy {
    UNSPECIFIED_CAPABILITY(0),
    CAPABILITY_BEDTIME(1),
    CAPABILITY_TIMEOUT(2),
    CAPABILITY_DISABLE_APP(3),
    CAPABILITY_USERMANAGER_LOCKDOWN(4),
    CAPABILITY_LOCKBOX(5),
    CAPABILITY_ACCOUNT_MANAGEMENT(6),
    CAPABILITY_WIPE(7),
    CAPABILITY_ADD_REMOVE_USER_LOCKDOWN(8),
    CAPABILITY_FACTORY_RESET_LOCKDOWN(9),
    CAPABILITY_RING(10),
    CAPABILITY_APP_PERMISSIONS(11),
    CAPABILITY_REVOKE_TOKEN(12),
    CAPABILITY_SETTINGS_SUPERVISION(13),
    CAPABILITY_DEV_OPTIONS_LOCKDOWN(14),
    CAPABILITY_SHOW_ON_ANDROID_ONLY_LIST(15),
    CAPABILITY_TIME_LIMIT_UNLOCK_WITH_DEADLINE(16),
    CAPABILITY_APP_PERMISSIONS_READ_ONLY(17),
    CAPABILITY_FRESH_LOCATION(18),
    CAPABILITY_LOCATION_SETTINGS(19),
    CAPABILITY_SET_SCREEN_LOCK(20),
    CAPABILITY_LIMITED_SUPERVISION(21),
    CAPABILITY_REMOTE_APPS(22),
    CAPABILITY_PERMALOCK(23),
    CAPABILITY_LOCK_WITH_DEADLINE(24),
    CAPABILITY_VOICE(101),
    CAPABILITY_SMS(102);

    private final int B;

    @Override // flm.fiy
    public final int a() {
        return this.B;
    }

    public static eus a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED_CAPABILITY;
            case 1:
                return CAPABILITY_BEDTIME;
            case 2:
                return CAPABILITY_TIMEOUT;
            case 3:
                return CAPABILITY_DISABLE_APP;
            case 4:
                return CAPABILITY_USERMANAGER_LOCKDOWN;
            case 5:
                return CAPABILITY_LOCKBOX;
            case 6:
                return CAPABILITY_ACCOUNT_MANAGEMENT;
            case 7:
                return CAPABILITY_WIPE;
            case 8:
                return CAPABILITY_ADD_REMOVE_USER_LOCKDOWN;
            case 9:
                return CAPABILITY_FACTORY_RESET_LOCKDOWN;
            case 10:
                return CAPABILITY_RING;
            case 11:
                return CAPABILITY_APP_PERMISSIONS;
            case 12:
                return CAPABILITY_REVOKE_TOKEN;
            case 13:
                return CAPABILITY_SETTINGS_SUPERVISION;
            case 14:
                return CAPABILITY_DEV_OPTIONS_LOCKDOWN;
            case 15:
                return CAPABILITY_SHOW_ON_ANDROID_ONLY_LIST;
            case 16:
                return CAPABILITY_TIME_LIMIT_UNLOCK_WITH_DEADLINE;
            case 17:
                return CAPABILITY_APP_PERMISSIONS_READ_ONLY;
            case 18:
                return CAPABILITY_FRESH_LOCATION;
            case 19:
                return CAPABILITY_LOCATION_SETTINGS;
            case 20:
                return CAPABILITY_SET_SCREEN_LOCK;
            case 21:
                return CAPABILITY_LIMITED_SUPERVISION;
            case 22:
                return CAPABILITY_REMOTE_APPS;
            case 23:
                return CAPABILITY_PERMALOCK;
            case 24:
                return CAPABILITY_LOCK_WITH_DEADLINE;
            case 101:
                return CAPABILITY_VOICE;
            case 102:
                return CAPABILITY_SMS;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eut.a;
    }

    eus(int i) {
        this.B = i;
    }
}
