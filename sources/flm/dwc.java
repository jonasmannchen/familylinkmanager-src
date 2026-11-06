package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwc implements dvz {
    private volatile dvz a;
    private volatile boolean b;
    private Object c;

    dwc(dvz dvzVar) {
        this.a = (dvz) dvl.a(dvzVar);
    }

    @Override // flm.dvz
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object objA = this.a.a();
                    this.c = objA;
                    this.b = true;
                    this.a = null;
                    return objA;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object string = this.a;
        if (string == null) {
            String strValueOf = String.valueOf(this.c);
            string = new StringBuilder(String.valueOf(strValueOf).length() + 25).append("<supplier that returned ").append(strValueOf).append(">").toString();
        }
        String strValueOf2 = String.valueOf(string);
        return new StringBuilder(String.valueOf(strValueOf2).length() + 19).append("Suppliers.memoize(").append(strValueOf2).append(")").toString();
    }
}
