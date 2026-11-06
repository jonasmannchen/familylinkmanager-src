package flm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gug {
    public static final Logger a = Logger.getLogger(gug.class.getName());

    private gug() {
    }

    public static gue a(guq guqVar) {
        return new gul(guqVar);
    }

    public static gud a(gup gupVar) {
        return new guk(gupVar);
    }

    public static gup a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        gtx gtxVarC = c(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (gtxVarC == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new gty(gtxVarC, new guh(gtxVarC, outputStream));
    }

    public static guq b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        gtx gtxVarC = c(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (gtxVarC == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new gtz(gtxVarC, new gui(gtxVarC, inputStream));
    }

    private static gtx c(Socket socket) {
        return new guj(socket);
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
