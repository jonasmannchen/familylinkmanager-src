package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bns {
    public static dfe a = dfe.a("gms:feedback_client:enable_new_send_silent_feedback", false);
    public static dfe b;
    public static dfe c;

    static {
        dfe.a("gms:feedback_client:enable_new_start_feedback_activity", false);
        dfe.a("gms:feedback_client:enable_new_session_id_format", false);
        b = new dfg("gms:feedback_client:feedback_options_max_data_size", 102400);
        c = dfe.a("gms:feedback_client:enable_max_allowed_binder_size_check", false);
    }
}
