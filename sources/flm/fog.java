package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fog {
    public final fod a;
    public final fob b;
    private final String c;
    private final Object d = this;

    public fog(foh fohVar) {
        this.a = fohVar.a;
        this.c = fohVar.b;
        this.b = new fob(fohVar.c);
    }

    public final String toString() {
        return "Request{method=" + this.c + ", url=" + this.a + ", tag=" + (this.d != this ? this.d : null) + '}';
    }
}
