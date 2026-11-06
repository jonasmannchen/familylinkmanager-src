package flm;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dwx implements Iterable {
    private final dvi a;

    protected dwx() {
        this.a = dur.a;
    }

    dwx(Iterable iterable) {
        dvl.a(iterable);
        this.a = dvi.c(this == iterable ? null : iterable);
    }

    public final Iterable a() {
        return (Iterable) this.a.a(this);
    }

    public static dwx a(Iterable iterable) {
        if (iterable instanceof dwx) {
            return (dwx) iterable;
        }
        return new dwy(iterable, iterable);
    }

    public String toString() {
        return dyk.a(a());
    }

    public final dwx b(Iterable iterable) {
        Iterable[] iterableArr = {a(), iterable};
        for (Iterable iterable2 : iterableArr) {
            dvl.a(iterable2);
        }
        return new dwz(iterableArr);
    }

    public final dwx a(dvm dvmVar) {
        return a(dyk.a(a(), dvmVar));
    }

    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022 A[ORIG_RETURN, RETURN] */
    public final boolean b(dvm dvmVar) {
        Iterator it = a().iterator();
        dvl.a(dvmVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (!dvmVar.a(it.next())) {
                i++;
            } else {
                if (i != -1) {
                    return true;
                }
                return false;
            }
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    public final dvi c(dvm dvmVar) {
        return dyk.c(a(), dvmVar);
    }

    public final dwx a(dvc dvcVar) {
        return a(dyk.a(a(), dvcVar));
    }

    public final dxm a(Comparator comparator) {
        return dxm.a(dzo.a(comparator), a());
    }
}
