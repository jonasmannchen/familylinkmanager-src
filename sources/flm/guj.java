package flm;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class guj extends gtx {
    private final /* synthetic */ Socket f;

    guj(Socket socket) {
        this.f = socket;
    }

    @Override // flm.gtx
    protected final IOException b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // flm.gtx
    protected final void b() {
        try {
            this.f.close();
        } catch (AssertionError e) {
            if (gug.a(e)) {
                gug.a.log(Level.WARNING, "Failed to close timed out socket " + this.f, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            gug.a.log(Level.WARNING, "Failed to close timed out socket " + this.f, (Throwable) e2);
        }
    }
}
