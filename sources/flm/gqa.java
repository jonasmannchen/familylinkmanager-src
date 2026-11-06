package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gqa implements fiy {
    UNKNOWN(0),
    APP_CREATED(1),
    APP_TO_BACKGROUND(2),
    APP_TO_FOREGROUND(3),
    APP_IN_BACKGROUND_FOR_SECONDS(4),
    APP_IN_FOREGROUND_FOR_SECONDS(5),
    DELTA_OF_MEMORY(6);

    private final int h;

    @Override // flm.fiy
    public final int a() {
        return this.h;
    }

    public static gqa a(int i2) {
        switch (i2) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return APP_CREATED;
            case 2:
                return APP_TO_BACKGROUND;
            case 3:
                return APP_TO_FOREGROUND;
            case 4:
                return APP_IN_BACKGROUND_FOR_SECONDS;
            case 5:
                return APP_IN_FOREGROUND_FOR_SECONDS;
            case 6:
                return DELTA_OF_MEMORY;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gqb.a;
    }

    gqa(int i2) {
        this.h = i2;
    }
}
