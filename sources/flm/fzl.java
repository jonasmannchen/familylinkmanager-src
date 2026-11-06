package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class fzl implements Runnable {
    private final fsc a;

    public fzl(fsc fscVar) {
        this.a = fscVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        fsc fscVarC = this.a.c();
        try {
            a();
        } finally {
            this.a.a(fscVarC);
        }
    }
}
