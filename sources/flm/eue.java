package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eue implements fiy {
    NOT_AVAILABLE(0),
    NOT_STARTED(1),
    ACTIVE(2),
    CANCELED(3),
    ENDED(4);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static eue a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return NOT_AVAILABLE;
            case 1:
                return NOT_STARTED;
            case 2:
                return ACTIVE;
            case 3:
                return CANCELED;
            case 4:
                return ENDED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return euf.a;
    }

    eue(int i) {
        this.e = i;
    }
}
