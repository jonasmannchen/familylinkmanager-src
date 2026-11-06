package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gsk implements fiy {
    UNKNOWN(0),
    APP_TO_FOREGROUND(1),
    APP_TO_BACKGROUND(2);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static gsk a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return APP_TO_FOREGROUND;
            case 2:
                return APP_TO_BACKGROUND;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gsl.a;
    }

    gsk(int i) {
        this.c = i;
    }
}
