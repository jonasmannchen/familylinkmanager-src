package flm;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzj extends AsyncTaskLoader {
    private boolean a;

    bzj(Context context) {
        super(context);
    }

    protected final void onStartLoading() {
        super.onStartLoading();
        if (!this.a) {
            this.a = true;
            forceLoad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0033 */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Void loadInBackground() {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            flm.bsr r1 = flm.bsq.a(r0)
            com.google.android.gms.kids.aidl.IKidsInternalService r0 = r1.a()     // Catch: android.os.RemoteException -> L20 java.lang.Throwable -> L33 flm.bxi -> L3c
            r2 = 0
            r0.setMemberSvExitState(r2)     // Catch: android.os.RemoteException -> L20 java.lang.Throwable -> L33 flm.bxi -> L3c
            java.lang.String r2 = "com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation"
            java.lang.String r3 = "com.google.android.gms.kids.features.timelimit.ACTION_CHECK"
            r0.startService(r2, r3)     // Catch: android.os.RemoteException -> L20 java.lang.Throwable -> L33 flm.bxi -> L3c
            android.content.Context r0 = r5.getContext()
            flm.bsq.a(r0, r1)
        L1e:
            r0 = 0
            return r0
        L20:
            r0 = move-exception
        L21:
            java.lang.String r2 = "MemberSpvsn"
            java.lang.String r3 = "Error starting check intent"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L33
            flm.btv.c(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L33
            android.content.Context r0 = r5.getContext()
            flm.bsq.a(r0, r1)
            goto L1e
        L33:
            r0 = move-exception
            android.content.Context r2 = r5.getContext()
            flm.bsq.a(r2, r1)
            throw r0
        L3c:
            r0 = move-exception
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.bzj.loadInBackground():java.lang.Void");
    }
}
