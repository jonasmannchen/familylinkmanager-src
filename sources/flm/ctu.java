package flm;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctu extends akk implements cts {
    ctu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.reporting.internal.IReportingService");
    }

    @Override // flm.cts
    public final ctl a(Account account) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, account);
        Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
        ctl ctlVar = (ctl) akm.a(parcelTransactAndReadException, ctl.CREATOR);
        parcelTransactAndReadException.recycle();
        return ctlVar;
    }

    @Override // flm.cts
    public final ctq a(ctn ctnVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, ctnVar);
        Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        ctq ctqVar = (ctq) akm.a(parcelTransactAndReadException, ctq.CREATOR);
        parcelTransactAndReadException.recycle();
        return ctqVar;
    }

    @Override // flm.cts
    public final int a(long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }
}
