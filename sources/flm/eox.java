package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eox implements fiy {
    DEFAULT(0),
    DELETED(1);

    public final int c;

    @Override // flm.fiy
    public final int a() {
        return this.c;
    }

    public static eox a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return DEFAULT;
            case 1:
                return DELETED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eoy.a;
    }

    eox(int i) {
        this.c = i;
    }
}
