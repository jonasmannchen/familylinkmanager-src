package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dww extends dws {
    public static final long serialVersionUID = 0;

    dww(Comparable comparable) {
        super((Comparable) dvl.a(comparable));
    }

    @Override // flm.dws
    final boolean a(Comparable comparable) {
        return dzq.b(this.a, comparable) <= 0;
    }

    @Override // flm.dws
    final dwp a() {
        return dwp.CLOSED;
    }

    @Override // flm.dws
    final dwp b() {
        return dwp.OPEN;
    }

    @Override // flm.dws
    final void a(StringBuilder sb) {
        sb.append('[').append(this.a);
    }

    @Override // flm.dws
    final void b(StringBuilder sb) {
        sb.append(this.a).append(')');
    }

    @Override // flm.dws
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 2).append("\\").append(strValueOf).append("/").toString();
    }
}
