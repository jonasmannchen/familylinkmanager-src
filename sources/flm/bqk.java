package flm;

import android.annotation.TargetApi;
import android.os.Trace;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqk implements Closeable {
    private static final bsm a = bsl.a().a("nts.enable_tracing", true);
    private final boolean b;

    @TargetApi(18)
    public bqk(String str) {
        this.b = ((Boolean) a.a()).booleanValue();
        if (this.b) {
            Trace.beginSection(str.length() > 127 ? str.substring(0, 127) : str);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @TargetApi(18)
    public final void close() {
        if (this.b) {
            Trace.endSection();
        }
    }
}
