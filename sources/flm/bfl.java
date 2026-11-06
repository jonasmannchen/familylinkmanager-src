package flm;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfl extends frn {
    public fvc a;
    public Object b;
    public final CountDownLatch c = new CountDownLatch(1);

    bfl() {
    }

    @Override // flm.frn
    public final void a(ftv ftvVar) {
    }

    @Override // flm.frn
    public final void a(Object obj) {
        if (this.b != null) {
            throw fvc.i.a("More than one value received for unary call").b();
        }
        this.b = obj;
    }

    @Override // flm.frn
    public final void a(fvc fvcVar, ftv ftvVar) {
        if (fvcVar == null) {
            this.a = fvc.i.a("Null status returned for unary call");
        } else if (fvcVar.a() && this.b == null) {
            this.a = fvc.i.a("No value received for unary call");
        } else {
            this.a = fvcVar;
        }
        this.c.countDown();
    }
}
