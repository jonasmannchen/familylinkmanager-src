package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ffo implements fiy {
    UNKNOWN_SIGNAL_TYPE(0),
    OBSERVED(1),
    INFERRED(2),
    MODEL(3),
    REPLAY_INJECTED(4);

    public final int b;

    @Override // flm.fiy
    public final int a() {
        return this.b;
    }

    public static ffo a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_SIGNAL_TYPE;
            case 1:
                return OBSERVED;
            case 2:
                return INFERRED;
            case 3:
                return MODEL;
            case 4:
                return REPLAY_INJECTED;
            default:
                return null;
        }
    }

    ffo(int i) {
        this.b = i;
    }
}
