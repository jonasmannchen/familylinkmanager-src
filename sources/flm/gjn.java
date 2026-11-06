package flm;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjn implements PrivilegedExceptionAction {
    gjn() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() {
        return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
