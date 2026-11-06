package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gqy implements fiy {
    BOOLEAN(4),
    CHAR(5),
    FLOAT(6),
    DOUBLE(7),
    BYTE(8),
    SHORT(9),
    INT(10),
    LONG(11);

    public final int a;

    @Override // flm.fiy
    public final int a() {
        return this.a;
    }

    public static gqy a(int i) {
        switch (i) {
            case 4:
                return BOOLEAN;
            case 5:
                return CHAR;
            case 6:
                return FLOAT;
            case 7:
                return DOUBLE;
            case 8:
                return BYTE;
            case 9:
                return SHORT;
            case 10:
                return INT;
            case 11:
                return LONG;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gqz.a;
    }

    gqy(int i) {
        this.a = i;
    }
}
