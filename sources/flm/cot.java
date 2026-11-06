package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cot implements at {
    private Object a = null;
    private final /* synthetic */ cou b;
    private final /* synthetic */ ap c;

    public cot(cou couVar, ap apVar) {
        this.b = couVar;
        this.c = apVar;
    }

    @Override // flm.at
    public final /* synthetic */ void a(Object obj) {
        Object objA = this.b.a((cij) dvl.a((cij) obj));
        if (objA != this.a) {
            if (objA.equals(this.a)) {
                this.a = objA;
            } else {
                this.a = objA;
                this.c.b(objA);
            }
        }
    }
}
