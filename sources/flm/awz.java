package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awz implements bau {
    public final /* synthetic */ awv a;

    awz(awv awvVar) {
        this.a = awvVar;
    }

    @Override // flm.bau
    public final void onSignOutComplete() {
        this.a.i.o.post(new axa(this));
    }
}
