package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ads implements Runnable {
    private final /* synthetic */ adr a;

    ads(adr adrVar) {
        this.a = adrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adr adrVar = this.a;
        switch (adrVar.o) {
            case 1:
                adrVar.n.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        adrVar.o = 3;
        adrVar.n.setFloatValues(((Float) adrVar.n.getAnimatedValue()).floatValue(), 0.0f);
        adrVar.n.setDuration(500L);
        adrVar.n.start();
    }
}
