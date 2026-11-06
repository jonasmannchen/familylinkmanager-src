package flm;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.gms.kids.aidl.IKidsInternalService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsr extends cqx {
    public volatile boolean a;
    private final CountDownLatch b;
    private volatile IKidsInternalService c;

    public bsr() {
        super("kids");
        this.b = new CountDownLatch(1);
        this.a = false;
    }

    @Override // flm.cqx
    public final void a(IBinder iBinder) {
        this.c = IKidsInternalService.Stub.asInterface(iBinder);
        this.a = false;
        this.b.countDown();
    }

    @Override // flm.cqx
    public final synchronized void a(ComponentName componentName) {
        btv.b("KidSetup", "onServiceDisconnected: %s", componentName);
        this.a = true;
        this.c = null;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        btv.b("KidSetup", "onBindingDied: %s", componentName);
        this.a = true;
        this.c = null;
    }

    public final synchronized IKidsInternalService a() {
        if (this.a) {
            throw new bxi("Disconnected from service");
        }
        try {
            if (this.b.await(10L, TimeUnit.SECONDS)) {
            } else {
                throw new bxi("Deadline exceeded");
            }
        } catch (InterruptedException e) {
            throw new bxi("Interrupted", e);
        }
        return this.c;
    }
}
