package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bbv {
    public static final int DEFAULT_BIND_FLAGS = 129;
    public static bbv sInstance;
    public static final Object sSingletonLock = new Object();

    protected abstract boolean bindService(bbw bbwVar, ServiceConnection serviceConnection, String str);

    public abstract void resetForTesting();

    protected abstract void unbindService(bbw bbwVar, ServiceConnection serviceConnection, String str);

    public static bbv getInstance(Context context) {
        synchronized (sSingletonLock) {
            if (sInstance == null) {
                sInstance = new bbx(context.getApplicationContext());
            }
        }
        return sInstance;
    }

    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return bindService(new bbw(str, DEFAULT_BIND_FLAGS), serviceConnection, str2);
    }

    public boolean bindService(String str, String str2, ServiceConnection serviceConnection, String str3) {
        return bindService(str, str2, DEFAULT_BIND_FLAGS, serviceConnection, str3);
    }

    public boolean bindService(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        return bindService(new bbw(str, str2, i), serviceConnection, str3);
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return bindService(new bbw(componentName, DEFAULT_BIND_FLAGS), serviceConnection, str);
    }

    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        unbindService(new bbw(str, DEFAULT_BIND_FLAGS), serviceConnection, str2);
    }

    public void unbindService(String str, String str2, ServiceConnection serviceConnection, String str3) {
        unbindService(str, str2, DEFAULT_BIND_FLAGS, serviceConnection, str3);
    }

    public void unbindService(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        unbindService(new bbw(str, str2, i), serviceConnection, str3);
    }

    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        unbindService(new bbw(componentName, DEFAULT_BIND_FLAGS), serviceConnection, str);
    }
}
