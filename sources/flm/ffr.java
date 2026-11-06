package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ffr implements fiy {
    UNKNOWN_CONTEXT_FAMILY(0),
    USER_ACTIVITY(1),
    USER_STATE(2),
    LOCATION(3),
    PLACE(4),
    PROXIMITY(5),
    AMBIENCE(6),
    DEVICE_STATE(7),
    DEVICE_ACTIVITY(8),
    USER_PROFILE(9),
    SEMANTIC_TIME(10),
    TASKS(11);

    public final int b;

    @Override // flm.fiy
    public final int a() {
        return this.b;
    }

    public static ffr a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_CONTEXT_FAMILY;
            case 1:
                return USER_ACTIVITY;
            case 2:
                return USER_STATE;
            case 3:
                return LOCATION;
            case 4:
                return PLACE;
            case 5:
                return PROXIMITY;
            case 6:
                return AMBIENCE;
            case 7:
                return DEVICE_STATE;
            case 8:
                return DEVICE_ACTIVITY;
            case 9:
                return USER_PROFILE;
            case 10:
                return SEMANTIC_TIME;
            case 11:
                return TASKS;
            default:
                return null;
        }
    }

    ffr(int i) {
        this.b = i;
    }
}
