package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eot implements fiy {
    NO_NOTIFICATION(0),
    ONE_MINUTE(1),
    FIVE_MINUTES(2),
    FIFTEEN_MINUTES(3);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static eot a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return NO_NOTIFICATION;
            case 1:
                return ONE_MINUTE;
            case 2:
                return FIVE_MINUTES;
            case 3:
                return FIFTEEN_MINUTES;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eou.a;
    }

    eot(int i) {
        this.e = i;
    }
}
