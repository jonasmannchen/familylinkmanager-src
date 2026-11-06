package flm;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwd implements dvz, Serializable {
    public static final long serialVersionUID = 0;
    private final Object a;

    dwd(Object obj) {
        this.a = obj;
    }

    @Override // flm.dvz
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwd) {
            return dvh.a(this.a, ((dwd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 22).append("Suppliers.ofInstance(").append(strValueOf).append(")").toString();
    }
}
