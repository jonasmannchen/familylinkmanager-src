package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ark implements fiy {
    UNKNOWN(0),
    ALARM_ELAPSED_REALTIME(1),
    ALARM_ELAPSED_REALTIME_WAKEUP(2),
    ALARM_RTC(3),
    ALARM_RTC_WAKEUP(4);

    public final int a;

    @Override // flm.fiy
    public final int a() {
        return this.a;
    }

    public static ark a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return ALARM_ELAPSED_REALTIME;
            case 2:
                return ALARM_ELAPSED_REALTIME_WAKEUP;
            case 3:
                return ALARM_RTC;
            case 4:
                return ALARM_RTC_WAKEUP;
            default:
                return null;
        }
    }

    ark(int i) {
        this.a = i;
    }
}
