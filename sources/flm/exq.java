package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum exq implements fiy {
    UNKNOWN_FAMILY_ROLE(0),
    HEAD_OF_HOUSEHOLD(1),
    PARENT(2),
    MEMBER(3),
    CHILD(4),
    UNCONFIRMED_MEMBER(5);

    private final int g;

    @Override // flm.fiy
    public final int a() {
        return this.g;
    }

    public static exq a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_FAMILY_ROLE;
            case 1:
                return HEAD_OF_HOUSEHOLD;
            case 2:
                return PARENT;
            case 3:
                return MEMBER;
            case 4:
                return CHILD;
            case 5:
                return UNCONFIRMED_MEMBER;
            default:
                return null;
        }
    }

    public static fiz b() {
        return exr.a;
    }

    exq(int i) {
        this.g = i;
    }
}
