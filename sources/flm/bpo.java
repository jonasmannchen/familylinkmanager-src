package flm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.GmsTracer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bpo extends BroadcastReceiver {
    private final GmsTracer a;

    public bpo(Context context) {
        this.a = a() ? new GmsTracer(context, getClass(), bnz.BROADCAST_RECEIVER) : null;
    }

    public abstract void a(Context context, Intent intent);

    public bpo(String str) {
        this.a = a() ? new GmsTracer(getClass(), bnz.BROADCAST_RECEIVER, str) : null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cqw cqwVarA = GmsTracer.a(this.a, "onReceive");
        try {
            a(context, intent);
            if (cqwVarA != null) {
                cqwVarA.close();
            }
        } catch (Throwable th) {
            if (cqwVarA != null) {
                if (0 != 0) {
                    try {
                        cqwVarA.close();
                    } catch (Throwable th2) {
                        ehh.a((Throwable) null, th2);
                    }
                } else {
                    cqwVarA.close();
                }
            }
            throw th;
        }
    }

    private static boolean a() {
        return bif.a() && ((fpu) fpt.a.a()).j();
    }
}
