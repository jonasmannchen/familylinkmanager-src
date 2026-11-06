package flm;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cqx implements ServiceConnection {
    private final cqt a;

    public cqx(String str) {
        cqt cqtVar;
        fpu fpuVar = cqu.b;
        if (fpuVar == null || !fpuVar.i()) {
            cqtVar = cqu.a;
        } else {
            getClass();
            cqtVar = cqu.a;
        }
        this.a = cqtVar;
    }

    public abstract void a(ComponentName componentName);

    public abstract void a(IBinder iBinder);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cqw cqwVarA = this.a.a(componentName, "onServiceConnected");
        try {
            a(iBinder);
            if (cqwVarA != null) {
                a(null, cqwVarA);
            }
        } catch (Throwable th) {
            if (cqwVarA != null) {
                a(null, cqwVarA);
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cqw cqwVarA = this.a.a(componentName, "onServiceDisconnected");
        try {
            a(componentName);
            if (cqwVarA != null) {
                a(null, cqwVarA);
            }
        } catch (Throwable th) {
            if (cqwVarA != null) {
                a(null, cqwVarA);
            }
            throw th;
        }
    }

    private static /* synthetic */ void a(Throwable th, cqw cqwVar) {
        if (th == null) {
            cqwVar.close();
            return;
        }
        try {
            cqwVar.close();
        } catch (Throwable th2) {
            ehh.a(th, th2);
        }
    }
}
