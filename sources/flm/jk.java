package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jk implements jw {
    private final /* synthetic */ Object a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ jh g;

    jk(jh jhVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = jhVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    @Override // flm.jw
    public final void c() {
        if (this.a != null) {
            this.g.b(this.a, this.b, (ArrayList) null);
        }
        if (this.c != null) {
            this.g.b(this.c, this.d, (ArrayList) null);
        }
        if (this.e != null) {
            this.g.b(this.e, this.f, (ArrayList) null);
        }
    }

    @Override // flm.jw
    public final void a(jq jqVar) {
    }

    @Override // flm.jw
    public final void a() {
    }

    @Override // flm.jw
    public final void b() {
    }
}
