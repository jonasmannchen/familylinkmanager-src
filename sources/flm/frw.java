package flm;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frw implements frv {
    @Override // flm.fry, flm.fso
    public final String a() {
        return "gzip";
    }

    @Override // flm.fry
    public final OutputStream a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    @Override // flm.fso
    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
