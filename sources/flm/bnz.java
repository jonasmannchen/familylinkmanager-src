package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum bnz implements fiy {
    UNKNOWN(0),
    PROVIDENCE(1),
    INTENT_OPERATION(2),
    BROADCAST_RECEIVER(3),
    CONTENT_PROVIDER(4),
    ACTIVITY(5),
    SERVICE(6),
    BINDER(7),
    SYNC_ADAPTER(8),
    GCM_TASK(9),
    INTENT_SERVICE(10),
    SERVICE_CONNECTION(11),
    GCM_LISTENER(12),
    CALLBACKS(13),
    ALARM_LISTENER(14),
    CUSTOM_EVENT_LOOP(15),
    SENSOR_EVENT_LISTENER(16),
    BLE_SCAN_CALLBACK(17);

    public final int f;

    @Override // flm.fiy
    public final int a() {
        return this.f;
    }

    public static bnz a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return PROVIDENCE;
            case 2:
                return INTENT_OPERATION;
            case 3:
                return BROADCAST_RECEIVER;
            case 4:
                return CONTENT_PROVIDER;
            case 5:
                return ACTIVITY;
            case 6:
                return SERVICE;
            case 7:
                return BINDER;
            case 8:
                return SYNC_ADAPTER;
            case 9:
                return GCM_TASK;
            case 10:
                return INTENT_SERVICE;
            case 11:
                return SERVICE_CONNECTION;
            case 12:
                return GCM_LISTENER;
            case 13:
                return CALLBACKS;
            case 14:
                return ALARM_LISTENER;
            case 15:
                return CUSTOM_EVENT_LOOP;
            case 16:
                return SENSOR_EVENT_LISTENER;
            case 17:
                return BLE_SCAN_CALLBACK;
            default:
                return null;
        }
    }

    public static fiz b() {
        return boa.a;
    }

    bnz(int i) {
        this.f = i;
    }
}
