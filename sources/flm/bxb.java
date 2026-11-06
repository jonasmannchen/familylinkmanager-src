package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxb extends cu {
    public bxb() {
        super(3, 4);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE `DeviceEventEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type` INTEGER, `timestampMillis` INTEGER, `value` BLOB)");
    }
}
