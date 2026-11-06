package flm;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cws extends bbq {
    private static volatile Bundle d;
    private static volatile Bundle e;
    private final String a;
    private final String b;
    private final HashMap c;

    public cws(Context context, Looper looper, atr atrVar, ats atsVar, String str, bba bbaVar) {
        super(context.getApplicationContext(), looper, 5, bbaVar, atrVar, atsVar);
        this.c = new HashMap();
        new HashMap();
        this.a = str;
        this.b = bbaVar.getRealClientPackageName();
    }

    @Override // flm.bai
    public final aqb[] getApiFeatures() {
        return cuw.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return "com.google.android.gms.people.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.b);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            a(bundle.getBundle("post_init_configuration"));
        }
        super.onPostInitHandler(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    @Override // flm.bai, flm.ate
    public final void disconnect() {
        synchronized (this.c) {
            try {
                if (isConnected()) {
                    for (cwt cwtVar : this.c.values()) {
                        cwt.q();
                        try {
                            ((cwm) super.getService()).a(cwtVar, false, null, null, 0);
                        } catch (RemoteException e2) {
                            Log.w("PeopleClient", "Failed to unregister listener", e2);
                        } catch (IllegalStateException e3) {
                            Log.w("PeopleClient", "PeopleService is in unexpected state", e3);
                        }
                    }
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        super.disconnect();
    }

    private final synchronized void a(Bundle bundle) {
        if (bundle != null) {
            cwy.a = bundle.getBoolean("use_contactables_api", true);
            cys.a.a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
            d = bundle.getBundle("config.email_type_map");
            e = bundle.getBundle("config.phone_type_map");
        }
    }

    static Status a(int i, String str, Bundle bundle) {
        PendingIntent pendingIntent;
        if (bundle == null) {
            pendingIntent = null;
        } else {
            pendingIntent = (PendingIntent) bundle.getParcelable(bai.KEY_PENDING_INTENT);
        }
        return new Status(i, str, pendingIntent);
    }

    public final void a(auw auwVar, boolean z, boolean z2, String str, String str2, int i) {
        super.checkConnected();
        cwu cwuVar = new cwu(auwVar);
        try {
            ((cwm) super.getService()).a(cwuVar, false, z2, null, null, i);
        } catch (RemoteException e2) {
            cwuVar.a(8, null, null);
        }
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return cwn.a(iBinder);
    }
}
