package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nn implements at {
    public final nl a;
    public boolean b = false;
    private final op c;

    nn(op opVar, nl nlVar) {
        this.c = opVar;
        this.a = nlVar;
    }

    @Override // flm.at
    public final void a(Object obj) {
        this.a.a(this.c, obj);
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
