package flm;

import java.net.InetSocketAddress;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gex {
    public final InetSocketAddress a;
    public final String b;
    public final String c;

    public gex(InetSocketAddress inetSocketAddress, String str, String str2) {
        dvl.a(inetSocketAddress);
        dvl.b(!inetSocketAddress.isUnresolved());
        this.a = inetSocketAddress;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gex)) {
            return false;
        }
        gex gexVar = (gex) obj;
        return dvh.a(this.a, gexVar.a) && dvh.a(this.b, gexVar.b) && dvh.a(this.c, gexVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
