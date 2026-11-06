package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum grf implements fiy {
    UNKNOWN_STATUS(0),
    SUCCESS(1),
    ERROR(2),
    CANCEL(3);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static grf a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_STATUS;
            case 1:
                return SUCCESS;
            case 2:
                return ERROR;
            case 3:
                return CANCEL;
            default:
                return null;
        }
    }

    public static fiz b() {
        return grg.a;
    }

    grf(int i) {
        this.e = i;
    }
}
