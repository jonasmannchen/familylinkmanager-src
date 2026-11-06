package flm;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bap extends bcl {
    public final int mDisconnectCount;
    public bai mGmsClient;

    public bap(bai baiVar, int i) {
        this.mGmsClient = baiVar;
        this.mDisconnectCount = i;
    }

    @Override // flm.bck
    public final void onAccountValidationComplete(int i, Bundle bundle) {
        Log.wtf(bai.TAG, "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // flm.bck
    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
        bdi.checkNotNull(this.mGmsClient, "onPostInitComplete can be called only once per call to getRemoteService");
        this.mGmsClient.onPostInitHandler(i, iBinder, bundle, this.mDisconnectCount);
        onCallbackComplete();
    }

    private final void onCallbackComplete() {
        this.mGmsClient = null;
    }

    @Override // flm.bck
    public final void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, bbe bbeVar) {
        bdi.checkNotNull(this.mGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        bdi.checkNotNull(bbeVar);
        this.mGmsClient.setConnectionInfo(bbeVar);
        onPostInitComplete(i, iBinder, bbeVar.getResolutionBundle());
    }
}
