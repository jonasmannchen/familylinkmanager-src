package flm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dnt implements aik {
    private Object a;
    public int k;
    public dnt l;
    public int o;
    public int p;
    public String q;
    public dnt t;
    public Set m = new HashSet();
    public boolean n = false;
    public int r = -1;
    public final List s = new ArrayList();

    public static boolean a(dnt dntVar) {
        return (dntVar instanceof dnq) && (((dnq) dntVar).a.o & 2) != 0;
    }

    public abstract int a(dod dodVar);

    public abstract int a(dod dodVar, int i);

    public abstract int b(dod dodVar);

    public abstract String b(dod dodVar, int i);

    public abstract String c(dod dodVar, int i);

    public static boolean b(dnt dntVar) {
        return (dntVar.o & 1) != 0;
    }

    public static void a(dnt dntVar, dod dodVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dntVar);
        while (!arrayDeque.isEmpty()) {
            dnt dntVar2 = (dnt) arrayDeque.pop();
            if (dntVar2.r == -1) {
                dntVar2.r = dntVar2.b(dodVar);
                arrayDeque.push(dntVar2);
                Iterator it = dntVar2.s.iterator();
                while (it.hasNext()) {
                    arrayDeque.push((dnt) it.next());
                }
            } else {
                for (dnt dntVar3 : dntVar2.s) {
                    dntVar2.r = dntVar3.r + dntVar2.r;
                }
            }
        }
    }

    protected dnt(int i) {
        this.k = i;
    }

    public final int e(dod dodVar) {
        return dodVar.d(this.k);
    }

    @Override // flm.aik
    public final void a(Object obj) {
        this.a = obj;
    }

    @Override // flm.aik
    public final Object a() {
        return this.a;
    }

    @Override // flm.aik
    public final void a(aik aikVar) {
        this.t = (dnt) aikVar;
        this.t.s.add(this);
    }

    @Override // flm.aik
    public Iterable b() {
        return Collections.emptyList();
    }
}
