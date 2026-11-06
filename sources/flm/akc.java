package flm;

import com.android.volley.toolbox.HurlStack;
import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akc extends FilterInputStream {
    private final HttpURLConnection a;

    public akc(HttpURLConnection httpURLConnection) {
        super(HurlStack.a(httpURLConnection));
        this.a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.a.disconnect();
    }
}
