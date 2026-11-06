package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ewh implements fiy {
    UNKNOWN_HIDDEN_STATE(0),
    HIDDEN(1),
    VISIBLE(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static ewh a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_HIDDEN_STATE;
            case 1:
                return HIDDEN;
            case 2:
                return VISIBLE;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ewi.a;
    }

    ewh(int i) {
        this.c = i;
    }
}
