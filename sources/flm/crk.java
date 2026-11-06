package flm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class crk extends akl implements crj {
    public static crj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof crj ? (crj) iInterfaceQueryLocalInterface : new crl(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
