package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eol implements fiy {
    TYPE_UNKNOWN(0),
    TYPE_IS_SUPERVISED(1),
    TYPE_DISALLOW_ACCOUNT_MANAGEMENT(4),
    TYPE_DISALLOW_FACTORY_RESET(5),
    TYPE_DISALLOW_INSTALL_UNKNOWN_RESOURCES(6),
    TYPE_DISALLOW_DEV_OPTIONS(22),
    TYPE_FORCE_ENABLE_LOCKBOX(7),
    TYPE_RING(8),
    TYPE_WIPE(9),
    TYPE_LOCATION(10),
    TYPE_HIDE_APP(11),
    TYPE_APP_PERMISSION(12),
    TYPE_TIMEOUT(13),
    TYPE_NOTIFY_LOCATION_SETTING_CHANGE(14),
    TYPE_DISALLOW_ADD_REMOVE_USER(15),
    TYPE_BROADCAST_GCM_REGISTERED(16),
    TYPE_SUPERVISED_COMMUNICATIONS(17),
    TYPE_APP_PERMISSION_CONTROL_MODE(18),
    TYPE_APP_PERMISSION_GRANT_STATE(19),
    TYPE_APP_MIN_VERSION(20),
    TYPE_REMOVE_SCREEN_LOCK(21),
    TYPE_PARENT_ACCESS_CODE(23),
    TYPE_LOCATION_REFRESH(24),
    TYPE_TIME_LIMIT(25),
    TYPE_SET_SCREEN_LOCK(26),
    TYPE_FACTORY_RESET_PROTECTION(27),
    TYPE_FAMILY_PLACES(28),
    DEPRECATED_2(2),
    DEPRECATED_3(3);

    public final int y;

    @Override // flm.fiy
    public final int a() {
        return this.y;
    }

    public static eol a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return TYPE_UNKNOWN;
            case 1:
                return TYPE_IS_SUPERVISED;
            case 2:
                return DEPRECATED_2;
            case 3:
                return DEPRECATED_3;
            case 4:
                return TYPE_DISALLOW_ACCOUNT_MANAGEMENT;
            case 5:
                return TYPE_DISALLOW_FACTORY_RESET;
            case 6:
                return TYPE_DISALLOW_INSTALL_UNKNOWN_RESOURCES;
            case 7:
                return TYPE_FORCE_ENABLE_LOCKBOX;
            case 8:
                return TYPE_RING;
            case 9:
                return TYPE_WIPE;
            case 10:
                return TYPE_LOCATION;
            case 11:
                return TYPE_HIDE_APP;
            case 12:
                return TYPE_APP_PERMISSION;
            case 13:
                return TYPE_TIMEOUT;
            case 14:
                return TYPE_NOTIFY_LOCATION_SETTING_CHANGE;
            case 15:
                return TYPE_DISALLOW_ADD_REMOVE_USER;
            case 16:
                return TYPE_BROADCAST_GCM_REGISTERED;
            case 17:
                return TYPE_SUPERVISED_COMMUNICATIONS;
            case 18:
                return TYPE_APP_PERMISSION_CONTROL_MODE;
            case 19:
                return TYPE_APP_PERMISSION_GRANT_STATE;
            case 20:
                return TYPE_APP_MIN_VERSION;
            case 21:
                return TYPE_REMOVE_SCREEN_LOCK;
            case 22:
                return TYPE_DISALLOW_DEV_OPTIONS;
            case 23:
                return TYPE_PARENT_ACCESS_CODE;
            case 24:
                return TYPE_LOCATION_REFRESH;
            case 25:
                return TYPE_TIME_LIMIT;
            case 26:
                return TYPE_SET_SCREEN_LOCK;
            case 27:
                return TYPE_FACTORY_RESET_PROTECTION;
            case 28:
                return TYPE_FAMILY_PLACES;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eom.a;
    }

    eol(int i) {
        this.y = i;
    }
}
