package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzq extends dzr implements dvm, Serializable {
    public static final dzq a = new dzq(dwv.b, dwt.b);
    public static final long serialVersionUID = 0;
    public final dws b;
    public final dws c;

    static dzq a(dws dwsVar, dws dwsVar2) {
        return new dzq(dwsVar, dwsVar2);
    }

    public static dzq a(Comparable comparable, Comparable comparable2) {
        return a(dws.b(comparable), dws.b(comparable2));
    }

    public static dzq a(Comparable comparable, dwp dwpVar, Comparable comparable2, dwp dwpVar2) {
        dvl.a(dwpVar);
        dvl.a(dwpVar2);
        return a(dwpVar == dwp.OPEN ? dws.c(comparable) : dws.b(comparable), dwpVar2 == dwp.OPEN ? dws.b(comparable2) : dws.c(comparable2));
    }

    public static dzq a(Comparable comparable, dwp dwpVar) {
        switch (dwpVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return a((dws) dwv.b, dws.b(comparable));
            case 1:
                return a((dws) dwv.b, dws.c(comparable));
            default:
                throw new AssertionError();
        }
    }

    public static dzq b(Comparable comparable, dwp dwpVar) {
        switch (dwpVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return a(dws.c(comparable), (dws) dwt.b);
            case 1:
                return a(dws.b(comparable), (dws) dwt.b);
            default:
                throw new AssertionError();
        }
    }

    private dzq(dws dwsVar, dws dwsVar2) {
        this.b = (dws) dvl.a(dwsVar);
        this.c = (dws) dvl.a(dwsVar2);
        if (dwsVar.compareTo(dwsVar2) > 0 || dwsVar == dwt.b || dwsVar2 == dwv.b) {
            String strValueOf = String.valueOf(b(dwsVar, dwsVar2));
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid range: ".concat(strValueOf) : new String("Invalid range: "));
        }
    }

    public final boolean a() {
        return this.b != dwv.b;
    }

    public final boolean b() {
        return this.c != dwt.b;
    }

    public final boolean c() {
        return this.b.equals(this.c);
    }

    @Override // flm.dvm
    public final boolean a(Comparable comparable) {
        dvl.a(comparable);
        return this.b.a(comparable) && !this.c.a(comparable);
    }

    public final boolean a(dzq dzqVar) {
        return this.b.compareTo(dzqVar.c) <= 0 && dzqVar.b.compareTo(this.c) <= 0;
    }

    public final dzq b(dzq dzqVar) {
        int iCompareTo = this.b.compareTo(dzqVar.b);
        int iCompareTo2 = this.c.compareTo(dzqVar.c);
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            if (iCompareTo > 0 || iCompareTo2 < 0) {
                return a(iCompareTo >= 0 ? this.b : dzqVar.b, iCompareTo2 <= 0 ? this.c : dzqVar.c);
            }
            return dzqVar;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzq)) {
            return false;
        }
        dzq dzqVar = (dzq) obj;
        return this.b.equals(dzqVar.b) && this.c.equals(dzqVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return b(this.b, this.c);
    }

    private static String b(dws dwsVar, dws dwsVar2) {
        StringBuilder sb = new StringBuilder(16);
        dwsVar.a(sb);
        sb.append("..");
        dwsVar2.b(sb);
        return sb.toString();
    }

    final Object readResolve() {
        if (equals(a)) {
            return a;
        }
        return this;
    }

    static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
