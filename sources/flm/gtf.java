package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gtf implements fiy {
    UNKNOWN(0),
    OUT_OF_MEMORY_PARSING(1),
    OUT_OF_MEMORY_SERIALIZING(2),
    SERIALIZED_HEAP_DUMP_TOO_LARGE(3),
    NONE(4);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static gtf a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return OUT_OF_MEMORY_PARSING;
            case 2:
                return OUT_OF_MEMORY_SERIALIZING;
            case 3:
                return SERIALIZED_HEAP_DUMP_TOO_LARGE;
            case 4:
                return NONE;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gtg.a;
    }

    gtf(int i) {
        this.e = i;
    }
}
