package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fej implements fiy {
    UNSPECIFIED_ACTION(0),
    LOCK(1),
    UNLOCK_USAGE_LIMIT(2),
    UNLOCK_WINDOW_LIMIT(3),
    UNLOCK_LOCK_OVERRIDE(4),
    UNLOCK_WITH_DEADLINE(5);

    public final int g;

    @Override // flm.fiy
    public final int a() {
        return this.g;
    }

    public static fej a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED_ACTION;
            case 1:
                return LOCK;
            case 2:
                return UNLOCK_USAGE_LIMIT;
            case 3:
                return UNLOCK_WINDOW_LIMIT;
            case 4:
                return UNLOCK_LOCK_OVERRIDE;
            case 5:
                return UNLOCK_WITH_DEADLINE;
            default:
                return null;
        }
    }

    public static fiz b() {
        return fek.a;
    }

    fej(int i) {
        this.g = i;
    }
}
