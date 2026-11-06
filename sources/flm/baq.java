package flm;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class baq implements ServiceConnection {
    public final int mDisconnectCount;
    public final /* synthetic */ bai this$0;

    public baq(bai baiVar, int i) {
        this.this$0 = baiVar;
        this.mDisconnectCount = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.this$0.triggerServiceNotAvailable(16);
            return;
        }
        synchronized (this.this$0.mServiceBrokerLock) {
            this.this$0.mServiceBroker = bco.asInterface(iBinder);
        }
        this.this$0.onPostServiceBindingHandler(0, null, this.mDisconnectCount);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.this$0.mServiceBrokerLock) {
            this.this$0.mServiceBroker = null;
        }
        this.this$0.mHandler.sendMessage(this.this$0.mHandler.obtainMessage(6, this.mDisconnectCount, 1));
    }
}
