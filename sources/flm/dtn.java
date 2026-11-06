package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dtn {
    public final dtn a;
    public final so b;
    public boolean c = false;

    public static dtl a(dtm dtmVar, dtn dtnVar, duo duoVar) {
        dvl.a(duoVar);
        Object objB = dtnVar.b(dtmVar);
        return objB == null ? dtl.a(dp.aa) : new dtl(dp.Y, dvl.a(objB), false);
    }

    dtn(dtn dtnVar, so soVar) {
        if (dtnVar != null) {
            dvl.a(dtnVar.c);
        }
        this.a = dtnVar;
        this.b = soVar;
    }

    final dtn j_() {
        if (this.c) {
            throw new IllegalStateException("Already frozen");
        }
        this.c = true;
        if (this.a != null && this.b.isEmpty()) {
            return this.a;
        }
        return this;
    }

    final boolean a(dtm dtmVar) {
        return this.b.containsKey(dtmVar) || (this.a != null && this.a.a(dtmVar));
    }

    private final Object b(dtm dtmVar) {
        dvl.b(this.c);
        Object obj = this.b.get(dtmVar);
        if (obj == null && this.a != null) {
            return this.a.b(dtmVar);
        }
        return obj;
    }
}
