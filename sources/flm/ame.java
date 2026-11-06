package flm;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ame {
    private final Context a;

    public ame(Context context) {
        this.a = context.getApplicationContext();
    }

    public final String a(String str) throws alt {
        bdi.checkNotMainThread("Calling this from your main thread can crash your app");
        bdi.checkNotNull(str, "Package name cannot be null!");
        try {
            aqx.b(this.a, 12451000);
            return (String) a(new amf(str));
        } catch (aqu e) {
            throw new alt(e);
        } catch (aqv e2) {
            throw new alt(e2);
        }
    }

    private final Object a(amg amgVar) throws IOException {
        for (int i = 1; i <= 2; i++) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                aps apsVar = new aps();
                bbv bbvVar = bbv.getInstance(this.a);
                try {
                    if (bbvVar.bindService("com.google.android.gms.auth.APP_CERT", apsVar, "AppCertServiceClient")) {
                        try {
                            Object objA = amgVar.a(ami.a(apsVar.a()));
                            bbvVar.unbindService("com.google.android.gms.auth.APP_CERT", apsVar, "AppCertServiceClient");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            return objA;
                        } catch (RemoteException e) {
                            Log.w("AppCertServiceClient", "RemoteException when executing call!", e);
                            throw new IOException("remote exception");
                        } catch (InterruptedException e2) {
                            if (i < 2) {
                                bbvVar.unbindService("com.google.android.gms.auth.APP_CERT", apsVar, "AppCertServiceClient");
                                Binder.restoreCallingIdentity(jClearCallingIdentity);
                            } else {
                                Thread.currentThread().interrupt();
                                String strValueOf = String.valueOf(e2);
                                Log.w("AppCertServiceClient", new StringBuilder(String.valueOf(strValueOf).length() + 34).append("Interrupted when getting service: ").append(strValueOf).toString());
                                throw new alt("Interrupted");
                            }
                        }
                    } else {
                        throw new IOException("Could not bind to service with the given context.");
                    }
                } catch (Throwable th) {
                    bbvVar.unbindService("com.google.android.gms.auth.APP_CERT", apsVar, "AppCertServiceClient");
                    throw th;
                }
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        }
        throw new IOException("all retry attempts fail");
    }
}
