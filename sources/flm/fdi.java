package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum fdi implements fiy {
    UNKNOWN_READ_MASK(0),
    INSTALLED_APP(1),
    DISPLAY_INFO(2),
    PLATFORM_INFO(3),
    CAPABILITY_INFO(4),
    DEVICE_SETTING(5),
    REACHABILITY_INFO(6),
    POLICY_SYNC_INFO(7),
    MANAGEMENT_DISCLAIMER(8);

    private final int j;

    @Override // flm.fiy
    public final int a() {
        return this.j;
    }

    public static fdi a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_READ_MASK;
            case 1:
                return INSTALLED_APP;
            case 2:
                return DISPLAY_INFO;
            case 3:
                return PLATFORM_INFO;
            case 4:
                return CAPABILITY_INFO;
            case 5:
                return DEVICE_SETTING;
            case 6:
                return REACHABILITY_INFO;
            case 7:
                return POLICY_SYNC_INFO;
            case 8:
                return MANAGEMENT_DISCLAIMER;
            default:
                return null;
        }
    }

    fdi(int i) {
        this.j = i;
    }
}
