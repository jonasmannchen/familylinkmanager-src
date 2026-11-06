package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxc extends cu {
    public bxc() {
        super(4, 5);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE `GeonotificationStateEntity` (`key` INTEGER NOT NULL, `state` BLOB NOT NULL, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE `TrackedPlace` (`familyPlaceId` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, PRIMARY KEY(`familyPlaceId`))");
        boVar.c("ALTER TABLE `AppDisabledState` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `AppDisabledState` (`packageName` TEXT, `reason` INTEGER NOT NULL, PRIMARY KEY(`packageName`, `reason`))");
        boVar.c("INSERT INTO AppDisabledState(packageName, reason) SELECT packageName, reason FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
        boVar.c("ALTER TABLE `DeviceEventEntity` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `DeviceEventEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` INTEGER NOT NULL, `timestampMillis` INTEGER NOT NULL, `value` BLOB)");
        boVar.c("INSERT INTO DeviceEventEntity(id, type, timestampMillis, value) SELECT id, type, timestampMillis, value FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
        boVar.c("ALTER TABLE `KeyValue` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `KeyValue` (`key` TEXT NOT NULL, `subKey` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `subKey`))");
        boVar.c("INSERT INTO KeyValue(key, subKey, value) SELECT key, subKey, value FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
        boVar.c("ALTER TABLE `PolicyEntity` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `PolicyEntity` (`type` INTEGER NOT NULL, `subKey` TEXT NOT NULL, `generation` INTEGER NOT NULL, `version` TEXT, `status` INTEGER NOT NULL, `value` BLOB, PRIMARY KEY(`type`, `subKey`))");
        boVar.c("INSERT INTO PolicyEntity(type, subKey, generation, version, status, value) SELECT type, subKey, generation, version, status, value FROM tmp_table");
        boVar.c("DROP TABLE tmp_table");
    }
}
