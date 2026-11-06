package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxg extends cu {
    public bxg() {
        super(8, 9);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE `TimeLimitKeyValueEntity` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE `TimeLimitLocalOverrideEntity` (`uuid` TEXT, `action` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `entryVersion` INTEGER NOT NULL, `entryId` TEXT, PRIMARY KEY(`uuid`))");
    }
}
