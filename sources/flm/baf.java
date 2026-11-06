package flm;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class baf extends bce {
    public static final String TAG = "AccountAccessor";
    public Account mAccount;
    public Context mContext;
    public int mGmsCoreUid = -1;

    public static baf fromGoogleAccountName(Context context, String str) {
        return new baf(context, TextUtils.isEmpty(str) ? null : new Account(str, "com.google"));
    }

    public static Account getAccountBinderSafe(bcd bcdVar) {
        Account account = null;
        if (bcdVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = bcdVar.getAccount();
            } catch (RemoteException e) {
                Log.w(TAG, "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return account;
    }

    public baf(Context context, Account account) {
        this.mContext = context.getApplicationContext();
        this.mAccount = account;
    }

    @Override // flm.bcd
    public final Account getAccount() {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.mGmsCoreUid) {
            return this.mAccount;
        }
        if (aqx.c(this.mContext, callingUid)) {
            this.mGmsCoreUid = callingUid;
            return this.mAccount;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baf)) {
            return false;
        }
        return this.mAccount.equals(((baf) obj).mAccount);
    }
}
