package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum asb implements fiy {
    UNKNOWN(0),
    BIND(1),
    UNBIND(2),
    CONNECT(3),
    DISCONNECT(4),
    TIME_OUT(5),
    START_SERVICE(6),
    STOP_SERVICE(7);

    public final int a;

    @Override // flm.fiy
    public final int a() {
        return this.a;
    }

    public static asb a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return BIND;
            case 2:
                return UNBIND;
            case 3:
                return CONNECT;
            case 4:
                return DISCONNECT;
            case 5:
                return TIME_OUT;
            case 6:
                return START_SERVICE;
            case 7:
                return STOP_SERVICE;
            default:
                return null;
        }
    }

    asb(int i) {
        this.a = i;
    }
}
