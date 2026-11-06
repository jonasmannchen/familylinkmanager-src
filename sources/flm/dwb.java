package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwb implements dvz, Serializable {
    public static final long serialVersionUID = 0;
    private final dvz a;
    private volatile transient boolean b;
    private transient Object c;

    dwb(dvz dvzVar) {
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
                    return objA;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object string;
        if (this.b) {
            String strValueOf = String.valueOf(this.c);
            string = new StringBuilder(String.valueOf(strValueOf).length() + 25).append("<supplier that returned ").append(strValueOf).append(">").toString();
        } else {
            string = this.a;
        }
        String strValueOf2 = String.valueOf(string);
        return new StringBuilder(String.valueOf(strValueOf2).length() + 19).append("Suppliers.memoize(").append(strValueOf2).append(")").toString();
    }
}
