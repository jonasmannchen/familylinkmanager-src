package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bn implements bv {
    private final String a;
    private final Object[] b;

    public bn(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    public bn(String str) {
        this(str, null);
    }

    @Override // flm.bv
    public final String a() {
        return this.a;
    }

    @Override // flm.bv
    public final void a(bu buVar) {
        Object[] objArr = this.b;
        if (objArr != null) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                int i2 = i + 1;
                if (obj == null) {
                    buVar.a(i2);
                } else if (obj instanceof byte[]) {
                    buVar.a(i2, (byte[]) obj);
                } else if (obj instanceof Float) {
                    buVar.a(i2, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    buVar.a(i2, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    buVar.a(i2, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    buVar.a(i2, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    buVar.a(i2, ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    buVar.a(i2, ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    buVar.a(i2, (String) obj);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }
}
