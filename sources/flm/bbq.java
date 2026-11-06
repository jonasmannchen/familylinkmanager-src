package flm;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bbq extends bai implements ate, bbu {
    public final Account mAccount;
    public final bba mClientSettings;
    public final Set mScopes;

    protected bbq(Context context, Handler handler, int i, bba bbaVar) {
        this(context, handler, bbv.getInstance(context), aqd.a, i, bbaVar, (atr) null, (ats) null);
    }

    public bbq(Context context, Looper looper, int i, bba bbaVar, atr atrVar, ats atsVar) {
        this(context, looper, bbv.getInstance(context), aqd.a, i, bbaVar, (atr) bdi.checkNotNull(atrVar), (ats) bdi.checkNotNull(atsVar));
    }

    protected bbq(Context context, Looper looper, int i, bba bbaVar) {
        this(context, looper, bbv.getInstance(context), aqd.a, i, bbaVar, (atr) null, (ats) null);
    }

    protected bbq(Context context, Looper looper, bbv bbvVar, aqd aqdVar, int i, bba bbaVar, atr atrVar, ats atsVar) {
        super(context, looper, bbvVar, aqdVar, i, wrapCallbacks(atrVar), wrapCallbacks(atsVar), bbaVar.getRealClientClassName());
        this.mClientSettings = bbaVar;
        this.mAccount = bbaVar.getAccount();
        this.mScopes = validateScopesDisallowingExpansion(bbaVar.getAllRequestedScopes());
    }

    protected bbq(Context context, Handler handler, bbv bbvVar, aqd aqdVar, int i, bba bbaVar, atr atrVar, ats atsVar) {
        super(context, handler, bbvVar, aqdVar, i, wrapCallbacks(atrVar), wrapCallbacks(atsVar));
        this.mClientSettings = (bba) bdi.checkNotNull(bbaVar);
        this.mAccount = bbaVar.getAccount();
        this.mScopes = validateScopesDisallowingExpansion(bbaVar.getAllRequestedScopes());
    }

    private Set validateScopesDisallowingExpansion(Set set) {
        Set setValidateScopes = validateScopes(set);
        Iterator it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    protected Set validateScopes(Set set) {
        return set;
    }

    @Override // flm.bai
    public final Account getAccount() {
        return this.mAccount;
    }

    protected final bba getClientSettings() {
        return this.mClientSettings;
    }

    @Override // flm.bai
    protected final Set getScopes() {
        return this.mScopes;
    }

    @Override // flm.bai
    public aqb[] getRequiredFeatures() {
        return new aqb[0];
    }

    private static bak wrapCallbacks(atr atrVar) {
        if (atrVar == null) {
            return null;
        }
        return new bbr(atrVar);
    }

    private static bal wrapCallbacks(ats atsVar) {
        if (atsVar == null) {
            return null;
        }
        return new bbs(atsVar);
    }

    @Override // flm.bai, flm.ate
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }
}
