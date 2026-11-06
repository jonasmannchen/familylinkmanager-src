package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum dwp {
    OPEN(false),
    CLOSED(true);

    dwp(boolean z) {
    }

    static dwp a(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
