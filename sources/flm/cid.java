package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum cid implements fiy {
    UNDEFINED(0),
    MATERIAL_BLUE(1),
    GLIF(2),
    GLIF_V2(3),
    GLIF_V3(4),
    SUPERVISEE(5),
    SUPERVISEE_EXIT(6),
    SUW_MATERIAL_BLUE(7),
    SUW_GLIF(8),
    SUW_GLIF_V2(9),
    SUW_GLIF_V3(10);

    public final int l;

    @Override // flm.fiy
    public final int a() {
        return this.l;
    }

    public static cid a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNDEFINED;
            case 1:
                return MATERIAL_BLUE;
            case 2:
                return GLIF;
            case 3:
                return GLIF_V2;
            case 4:
                return GLIF_V3;
            case 5:
                return SUPERVISEE;
            case 6:
                return SUPERVISEE_EXIT;
            case 7:
                return SUW_MATERIAL_BLUE;
            case 8:
                return SUW_GLIF;
            case 9:
                return SUW_GLIF_V2;
            case 10:
                return SUW_GLIF_V3;
            default:
                return null;
        }
    }

    public static fiz b() {
        return cie.a;
    }

    cid(int i) {
        this.l = i;
    }
}
