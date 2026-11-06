package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxh extends cu {
    public bxh() {
        super(9, 10);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE `AppPendingDisableEntity` (`packageName` TEXT, `pendingTimestamp` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
        boVar.c("ALTER TABLE `KeyValue` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `KeyValue` (`key` TEXT, `value` TEXT, PRIMARY KEY(`key`))");
        boVar.c("INSERT INTO KeyValue(key, value) SELECT key, value FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
    }
}
