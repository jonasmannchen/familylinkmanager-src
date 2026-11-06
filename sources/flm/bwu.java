package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwu extends cu {
    public bwu() {
        super(10, 11);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("ALTER TABLE `AppPendingDisableEntity` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `AppPendingDisableEntity` (`packageName` TEXT NOT NULL, `pendingTimestamp` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
        boVar.c("INSERT INTO AppPendingDisableEntity(packageName, pendingTimestamp) SELECT packageName, pendingTimestamp FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
        boVar.c("ALTER TABLE `AppStateEntity` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `AppStateEntity` (`packageName` TEXT NOT NULL, `flags` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
        boVar.c("INSERT INTO AppStateEntity(packageName, flags) SELECT packageName, flags FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
        boVar.c("ALTER TABLE `KeyValue` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `KeyValue` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
        boVar.c("INSERT INTO KeyValue(key, value) SELECT key, value FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
        boVar.c("ALTER TABLE `TimeLimitLocalOverrideEntity` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `TimeLimitLocalOverrideEntity` (`uuid` TEXT NOT NULL, `action` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `entryVersion` INTEGER NOT NULL, `entryId` TEXT, PRIMARY KEY(`uuid`))");
        boVar.c("INSERT INTO TimeLimitLocalOverrideEntity(uuid, action, timestamp, entryVersion, entryId) SELECT uuid, action, timestamp, entryVersion, entryId FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
    }
}
