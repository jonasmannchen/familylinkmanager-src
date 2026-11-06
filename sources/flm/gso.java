package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gso extends fio implements fkg {
    gso() {
        super(gsn.b);
    }

    public final int a() {
        return ((gsn) this.a).a.size();
    }

    public final gso a(gss gssVar) {
        c();
        gsn gsnVar = (gsn) this.a;
        if (!gsnVar.a.a()) {
            fjf fjfVar = gsnVar.a;
            int size = fjfVar.size();
            gsnVar.a = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        gsnVar.a.add((gsr) ((fin) gssVar.h()));
        return this;
    }
}
