package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqe implements fqd {
    private static final drf a;
    private static final drf b;
    private static final drf c;
    private static final drf d;
    private static final drf e;
    private static final drf f;

    @Override // flm.fqd
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // flm.fqd
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // flm.fqd
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // flm.fqd
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // flm.fqd
    public final long e() {
        return ((Long) e.b()).longValue();
    }

    @Override // flm.fqd
    public final long f() {
        return ((Long) f.b()).longValue();
    }

    static {
        drn drnVarA = new drn(dre.a("com.google.android.gms.kids")).a();
        a = drnVarA.a("GellerFeature__enable_disambiguation_need_help_updates", false);
        b = drnVarA.a("GellerFeature__service_flag_latency_poll_attempts", 10L);
        c = drnVarA.a("GellerFeature__start_supervision_exit_cooldown_automatically", true);
        d = drnVarA.a("GellerFeature__start_supervision_exit_lockdown_automatically", true);
        e = drnVarA.a("GellerFeature__supervision_exit_cooldown_duration_millis", bbx.DEFAULT_BIND_TIMEOUT_MILLIS);
        f = drnVarA.a("GellerFeature__supervision_exit_lockdown_duration_millis", 86400000L);
    }
}
