package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum epf implements fiy {
    UNKNOWN_FRAGMENT(0),
    INITIAL_LOADING(25),
    ERROR(26),
    ACCOUNT_REMOVAL_NOTICE(1),
    OTHER_SUPERVISED_PLATFORMS(2),
    OTHER_UNSUPERVISED_PLATFORMS(24),
    OTHER_ALLOWED_DEVICES(27),
    NOT_ALLOWED_DEVICES(28),
    PAIRING_CODE(3),
    NEED_HELP(45),
    PASSWORD_VERIFICATION(4),
    JOIN_FAMILY(5),
    WAITING_FOR_PARENT(6),
    SUPERVISION_DISCLAIMER(7),
    PROFILE_OWNER_HOST(46),
    PROFILE_OWNER(8),
    ADDING_MEMBER_SUPERVISION(9),
    NEXT_STEPS(10),
    DEVICE_NAME(11),
    APP_SELECTOR(12),
    REVIEW_SETTINGS(13),
    SYNC_SUPERVISION(14),
    SUPERVISION_CONFIRMATION(15),
    ALL_SET(16),
    ABOUT_SUPERVISION(17),
    STOP_SUPERVISION_WARNING(18),
    STOP_SUPERVISION_COOLDOWN(19),
    STOP_SUPERVISION_LOCKDOWN(20),
    STOP_SUPERVISION_PARENT_ACCESS_CODE(21),
    STOPPING_SUPERVISION(22),
    SUPERVISION_STOPPED(23),
    ADD_SECONDARY(29),
    AUTH_ADD_PRE(30),
    PARENT_ESCALATION(31),
    PARENT_PICKER(32),
    PARENT_PASSWORD(33),
    CONSENT_INFO(34),
    REMOVE_SECONDARY(35),
    INITIALIZE_DEVICE_SETUP(36),
    APP_DETAILS(37),
    APP_PERMISSIONS(38),
    GOOGLE_SERVICES(39),
    HIDE_APP_FAILED(40),
    ACCOUNT_REMOVED(41),
    UPDATING_APPS(44),
    ACCOUNT_REMOVAL(42),
    LOCAL_UNLOCK(43);

    public final int L;

    @Override // flm.fiy
    public final int a() {
        return this.L;
    }

    public static epf a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_FRAGMENT;
            case 1:
                return ACCOUNT_REMOVAL_NOTICE;
            case 2:
                return OTHER_SUPERVISED_PLATFORMS;
            case 3:
                return PAIRING_CODE;
            case 4:
                return PASSWORD_VERIFICATION;
            case 5:
                return JOIN_FAMILY;
            case 6:
                return WAITING_FOR_PARENT;
            case 7:
                return SUPERVISION_DISCLAIMER;
            case 8:
                return PROFILE_OWNER;
            case 9:
                return ADDING_MEMBER_SUPERVISION;
            case 10:
                return NEXT_STEPS;
            case 11:
                return DEVICE_NAME;
            case 12:
                return APP_SELECTOR;
            case 13:
                return REVIEW_SETTINGS;
            case 14:
                return SYNC_SUPERVISION;
            case 15:
                return SUPERVISION_CONFIRMATION;
            case 16:
                return ALL_SET;
            case 17:
                return ABOUT_SUPERVISION;
            case 18:
                return STOP_SUPERVISION_WARNING;
            case 19:
                return STOP_SUPERVISION_COOLDOWN;
            case 20:
                return STOP_SUPERVISION_LOCKDOWN;
            case 21:
                return STOP_SUPERVISION_PARENT_ACCESS_CODE;
            case 22:
                return STOPPING_SUPERVISION;
            case 23:
                return SUPERVISION_STOPPED;
            case 24:
                return OTHER_UNSUPERVISED_PLATFORMS;
            case 25:
                return INITIAL_LOADING;
            case 26:
                return ERROR;
            case 27:
                return OTHER_ALLOWED_DEVICES;
            case 28:
                return NOT_ALLOWED_DEVICES;
            case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                return ADD_SECONDARY;
            case 30:
                return AUTH_ADD_PRE;
            case 31:
                return PARENT_ESCALATION;
            case 32:
                return PARENT_PICKER;
            case 33:
                return PARENT_PASSWORD;
            case 34:
                return CONSENT_INFO;
            case 35:
                return REMOVE_SECONDARY;
            case 36:
                return INITIALIZE_DEVICE_SETUP;
            case 37:
                return APP_DETAILS;
            case 38:
                return APP_PERMISSIONS;
            case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                return GOOGLE_SERVICES;
            case 40:
                return HIDE_APP_FAILED;
            case 41:
                return ACCOUNT_REMOVED;
            case 42:
                return ACCOUNT_REMOVAL;
            case 43:
                return LOCAL_UNLOCK;
            case 44:
                return UPDATING_APPS;
            case 45:
                return NEED_HELP;
            case 46:
                return PROFILE_OWNER_HOST;
            default:
                return null;
        }
    }

    public static fiz b() {
        return epg.a;
    }

    epf(int i) {
        this.L = i;
    }
}
