package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvu extends frn {
    private final /* synthetic */ frn a;
    private final /* synthetic */ fvt b;

    fvu(fvt fvtVar, frn frnVar) {
        this.b = fvtVar;
        this.a = frnVar;
    }

    @Override // flm.frn
    public final void a(ftv ftvVar) {
        this.a.a(ftvVar);
    }

    @Override // flm.frn
    public final void a(Object obj) {
        this.a.a(obj);
    }

    @Override // flm.frn
    public final void a(fvc fvcVar, ftv ftvVar) {
        if (this.b.a.d && fvc.g.m == fvcVar.m) {
            try {
                alu.a(this.b.a.c, this.b.a.b);
            } catch (alt e) {
            } catch (IOException e2) {
            }
        }
        this.a.a(fvcVar, ftvVar);
    }

    @Override // flm.frn
    public final void a() {
        this.a.a();
    }
}
