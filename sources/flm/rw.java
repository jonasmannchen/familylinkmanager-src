package flm;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class rw extends sc {
    private final /* synthetic */ rv c;

    rw(rv rvVar) {
        this.c = rvVar;
    }

    @Override // flm.sc
    protected final int a() {
        return this.c.b;
    }

    @Override // flm.sc
    protected final Object a(int i, int i2) {
        return this.c.a[i];
    }

    @Override // flm.sc
    protected final int a(Object obj) {
        return this.c.a(obj);
    }

    @Override // flm.sc
    protected final int b(Object obj) {
        return this.c.a(obj);
    }

    @Override // flm.sc
    protected final Map b() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // flm.sc
    protected final void a(Object obj, Object obj2) {
        this.c.add(obj);
    }

    @Override // flm.sc
    protected final Object a(int i, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // flm.sc
    protected final void a(int i) {
        this.c.a(i);
    }

    @Override // flm.sc
    protected final void c() {
        this.c.clear();
    }
}
