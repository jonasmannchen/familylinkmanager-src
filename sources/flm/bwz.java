package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwz extends cu {
    public bwz() {
        super(15, 16);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("UPDATE TimeLimitLocalOverrideEntity SET entryId = \"\" WHERE entryId IS NULL");
        boVar.c("ALTER TABLE `TimeLimitLocalOverrideEntity` RENAME TO tmp_table");
        boVar.c("CREATE TABLE IF NOT EXISTS `TimeLimitLocalOverrideEntity` (`uuid` TEXT NOT NULL, `action` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `entryVersion` INTEGER NOT NULL, `entryId` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
        boVar.c("INSERT INTO TimeLimitLocalOverrideEntity(uuid, action, timestamp, entryVersion, entryId) SELECT uuid, action, timestamp, entryVersion, entryId FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
    }
}
