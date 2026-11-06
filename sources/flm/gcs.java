package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcs implements gcu {
    public final fzj a;

    public gcs(fzj fzjVar) {
        this.a = fzjVar;
    }

    @Override // flm.gcu
    public final void a() {
        this.a.a(new gct(this), egn.INSTANCE);
    }

    @Override // flm.gcu
    public final void b() {
        this.a.b(fvc.j.a("Keepalive failed. The connection is likely gone"));
    }
}
