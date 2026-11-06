package flm;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.googlecertificates.ModuleDescriptor;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aqg {
    private static volatile bcq a;
    private static final Object b = new Object();
    private static Context c;

    static synchronized void a(Context context) {
        if (c != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            c = context.getApplicationContext();
        }
    }

    static aqs a(String str, aqi aqiVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, aqiVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static aqs b(final String str, final aqi aqiVar, final boolean z, boolean z2) {
        try {
            if (a == null) {
                bdi.checkNotNull(c);
                synchronized (b) {
                    try {
                        if (a == null) {
                            a = bcr.asInterface(DynamiteModule.a(c, DynamiteModule.b, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.common.GoogleCertificatesImpl"));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            bdi.checkNotNull(c);
            try {
                if (a.isGoogleOrPlatformSigned(new aqq(str, aqiVar, z, z2), blt.a(c.getPackageManager()))) {
                    return aqs.a;
                }
                return aqs.a(new Callable(z, str, aqiVar) { // from class: flm.aqh
                    private final boolean a;
                    private final String b;
                    private final aqi c;

                    {
                        this.a = z;
                        this.b = str;
                        this.c = aqiVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = this.a;
                        String str2 = this.b;
                        aqi aqiVar2 = this.c;
                        return aqs.a(str2, aqiVar2, z3, !z3 && aqg.b(str2, aqiVar2, true, false).b);
                    }
                });
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return aqs.a("module call", e);
            }
        } catch (bmg e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String strValueOf = String.valueOf(e2.getMessage());
            return aqs.a(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e2);
        }
    }
}
