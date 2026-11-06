package flm;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ax extends s {
    private final /* synthetic */ au a;

    public ax(au auVar) {
        this.a = auVar;
    }

    @Override // flm.s, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ((az) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.a.h;
    }

    @Override // flm.s, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        au auVar = this.a;
        auVar.b--;
        if (auVar.b == 0) {
            auVar.e.postDelayed(auVar.g, 700L);
        }
    }

    @Override // flm.s, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        au auVar = this.a;
        auVar.a--;
        auVar.a();
    }
}
