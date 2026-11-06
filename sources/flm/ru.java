package flm;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ru extends sc {
    private final /* synthetic */ rt c;

    ru(rt rtVar) {
        this.c = rtVar;
    }

    @Override // flm.sc
    protected final int a() {
        return this.c.b;
    }

    @Override // flm.sc
    protected final Object a(int i, int i2) {
        return this.c.a[(i << 1) + i2];
    }

    @Override // flm.sc
    protected final int a(Object obj) {
        return this.c.a(obj);
    }

    @Override // flm.sc
    protected final int b(Object obj) {
        return this.c.b(obj);
    }

    @Override // flm.sc
    protected final Map b() {
        return this.c;
    }

    @Override // flm.sc
    protected final void a(Object obj, Object obj2) {
        this.c.put(obj, obj2);
    }

    @Override // flm.sc
    protected final Object a(int i, Object obj) {
        rt rtVar = this.c;
        int i2 = (i << 1) + 1;
        Object obj2 = rtVar.a[i2];
        rtVar.a[i2] = obj;
        return obj2;
    }

    @Override // flm.sc
    protected final void a(int i) {
        this.c.d(i);
    }

    @Override // flm.sc
    protected final void c() {
        this.c.clear();
    }
}
