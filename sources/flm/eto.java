package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eto implements fiy {
    APP_PERMISSION_CONTROL_UNKNOWN(0),
    APP_PERMISSION_CONTROL_SHARED(1),
    APP_PERMISSION_CONTROL_PARENT(2);

    private final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static eto a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return APP_PERMISSION_CONTROL_UNKNOWN;
            case 1:
                return APP_PERMISSION_CONTROL_SHARED;
            case 2:
                return APP_PERMISSION_CONTROL_PARENT;
            default:
                return null;
        }
    }

    public static fiz b() {
        return etp.a;
    }

    eto(int i) {
        this.d = i;
    }
}
