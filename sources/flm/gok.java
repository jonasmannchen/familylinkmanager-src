package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gok implements fiy {
    UNKNOWN(0),
    FOREGROUND_TO_BACKGROUND(1),
    BACKGROUND_TO_FOREGROUND(2),
    FOREGROUND_SERVICE_START(3),
    FOREGROUND_SERVICE_STOP(4),
    CUSTOM_MEASURE_START(5),
    CUSTOM_MEASURE_STOP(6);

    public final int d;

    @Override // flm.fiy
    public final int a() {
        return this.d;
    }

    public static gok a(int i2) {
        switch (i2) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return FOREGROUND_TO_BACKGROUND;
            case 2:
                return BACKGROUND_TO_FOREGROUND;
            case 3:
                return FOREGROUND_SERVICE_START;
            case 4:
                return FOREGROUND_SERVICE_STOP;
            case 5:
                return CUSTOM_MEASURE_START;
            case 6:
                return CUSTOM_MEASURE_STOP;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gol.a;
    }

    gok(int i2) {
        this.d = i2;
    }
}
