package flm;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dei extends bbq {
    private final AtomicReference a;

    public static boolean a(Context context) {
        return !context.getPackageManager().queryIntentServices(new Intent("com.google.android.gms.usagereporting.service.START").setPackage("com.google.android.gms"), 0).isEmpty();
    }

    @Override // flm.bai
    public final aqb[] getApiFeatures() {
        return ddm.a;
    }

    public dei(Context context, Looper looper, bba bbaVar, atr atrVar, ats atsVar) {
        super(context, looper, 41, bbaVar, atrVar, atsVar);
        this.a = new AtomicReference();
    }

    @Override // flm.bai, flm.ate
    public final void disconnect() {
        try {
            dem demVar = (dem) this.a.getAndSet(null);
            if (demVar != null) {
                ((dec) getService()).a(demVar, new dek());
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.disconnect();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return ded.a(iBinder);
    }
}
