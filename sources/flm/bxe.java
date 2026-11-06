package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxe extends cu {
    public bxe() {
        super(6, 7);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("ALTER TABLE `DeviceEventEntity` ADD COLUMN packageName TEXT");
        boVar.c("DELETE FROM DeviceEventEntity WHERE type IN (0,1)");
        boVar.c("UPDATE DeviceEventEntity SET type = 12 WHERE type = 2");
        boVar.c("UPDATE DeviceEventEntity SET type = 1 WHERE type = 3");
        boVar.c("UPDATE DeviceEventEntity SET type = 13 WHERE type = 4");
        boVar.c("UPDATE DeviceEventEntity SET type = 14 WHERE type = 5");
    }
}
