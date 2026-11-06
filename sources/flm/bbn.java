package flm;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbn extends bdv {
    public static final Parcelable.Creator CREATOR = new bbo();
    public static final String TAG = "GetServiceRequest";
    public static final int VERSION_CODE = 4;
    public IBinder accountAccessorBinder;
    public String callingPackage;
    public aqb[] clientApiFeatures;
    public int clientLibraryVersion;
    public Account clientRequestedAccount;
    public aqb[] clientRequiredFeatures;
    public Bundle extraArgs;
    public boolean requestingConnectionInfo;
    public Scope[] scopes;
    public final int serviceId;
    public final int version;

    public bbn(int i) {
        this.version = 4;
        this.clientLibraryVersion = aqf.c;
        this.serviceId = i;
        this.requestingConnectionInfo = true;
    }

    bbn(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, aqb[] aqbVarArr, aqb[] aqbVarArr2, boolean z) {
        this.version = i;
        this.serviceId = i2;
        this.clientLibraryVersion = i3;
        if ("com.google.android.gms".equals(str)) {
            this.callingPackage = "com.google.android.gms";
        } else {
            this.callingPackage = str;
        }
        if (i < 2) {
            this.clientRequestedAccount = getAccountFromAccessor(iBinder);
        } else {
            this.accountAccessorBinder = iBinder;
            this.clientRequestedAccount = account;
        }
        this.scopes = scopeArr;
        this.extraArgs = bundle;
        this.clientRequiredFeatures = aqbVarArr;
        this.clientApiFeatures = aqbVarArr2;
        this.requestingConnectionInfo = z;
    }

    public final int getClientLibraryVersion() {
        return this.clientLibraryVersion;
    }

    public final bbn setClientLibraryVersion(int i) {
        this.clientLibraryVersion = i;
        return this;
    }

    public final aqb[] getClientRequiredFeatures() {
        return this.clientRequiredFeatures;
    }

    public final bbn setClientRequiredFeatures(aqb[] aqbVarArr) {
        this.clientRequiredFeatures = aqbVarArr;
        return this;
    }

    public final aqb[] getClientApiFeatures() {
        return this.clientApiFeatures;
    }

    public final bbn setClientApiFeatures(aqb[] aqbVarArr) {
        this.clientApiFeatures = aqbVarArr;
        return this;
    }

    public final boolean isRequestingConnectionInfo() {
        return this.requestingConnectionInfo;
    }

    public final bbn setRequestingConnectionInfo(boolean z) {
        this.requestingConnectionInfo = z;
        return this;
    }

    public final int getServiceId() {
        return this.serviceId;
    }

    public final String getCallingPackage() {
        return this.callingPackage;
    }

    public final bbn setCallingPackage(String str) {
        this.callingPackage = str;
        return this;
    }

    public final Account getClientRequestedAccount() {
        return this.clientRequestedAccount;
    }

    public final bbn setClientRequestedAccount(Account account) {
        this.clientRequestedAccount = account;
        return this;
    }

    public final Account getAuthenticatedAccount() {
        return getAccountFromAccessor(this.accountAccessorBinder);
    }

    public final bbn setAuthenticatedAccount(bcd bcdVar) {
        if (bcdVar != null) {
            this.accountAccessorBinder = bcdVar.asBinder();
        }
        return this;
    }

    public final Scope[] getScopes() {
        return this.scopes;
    }

    public final bbn setScopes(Collection collection) {
        this.scopes = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public final Bundle getExtraArgs() {
        return this.extraArgs;
    }

    public final bbn setExtraArgs(Bundle bundle) {
        this.extraArgs = bundle;
        return this;
    }

    public static Parcelable.Creator getCreator() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bbo.writeToParcel(this, parcel, i);
    }

    private final Account getAccountFromAccessor(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return baf.getAccountBinderSafe(bce.asInterface(iBinder));
    }
}
