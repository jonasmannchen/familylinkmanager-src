package flm;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bba {
    public static final String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
    public final Account mAccount;
    public final Set mAllRequestedScopes;
    public final int mGravityForPopups;
    public final boolean mIsSignInClientDisconnectFixEnabled;
    public final Map mOptionalApiSettingsMap;
    public final String mRealClientClassName;
    public final String mRealClientPackageName;
    public final Set mRequiredScopes;
    public Integer mSessionId;
    public final czq mSignInOptions;
    public final View mViewForPopups;

    public static bba createDefault(Context context) {
        return new atq(context).a();
    }

    public bba(Account account, Set set, Map map, int i, View view, String str, String str2, czq czqVar) {
        this(account, set, map, i, view, str, str2, czqVar, false);
    }

    public bba(Account account, Set set, Map map, int i, View view, String str, String str2, czq czqVar, boolean z) {
        this.mAccount = account;
        this.mRequiredScopes = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.mOptionalApiSettingsMap = map == null ? Collections.EMPTY_MAP : map;
        this.mViewForPopups = view;
        this.mGravityForPopups = i;
        this.mRealClientPackageName = str;
        this.mRealClientClassName = str2;
        this.mSignInOptions = czqVar;
        this.mIsSignInClientDisconnectFixEnabled = z;
        HashSet hashSet = new HashSet(this.mRequiredScopes);
        Iterator it = this.mOptionalApiSettingsMap.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((bbc) it.next()).mScopes);
        }
        this.mAllRequestedScopes = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public final String getAccountName() {
        if (this.mAccount != null) {
            return this.mAccount.name;
        }
        return null;
    }

    public final Account getAccount() {
        return this.mAccount;
    }

    public final Account getAccountOrDefault() {
        if (this.mAccount != null) {
            return this.mAccount;
        }
        return new Account(bai.DEFAULT_ACCOUNT, "com.google");
    }

    public final int getGravityForPopups() {
        return this.mGravityForPopups;
    }

    public final Set getRequiredScopes() {
        return this.mRequiredScopes;
    }

    public final Set getAllRequestedScopes() {
        return this.mAllRequestedScopes;
    }

    public final Map getOptionalApiSettings() {
        return this.mOptionalApiSettingsMap;
    }

    public final String getRealClientPackageName() {
        return this.mRealClientPackageName;
    }

    public final String getRealClientClassName() {
        return this.mRealClientClassName;
    }

    public final View getViewForPopups() {
        return this.mViewForPopups;
    }

    public final czq getSignInOptions() {
        return this.mSignInOptions;
    }

    public final Integer getClientSessionId() {
        return this.mSessionId;
    }

    public final void setClientSessionId(Integer num) {
        this.mSessionId = num;
    }

    public final Set getApplicableScopes(asw aswVar) {
        bbc bbcVar = (bbc) this.mOptionalApiSettingsMap.get(aswVar);
        if (bbcVar == null || bbcVar.mScopes.isEmpty()) {
            return this.mRequiredScopes;
        }
        HashSet hashSet = new HashSet(this.mRequiredScopes);
        hashSet.addAll(bbcVar.mScopes);
        return hashSet;
    }

    public final boolean isSignInClientDisconnectFixEnabled() {
        return this.mIsSignInClientDisconnectFixEnabled;
    }
}
