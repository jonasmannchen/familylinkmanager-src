package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fii {
    DOUBLE(0, fij.SCALAR, fji.DOUBLE),
    FLOAT(1, fij.SCALAR, fji.FLOAT),
    INT64(2, fij.SCALAR, fji.LONG),
    UINT64(3, fij.SCALAR, fji.LONG),
    INT32(4, fij.SCALAR, fji.INT),
    FIXED64(5, fij.SCALAR, fji.LONG),
    FIXED32(6, fij.SCALAR, fji.INT),
    BOOL(7, fij.SCALAR, fji.BOOLEAN),
    STRING(8, fij.SCALAR, fji.STRING),
    MESSAGE(9, fij.SCALAR, fji.MESSAGE),
    BYTES(10, fij.SCALAR, fji.BYTE_STRING),
    UINT32(11, fij.SCALAR, fji.INT),
    ENUM(12, fij.SCALAR, fji.ENUM),
    SFIXED32(13, fij.SCALAR, fji.INT),
    SFIXED64(14, fij.SCALAR, fji.LONG),
    SINT32(15, fij.SCALAR, fji.INT),
    SINT64(16, fij.SCALAR, fji.LONG),
    GROUP(17, fij.SCALAR, fji.MESSAGE),
    DOUBLE_LIST(18, fij.VECTOR, fji.DOUBLE),
    FLOAT_LIST(19, fij.VECTOR, fji.FLOAT),
    INT64_LIST(20, fij.VECTOR, fji.LONG),
    UINT64_LIST(21, fij.VECTOR, fji.LONG),
    INT32_LIST(22, fij.VECTOR, fji.INT),
    FIXED64_LIST(23, fij.VECTOR, fji.LONG),
    FIXED32_LIST(24, fij.VECTOR, fji.INT),
    BOOL_LIST(25, fij.VECTOR, fji.BOOLEAN),
    STRING_LIST(26, fij.VECTOR, fji.STRING),
    MESSAGE_LIST(27, fij.VECTOR, fji.MESSAGE),
    BYTES_LIST(28, fij.VECTOR, fji.BYTE_STRING),
    UINT32_LIST(29, fij.VECTOR, fji.INT),
    ENUM_LIST(30, fij.VECTOR, fji.ENUM),
    SFIXED32_LIST(31, fij.VECTOR, fji.INT),
    SFIXED64_LIST(32, fij.VECTOR, fji.LONG),
    SINT32_LIST(33, fij.VECTOR, fji.INT),
    SINT64_LIST(34, fij.VECTOR, fji.LONG),
    DOUBLE_LIST_PACKED(35, fij.PACKED_VECTOR, fji.DOUBLE),
    FLOAT_LIST_PACKED(36, fij.PACKED_VECTOR, fji.FLOAT),
    INT64_LIST_PACKED(37, fij.PACKED_VECTOR, fji.LONG),
    UINT64_LIST_PACKED(38, fij.PACKED_VECTOR, fji.LONG),
    INT32_LIST_PACKED(39, fij.PACKED_VECTOR, fji.INT),
    FIXED64_LIST_PACKED(40, fij.PACKED_VECTOR, fji.LONG),
    FIXED32_LIST_PACKED(41, fij.PACKED_VECTOR, fji.INT),
    BOOL_LIST_PACKED(42, fij.PACKED_VECTOR, fji.BOOLEAN),
    UINT32_LIST_PACKED(43, fij.PACKED_VECTOR, fji.INT),
    ENUM_LIST_PACKED(44, fij.PACKED_VECTOR, fji.ENUM),
    SFIXED32_LIST_PACKED(45, fij.PACKED_VECTOR, fji.INT),
    SFIXED64_LIST_PACKED(46, fij.PACKED_VECTOR, fji.LONG),
    SINT32_LIST_PACKED(47, fij.PACKED_VECTOR, fji.INT),
    SINT64_LIST_PACKED(48, fij.PACKED_VECTOR, fji.LONG),
    GROUP_LIST(49, fij.VECTOR, fji.MESSAGE),
    MAP(50, fij.MAP, fji.VOID);

    private static final fii[] ab;
    public final int h;
    public final fij i;

    fii(int i, fij fijVar, fji fjiVar) {
        this.h = i;
        this.i = fijVar;
        switch (fijVar.ordinal()) {
            case 1:
                Class cls = fjiVar.k;
                break;
            case 3:
                Class cls2 = fjiVar.k;
                break;
        }
        if (fijVar == fij.SCALAR) {
            fjiVar.ordinal();
        }
    }

    static {
        fii[] fiiVarArrValues = values();
        ab = new fii[fiiVarArrValues.length];
        for (fii fiiVar : fiiVarArrValues) {
            ab[fiiVar.h] = fiiVar;
        }
    }
}
