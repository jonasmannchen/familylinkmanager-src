package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfv {
    public static final drn a;
    public static final drf b;
    public static final drf c;

    static {
        drn drnVarA = new drn("direct_boot:gms_chimera_phenotype_flags").a("gms:common:");
        a = drnVarA;
        drf.a(drnVarA, "upload_internal_stats_interval", 0L);
        drf.a(a, "upload_network_stats_interval", 0L);
        drf.a(a, "stats:max_num_of_events", 100);
        drf.a(a, "stats:max_chunk_size", 100);
        b = drf.a(a, "stats:writer:timeout_millis", 60000L);
        c = drf.a(a, "stats:writer:buffer_size", 20480);
        drf.a(a, "stats:allow_non_googler_upload", false);
        drf.a(a, "stats:enable_event_tracker_in_modulefood", false);
    }
}
