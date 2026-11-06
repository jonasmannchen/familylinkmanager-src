package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmp extends akk implements bmn {
    bmp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // flm.bmn
    public final blq a(blq blqVar, String str, int i, blq blqVar2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar2);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }

    @Override // flm.bmn
    public final blq b(blq blqVar, String str, int i, blq blqVar2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar2);
        Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }
}
