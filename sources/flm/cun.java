package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cun extends akk implements cul {
    cun(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.lockbox.internal.ILockboxService");
    }

    @Override // flm.cul
    public final cut a(String str) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        cut cutVar = (cut) akm.a(parcelTransactAndReadException, cut.CREATOR);
        parcelTransactAndReadException.recycle();
        return cutVar;
    }

    @Override // flm.cul
    public final void a(String str, cui cuiVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        akm.a(parcelObtainAndWriteInterfaceToken, cuiVar);
        transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
    }
}
