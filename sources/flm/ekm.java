package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ekm implements fiy {
    VALUE_UNSPECIFIED(0),
    ENABLED(1),
    DISABLED(2);

    public final int b;

    @Override // flm.fiy
    public final int a() {
        return this.b;
    }

    public static ekm a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return VALUE_UNSPECIFIED;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return ekn.a;
    }

    ekm(int i) {
        this.b = i;
    }
}
