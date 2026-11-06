package flm;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjl implements PrivilegedExceptionAction {
    gjl() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() {
        return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
