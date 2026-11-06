package flm;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ccn implements daz {
    public static final daz a = new ccn();

    private ccn() {
    }

    @Override // flm.daz
    public final void a(dbh dbhVar) {
        if (dbhVar.b()) {
            btv.c("Persistent", "Awareness subscription succeeded.", new Object[0]);
        } else {
            btv.b("Persistent", dbhVar.e(), "Awareness subscription failed with", new Object[0]);
        }
    }
}
