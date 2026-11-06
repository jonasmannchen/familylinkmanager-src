package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqt implements fqs {
    private static final drf a;
    private static final drf b;

    @Override // flm.fqs
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // flm.fqs
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    static {
        drn drnVarA = new drn(dre.a("com.google.android.gms.kids")).a();
        a = drnVarA.a("gms:kids:supervision_otp_granularity_millis", 60000L);
        b = drnVarA.a("gms:kids:supervision_otp_ttl_millis", 600000L);
    }
}
