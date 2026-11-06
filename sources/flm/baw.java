package flm;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class baw extends bdv {
    public static final Parcelable.Creator CREATOR = new bax();
    public static final String KEY_AUTH_PACKAGE_NAME = "auth_package_name";
    public static final String KEY_CALLING_PACKAGE_NAME = "calling_package_name";
    public static final String KEY_CALLING_UID = "calling_uid";
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_EXTRAS_AUTH_TOKEN = "auth_token";
    public static final String KEY_EXTRAS_CLIENT_VERSION = "client_version";
    public static final String KEY_GRANTED_SCOPES = "granted_scopes";
    public static final String KEY_REQUESTED_ACCOUNT_NAME = "requested_account_name";
    public static final String KEY_REQUESTED_ACCOUNT_TYPE = "requested_account_type";
    public static final String KEY_REQUESTED_VISIBLE_ACTIONS = "requested_visible_actions";
    public static final String KEY_RESOLVED_ACCOUNT_NAME = "resolved_account_name";
    public static final String KEY_RESOLVED_ACCOUNT_TYPE = "resolved_account_type";
    public static final String SHARED_PREFS_PREFIX = "common.clientcontext_";
    public static final int VERSION_CODE = 0;
    public String mAuthPackageName;
    public String mCallingPackageName;
    public int mCallingPid;
    public int mCallingUid;
    public Bundle mExtras;
    public List mGrantedScopes;
    public Account mRequestedAccount;
    public Account mResolvedAccount;
    public final int mVersion;
    public List mVisibleActions;

    baw(int i, int i2, Account account, Account account2, String str, String str2, List list, List list2, Bundle bundle, int i3) {
        this.mVersion = i;
        this.mCallingUid = i2;
        this.mResolvedAccount = account;
        this.mRequestedAccount = account2;
        this.mCallingPackageName = str;
        this.mAuthPackageName = str2;
        this.mGrantedScopes = list == null ? new ArrayList() : list;
        this.mVisibleActions = list2 == null ? new ArrayList() : list2;
        this.mExtras = bundle == null ? new Bundle() : bundle;
        this.mCallingPid = i3;
    }

    public baw() {
        this(0, -1, null, null, null, null, null, null, null, -1);
    }

    @Deprecated
    public baw(int i, Account account, Account account2, String str) {
        this(i, account, account2, str, str);
    }

    public baw(baw bawVar) {
        this(bawVar.mCallingUid, bawVar.mResolvedAccount, bawVar.mRequestedAccount, bawVar.mCallingPackageName, bawVar.mAuthPackageName, new ArrayList(bawVar.mGrantedScopes), new ArrayList(bawVar.mVisibleActions), new Bundle(bawVar.mExtras));
    }

    @Deprecated
    public baw(int i, Account account, Account account2, String str, String str2) {
        this(i, account2, account, str, str2, (ArrayList) null, (ArrayList) null, new Bundle());
    }

    @Deprecated
    public baw(int i, Account account, Account account2, String str, String str2, ArrayList arrayList, ArrayList arrayList2, Bundle bundle) {
        this(0, i, account, account2, str, str2, arrayList, arrayList2, bundle, -1);
    }

    @Deprecated
    public baw(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, str3);
    }

    @Deprecated
    public baw(int i, String str, String str2, String str3, String str4) {
        this(i, str2, str, str3, str4, (ArrayList) null, (ArrayList) null, new Bundle());
    }

    @Deprecated
    public baw(int i, String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, Bundle bundle) {
        this(i, createGoogleAccount(str), createGoogleAccount(str2), str3, str4, arrayList, arrayList2, bundle);
    }

    public final int getVersion() {
        return this.mVersion;
    }

    public final int getCallingUid() {
        return this.mCallingUid;
    }

    public final baw setCallingUid(int i) {
        this.mCallingUid = i;
        return this;
    }

    @Deprecated
    public final String getRequestedAccountName() {
        if (this.mRequestedAccount == null) {
            return null;
        }
        return this.mRequestedAccount.name;
    }

    public final Account getRequestedAccount() {
        return this.mRequestedAccount;
    }

    public final baw setRequestedAccount(Account account) {
        this.mRequestedAccount = account;
        return this;
    }

    @Deprecated
    public final String getResolvedAccountName() {
        if (this.mResolvedAccount == null) {
            return null;
        }
        return this.mResolvedAccount.name;
    }

    public final Account getResolvedAccount() {
        return this.mResolvedAccount;
    }

    @Deprecated
    public final baw setResolvedAccountName(String str) {
        this.mResolvedAccount = createGoogleAccount(str);
        return this;
    }

    public final baw setResolvedAccount(Account account) {
        this.mResolvedAccount = account;
        return this;
    }

    public final String getCallingPackageName() {
        return this.mCallingPackageName;
    }

    public final baw setCallingPackageName(String str) {
        this.mCallingPackageName = str;
        return this;
    }

    public final String getAuthPackageName() {
        return this.mAuthPackageName;
    }

    public final baw setAuthPackageName(String str) {
        this.mAuthPackageName = str;
        return this;
    }

    public final boolean isCurrentContext() {
        return this.mCallingUid == Process.myUid();
    }

    public final boolean isResolvedDefaultAccount() {
        return bai.DEFAULT_ACCOUNT.equals(this.mRequestedAccount == null ? null : this.mRequestedAccount.name);
    }

    public final boolean isProxyingAuthentication() {
        return !TextUtils.equals(this.mCallingPackageName, this.mAuthPackageName);
    }

    public final baw addGrantedScope(String str) {
        if (!hasScope(str)) {
            this.mGrantedScopes.add(str);
        }
        return this;
    }

    public final boolean hasScope(String str) {
        return this.mGrantedScopes.contains(str);
    }

    public final boolean hasScope(Scope scope) {
        return this.mGrantedScopes.contains(scope.b);
    }

    public final boolean hasScopes(String[] strArr) {
        for (String str : strArr) {
            if (!hasScope(str)) {
                return false;
            }
        }
        return true;
    }

    public final baw setGrantedScopes(String[] strArr) {
        this.mGrantedScopes.clear();
        if (strArr != null) {
            for (String str : strArr) {
                this.mGrantedScopes.add(str);
            }
        }
        return this;
    }

    public final baw setGrantedScopes(baw bawVar) {
        this.mGrantedScopes.clear();
        this.mGrantedScopes.addAll(bawVar.mGrantedScopes);
        return this;
    }

    public final String[] getGrantedScopes() {
        return (String[]) this.mGrantedScopes.toArray(new String[this.mGrantedScopes.size()]);
    }

    public final List getGrantedScopesAsList() {
        return this.mGrantedScopes;
    }

    public final boolean hasAnyScopes() {
        return this.mGrantedScopes != null && this.mGrantedScopes.size() > 0;
    }

    public final String getScopesString() {
        if (!hasAnyScopes()) {
            throw new NullPointerException("no scopes granted");
        }
        String strValueOf = String.valueOf(TextUtils.join(" ", this.mGrantedScopes));
        return strValueOf.length() != 0 ? "oauth2:".concat(strValueOf) : new String("oauth2:");
    }

    public final baw setVisibleActions(String[] strArr) {
        this.mVisibleActions.clear();
        if (strArr != null && strArr.length > 0) {
            this.mVisibleActions.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public final String[] getVisibleActions() {
        return (String[]) this.mVisibleActions.toArray(new String[this.mVisibleActions.size()]);
    }

    public final List getVisibleActionsAsList() {
        return this.mVisibleActions;
    }

    public final baw setExtra(String str, String str2) {
        bdi.checkArgument(str == null || !str.contains(bdp.WHITELIST_DELIMITER), "key cannot contain ','");
        bdi.checkArgument(str2 == null || !str2.contains(bdp.WHITELIST_DELIMITER), "value cannot contain ','");
        this.mExtras.putString(str, str2);
        return this;
    }

    public final baw setExtra(String str, int i) {
        bdi.checkArgument(str == null || !str.contains(bdp.WHITELIST_DELIMITER), "key cannot contain ','");
        this.mExtras.putInt(str, i);
        return this;
    }

    public final baw setExtras(baw bawVar) {
        this.mExtras.clear();
        this.mExtras.putAll(bawVar.mExtras);
        return this;
    }

    public final Bundle getExtras() {
        return this.mExtras;
    }

    public final String getExtra(String str) {
        return this.mExtras.getString(str);
    }

    public final int getExtraInt(String str, int i) {
        return this.mExtras.getInt(str, i);
    }

    public final Parcelable getExtraParcelable(String str) {
        return this.mExtras.getParcelable(str);
    }

    public final int getCallingPid() {
        return this.mCallingPid;
    }

    public final baw setCallingPid(int i) {
        this.mCallingPid = i;
        return this;
    }

    public final void storeToSharedPrefs(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(getSharedPrefsFileName(this.mResolvedAccount, this.mAuthPackageName), 0).edit();
        editorEdit.putInt(KEY_CALLING_UID, this.mCallingUid);
        editorEdit.putString(KEY_RESOLVED_ACCOUNT_NAME, this.mResolvedAccount.name);
        editorEdit.putString(KEY_RESOLVED_ACCOUNT_TYPE, this.mResolvedAccount.type);
        editorEdit.putString(KEY_REQUESTED_ACCOUNT_NAME, this.mRequestedAccount.name);
        editorEdit.putString(KEY_REQUESTED_ACCOUNT_TYPE, this.mRequestedAccount.type);
        editorEdit.putString(KEY_CALLING_PACKAGE_NAME, this.mCallingPackageName);
        editorEdit.putString(KEY_AUTH_PACKAGE_NAME, this.mAuthPackageName);
        StringBuilder sb = new StringBuilder();
        int size = this.mGrantedScopes.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(bdp.WHITELIST_DELIMITER);
            }
            sb.append((String) this.mGrantedScopes.get(i));
        }
        editorEdit.putString(KEY_GRANTED_SCOPES, sb.toString());
        editorEdit.putString(KEY_REQUESTED_VISIBLE_ACTIONS, TextUtils.join(bdp.WHITELIST_DELIMITER, this.mVisibleActions));
        if (this.mExtras.size() > 0) {
            sb.delete(0, sb.length());
            for (String str : this.mExtras.keySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
                sb.append(',');
                sb.append(this.mExtras.getString(str));
            }
            editorEdit.putString(KEY_EXTRAS, sb.toString());
        }
        editorEdit.apply();
    }

    @Deprecated
    public static baw loadFromSharedPrefs(Context context, int i, String str, String str2) {
        bdi.checkNotEmpty(str);
        return loadFromSharedPrefs(context, i, createGoogleAccount(str), str2);
    }

    public static baw loadFromSharedPrefs(Context context, int i, Account account, String str) {
        bdi.checkNotNull(account);
        bdi.checkNotNull(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSharedPrefsFileName(account, str), 0);
        int i2 = sharedPreferences.getInt(KEY_CALLING_UID, -1);
        if (i2 == -1 || i2 != i) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String string = sharedPreferences.getString(KEY_GRANTED_SCOPES, null);
        if (string != null && string.length() > 0) {
            String[] strArrSplit = string.split(bdp.WHITELIST_DELIMITER);
            for (String str2 : strArrSplit) {
                arrayList.add(str2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        String string2 = sharedPreferences.getString(KEY_REQUESTED_VISIBLE_ACTIONS, null);
        if (string2 != null && string2.length() > 0) {
            String[] strArrSplit2 = string2.split(bdp.WHITELIST_DELIMITER);
            for (String str3 : strArrSplit2) {
                arrayList2.add(str3);
            }
        }
        Bundle bundle = new Bundle();
        String string3 = sharedPreferences.getString(KEY_EXTRAS, null);
        if (string3 != null && string3.length() > 0) {
            String[] strArrSplit3 = string3.split(bdp.WHITELIST_DELIMITER);
            int length = strArrSplit3.length - 1;
            for (int i3 = 0; i3 < length; i3 += 2) {
                bundle.putString(strArrSplit3[i3], strArrSplit3[i3 + 1]);
            }
        }
        String string4 = sharedPreferences.getString(KEY_RESOLVED_ACCOUNT_NAME, null);
        Account account2 = !TextUtils.isEmpty(string4) ? new Account(string4, sharedPreferences.getString(KEY_RESOLVED_ACCOUNT_TYPE, "com.google")) : null;
        String string5 = sharedPreferences.getString(KEY_REQUESTED_ACCOUNT_NAME, null);
        return new baw(i2, account2, !TextUtils.isEmpty(string5) ? new Account(string5, sharedPreferences.getString(KEY_REQUESTED_ACCOUNT_TYPE, "com.google")) : null, sharedPreferences.getString(KEY_CALLING_PACKAGE_NAME, null), sharedPreferences.getString(KEY_AUTH_PACKAGE_NAME, null), arrayList, arrayList2, bundle);
    }

    public final void clearFromSharedPrefs(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(getSharedPrefsFileName(this.mResolvedAccount, this.mAuthPackageName), 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    private static String getSharedPrefsFileName(Account account, String str) {
        String strValueOf = String.valueOf(SHARED_PREFS_PREFIX);
        String strValueOf2 = String.valueOf(String.valueOf(account.hashCode() ^ str.hashCode()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    private static Account createGoogleAccount(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof baw)) {
            return false;
        }
        baw bawVar = (baw) obj;
        return bcx.equal(bawVar.mResolvedAccount, this.mResolvedAccount) && bcx.equal(bawVar.mRequestedAccount, this.mRequestedAccount) && bcx.equal(bawVar.mCallingPackageName, this.mCallingPackageName) && bcx.equal(bawVar.mAuthPackageName, this.mAuthPackageName) && bawVar.mCallingUid == this.mCallingUid;
    }

    public final boolean isIdentical(baw bawVar) {
        if (bawVar.equals(this) && new HashSet(this.mGrantedScopes).equals(new HashSet(bawVar.mGrantedScopes)) && new HashSet(this.mVisibleActions).equals(new HashSet(bawVar.mVisibleActions))) {
            Set<String> setKeySet = this.mExtras.keySet();
            if (!setKeySet.equals(bawVar.mExtras.keySet())) {
                return false;
            }
            for (String str : setKeySet) {
                if (!bcx.equal(this.mExtras.get(str), bawVar.mExtras.get(str))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return bcx.hashCode(this.mResolvedAccount, this.mRequestedAccount, this.mCallingPackageName, this.mAuthPackageName, Integer.valueOf(this.mCallingUid));
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("mRequestedAccount", this.mRequestedAccount).add("mResolvedAccount", this.mResolvedAccount).add("mCallingPackageName", this.mCallingPackageName).add("mCallingUid", Integer.valueOf(this.mCallingUid)).add("mAuthPackageName", this.mAuthPackageName).add("mGrantedScopes", this.mGrantedScopes).add("isProxyingAuthentication", Boolean.valueOf(isProxyingAuthentication())).add("mVisibleActions", this.mVisibleActions).add("mExtras", this.mExtras).toString();
    }

    public static Parcelable.Creator getCreator() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bax.writeToParcel(this, parcel, i);
    }
}
