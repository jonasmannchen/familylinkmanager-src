package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gtp implements fiy {
    UNKNOWN(0),
    DISK_READ(1),
    DISK_WRITE(2),
    SLOW(3);

    public final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static gtp a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return DISK_READ;
            case 2:
                return DISK_WRITE;
            case 3:
                return SLOW;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gtq.a;
    }

    gtp(int i) {
        this.d = i;
    }
}
