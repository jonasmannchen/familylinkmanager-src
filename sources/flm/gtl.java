package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gtl implements fiy {
    UNKNOWN(0),
    PRIMES_INITIALIZED(1),
    PRIMES_CRASH_MONITORING_INITIALIZED(2),
    PRIMES_FIRST_ACTIVITY_LAUNCHED(3);

    public final int e;

    @Override // flm.fiy
    public final int a() {
        return this.e;
    }

    public static gtl a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return UNKNOWN;
            case 1:
                return PRIMES_INITIALIZED;
            case 2:
                return PRIMES_CRASH_MONITORING_INITIALIZED;
            case 3:
                return PRIMES_FIRST_ACTIVITY_LAUNCHED;
            default:
                return null;
        }
    }

    public static fiz b() {
        return gtm.a;
    }

    gtl(int i) {
        this.e = i;
    }
}
