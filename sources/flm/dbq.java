package flm;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbq implements dbr {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // flm.dbf
    public final void a(Object obj) {
        this.a.countDown();
    }

    @Override // flm.dbc
    public final void a(Exception exc) {
        this.a.countDown();
    }

    @Override // flm.daw
    public final void a() {
        this.a.countDown();
    }
}
