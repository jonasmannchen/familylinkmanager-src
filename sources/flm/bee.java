package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bee extends akk implements bec {
    bee(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.net.ISocketFactoryCreator");
    }

    @Override // flm.bec
    public final blq a(blq blqVar, blq blqVar2, blq blqVar3, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar2);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar3);
        akm.a(parcelObtainAndWriteInterfaceToken, z);
        Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }

    @Override // flm.bec
    public final blq a(blq blqVar, blq blqVar2, blq blqVar3, String str) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar2);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar3);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }
}
