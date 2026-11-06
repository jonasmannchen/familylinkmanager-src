package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ewl implements fiy {
    UNKNOWN_REPORT_TYPE(0),
    PARTIAL_REPORT(1),
    FULL_REPORT(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static ewl a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_REPORT_TYPE;
            case 1:
                return PARTIAL_REPORT;
            case 2:
                return FULL_REPORT;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ewm.a;
    }

    ewl(int i) {
        this.c = i;
    }
}
