package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apn extends akk implements apl {
    apn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // flm.apl
    public final void a(apj apjVar, apc apcVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, apjVar);
        akm.a(parcelObtainAndWriteInterfaceToken, apcVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
