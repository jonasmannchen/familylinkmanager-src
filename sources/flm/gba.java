package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gba implements Runnable {
    private final /* synthetic */ fzc a;
    private final /* synthetic */ gaz b;

    gba(gaz gazVar, fzc fzcVar) {
        this.b = gazVar;
        this.a = fzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fzc fzcVar = this.a;
        this.b.a.c();
        fzcVar.b();
    }
}
