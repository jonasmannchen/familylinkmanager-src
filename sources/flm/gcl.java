package flm;

import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcl {
    public List a;
    public int b;
    public int c;

    public gcl(List list) {
        this.a = list;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final SocketAddress b() {
        return (SocketAddress) ((fss) this.a.get(this.b)).a.get(this.c);
    }
}
