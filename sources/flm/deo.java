package flm;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class deo {
    private static boolean a = false;
    private static deo b;
    private final Context c;
    private ContentProviderClient d;

    public static synchronized void a() {
        b = null;
        a = false;
    }

    public static synchronized deo a(Context context) {
        deo deoVar;
        deo deoVar2 = null;
        synchronized (deo.class) {
            if (a) {
                deoVar = b;
            } else {
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(dep.a.getAuthority(), 0);
                if (providerInfoResolveContentProvider != null) {
                    if (!providerInfoResolveContentProvider.packageName.equals("com.google.android.gms")) {
                        String str = providerInfoResolveContentProvider.packageName;
                        Log.e("IAMetadataClient", new StringBuilder(String.valueOf(str).length() + 85).append("Package ").append(str).append(" is invalid for instant apps content provider; instant apps will be disabled.").toString());
                    } else {
                        ContentProviderClient contentProviderClientB = b(context);
                        if (contentProviderClientB != null) {
                            deoVar2 = new deo(context, contentProviderClientB);
                        }
                    }
                }
                b = deoVar2;
                a = true;
                deoVar = b;
            }
        }
        return deoVar;
    }

    private static ContentProviderClient b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return contentResolver.acquireUnstableContentProviderClient(dep.a);
    }

    private deo(Context context, ContentProviderClient contentProviderClient) {
        this.c = context;
        this.d = contentProviderClient;
        Collections.synchronizedMap(new HashMap());
    }

    private final synchronized ContentProviderClient a(ContentProviderClient contentProviderClient) {
        ContentProviderClient contentProviderClient2;
        if (contentProviderClient != this.d) {
            contentProviderClient2 = this.d;
        } else {
            ContentProviderClient contentProviderClientB = b(this.c);
            if (contentProviderClientB != null) {
                if (this.d != null) {
                    this.d.release();
                }
                this.d = contentProviderClientB;
                contentProviderClient2 = this.d;
            } else {
                contentProviderClient2 = null;
            }
        }
        return contentProviderClient2;
    }

    final Bundle a(String str, Bundle bundle) throws RemoteException {
        ContentProviderClient contentProviderClient;
        Bundle bundleCall;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            synchronized (this) {
                contentProviderClient = this.d;
            }
            if (contentProviderClient != null) {
                try {
                    bundleCall = contentProviderClient.call(str, null, bundle);
                } catch (DeadObjectException e) {
                    ContentProviderClient contentProviderClientA = a(contentProviderClient);
                    if (contentProviderClientA != null) {
                        bundleCall = contentProviderClientA.call(str, null, bundle);
                    } else {
                        throw e;
                    }
                }
            } else {
                bundleCall = this.c.getContentResolver().call(dep.a, str, (String) null, bundle);
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            if (bundleCall == null) {
                throw new RemoteException();
            }
            return bundleCall;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }
}
