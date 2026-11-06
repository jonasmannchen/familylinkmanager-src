package flm;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fwt implements ghe {
    public abstract fwu c();

    protected abstract gbf d();

    @Override // flm.ghe
    public final void a(InputStream inputStream) {
        dvl.a(inputStream, "message");
        try {
            if (!d().b()) {
                d().a(inputStream);
            }
        } finally {
            gbh.a(inputStream);
        }
    }

    @Override // flm.ghe
    public final void f() {
        if (!d().b()) {
            d().a();
        }
    }

    @Override // flm.ghe
    public final void a(fry fryVar) {
        d().a((fry) dvl.a(fryVar, "compressor"));
    }

    public final void d(int i) {
        c().c(i);
    }
}
