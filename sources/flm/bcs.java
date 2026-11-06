package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcs extends akk implements bcq {
    bcs(IBinder iBinder) {
        super(iBinder, bcr.DESCRIPTOR);
    }

    @Override // flm.bcq
    public final blq getGoogleCertificates() {
        Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }

    @Override // flm.bcq
    public final blq getGoogleReleaseCertificates() {
        Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }

    @Override // flm.bcq
    public final boolean isGoogleReleaseSigned(String str, blq blqVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        boolean zA = akm.a(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zA;
    }

    @Override // flm.bcq
    public final boolean isGoogleSigned(String str, blq blqVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
        boolean zA = akm.a(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zA;
    }

    @Override // flm.bcq
    public final boolean isGoogleOrPlatformSigned(aqq aqqVar, blq blqVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, aqqVar);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
        boolean zA = akm.a(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zA;
    }
}
