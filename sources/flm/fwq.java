package flm;

import java.net.SocketAddress;
import java.net.URI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwq extends fuj {
    public final SocketAddress b;
    public final String c;

    fwq(SocketAddress socketAddress, String str) {
        this.b = socketAddress;
        this.c = str;
    }

    @Override // flm.fuj
    public final fui a(URI uri, frd frdVar) {
        return new fwr(this);
    }

    @Override // flm.fuj
    public final String a() {
        return "directaddress";
    }
}
