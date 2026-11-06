package flm;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sg implements Iterator, Map.Entry {
    private int a;
    private final /* synthetic */ sc d;
    private boolean c = false;
    private int b = -1;

    sg(sc scVar) {
        this.d = scVar;
        this.a = scVar.a() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.a(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.a(this.b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.a(this.b, 1);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.a(this.b, obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return rx.a(entry.getKey(), this.d.a(this.b, 0)) && rx.a(entry.getValue(), this.d.a(this.b, 1));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object objA = this.d.a(this.b, 0);
        Object objA2 = this.d.a(this.b, 1);
        return (objA2 != null ? objA2.hashCode() : 0) ^ (objA == null ? 0 : objA.hashCode());
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b++;
        this.c = true;
        return this;
    }
}
