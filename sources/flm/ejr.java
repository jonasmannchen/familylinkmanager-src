package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejr extends fio implements fkg {
    ejr() {
        super(ejq.e);
    }

    public final ejr a(eju ejuVar) {
        c();
        ejq ejqVar = (ejq) this.a;
        if (ejuVar == null) {
            throw new NullPointerException();
        }
        if (!ejqVar.b.a()) {
            fjf fjfVar = ejqVar.b;
            int size = fjfVar.size();
            ejqVar.b = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        ejqVar.b.add(ejuVar);
        return this;
    }
}
