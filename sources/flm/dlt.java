package flm;

import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dlt implements dmb {
    private final /* synthetic */ Application a;

    dlt(Application application) {
        this.a = application;
    }

    @Override // flm.dmb
    public final /* synthetic */ Object a() {
        dkm.a(3, "ScenarioSamplingMetricService", "Measuring total pss", new Object[0]);
        return Long.valueOf(dpg.a(this.a));
    }
}
