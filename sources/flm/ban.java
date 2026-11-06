package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ban {
    public boolean mCallbackDelivered = false;
    public Object mListener;
    public final /* synthetic */ bai this$0;

    public ban(bai baiVar, Object obj) {
        this.this$0 = baiVar;
        this.mListener = obj;
    }

    protected abstract void deliverCallback(Object obj);

    protected abstract void onDeliverCallbackFailed();

    public void deliverCallback() {
        Object obj;
        synchronized (this) {
            obj = this.mListener;
            if (this.mCallbackDelivered) {
                String strValueOf = String.valueOf(this);
                Log.w(bai.TAG, new StringBuilder(String.valueOf(strValueOf).length() + 47).append("Callback proxy ").append(strValueOf).append(" being reused. This is not safe.").toString());
            }
        }
        if (obj != null) {
            try {
                deliverCallback(obj);
            } catch (RuntimeException e) {
                onDeliverCallbackFailed();
                throw e;
            }
        } else {
            onDeliverCallbackFailed();
        }
        synchronized (this) {
            this.mCallbackDelivered = true;
        }
        unregister();
    }

    public void unregister() {
        removeListener();
        synchronized (this.this$0.mCallbackProxyList) {
            this.this$0.mCallbackProxyList.remove(this);
        }
    }

    public void removeListener() {
        synchronized (this) {
            this.mListener = null;
        }
    }

    boolean hasListenerForTest() {
        return this.mListener != null;
    }

    boolean isRegisteredForTest() {
        return this.this$0.mCallbackProxyList.contains(this);
    }
}
