package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dln {
    public final boolean a;
    public final float b;
    public final int c;
    public final dvi d;

    @Deprecated
    public dln() {
        this(false);
    }

    @Deprecated
    private dln(boolean z) {
        this(false, 10);
    }

    @Deprecated
    public dln(boolean z, int i) {
        this(z, i, null);
    }

    @Deprecated
    private dln(boolean z, int i, dks dksVar) {
        this(z, 1.0f, i, dvi.c(null));
    }

    private dln(boolean z, float f, int i, dvi dviVar) {
        this.a = z;
        this.b = 1.0f;
        this.c = i;
        this.d = dviVar;
    }
}
