package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class gib implements Runnable {
    private final /* synthetic */ gho a;

    private gib(gho ghoVar) {
        this.a = ghoVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.b == null) {
                throw new IOException("Unable to perform write due to unavailable frameWriter.");
            }
            a();
        } catch (RuntimeException e) {
            this.a.d.a(e);
        } catch (Exception e2) {
            this.a.d.a(e2);
        }
    }

    /* synthetic */ gib(gho ghoVar, byte b) {
        this(ghoVar);
    }
}
