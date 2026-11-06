package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bby implements ServiceConnection {
    public IBinder mBinder;
    public ComponentName mComponentName;
    public final bbw mConfig;
    public boolean mIsBound;
    public final /* synthetic */ bbx this$0;
    public final Set mClientConnections = new HashSet();
    public int mState = 2;

    public bby(bbx bbxVar, bbw bbwVar) {
        this.this$0 = bbxVar;
        this.mConfig = bbwVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.this$0.mConnectionStatus) {
            this.this$0.mHandler.removeMessages(1, this.mConfig);
            this.mBinder = iBinder;
            this.mComponentName = componentName;
            Iterator it = this.mClientConnections.iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.mState = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.this$0.mConnectionStatus) {
            this.this$0.mHandler.removeMessages(1, this.mConfig);
            this.mBinder = null;
            this.mComponentName = componentName;
            Iterator it = this.mClientConnections.iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.mState = 2;
        }
    }

    public final void bindService(String str) {
        boolean z;
        this.mState = 3;
        bfu bfuVar = this.this$0.mConnectionTracker;
        Context context = this.this$0.mApplicationContext;
        Intent startServiceIntent = this.mConfig.getStartServiceIntent(this.this$0.mApplicationContext);
        int bindFlags = this.mConfig.getBindFlags();
        if (bfu.a(context, startServiceIntent)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            z = false;
        } else {
            boolean zBindService = context.bindService(startServiceIntent, this, bindFlags);
            if (bfu.a && zBindService) {
                bfuVar.a(context, bfu.a(this), str, startServiceIntent, 2);
            }
            z = zBindService;
        }
        this.mIsBound = z;
        if (!this.mIsBound) {
            this.mState = 2;
            try {
                this.this$0.mConnectionTracker.a(this.this$0.mApplicationContext, this);
            } catch (IllegalArgumentException e) {
            }
        } else {
            this.this$0.mHandler.sendMessageDelayed(this.this$0.mHandler.obtainMessage(1, this.mConfig), this.this$0.mBindTimeoutMillis);
        }
    }

    public final void unbindService(String str) {
        this.this$0.mHandler.removeMessages(1, this.mConfig);
        this.this$0.mConnectionTracker.a(this.this$0.mApplicationContext, this);
        this.mIsBound = false;
        this.mState = 2;
    }

    public final void addServiceConnection(ServiceConnection serviceConnection, String str) {
        bfu bfuVar = this.this$0.mConnectionTracker;
        Context context = this.this$0.mApplicationContext;
        Intent startServiceIntent = this.mConfig.getStartServiceIntent(this.this$0.mApplicationContext);
        if (bfu.a) {
            bfuVar.a(context, bfu.a(serviceConnection), str, startServiceIntent, 3);
        }
        this.mClientConnections.add(serviceConnection);
    }

    public final void removeServiceConnection(ServiceConnection serviceConnection, String str) {
        bfu bfuVar = this.this$0.mConnectionTracker;
        Context context = this.this$0.mApplicationContext;
        if (bfu.a) {
            bfuVar.a(context, bfu.a(serviceConnection), null, null, 4);
        }
        this.mClientConnections.remove(serviceConnection);
    }

    public final boolean isBound() {
        return this.mIsBound;
    }

    public final int getState() {
        return this.mState;
    }

    public final boolean containsGmsServiceConnection(ServiceConnection serviceConnection) {
        return this.mClientConnections.contains(serviceConnection);
    }

    public final boolean hasNoGmsServiceConnections() {
        return this.mClientConnections.isEmpty();
    }

    public final int getNumGmsServiceConnections() {
        return this.mClientConnections.size();
    }

    public final IBinder getBinder() {
        return this.mBinder;
    }

    public final ComponentName getComponentName() {
        return this.mComponentName;
    }
}
