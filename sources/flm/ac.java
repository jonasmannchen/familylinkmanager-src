package flm;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ac extends s {
    private final ad a = new ad();

    @Override // flm.s, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof ln) {
            ((ln) activity).b.a.d.a((lv) this.a, true);
        }
        az.a(activity);
    }

    @Override // flm.s, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity instanceof ln) {
            aa.a((ln) activity, z.CREATED);
        }
    }

    @Override // flm.s, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (activity instanceof ln) {
            aa.a((ln) activity, z.CREATED);
        }
    }
}
