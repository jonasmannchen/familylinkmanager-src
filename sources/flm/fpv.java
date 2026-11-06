package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpv implements fpu {
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
    private static final drf s;
    private static final drf t;
    private static final drf u;

    @Override // flm.fpu
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // flm.fpu
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // flm.fpu
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean e() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean f() {
        return ((Boolean) f.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean g() {
        return ((Boolean) g.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean h() {
        return ((Boolean) h.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean i() {
        return ((Boolean) i.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean j() {
        return ((Boolean) j.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean k() {
        return ((Boolean) k.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean l() {
        return ((Boolean) l.b()).booleanValue();
    }

    @Override // flm.fpu
    public final long m() {
        return ((Long) m.b()).longValue();
    }

    @Override // flm.fpu
    public final long n() {
        return ((Long) n.b()).longValue();
    }

    @Override // flm.fpu
    public final boolean o() {
        return ((Boolean) o.b()).booleanValue();
    }

    @Override // flm.fpu
    public final long p() {
        return ((Long) p.b()).longValue();
    }

    @Override // flm.fpu
    public final boolean q() {
        return ((Boolean) q.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean r() {
        return ((Boolean) r.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean s() {
        return ((Boolean) s.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean t() {
        return ((Boolean) t.b()).booleanValue();
    }

    @Override // flm.fpu
    public final boolean u() {
        return ((Boolean) u.b()).booleanValue();
    }

    static {
        drn drnVar = new drn("direct_boot:gms_chimera_phenotype_flags");
        a = drnVar.a("Tracing__aggregates_period_seconds", 600L);
        b = drnVar.a("Tracing__cpu_sample_rate_per_thousand", 0L);
        c = drnVar.a("Tracing__create_root_traces_on_punch_clock_handler", false);
        d = drnVar.a("Tracing__create_root_traces_on_scheduled_executor", false);
        drnVar.a("Tracing__enable_activity_tracing", false);
        e = drnVar.a("Tracing__enable_aggregates_logging", false);
        drnVar.a("Tracing__enable_alarm_fired", false);
        drnVar.a("Tracing__enable_binder_tracing", false);
        drnVar.a("Tracing__enable_binder_wrapper_tracing", false);
        drnVar.a("Tracing__enable_bound_service_tracing", false);
        drnVar.a("Tracing__enable_broadcast_receiver_tracing", false);
        f = drnVar.a("Tracing__enable_calling_force_aggregates_logging", true);
        drnVar.a("Tracing__enable_content_provider_tracing", false);
        drnVar.a("Tracing__enable_google_api_client_callbacks", false);
        drnVar.a("Tracing__enable_intent_operation_tracing", false);
        drnVar.a("Tracing__enable_intent_service_tracing", false);
        drnVar.a("Tracing__enable_punch_clock_handler", false);
        g = drnVar.a("Tracing__enable_punch_clock_handler_stash_bundle", false);
        h = drnVar.a("Tracing__enable_punch_clock_handler_stash_obj", false);
        drnVar.a("Tracing__enable_punch_clock_threads", false);
        i = drnVar.a("Tracing__enable_punch_clock_tracer", false);
        j = drnVar.a("Tracing__enable_runtime_receiver_tracing", false);
        drnVar.a("Tracing__enable_scan_callback_tracing", false);
        drnVar.a("Tracing__enable_sensor_event_listener_tracing", false);
        drnVar.a("Tracing__enable_service_tracing", false);
        drnVar.a("Tracing__enable_sync_adapter_tracing", false);
        k = drnVar.a("Tracing__enable_tracing", false);
        drnVar.a("Tracing__enable_transaction_interceptor", true);
        l = drnVar.a("Tracing__expensive_trace_logging", false);
        m = drnVar.a("Tracing__expensive_trace_warn_count", 1000L);
        n = drnVar.a("Tracing__expensive_trace_warn_cpu_ms", 10000L);
        o = drnVar.a("Tracing__log_missing_traces", false);
        p = drnVar.a("Tracing__min_schedule_time_for_new_trace_ms", 1000L);
        q = drnVar.a("Tracing__monitor_device_state", false);
        r = drnVar.a("Tracing__populate_gcore_dimensions", true);
        s = drnVar.a("Tracing__propagate_traces_on_global_thread_pool", false);
        t = drnVar.a("Tracing__propagate_traces_on_scheduled_executor", false);
        u = drnVar.a("Tracing__reserve_phantom_thread", false);
        drnVar.a("Tracing__skip_log_operation", true);
        drnVar.a("Tracing__suppress_chatty_binder_traces", false);
        drnVar.a("Tracing__trace_tron_reader", false);
    }
}
