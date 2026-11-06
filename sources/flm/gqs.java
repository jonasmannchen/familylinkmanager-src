package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gqs implements fiy {
    UNKNOWN(0),
    BACKGROUND_MEMORY_SAMPLE_THRESHOLD(1),
    OUT_OF_MEMORY_ERROR(2);

    public final int b;

    @Override // flm.fiy
    public final int a() {
        return this.b;
    }

    public static gqs a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return BACKGROUND_MEMORY_SAMPLE_THRESHOLD;
            case 2:
                return OUT_OF_MEMORY_ERROR;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gqt.a;
    }

    gqs(int i) {
        this.b = i;
    }
}
