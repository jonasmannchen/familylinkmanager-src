package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum euz implements fiy {
    UNKNOWN_SYNC_TRIGGER(0),
    BOOTSTRAP(1),
    SERVER_CHANGE(2),
    PERIODICAL_SYNC(3),
    LOCAL_CHANGE(4),
    FORCED_SYNC(5),
    DATABASE_RECREATED(6),
    USER_SWITCH(7),
    USAGE_LIMIT_UPDATED(8),
    PACKAGE_CHANGED(9),
    DATE_TIME_CHANGED(10),
    LOCAL_UNLOCK(11),
    USAGE_TIME_CHANGED(12),
    SUPERVISION_STATE_CHANGED(13),
    PHENOTYPE_FLAG_COMMITTED(14);

    public final int n;

    @Override // flm.fiy
    public final int a() {
        return this.n;
    }

    public static euz a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_SYNC_TRIGGER;
            case 1:
                return BOOTSTRAP;
            case 2:
                return SERVER_CHANGE;
            case 3:
                return PERIODICAL_SYNC;
            case 4:
                return LOCAL_CHANGE;
            case 5:
                return FORCED_SYNC;
            case 6:
                return DATABASE_RECREATED;
            case 7:
                return USER_SWITCH;
            case 8:
                return USAGE_LIMIT_UPDATED;
            case 9:
                return PACKAGE_CHANGED;
            case 10:
                return DATE_TIME_CHANGED;
            case 11:
                return LOCAL_UNLOCK;
            case 12:
                return USAGE_TIME_CHANGED;
            case 13:
                return SUPERVISION_STATE_CHANGED;
            case 14:
                return PHENOTYPE_FLAG_COMMITTED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eva.a;
    }

    euz(int i) {
        this.n = i;
    }
}
