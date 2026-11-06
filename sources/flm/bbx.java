package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bbx extends bbv implements Handler.Callback {
    public static final boolean DEBUG = false;
    public static final long DEFAULT_BIND_TIMEOUT_MILLIS = 300000;
    public static final long DEFAULT_UNBIND_DELAY_MILLIS = 5000;
    public static final int LOG_WTF_CLIENTS_PER_CONNECTION_THRESHOLD = 100;
    public static final int LOG_WTF_CONNECTIONS_THRESHOLD = 200;
    public static final int MSG_TIMEOUT_BIND = 1;
    public static final int MSG_UNBIND_SERVICE = 0;
    public static final int STATE_SERVICE_CONNECTED = 1;
    public static final int STATE_SERVICE_CONNECTING = 3;
    public static final int STATE_SERVICE_DISCONNECTED = 2;
    public static final String TAG = "GmsClientSupervisor";
    public final Context mApplicationContext;
    public final long mBindTimeoutMillis;
    public final HashMap mConnectionStatus;
    public final bfu mConnectionTracker;
    public final Handler mHandler;
    public final long mUnbindDelayMillis;

    bbx(Context context) {
        this.mConnectionStatus = new HashMap();
        this.mApplicationContext = context.getApplicationContext();
        this.mHandler = new cqr(context.getMainLooper(), this);
        this.mConnectionTracker = bfu.a();
        this.mUnbindDelayMillis = DEFAULT_UNBIND_DELAY_MILLIS;
        this.mBindTimeoutMillis = DEFAULT_BIND_TIMEOUT_MILLIS;
    }

    bbx(Context context, bfu bfuVar, long j, long j2) {
        this.mConnectionStatus = new HashMap();
        this.mApplicationContext = context.getApplicationContext();
        this.mHandler = new cqr(context.getMainLooper(), this);
        this.mConnectionTracker = bfuVar;
        this.mUnbindDelayMillis = j;
        this.mBindTimeoutMillis = j2;
    }

    @Override // flm.bbv
    protected final boolean bindService(bbw bbwVar, ServiceConnection serviceConnection, String str) {
        boolean zIsBound;
        bdi.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.mConnectionStatus) {
            bby bbyVar = (bby) this.mConnectionStatus.get(bbwVar);
            if (bbyVar == null) {
                bbyVar = new bby(this, bbwVar);
                bbyVar.addServiceConnection(serviceConnection, str);
                bbyVar.bindService(str);
                this.mConnectionStatus.put(bbwVar, bbyVar);
                if (this.mConnectionStatus.size() > 200) {
                    String strValueOf = String.valueOf(bbwVar);
                    Log.wtf(TAG, new StringBuilder(String.valueOf(strValueOf).length() + 51).append("Adding ").append(strValueOf).append(", and there are now ").append(this.mConnectionStatus.size()).append(" connections.").toString(), new Exception());
                }
            } else {
                this.mHandler.removeMessages(0, bbwVar);
                if (bbyVar.containsGmsServiceConnection(serviceConnection)) {
                    String strValueOf2 = String.valueOf(bbwVar);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf2).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(strValueOf2).toString());
                }
                bbyVar.addServiceConnection(serviceConnection, str);
                switch (bbyVar.getState()) {
                    case 1:
                        serviceConnection.onServiceConnected(bbyVar.getComponentName(), bbyVar.getBinder());
                        break;
                    case 2:
                        bbyVar.bindService(str);
                        break;
                }
            }
            if (bbyVar.getNumGmsServiceConnections() > 100) {
                int numGmsServiceConnections = bbyVar.getNumGmsServiceConnections();
                String strValueOf3 = String.valueOf(bbwVar);
                Log.wtf(TAG, new StringBuilder(String.valueOf(strValueOf3).length() + 41).append("There are").append(numGmsServiceConnections).append(" clients for service ").append(strValueOf3).toString(), new Exception());
            }
            zIsBound = bbyVar.isBound();
        }
        return zIsBound;
    }

    @Override // flm.bbv
    protected final void unbindService(bbw bbwVar, ServiceConnection serviceConnection, String str) {
        bdi.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.mConnectionStatus) {
            bby bbyVar = (bby) this.mConnectionStatus.get(bbwVar);
            if (bbyVar == null) {
                String strValueOf = String.valueOf(bbwVar);
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 50).append("Nonexistent connection status for service config: ").append(strValueOf).toString());
            }
            if (!bbyVar.containsGmsServiceConnection(serviceConnection)) {
                String strValueOf2 = String.valueOf(bbwVar);
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf2).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(strValueOf2).toString());
            }
            bbyVar.removeServiceConnection(serviceConnection, str);
            if (bbyVar.hasNoGmsServiceConnections()) {
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, bbwVar), this.mUnbindDelayMillis);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case MSG_UNBIND_SERVICE /* 0 */:
                synchronized (this.mConnectionStatus) {
                    bbw bbwVar = (bbw) message.obj;
                    bby bbyVar = (bby) this.mConnectionStatus.get(bbwVar);
                    if (bbyVar != null && bbyVar.hasNoGmsServiceConnections()) {
                        if (bbyVar.isBound()) {
                            bbyVar.unbindService(TAG);
                        }
                        this.mConnectionStatus.remove(bbwVar);
                    }
                    break;
                }
                return true;
            case 1:
                synchronized (this.mConnectionStatus) {
                    bbw bbwVar2 = (bbw) message.obj;
                    bby bbyVar2 = (bby) this.mConnectionStatus.get(bbwVar2);
                    if (bbyVar2 != null && bbyVar2.getState() == 3) {
                        String strValueOf = String.valueOf(bbwVar2);
                        Log.e(TAG, new StringBuilder(String.valueOf(strValueOf).length() + 47).append("Timeout waiting for ServiceConnection callback ").append(strValueOf).toString(), new Exception());
                        ComponentName componentName = bbyVar2.getComponentName();
                        if (componentName == null) {
                            componentName = bbwVar2.getComponentName();
                        }
                        bbyVar2.onServiceDisconnected(componentName == null ? new ComponentName(bbwVar2.getPackage(), "unknown") : componentName);
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }

    public final int getClientCountForTesting(String str, String str2, int i) {
        int size;
        synchronized (this.mConnectionStatus) {
            bby bbyVar = (bby) this.mConnectionStatus.get(new bbw(str, str2, i));
            size = bbyVar == null ? 0 : bbyVar.mClientConnections.size();
        }
        return size;
    }

    public final int getClientCountForTesting() {
        int size;
        synchronized (this.mConnectionStatus) {
            size = 0;
            for (bby bbyVar : this.mConnectionStatus.values()) {
                size = (bbyVar == null ? 0 : bbyVar.mClientConnections.size()) + size;
            }
        }
        return size;
    }

    public final int getServiceCountForTesting() {
        int size;
        synchronized (this.mConnectionStatus) {
            size = this.mConnectionStatus.size();
        }
        return size;
    }

    public final boolean isServiceConnectionCached(String str, String str2, int i) {
        boolean z;
        synchronized (this.mConnectionStatus) {
            z = this.mConnectionStatus.get(new bbw(str, str2, i)) != null;
        }
        return z;
    }

    @Override // flm.bbv
    public final void resetForTesting() {
        synchronized (this.mConnectionStatus) {
            for (bby bbyVar : this.mConnectionStatus.values()) {
                this.mHandler.removeMessages(0, bbyVar.mConfig);
                if (bbyVar.isBound()) {
                    bbyVar.unbindService(TAG);
                }
            }
            this.mConnectionStatus.clear();
        }
    }

    final Handler getHandlerForTesting() {
        return this.mHandler;
    }
}
