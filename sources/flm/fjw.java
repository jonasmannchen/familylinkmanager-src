package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjw {
    public final fjx a;

    public fjw(fmj fmjVar, Object obj, fmj fmjVar2, Object obj2) {
        this.a = new fjx(fmjVar, obj, fmjVar2, obj2);
    }

    static void a(fhp fhpVar, fjx fjxVar, Object obj, Object obj2) {
        fig.a(fhpVar, fjxVar.a, 1, obj);
        fig.a(fhpVar, fjxVar.c, 2, obj2);
    }

    static int a(fjx fjxVar, Object obj, Object obj2) {
        return fig.a(fjxVar.a, 1, obj) + fig.a(fjxVar.c, 2, obj2);
    }
}
