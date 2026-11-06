package flm;

import java.net.SocketAddress;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gey extends SocketAddress {
    public static final long serialVersionUID = -6854992294603212793L;
    public final SocketAddress a;
    public final gex b;

    gey(SocketAddress socketAddress, gex gexVar) {
        this.a = (SocketAddress) dvl.a(socketAddress);
        this.b = (gex) dvl.a(gexVar);
    }
}
