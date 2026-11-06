package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dwo implements dzs {
    dwo() {
    }

    @Override // flm.dzs
    public abstract dzq b(Comparable comparable);

    @Override // flm.dzs
    public boolean a(Comparable comparable) {
        return b(comparable) != null;
    }

    @Override // flm.dzs
    public void a(dzq dzqVar) {
        throw new UnsupportedOperationException();
    }

    public void b(dzq dzqVar) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.dzs
    public void a(dzs dzsVar) {
        a(dzsVar.a());
    }

    @Override // flm.dzs
    public void a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a((dzq) it.next());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzs) {
            return a().equals(((dzs) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
