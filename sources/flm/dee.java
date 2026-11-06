package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dee extends akk implements dec {
    dee(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    @Override // flm.dec
    public final void a(ddy ddyVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, ddyVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.dec
    public final void a(dea deaVar, ddy ddyVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, deaVar);
        akm.a(parcelObtainAndWriteInterfaceToken, ddyVar);
        transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
    }
}
