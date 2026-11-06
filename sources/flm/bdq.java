package flm;

import android.accounts.Account;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdq implements bbm {
    public static final String TAG = "SidewinderPreProcessor";
    public final Context mContext;

    public bdq(Context context) {
        this.mContext = context;
    }

    @Override // flm.bbm
    public final apx process(bbn bbnVar, bbe bbeVar) {
        Account authenticatedAccount = bbnVar.getAuthenticatedAccount();
        if (authenticatedAccount == null) {
            authenticatedAccount = bbnVar.getClientRequestedAccount();
        }
        return bdp.shouldBlock(this.mContext, bbnVar.getServiceId(), authenticatedAccount) ? new apx(16) : apx.a;
    }
}
