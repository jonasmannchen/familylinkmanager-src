package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsb {
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");
    public volatile bsd a;
    private final bbv d;
    private Context g;
    public CountDownLatch b = new CountDownLatch(1);
    private int f = 0;
    private boolean h = false;
    private ServiceConnection e = new bsc(this);

    public bsb(Context context) {
        this.g = context;
        this.d = bbv.getInstance(this.g);
    }

    public final Bundle a(String str) {
        Bundle bundleA = null;
        try {
            if (!a()) {
                b();
            } else {
                if (this.a == null && Looper.getMainLooper().getThread() != Thread.currentThread() && !this.b.await(500L, TimeUnit.MILLISECONDS)) {
                    Log.w("GoogleHttpServiceClient", "Timeout on service connection", new Throwable());
                    this.b.countDown();
                }
                bundleA = this.a != null ? this.a.a(str) : null;
            }
        } catch (RemoteException e) {
            Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", e);
        } catch (InterruptedException e2) {
            String strValueOf = String.valueOf(e2);
            Log.w("GoogleHttpServiceClient", new StringBuilder(String.valueOf(strValueOf).length() + 32).append("Interrupted waiting for binder: ").append(strValueOf).toString());
        } finally {
            b();
        }
        return bundleA;
    }

    private final synchronized boolean a() {
        int i = this.f;
        this.f = i + 1;
        if (i == 0) {
            this.h = this.d.bindService(c, this.e, "GoogleHttpServiceClient");
        }
        return this.h;
    }

    private final synchronized void b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            this.d.unbindService(c, this.e, "GoogleHttpServiceClient");
        }
    }
}
