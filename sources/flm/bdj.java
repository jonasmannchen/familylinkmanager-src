package flm;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdj extends bdv {
    public static final Parcelable.Creator CREATOR = new bdk();
    public static final int VERSION_CODE = 2;
    public final Account mAccount;
    public final int mSessionId;
    public final GoogleSignInAccount mSignInAccountHint;
    public final int mVersionCode;

    bdj(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.mVersionCode = i;
        this.mAccount = account;
        this.mSessionId = i2;
        this.mSignInAccountHint = googleSignInAccount;
    }

    public bdj(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final Account getAccount() {
        return this.mAccount;
    }

    public final int getSessionId() {
        return this.mSessionId;
    }

    public final GoogleSignInAccount getSignInAccountHint() {
        return this.mSignInAccountHint;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bdk.writeToParcel(this, parcel, i);
    }
}
