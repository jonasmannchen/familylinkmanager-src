package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dws implements Serializable, Comparable {
    public static final long serialVersionUID = 0;
    public final Comparable a;

    dws(Comparable comparable) {
        this.a = comparable;
    }

    abstract dwp a();

    abstract void a(StringBuilder sb);

    abstract boolean a(Comparable comparable);

    abstract dwp b();

    abstract void b(StringBuilder sb);

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dws dwsVar) {
        if (dwsVar == dwv.b) {
            return 1;
        }
        if (dwsVar == dwt.b) {
            return -1;
        }
        int iB = dzq.b(this.a, dwsVar.a);
        if (iB != 0) {
            return iB;
        }
        boolean z = this instanceof dwu;
        if (z == (dwsVar instanceof dwu)) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    public Comparable c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dws)) {
            return false;
        }
        try {
            return compareTo((dws) obj) == 0;
        } catch (ClassCastException e) {
            return false;
        }
    }

    static dws b(Comparable comparable) {
        return new dww(comparable);
    }

    static dws c(Comparable comparable) {
        return new dwu(comparable);
    }
}
