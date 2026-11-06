package flm;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frx implements frv {
    public static final frv a = new frx();

    @Override // flm.fso
    public final InputStream a(InputStream inputStream) {
        return inputStream;
    }

    @Override // flm.fry, flm.fso
    public final String a() {
        return "identity";
    }

    @Override // flm.fry
    public final OutputStream a(OutputStream outputStream) {
        return outputStream;
    }

    private frx() {
    }
}
