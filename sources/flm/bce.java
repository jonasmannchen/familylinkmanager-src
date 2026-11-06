package flm;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bce extends akl implements bcd {
    public static final String DESCRIPTOR = "com.google.android.gms.common.internal.IAccountAccessor";
    public static final int TRANSACTION_getAccount = 2;

    public bce() {
        super(DESCRIPTOR);
    }

    public static bcd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (iInterfaceQueryLocalInterface instanceof bcd) {
            return (bcd) iInterfaceQueryLocalInterface;
        }
        return new bcf(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Account account = getAccount();
        parcel2.writeNoException();
        akm.b(parcel2, account);
        return true;
    }
}
