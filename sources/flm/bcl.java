package flm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bcl extends akl implements bck {
    public static final String DESCRIPTOR = "com.google.android.gms.common.internal.IGmsCallbacks";
    public static final int TRANSACTION_onAccountValidationComplete = 2;
    public static final int TRANSACTION_onPostInitComplete = 1;
    public static final int TRANSACTION_onPostInitCompleteWithConnectionInfo = 3;

    public bcl() {
        super(DESCRIPTOR);
    }

    public static bck asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (iInterfaceQueryLocalInterface instanceof bck) {
            return (bck) iInterfaceQueryLocalInterface;
        }
        return new bcm(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) akm.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                onAccountValidationComplete(parcel.readInt(), (Bundle) akm.a(parcel, Bundle.CREATOR));
                break;
            case 3:
                onPostInitCompleteWithConnectionInfo(parcel.readInt(), parcel.readStrongBinder(), (bbe) akm.a(parcel, bbe.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
