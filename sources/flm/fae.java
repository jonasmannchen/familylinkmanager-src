package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fae implements fiy {
    LOCATION_MODE_UNSPECIFIED(0),
    OFF(1),
    HIGH_ACCURACY(2),
    BATTERY_SAVING(3),
    DEVICE_ONLY(4);

    public final int f;

    @Override // flm.fiy
    public final int a() {
        return this.f;
    }

    public static fae a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return LOCATION_MODE_UNSPECIFIED;
            case 1:
                return OFF;
            case 2:
                return HIGH_ACCURACY;
            case 3:
                return BATTERY_SAVING;
            case 4:
                return DEVICE_ONLY;
            default:
                return null;
        }
    }

    public static fiz b() {
        return faf.a;
    }

    fae(int i) {
        this.f = i;
    }
}
