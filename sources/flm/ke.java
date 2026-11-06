package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ke extends jx {
    private kc a;

    ke(kc kcVar) {
        this.a = kcVar;
    }

    @Override // flm.jx, flm.jw
    public final void c() {
        if (!this.a.t) {
            this.a.d();
            this.a.t = true;
        }
    }

    @Override // flm.jx, flm.jw
    public final void a(jq jqVar) {
        this.a.s--;
        if (this.a.s == 0) {
            this.a.t = false;
            this.a.e();
        }
        jqVar.b(this);
    }
}
