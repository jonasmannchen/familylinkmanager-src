package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwt extends dws {
    public static final dwt b = new dwt();
    public static final long serialVersionUID = 0;

    private dwt() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.dws
    public final Comparable c() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // flm.dws
    final boolean a(Comparable comparable) {
        return false;
    }

    @Override // flm.dws
    final dwp a() {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // flm.dws
    final dwp b() {
        throw new IllegalStateException();
    }

    @Override // flm.dws
    final void a(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // flm.dws
    final void b(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // flm.dws
    /* JADX INFO: renamed from: a */
    public final int compareTo(dws dwsVar) {
        return dwsVar == this ? 0 : 1;
    }

    @Override // flm.dws
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }

    private final Object readResolve() {
        return b;
    }

    @Override // flm.dws, java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return compareTo((dws) obj);
    }
}
