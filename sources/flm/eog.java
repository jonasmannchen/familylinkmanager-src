package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eog implements fiy {
    UNKNOWN(0),
    ALLOW_ADD_REMOVE_USER(1),
    ALLOW_INSTALL_UNKNOWN_SOURCES(2),
    ALLOW_SMS(3),
    ALLOW_OUTGOING_CALLS(4);

    public final int f;

    @Override // flm.fiy
    public final int a() {
        return this.f;
    }

    public static eog a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return ALLOW_ADD_REMOVE_USER;
            case 2:
                return ALLOW_INSTALL_UNKNOWN_SOURCES;
            case 3:
                return ALLOW_SMS;
            case 4:
                return ALLOW_OUTGOING_CALLS;
            default:
                return null;
        }
    }

    public static fiz b() {
        return eoh.a;
    }

    eog(int i) {
        this.f = i;
    }
}
