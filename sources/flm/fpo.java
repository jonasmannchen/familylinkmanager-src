package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpo implements fpn {
    private static final drf a;

    @Override // flm.fpn
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    static {
        drn drnVarA = new drn("direct_boot:gms_chimera_phenotype_flags").a("gms:common:");
        drnVarA.a("latency_tracking_enabled", false);
        drnVarA.a("RadioActivityTracking__radio_tracking_blame_radio_active_delta_millis", 1000L);
        drnVarA.a("RadioActivityTracking__radio_tracking_caching_db_writer_network_activity_event_record_buffer_size", 50L);
        drnVarA.a("RadioActivityTracking__radio_tracking_caching_db_writer_network_activity_event_timeout_millis", 60000L);
        drnVarA.a("RadioActivityTracking__radio_tracking_caching_db_writer_radio_event_record_buffer_size", 50L);
        drnVarA.a("RadioActivityTracking__radio_tracking_caching_db_writer_radio_event_timeout_millis", 60000L);
        drnVarA.a("RadioActivityTracking__radio_tracking_delete_until_millis_ago", 604800000L);
        drnVarA.a("RadioActivityTracking__radio_tracking_dump_enabled", true);
        drnVarA.a("RadioActivityTracking__radio_tracking_dump_period", 36000000L);
        a = drnVarA.a("radio_tracking_enabled", false);
        drnVarA.a("RadioActivityTracking__radio_tracking_max_num_of_events", 100L);
        drnVarA.a("RadioActivityTracking__radio_tracking_mobile_dump_enabled", true);
        drnVarA.a("RadioActivityTracking__radio_tracking_report_latency_enabled", true);
        drnVarA.a("RadioActivityTracking__radio_tracking_report_mobile_enabled", true);
        drnVarA.a("RadioActivityTracking__radio_tracking_report_wifi_enabled", true);
        drnVarA.a("RadioActivityTracking__radio_tracking_upload_all_current_data", false);
        drnVarA.a("RadioActivityTracking__radio_tracking_upload_task_period_in_seconds", 86400L);
        drnVarA.a("RadioActivityTracking__radio_tracking_wifi_dump_enabled", true);
    }
}
