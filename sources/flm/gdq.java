package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdq implements Runnable {
    private final /* synthetic */ fts a;
    private final /* synthetic */ fsa b;
    private final /* synthetic */ gdn c;

    gdq(gdn gdnVar, fts ftsVar, fsa fsaVar) {
        this.c = gdnVar;
        this.a = ftsVar;
        this.b = fsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != this.c.c.v) {
            return;
        }
        this.c.c.a(this.a);
        if (this.b != fsa.SHUTDOWN) {
            if (this.c.c.I != null) {
                fym fymVar = this.c.c.I;
                ftb ftbVar = new ftb();
                String strValueOf = String.valueOf(this.b);
                ftbVar.a = new StringBuilder(String.valueOf(strValueOf).length() + 15).append("Entering ").append(strValueOf).append(" state").toString();
                ftbVar.b = ftc.CT_INFO;
                fymVar.a(ftbVar.a(this.c.c.i.a()).a());
            }
            this.c.c.p.a(this.b);
        }
    }
}
