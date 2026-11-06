package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpi implements fph {
    private static final drf a;
    private static final drf b;
    private static final drf c;
    private static final drf d;
    private static final drf e;
    private static final drf f;
    private static final drf g;
    private static final drf h;
    private static final drf i;
    private static final drf j;
    private static final drf k;
    private static final drf l;
    private static final drf m;
    private static final drf n;
    private static final drf o;
    private static final drf p;
    private static final drf q;
    private static final drf r;

    @Override // flm.fph
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // flm.fph
    public final boolean b() {
        return ((Boolean) f.b()).booleanValue();
    }

    @Override // flm.fph
    public final boolean c() {
        return ((Boolean) h.b()).booleanValue();
    }

    @Override // flm.fph
    public final boolean d() {
        return ((Boolean) i.b()).booleanValue();
    }

    @Override // flm.fph
    public final long e() {
        return ((Long) j.b()).longValue();
    }

    @Override // flm.fph
    public final long f() {
        return ((Long) l.b()).longValue();
    }

    @Override // flm.fph
    public final long g() {
        return ((Long) m.b()).longValue();
    }

    @Override // flm.fph
    public final long h() {
        return ((Long) n.b()).longValue();
    }

    @Override // flm.fph
    public final long i() {
        return ((Long) o.b()).longValue();
    }

    @Override // flm.fph
    public final long j() {
        return ((Long) p.b()).longValue();
    }

    @Override // flm.fph
    public final double k() {
        return ((Double) q.b()).doubleValue();
    }

    @Override // flm.fph
    public final boolean l() {
        return ((Boolean) r.b()).booleanValue();
    }

    static {
        drn drnVarA = new drn("direct_boot:gms_chimera_phenotype_flags").a();
        a = drnVarA.a("Primes__enable_primes", true);
        b = drnVarA.a("Primes__enable_primes_memory", false);
        c = drnVarA.a("Primes__enable_primes_memory_leak_count", false);
        d = drnVarA.a("Primes__enable_primes_memory_leak_heap_dump", false);
        e = drnVarA.a("Primes__enable_primes_network", false);
        f = drnVarA.a("Primes__enable_primes_package", false);
        g = drnVarA.a("Primes__enable_primes_profiling", false);
        h = drnVarA.a("Primes__enable_primes_timer", false);
        i = drnVarA.a("Primes__enable_primes_tracing", false);
        drnVarA.a("latency_service_whitelist", "*");
        j = drnVarA.a("Primes__max_event_proto_bytes", 5120L);
        k = drnVarA.a("Primes__memory_sample_rate_per_second", 3L);
        drnVarA.a("Primes__memory_timer", 30000L);
        l = drnVarA.a("Primes__throttler_initial_events", 2L);
        m = drnVarA.a("Primes__throttler_interval_seconds", 86400L);
        n = drnVarA.a("Primes__throttler_max_bank_events", 25L);
        o = drnVarA.a("Primes__timer_sample_rate_per_second", 10L);
        p = drnVarA.a("Primes__tracing_sample_rate_per_second", 10L);
        drnVarA.a("Primes__tracing_sample_rate_per_thousand", 0L);
        q = drnVarA.a("Primes__tracing_sampling_probability", 0.0d);
        drnVarA.a("Primes__upload_interval_millis", 86400000L);
        r = drnVarA.a("Primes__use_unmetered_network_only", false);
    }
}
