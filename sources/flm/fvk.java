package flm;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvk extends fst {
    private static final Class b = d();
    public Context a;
    private final ftu c;

    private static final Class d() {
        try {
            return Class.forName("flm.gie");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static fvk a(String str, int i) {
        return new fvk(gbh.a(str, i));
    }

    private fvk(String str) {
        if (b == null) {
            throw new UnsupportedOperationException("No ManagedChannelBuilder found on the classpath");
        }
        try {
            this.c = (ftu) b.getMethod("forTarget", String.class).invoke(null, str);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create ManagedChannelBuilder", e);
        }
    }

    @Deprecated
    public final fvk a(Executor executor) {
        try {
            b.getMethod("transportExecutor", Executor.class).invoke(this.c, executor);
            return this;
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke transportExecutor on delegate builder", e);
        }
    }

    @Deprecated
    public final fvk a(SSLSocketFactory sSLSocketFactory) {
        try {
            b.getMethod("sslSocketFactory", SSLSocketFactory.class).invoke(this.c, sSLSocketFactory);
            return this;
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke sslSocketFactory on delegate builder", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fst
    public final ftu a() {
        return this.c;
    }

    @Override // flm.fst, flm.ftu
    public final ftt b() {
        return new fvl(this.c.b(), this.a);
    }
}
