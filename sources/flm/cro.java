package flm;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cro extends akk implements crm {
    cro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // flm.crm
    public final void a(LocationResult locationResult) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, locationResult);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.crm
    public final void a(LocationAvailability locationAvailability) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, locationAvailability);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }
}
