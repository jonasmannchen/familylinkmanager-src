package flm;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bae extends bco {
    public static final String TAG = "AbstractServiceBroker";
    public static final int[] TRANSACTION_CODE_TO_SERVICE_ID = {0, 2, 3, 21, 4, 5, 22, 6, 23, 1, 7, 24, 8, 25, 26, 27, 28, 9, 29, 10, 11, 19, 30, 31, 12, 13, 14, 15, 0, 0, 17, 32, 33, 0, 35, 36, 37, 38, 18, 0, 39, 40, 4, 41, 20, 42};
    public final AtomicReference brokerTimer;
    public final Context mContext;
    public final List mPostProcessors;
    public final List mPreProcessors;
    public final Set mServiceIds;

    public bae(Context context, int i, int... iArr) {
        this(context, true, i, iArr);
    }

    public abstract void onGetService(bbp bbpVar, bbn bbnVar);

    protected bae(Context context, boolean z, int i, int... iArr) {
        this.mPreProcessors = new ArrayList();
        this.mPostProcessors = new ArrayList();
        this.brokerTimer = new AtomicReference(div.a().b());
        this.mContext = context.getApplicationContext();
        this.mServiceIds = new rv(iArr.length + 1);
        this.mServiceIds.add(Integer.valueOf(i));
        for (int i2 : iArr) {
            this.mServiceIds.add(Integer.valueOf(i2));
        }
        if (z) {
            this.mPreProcessors.add(new bdh(this.mContext, getRequiredPermissionGroups(), getPermissionExplanations()));
            if (((Boolean) azi.a.b()).booleanValue()) {
                this.mPreProcessors.add(new bds(this.mContext));
            }
            this.mPreProcessors.add(new bdq(this.mContext));
            this.mPreProcessors.add(new bct(this.mContext));
            this.mPreProcessors.add(new bbk(this.mContext));
            bcu bcuVar = new bcu(this.mContext);
            this.mPreProcessors.add(bcuVar);
            this.mPostProcessors.add(bcuVar);
        }
    }

    @Override // flm.bcn
    public final void getService(bck bckVar, bbn bbnVar) {
        int serviceId = bbnVar.getServiceId();
        bdi.checkArgument(this.mServiceIds.contains(Integer.valueOf(serviceId)) || this.mServiceIds.contains(0), new StringBuilder(34).append("Unexpected service id: ").append(serviceId).toString());
        dme dmeVarB = div.a().b();
        verifyCallingPackage(bbnVar.getCallingPackage());
        try {
            try {
                bbe bbeVar = new bbe();
                bbp bbpVarAddPostProcessors = new bbp(bckVar, bbnVar, bbeVar).addPostProcessors(this.mPostProcessors);
                Iterator it = this.mPreProcessors.iterator();
                while (it.hasNext()) {
                    apx apxVarProcess = ((bbm) it.next()).process(bbnVar, bbeVar);
                    if (!apxVarProcess.b()) {
                        bbeVar.setResolutionBundle(getResolutionBundle(apxVarProcess.d));
                        bbpVarAddPostProcessors.onPostInitCompleteWithConnectionInfo(apxVarProcess.c, null, bbeVar);
                        div.a().a(dmeVarB, new StringBuilder(22).append(serviceId).append("-GetService").toString());
                        div.a().a((dme) this.brokerTimer.getAndSet(null), new StringBuilder(25).append(serviceId).append("-ServiceBroker").toString());
                        return;
                    }
                }
                onGetService(bbpVarAddPostProcessors, bbnVar);
                div.a().a(dmeVarB, new StringBuilder(22).append(serviceId).append("-GetService").toString());
                div.a().a((dme) this.brokerTimer.getAndSet(null), new StringBuilder(25).append(serviceId).append("-ServiceBroker").toString());
            } catch (RuntimeException e) {
                Log.e(TAG, "Getting service failed", e);
                throw e;
            }
        } catch (Throwable th) {
            div.a().a(dmeVarB, new StringBuilder(22).append(serviceId).append("-GetService").toString());
            div.a().a((dme) this.brokerTimer.getAndSet(null), new StringBuilder(25).append(serviceId).append("-ServiceBroker").toString());
            throw th;
        }
    }

    final void verifyCallingPackage(String str) {
        if (str != null) {
            bhq.a(this.mContext, str);
        }
        verifyAccessForCallingPackage(str);
    }

    public void verifyAccessForCallingPackage(String str) {
    }

    public Set getRequiredPermissionGroups() {
        return bep.c().keySet();
    }

    public Map getPermissionExplanations() {
        return null;
    }

    protected long getApiVersion() {
        return 0L;
    }

    protected Bundle getResolutionBundle(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(bai.KEY_PENDING_INTENT, pendingIntent);
        return bundle;
    }

    @Override // flm.bco
    @Deprecated
    public void validateAccount(bck bckVar, bdt bdtVar) {
        try {
            bckVar.onAccountValidationComplete(0, null);
        } catch (RuntimeException e) {
            Log.e(TAG, "Validating account failed", e);
            throw e;
        }
    }

    protected boolean isPreAuthenticated(bbn bbnVar) {
        return bbnVar.getAuthenticatedAccount() != null;
    }

    @Override // flm.bco
    public void getLegacyService(int i, bck bckVar, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        bbn requestingConnectionInfo = new bbn(TRANSACTION_CODE_TO_SERVICE_ID[i]).setClientLibraryVersion(i2).setCallingPackage(str).setClientRequestedAccount(TextUtils.isEmpty(str2) ? null : new Account(str2, "com.google")).setRequestingConnectionInfo(false);
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        bbn extraArgs = requestingConnectionInfo.setExtraArgs(bundle);
        if (strArr != null) {
            bdi.checkNotNull(strArr, "scopeStrings can't be null.");
            HashSet hashSet = new HashSet(strArr.length);
            for (String str5 : strArr) {
                if (!TextUtils.isEmpty(str5)) {
                    hashSet.add(new Scope(str5));
                }
            }
            extraArgs.setScopes(hashSet);
        }
        getService(bckVar, extraArgs);
    }
}
