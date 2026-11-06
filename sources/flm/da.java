package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class da {
    private final String a;
    private final boolean b;
    private final List c;

    public da(String str, boolean z, List list) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        da daVar = (da) obj;
        if (this.b != daVar.b || !this.c.equals(daVar.c)) {
            return false;
        }
        if (this.a.startsWith("index_")) {
            return daVar.a.startsWith("index_");
        }
        return this.a.equals(daVar.a);
    }

    public final int hashCode() {
        int iHashCode;
        if (this.a.startsWith("index_")) {
            iHashCode = "index_".hashCode();
        } else {
            iHashCode = this.a.hashCode();
        }
        return (((this.b ? 1 : 0) + (iHashCode * 31)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
    }
}
