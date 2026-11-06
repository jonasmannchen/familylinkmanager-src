package flm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class csl extends akl implements csk {
    public csl() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public static csk a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        if (iInterfaceQueryLocalInterface instanceof csk) {
            return (csk) iInterfaceQueryLocalInterface;
        }
        return new csm(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((csh) akm.a(parcel, csh.CREATOR));
        return true;
    }
}
