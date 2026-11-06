package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dvn extends dvi {
    public static final long serialVersionUID = 0;
    private final Object a;

    dvn(Object obj) {
        this.a = obj;
    }

    @Override // flm.dvi
    public final boolean a() {
        return true;
    }

    @Override // flm.dvi
    public final Object b() {
        return this.a;
    }

    @Override // flm.dvi
    public final Object a(Object obj) {
        dvl.a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override // flm.dvi
    public final Object a(dvz dvzVar) {
        dvl.a(dvzVar);
        return this.a;
    }

    @Override // flm.dvi
    public final Object c() {
        return this.a;
    }

    @Override // flm.dvi
    public final dvi a(dvc dvcVar) {
        return new dvn(dvl.a(dvcVar.a(this.a), "the Function passed to Optional.transform() must not return null."));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvn) {
            return this.a.equals(((dvn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1502476572 + this.a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 13).append("Optional.of(").append(strValueOf).append(")").toString();
    }
}
