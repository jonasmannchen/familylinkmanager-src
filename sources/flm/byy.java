package flm;

import com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byy implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ayt.a().startService(TimeLimitCheckingIntentOperation.a("near_future"));
    }
}
