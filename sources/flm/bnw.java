package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum bnw implements fiy {
    STATE_NONE(0),
    STATE_POWER_CONNECTED(1),
    STATE_INTERACTIVE(2),
    STATE_UNINITIALIZED(7),
    STATE_BATTERY_LOW(8),
    STATE_DEVICE_IDLE_MODE(16),
    STATE_POWER_SAVE_MODE(32);

    public final int g;

    @Override // flm.fiy
    public final int a() {
        return this.g;
    }

    bnw(int i2) {
        this.g = i2;
    }
}
