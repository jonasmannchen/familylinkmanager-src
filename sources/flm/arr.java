package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum arr implements fiy {
    UNKNOWN(0),
    STARTUP(1),
    UNCAUGHT_EXCEPTION_HANDLER(2),
    PHENOTYPE_UPDATE(3),
    SAFEBOOT_STARTUP(4);

    public final int a;

    @Override // flm.fiy
    public final int a() {
        return this.a;
    }

    public static arr a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return STARTUP;
            case 2:
                return UNCAUGHT_EXCEPTION_HANDLER;
            case 3:
                return PHENOTYPE_UPDATE;
            case 4:
                return SAFEBOOT_STARTUP;
            default:
                return null;
        }
    }

    arr(int i) {
        this.a = i;
    }
}
