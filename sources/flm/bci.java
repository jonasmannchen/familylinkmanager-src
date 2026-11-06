package flm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bci extends akl implements bch {
    public static final String DESCRIPTOR = "com.google.android.gms.common.internal.ICertData";
    public static final int TRANSACTION_getBytesWrapped = 1;
    public static final int TRANSACTION_getHashCode = 2;

    public bci() {
        super(DESCRIPTOR);
    }

    public static bch asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (iInterfaceQueryLocalInterface instanceof bch) {
            return (bch) iInterfaceQueryLocalInterface;
        }
        return new bcj(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                blq bytesWrapped = getBytesWrapped();
                parcel2.writeNoException();
                akm.a(parcel2, bytesWrapped);
                return true;
            case 2:
                int hashCode = getHashCode();
                parcel2.writeNoException();
                parcel2.writeInt(hashCode);
                return true;
            default:
                return false;
        }
    }
}
