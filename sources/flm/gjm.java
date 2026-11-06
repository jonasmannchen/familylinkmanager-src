package flm;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjm implements PrivilegedExceptionAction {
    gjm() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() {
        return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
    }
}
