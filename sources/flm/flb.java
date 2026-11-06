package flm;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class flb extends AbstractMap {
    public List a;
    public Map b;
    public boolean c;
    public Map d;
    private final int e;
    private volatile flk f;
    private volatile fle g;

    static flb a(int i) {
        return new flc(i);
    }

    private flb(int i) {
        this.e = i;
        this.a = Collections.emptyList();
        this.b = Collections.emptyMap();
        this.d = Collections.emptyMap();
    }

    public void a() {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        if (!this.c) {
            if (this.b.isEmpty()) {
                mapUnmodifiableMap = Collections.emptyMap();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(this.b);
            }
            this.b = mapUnmodifiableMap;
            if (this.d.isEmpty()) {
                mapUnmodifiableMap2 = Collections.emptyMap();
            } else {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(this.d);
            }
            this.d = mapUnmodifiableMap2;
            this.c = true;
        }
    }

    public final int b() {
        return this.a.size();
    }

    public final Map.Entry b(int i) {
        return (Map.Entry) this.a.get(i);
    }

    public final Iterable c() {
        if (this.b.isEmpty()) {
            return flf.b;
        }
        return this.b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.a.size() + this.b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((fli) this.a.get(iA)).getValue() : this.b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        e();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((fli) this.a.get(iA)).setValue(obj);
        }
        e();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(this.e);
        }
        int i = -(iA + 1);
        if (i >= this.e) {
            return f().put(comparable, obj);
        }
        if (this.a.size() == this.e) {
            fli fliVar = (fli) this.a.remove(this.e - 1);
            f().put((Comparable) fliVar.getKey(), fliVar.getValue());
        }
        this.a.add(i, new fli(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return c(iA);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    final Object c(int i) {
        e();
        Object value = ((fli) this.a.remove(i)).getValue();
        if (!this.b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.a.add(new fli(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int a(Comparable comparable) {
        int size = this.a.size() - 1;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo((Comparable) ((fli) this.a.get(size)).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        int i2 = size;
        while (i <= i2) {
            int i3 = (i + i2) / 2;
            int iCompareTo2 = comparable.compareTo((Comparable) ((fli) this.a.get(i3)).getKey());
            if (iCompareTo2 < 0) {
                i2 = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i = i3 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f == null) {
            this.f = new flk(this);
        }
        return this.f;
    }

    final Set d() {
        if (this.g == null) {
            this.g = new fle(this);
        }
        return this.g;
    }

    final void e() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap f() {
        e();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            this.b = new TreeMap();
            this.d = ((TreeMap) this.b).descendingMap();
        }
        return (SortedMap) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flb)) {
            return super.equals(obj);
        }
        flb flbVar = (flb) obj;
        int size = size();
        if (size != flbVar.size()) {
            return false;
        }
        int iB = b();
        if (iB != flbVar.b()) {
            return entrySet().equals(flbVar.entrySet());
        }
        for (int i = 0; i < iB; i++) {
            if (!b(i).equals(flbVar.b(i))) {
                return false;
            }
        }
        if (iB != size) {
            return this.b.equals(flbVar.b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i = 0; i < iB; i++) {
            iHashCode += ((fli) this.a.get(i)).hashCode();
        }
        return this.b.size() > 0 ? this.b.hashCode() + iHashCode : iHashCode;
    }

    /* synthetic */ flb(int i, byte b) {
        this(i);
    }
}
