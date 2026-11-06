package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gtv implements fiy {
    UNKNOWN(0),
    INIT_ALL(1),
    INIT_SHUTDOWN(2),
    INIT_CONFIGS(3),
    INIT_FLAGS(4),
    LOGGER_JOB_STARTED(5),
    LOGGER_JOB_SUCCESSFUL(6),
    LOGGER_JOB_INVALID_PARAMS(7),
    LOGGER_JOB_NO_FILE(8),
    LOGGER_JOB_MESSAGE_EMPTY(9),
    LOGGER_JOB_INTERRUPTED(10),
    LOGGER_JOB_EXCEPTION(11),
    LOGGER_JOB_HTTP_STATUS_200(12),
    LOGGER_JOB_HTTP_STATUS_400(13),
    LOGGER_JOB_HTTP_STATUS_500(14),
    LOGGER_JOB_HTTP_STATUS_OTHER(15),
    LOGGER_JOB_HTTP_TIMEOUT_EXCEPTION(16);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static gtv a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return INIT_ALL;
            case 2:
                return INIT_SHUTDOWN;
            case 3:
                return INIT_CONFIGS;
            case 4:
                return INIT_FLAGS;
            case 5:
                return LOGGER_JOB_STARTED;
            case 6:
                return LOGGER_JOB_SUCCESSFUL;
            case 7:
                return LOGGER_JOB_INVALID_PARAMS;
            case 8:
                return LOGGER_JOB_NO_FILE;
            case 9:
                return LOGGER_JOB_MESSAGE_EMPTY;
            case 10:
                return LOGGER_JOB_INTERRUPTED;
            case 11:
                return LOGGER_JOB_EXCEPTION;
            case 12:
                return LOGGER_JOB_HTTP_STATUS_200;
            case 13:
                return LOGGER_JOB_HTTP_STATUS_400;
            case 14:
                return LOGGER_JOB_HTTP_STATUS_500;
            case 15:
                return LOGGER_JOB_HTTP_STATUS_OTHER;
            case 16:
                return LOGGER_JOB_HTTP_TIMEOUT_EXCEPTION;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gtw.a;
    }

    gtv(int i) {
        this.e = i;
    }
}
