package flm;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class geg implements ghg {
    private InputStream a;

    geg(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // flm.ghg
    public final InputStream a() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
