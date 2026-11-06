package flm;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcf extends akk implements bcd {
    bcf(IBinder iBinder) {
        super(iBinder, bce.DESCRIPTOR);
    }

    @Override // flm.bcd
    public final Account getAccount() {
        Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        Account account = (Account) akm.a(parcelTransactAndReadException, Account.CREATOR);
        parcelTransactAndReadException.recycle();
        return account;
    }
}
