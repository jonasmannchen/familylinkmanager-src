package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awu implements auu {
    private final /* synthetic */ awt a;

    awu(awt awtVar) {
        this.a = awtVar;
    }

    @Override // flm.auu
    public final void a(boolean z) {
        this.a.o.sendMessage(this.a.o.obtainMessage(1, Boolean.valueOf(z)));
    }
}
