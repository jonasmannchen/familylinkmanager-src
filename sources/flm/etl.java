package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum etl implements fiy {
    UNKNOWN_INTERACTIVE_ELEMENT_ID(0),
    USERS_INTERACT(1),
    SHARES_INFO(2),
    SHARES_LOCATION(3),
    DIGITAL_PURCHASES(4),
    UNRESTRICTED_INTERNET(5);

    private final int g;

    @Override // flm.fiy
    public final int a() {
        return this.g;
    }

    public static etl a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN_INTERACTIVE_ELEMENT_ID;
            case 1:
                return USERS_INTERACT;
            case 2:
                return SHARES_INFO;
            case 3:
                return SHARES_LOCATION;
            case 4:
                return DIGITAL_PURCHASES;
            case 5:
                return UNRESTRICTED_INTERNET;
            default:
                return null;
        }
    }

    etl(int i) {
        this.g = i;
    }
}
