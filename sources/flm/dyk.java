package flm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyk {
    public static String a(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        return sb.append(']').toString();
    }

    public static Iterable a(Iterable iterable, dvm dvmVar) {
        dvl.a(iterable);
        dvl.a(dvmVar);
        return new dyl(iterable, dvmVar);
    }

    public static Object b(Iterable iterable, dvm dvmVar) {
        Iterator it = iterable.iterator();
        dvl.a(it);
        dvl.a(dvmVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (dvmVar.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static dvi c(Iterable iterable, dvm dvmVar) {
        Iterator it = iterable.iterator();
        dvl.a(it);
        dvl.a(dvmVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (dvmVar.a(next)) {
                return dvi.b(next);
            }
        }
        return dur.a;
    }

    public static Iterable a(Iterable iterable, dvc dvcVar) {
        dvl.a(iterable);
        dvl.a(dvcVar);
        return new dym(iterable, dvcVar);
    }

    public static Object a(Iterable iterable, Object obj) {
        return dyn.a(iterable.iterator(), (Object) null);
    }
}
