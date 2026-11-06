package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dur extends dvi {
    public static final dur a = new dur();
    public static final long serialVersionUID = 0;

    private dur() {
    }

    @Override // flm.dvi
    public final boolean a() {
        return false;
    }

    @Override // flm.dvi
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // flm.dvi
    public final Object a(Object obj) {
        return dvl.a(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // flm.dvi
    public final Object a(dvz dvzVar) {
        return dvl.a(dvzVar.a(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // flm.dvi
    public final Object c() {
        return null;
    }

    @Override // flm.dvi
    public final dvi a(dvc dvcVar) {
        dvl.a(dvcVar);
        return a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    private final Object readResolve() {
        return a;
    }
}
