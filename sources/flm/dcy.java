package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcy extends akk implements dcw {
    dcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.udc.internal.IUdcService");
    }

    @Override // flm.dcw
    public final void a(dcu dcuVar, dch dchVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, dcuVar);
        akm.a(parcelObtainAndWriteInterfaceToken, dchVar);
        transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.dcw
    public final void a(dcu dcuVar, dcq dcqVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, dcuVar);
        akm.a(parcelObtainAndWriteInterfaceToken, dcqVar);
        transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
    }
}
