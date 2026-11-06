package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxa extends cu {
    public bxa() {
        super(2, 3);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("ALTER TABLE `PolicyEntity` RENAME TO tmp_table");
        boVar.c("CREATE TABLE `PolicyEntity` (`type` INTEGER, `subKey` TEXT, `generation` INTEGER, `version` TEXT, `status` INTEGER, `value` BLOB, PRIMARY KEY(`type`, `subKey`))");
        boVar.c("INSERT INTO PolicyEntity(type, subKey, generation, version, status, value) SELECT type, subKey, generation, version, 3, value FROM tmp_table WHERE isExpired = 1");
        boVar.c("INSERT INTO PolicyEntity(type, subKey, generation, version, status, value) SELECT type, subKey, generation, version, 2, value FROM tmp_table WHERE isExpired = 0 AND isChanged = 0");
        boVar.c("INSERT INTO PolicyEntity(type, subKey, generation, version, status, value) SELECT type, subKey, generation, version, 1, value FROM tmp_table WHERE isExpired = 0 AND isChanged = 1");
        boVar.c("DROP TABLE tmp_table");
    }
}
