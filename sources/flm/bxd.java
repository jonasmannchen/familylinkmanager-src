package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxd extends cu {
    public bxd() {
        super(5, 6);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE `ActivitySampleEntity` (`key` INTEGER NOT NULL, `activityRecognitionResult` BLOB NOT NULL, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE `LocationSampleEntity` (`key` INTEGER NOT NULL, `location` BLOB NOT NULL, PRIMARY KEY(`key`))");
    }
}
