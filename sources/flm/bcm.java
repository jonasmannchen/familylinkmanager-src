package flm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcm extends akk implements bck {
    bcm(IBinder iBinder) {
        super(iBinder, bcl.DESCRIPTOR);
    }

    @Override // flm.bck
    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        parcelObtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        akm.a(parcelObtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.bck
    public final void onAccountValidationComplete(int i, Bundle bundle) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        akm.a(parcelObtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.bck
    public final void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, bbe bbeVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        parcelObtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        akm.a(parcelObtainAndWriteInterfaceToken, bbeVar);
        transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
    }
}
