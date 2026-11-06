package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cx {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public cx(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cx cxVar = (cx) obj;
        if (this.d == cxVar.d && this.a.equals(cxVar.a) && this.c == cxVar.c) {
            if (this.b != null) {
                return this.b.equalsIgnoreCase(cxVar.b);
            }
            return cxVar.b == null;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c ? 1231 : 1237) + (((this.b != null ? this.b.hashCode() : 0) + (this.a.hashCode() * 31)) * 31)) * 31) + this.d;
    }

    public final String toString() {
        return "Column{name='" + this.a + "', type='" + this.b + "', notNull=" + this.c + ", primaryKeyPosition=" + this.d + '}';
    }
}
