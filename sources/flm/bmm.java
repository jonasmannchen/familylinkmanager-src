package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmm extends akk implements bmk {
    bmm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // flm.bmk
    public final blq a(blq blqVar, String str, int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }

    @Override // flm.bmk
    public final int a(blq blqVar, String str, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        akm.a(parcelObtainAndWriteInterfaceToken, z);
        Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }

    @Override // flm.bmk
    public final blq b(blq blqVar, String str, int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }

    @Override // flm.bmk
    public final int b(blq blqVar, String str, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, blqVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        akm.a(parcelObtainAndWriteInterfaceToken, z);
        Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }

    @Override // flm.bmk
    public final int a() {
        Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }
}
