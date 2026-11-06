package flm;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gfl implements Runnable {
    private final /* synthetic */ Collection a;
    private final /* synthetic */ ggg b;
    private final /* synthetic */ gfi c;

    gfl(gfi gfiVar, Collection collection, ggg gggVar) {
        this.c = gfiVar;
        this.a = collection;
        this.b = gggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (ggg gggVar : this.a) {
            if (gggVar != this.b) {
                gggVar.a.b(gfi.b);
            }
        }
        this.c.b();
    }
}
