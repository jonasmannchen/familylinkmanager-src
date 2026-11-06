package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum elj implements fiy {
    INTENT_STATE_UNKNOWN(0),
    STARTED(1),
    ON_RESULT(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static elj a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return INTENT_STATE_UNKNOWN;
            case 1:
                return STARTED;
            case 2:
                return ON_RESULT;
            default:
                return null;
        }
    }

    public static fiz b() {
        return elk.a;
    }

    elj(int i) {
        this.c = i;
    }
}
