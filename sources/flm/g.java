package flm;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class g implements Iterable {
    public j b;
    public j c;
    public WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected j a(Object obj) {
        j jVar = this.b;
        while (jVar != null && !jVar.a.equals(obj)) {
            jVar = jVar.c;
        }
        return jVar;
    }

    public Object a(Object obj, Object obj2) {
        j jVarA = a(obj);
        if (jVarA != null) {
            return jVarA.b;
        }
        b(obj, obj2);
        return null;
    }

    protected final j b(Object obj, Object obj2) {
        j jVar = new j(obj, obj2);
        this.e++;
        if (this.c == null) {
            this.b = jVar;
            this.c = this.b;
        } else {
            this.c.c = jVar;
            jVar.d = this.c;
            this.c = jVar;
        }
        return jVar;
    }

    public Object b(Object obj) {
        j jVarA = a(obj);
        if (jVarA == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                ((m) it.next()).a_(jVarA);
            }
        }
        if (jVarA.d != null) {
            jVarA.d.c = jVarA.c;
        } else {
            this.b = jVarA.c;
        }
        if (jVarA.c != null) {
            jVarA.c.d = jVarA.d;
        } else {
            this.c = jVarA.d;
        }
        jVarA.c = null;
        jVarA.d = null;
        return jVarA.b;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        h hVar = new h(this.b, this.c);
        this.d.put(hVar, false);
        return hVar;
    }

    public final k a() {
        k kVar = new k(this);
        this.d.put(kVar, false);
        return kVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.e != gVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = gVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
