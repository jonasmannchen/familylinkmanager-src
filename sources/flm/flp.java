package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flp extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;

    public flp() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final fjg a() {
        return new fjg(getMessage());
    }
}
