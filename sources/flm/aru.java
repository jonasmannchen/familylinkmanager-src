package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum aru implements fiy {
    UNSPECIFIED(0),
    PROPOSED(1),
    COMPLETED(2),
    SKIPPED(3),
    FAILED(4);

    public final int a;

    @Override // flm.fiy
    public final int a() {
        return this.a;
    }

    public static aru a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED;
            case 1:
                return PROPOSED;
            case 2:
                return COMPLETED;
            case 3:
                return SKIPPED;
            case 4:
                return FAILED;
            default:
                return null;
        }
    }

    aru(int i) {
        this.a = i;
    }
}
