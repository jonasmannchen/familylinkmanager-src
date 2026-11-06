package flm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdl extends bdv {
    public static final Parcelable.Creator CREATOR = new bdm();
    public static final int VERSION_CODE = 1;
    public IBinder mAccountAccessorBinder;
    public apx mConnectionResult;
    public boolean mIsFromCrossClientAuth;
    public boolean mSaveDefaultAccount;
    public final int mVersionCode;

    bdl(int i, IBinder iBinder, apx apxVar, boolean z, boolean z2) {
        this.mVersionCode = i;
        this.mAccountAccessorBinder = iBinder;
        this.mConnectionResult = apxVar;
        this.mSaveDefaultAccount = z;
        this.mIsFromCrossClientAuth = z2;
    }

    public bdl(apx apxVar) {
        this(1, null, apxVar, false, false);
    }

    public bdl(int i) {
        this(new apx(i, null));
    }

    public final bcd getAccountAccessor() {
        return bce.asInterface(this.mAccountAccessorBinder);
    }

    public final bdl setAccountAccessor(bcd bcdVar) {
        this.mAccountAccessorBinder = bcdVar == null ? null : bcdVar.asBinder();
        return this;
    }

    public final apx getConnectionResult() {
        return this.mConnectionResult;
    }

    public final boolean getSaveDefaultAccount() {
        return this.mSaveDefaultAccount;
    }

    public final bdl setSaveDefaultAccount(boolean z) {
        this.mSaveDefaultAccount = z;
        return this;
    }

    public final boolean isFromCrossClientAuth() {
        return this.mIsFromCrossClientAuth;
    }

    public final bdl setIsFromCrossClientAuth(boolean z) {
        this.mIsFromCrossClientAuth = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bdm.writeToParcel(this, parcel, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdl)) {
            return false;
        }
        bdl bdlVar = (bdl) obj;
        return this.mConnectionResult.equals(bdlVar.mConnectionResult) && getAccountAccessor().equals(bdlVar.getAccountAccessor());
    }
}
