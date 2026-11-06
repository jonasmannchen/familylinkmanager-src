package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwt extends cu {
    public bwt() {
        super(1, 2);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("DROP TABLE MetaData");
        boVar.c("DROP TABLE HideAppPolicy");
        boVar.c("CREATE TABLE `AppDisabledState` (`packageName` TEXT, `reason` INTEGER, PRIMARY KEY(`packageName`, `reason`))");
        boVar.c("CREATE TABLE `KeyValue` (`key` TEXT, `subKey` TEXT, `value` TEXT, PRIMARY KEY(`key`, `subKey`))");
        boVar.c("CREATE TABLE `PolicyEntity` (`type` INTEGER, `subKey` TEXT, `generation` INTEGER, `version` TEXT, `isExpired` INTEGER, `isChanged` INTEGER, `value` BLOB, PRIMARY KEY(`type`, `subKey`))");
    }
}
