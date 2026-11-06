package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ay implements w {
    private final Object a;
    private final p b;

    ay(Object obj) {
        this.a = obj;
        this.b = o.a.b(this.a.getClass());
    }

    @Override // flm.w
    public final void a(af afVar, y yVar) {
        p pVar = this.b;
        Object obj = this.a;
        p.a((List) pVar.a.get(yVar), afVar, yVar, obj);
        p.a((List) pVar.a.get(y.ON_ANY), afVar, yVar, obj);
    }
}
