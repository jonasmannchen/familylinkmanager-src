package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum elr implements fiy {
    UNKNOWN_TASK_TYPE(0),
    ONE_OFF(1),
    PERIODIC(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static elr a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_TASK_TYPE;
            case 1:
                return ONE_OFF;
            case 2:
                return PERIODIC;
            default:
                return null;
        }
    }

    public static fiz b() {
        return els.a;
    }

    elr(int i) {
        this.c = i;
    }
}
