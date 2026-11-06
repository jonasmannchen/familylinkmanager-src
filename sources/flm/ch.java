package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ch extends ct {
    public ch(cn cnVar) {
        super(cnVar);
    }

    public abstract void a(bw bwVar, Object obj);

    public final void a(Object obj) {
        bw bwVarB = b();
        try {
            a(bwVarB, obj);
            bwVarB.d();
        } finally {
            a(bwVarB);
        }
    }

    public final void a(Iterable iterable) {
        bw bwVarB = b();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(bwVarB, it.next());
                bwVarB.d();
            }
            a(bwVarB);
        } catch (Throwable th) {
            a(bwVarB);
            throw th;
        }
    }
}
