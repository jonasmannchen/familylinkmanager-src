package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwv extends cu {
    public bwv() {
        super(11, 12);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE `KidsModuleInfo` (`key` INTEGER NOT NULL, `apkPackageName` TEXT, `apkVersionCode` INTEGER NOT NULL, `moduleVersion` INTEGER NOT NULL, PRIMARY KEY(`key`))");
    }
}
