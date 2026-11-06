package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ezf implements fiy {
    UNSPECIFIED_INSTALLED_APP_FLAG(0),
    FLAG_SYSTEM_APP(1),
    FLAG_UPDATED_SYSTEM_APP(2),
    FLAG_HAS_LAUNCHER_ACTIVITY(3),
    FLAG_IS_DIALER(4),
    FLAG_IS_DEVICE_ADMIN(5);

    public final int f;

    @Override // flm.fiy
    public final int a() {
        return this.f;
    }

    public static ezf a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNSPECIFIED_INSTALLED_APP_FLAG;
            case 1:
                return FLAG_SYSTEM_APP;
            case 2:
                return FLAG_UPDATED_SYSTEM_APP;
            case 3:
                return FLAG_HAS_LAUNCHER_ACTIVITY;
            case 4:
                return FLAG_IS_DIALER;
            case 5:
                return FLAG_IS_DEVICE_ADMIN;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ezg.a;
    }

    ezf(int i) {
        this.f = i;
    }
}
