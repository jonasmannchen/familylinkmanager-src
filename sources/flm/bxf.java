package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxf extends cu {
    public bxf() {
        super(7, 8);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE `AppStateEntity` (`packageName` TEXT, `flags` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
        boVar.c("INSERT INTO AppStateEntity(packageName, flags) SELECT DISTINCT packageName, 0 FROM AppDisabledState");
        boVar.c("UPDATE AppStateEntity SET flags = (flags | 1) WHERE packageName IN (SELECT packageName FROM AppDisabledState WHERE reason = 101)");
        boVar.c("UPDATE AppStateEntity SET flags = (flags | 2) WHERE packageName IN (SELECT packageName FROM AppDisabledState WHERE reason = 100)");
        boVar.c("UPDATE AppStateEntity SET flags = (flags | 4) WHERE packageName IN (SELECT packageName FROM AppDisabledState WHERE reason = 102)");
        boVar.c("DROP TABLE `AppDisabledState`");
    }
}
