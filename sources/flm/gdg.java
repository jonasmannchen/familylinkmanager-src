package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdg implements fyw {
    public final /* synthetic */ gda a;

    gdg(gda gdaVar) {
        this.a = gdaVar;
    }

    @Override // flm.fyw
    public final fzb a(ftq ftqVar) {
        fts ftsVar = this.a.w;
        if (this.a.C.get()) {
            return this.a.A;
        }
        if (ftsVar == null) {
            this.a.k.a(new gdh(this)).a();
            return this.a.A;
        }
        fzb fzbVarA = gbh.a(ftsVar.a(), ftqVar.a().h);
        return fzbVarA == null ? this.a.A : fzbVarA;
    }

    @Override // flm.fyw
    public final gfi a(fuf fufVar, frj frjVar, ftv ftvVar, fsc fscVar) {
        dvl.b(this.a.Q, "retry should be enabled");
        return new gdi(this, fufVar, ftvVar, frjVar, fscVar);
    }
}
