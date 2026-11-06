package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwx extends cu {
    public bwx() {
        super(13, 14);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE IF NOT EXISTS `ConsentStatusEntity` (`secondaryAccountEmail` TEXT NOT NULL, `isValid` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`secondaryAccountEmail`))");
    }
}
