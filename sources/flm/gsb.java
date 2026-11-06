package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gsb implements fiy {
    UNKNOWN(0),
    NULL_POINTER_EXCEPTION(1),
    OUT_OF_MEMORY_ERROR(2),
    OTHER_RUNTIME_EXCEPTION(3),
    OTHER_ERROR(4);

    public final int f;

    @Override // flm.fiy
    public final int a() {
        return this.f;
    }

    public static gsb a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return NULL_POINTER_EXCEPTION;
            case 2:
                return OUT_OF_MEMORY_ERROR;
            case 3:
                return OTHER_RUNTIME_EXCEPTION;
            case 4:
                return OTHER_ERROR;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gsc.a;
    }

    gsb(int i) {
        this.f = i;
    }
}
