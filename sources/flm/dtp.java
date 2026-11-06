package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtp extends dtn implements dto {
    public static final dtn d = new dtp(null, new so(0)).j_();

    public dtp(dtn dtnVar, so soVar) {
        super(dtnVar, soVar);
    }

    @Override // flm.dto
    public final dtn a() {
        return j_();
    }

    @Override // flm.dto
    public final dto a(dtm dtmVar, Object obj) {
        dvl.b(!this.c, "Can't mutate after handing to trace");
        dvl.a(obj);
        dvl.b(a(dtmVar) ? false : true, "Key already present");
        this.b.put(dtmVar, obj);
        return this;
    }
}
