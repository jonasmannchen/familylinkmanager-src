package flm;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbt implements Handler.Callback {
    public static final int SEND_ON_CONNECTED = 1;
    public static final String TAG = "GmsClientEvents";
    public final bbu mEventState;
    public final Handler mHandler;
    public final ArrayList mConnectionListeners = new ArrayList();
    public final ArrayList mConnectionListenersRemoved = new ArrayList();
    public final ArrayList mConnectionFailedListeners = new ArrayList();
    public volatile boolean mCallbacksEnabled = false;
    public final AtomicInteger mDisableCallbacksCount = new AtomicInteger(0);
    public boolean mIsProcessingConnectionCallback = false;
    public final Object mLock = new Object();

    public bbt(Looper looper, bbu bbuVar) {
        this.mEventState = bbuVar;
        this.mHandler = new cqr(looper, this);
    }

    bbt(Handler handler, bbu bbuVar) {
        this.mEventState = bbuVar;
        this.mHandler = handler;
    }

    public final void disableCallbacks() {
        this.mCallbacksEnabled = false;
        this.mDisableCallbacksCount.incrementAndGet();
    }

    public final void enableCallbacks() {
        this.mCallbacksEnabled = true;
    }

    protected final void onConnectionSuccess() {
        synchronized (this.mLock) {
            onConnectionSuccess(this.mEventState.getConnectionHint());
        }
    }

    public final void onConnectionSuccess(Bundle bundle) {
        int i = 0;
        bdi.checkState(Looper.myLooper() == this.mHandler.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.mLock) {
            bdi.checkState(!this.mIsProcessingConnectionCallback);
            this.mHandler.removeMessages(1);
            this.mIsProcessingConnectionCallback = true;
            bdi.checkState(this.mConnectionListenersRemoved.size() == 0);
            ArrayList arrayList = new ArrayList(this.mConnectionListeners);
            int i2 = this.mDisableCallbacksCount.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                atr atrVar = (atr) obj;
                if (!this.mCallbacksEnabled || !this.mEventState.isConnected() || this.mDisableCallbacksCount.get() != i2) {
                    break;
                } else if (!this.mConnectionListenersRemoved.contains(atrVar)) {
                    atrVar.a(bundle);
                }
            }
            this.mConnectionListenersRemoved.clear();
            this.mIsProcessingConnectionCallback = false;
        }
    }

    public final void onUnintentionalDisconnection(int i) {
        int i2 = 0;
        bdi.checkState(Looper.myLooper() == this.mHandler.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        synchronized (this.mLock) {
            this.mIsProcessingConnectionCallback = true;
            ArrayList arrayList = new ArrayList(this.mConnectionListeners);
            int i3 = this.mDisableCallbacksCount.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                atr atrVar = (atr) obj;
                if (!this.mCallbacksEnabled || this.mDisableCallbacksCount.get() != i3) {
                    break;
                } else if (this.mConnectionListeners.contains(atrVar)) {
                    atrVar.a(i);
                }
            }
            this.mConnectionListenersRemoved.clear();
            this.mIsProcessingConnectionCallback = false;
        }
    }

    public final void onConnectionFailure(apx apxVar) {
        int i = 0;
        bdi.checkState(Looper.myLooper() == this.mHandler.getLooper(), "onConnectionFailure must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        synchronized (this.mLock) {
            ArrayList arrayList = new ArrayList(this.mConnectionFailedListeners);
            int i2 = this.mDisableCallbacksCount.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ats atsVar = (ats) obj;
                if (this.mCallbacksEnabled && this.mDisableCallbacksCount.get() == i2) {
                    if (this.mConnectionFailedListeners.contains(atsVar)) {
                        atsVar.a(apxVar);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void registerConnectionCallbacks(atr atrVar) {
        bdi.checkNotNull(atrVar);
        synchronized (this.mLock) {
            if (this.mConnectionListeners.contains(atrVar)) {
                String strValueOf = String.valueOf(atrVar);
                Log.w(TAG, new StringBuilder(String.valueOf(strValueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(strValueOf).append(" is already registered").toString());
            } else {
                this.mConnectionListeners.add(atrVar);
            }
        }
        if (this.mEventState.isConnected()) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(1, atrVar));
        }
    }

    public final boolean isConnectionCallbacksRegistered(atr atrVar) {
        boolean zContains;
        bdi.checkNotNull(atrVar);
        synchronized (this.mLock) {
            zContains = this.mConnectionListeners.contains(atrVar);
        }
        return zContains;
    }

    public final void unregisterConnectionCallbacks(atr atrVar) {
        bdi.checkNotNull(atrVar);
        synchronized (this.mLock) {
            if (!this.mConnectionListeners.remove(atrVar)) {
                String strValueOf = String.valueOf(atrVar);
                Log.w(TAG, new StringBuilder(String.valueOf(strValueOf).length() + 52).append("unregisterConnectionCallbacks(): listener ").append(strValueOf).append(" not found").toString());
            } else if (this.mIsProcessingConnectionCallback) {
                this.mConnectionListenersRemoved.add(atrVar);
            }
        }
    }

    public final void registerConnectionFailedListener(ats atsVar) {
        bdi.checkNotNull(atsVar);
        synchronized (this.mLock) {
            if (this.mConnectionFailedListeners.contains(atsVar)) {
                String strValueOf = String.valueOf(atsVar);
                Log.w(TAG, new StringBuilder(String.valueOf(strValueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(strValueOf).append(" is already registered").toString());
            } else {
                this.mConnectionFailedListeners.add(atsVar);
            }
        }
    }

    public final boolean isConnectionFailedListenerRegistered(ats atsVar) {
        boolean zContains;
        bdi.checkNotNull(atsVar);
        synchronized (this.mLock) {
            zContains = this.mConnectionFailedListeners.contains(atsVar);
        }
        return zContains;
    }

    public final void unregisterConnectionFailedListener(ats atsVar) {
        bdi.checkNotNull(atsVar);
        synchronized (this.mLock) {
            if (!this.mConnectionFailedListeners.remove(atsVar)) {
                String strValueOf = String.valueOf(atsVar);
                Log.w(TAG, new StringBuilder(String.valueOf(strValueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(strValueOf).append(" not found").toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            atr atrVar = (atr) message.obj;
            synchronized (this.mLock) {
                if (this.mCallbacksEnabled && this.mEventState.isConnected() && this.mConnectionListeners.contains(atrVar)) {
                    atrVar.a(this.mEventState.getConnectionHint());
                }
            }
            return true;
        }
        Log.wtf(TAG, new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
        return false;
    }

    public final boolean areCallbacksEnabled() {
        return this.mCallbacksEnabled;
    }
}
