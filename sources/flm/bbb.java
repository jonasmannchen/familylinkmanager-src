package flm;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbb {
    public Account mAccount;
    public boolean mIsSignInClientDisconnectFixEnabled;
    public Map mOptionalApiSettingsMap;
    public String mRealClientClassName;
    public String mRealClientPackageName;
    public rv mRequiredScopes;
    public View mViewForPopups;
    public int mGravityForPopups = 0;
    public czq mSignInOptions = czq.a;

    public final bbb setAccount(Account account) {
        this.mAccount = account;
        return this;
    }

    public final bbb addRequiredScope(Scope scope) {
        if (this.mRequiredScopes == null) {
            this.mRequiredScopes = new rv();
        }
        this.mRequiredScopes.add(scope);
        return this;
    }

    public final bbb addAllRequiredScopes(Collection collection) {
        if (this.mRequiredScopes == null) {
            this.mRequiredScopes = new rv();
        }
        this.mRequiredScopes.addAll(collection);
        return this;
    }

    public final bbb setOptionalApiSettingsMap(Map map) {
        this.mOptionalApiSettingsMap = map;
        return this;
    }

    public final bbb setGravityForPopups(int i) {
        this.mGravityForPopups = i;
        return this;
    }

    public final bbb setViewForPopups(View view) {
        this.mViewForPopups = view;
        return this;
    }

    public final bbb setRealClientPackageName(String str) {
        this.mRealClientPackageName = str;
        return this;
    }

    public final bbb setRealClientClassName(String str) {
        this.mRealClientClassName = str;
        return this;
    }

    public final bbb setSignInOptions(czq czqVar) {
        this.mSignInOptions = czqVar;
        return this;
    }

    public final bbb enableSignInClientDisconnectFix() {
        this.mIsSignInClientDisconnectFixEnabled = true;
        return this;
    }

    public final bba build() {
        return new bba(this.mAccount, this.mRequiredScopes, this.mOptionalApiSettingsMap, this.mGravityForPopups, this.mViewForPopups, this.mRealClientPackageName, this.mRealClientClassName, this.mSignInOptions, this.mIsSignInClientDisconnectFixEnabled);
    }
}
