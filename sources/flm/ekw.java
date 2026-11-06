package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ekw implements fiy {
    BACKGROUND_TASK_STATE_UNKNOWN(0),
    STARTED(1),
    SUCCEEDED(2),
    FAILED_RECOVERABLE(3),
    FAILED_FATAL(4);

    public final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static ekw a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return BACKGROUND_TASK_STATE_UNKNOWN;
            case 1:
                return STARTED;
            case 2:
                return SUCCEEDED;
            case 3:
                return FAILED_RECOVERABLE;
            case 4:
                return FAILED_FATAL;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ekx.a;
    }

    ekw(int i) {
        this.d = i;
    }
}
