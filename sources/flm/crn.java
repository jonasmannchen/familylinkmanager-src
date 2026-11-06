package flm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class crn extends akl implements crm {
    public crn() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static crm a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (iInterfaceQueryLocalInterface instanceof crm) {
            return (crm) iInterfaceQueryLocalInterface;
        }
        return new cro(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((LocationResult) akm.a(parcel, LocationResult.CREATOR));
                return true;
            case 2:
                a((LocationAvailability) akm.a(parcel, LocationAvailability.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
