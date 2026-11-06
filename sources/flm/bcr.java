package flm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bcr extends akl implements bcq {
    public static final String DESCRIPTOR = "com.google.android.gms.common.internal.IGoogleCertificatesApi";
    public static final int TRANSACTION_getGoogleCertificates = 1;
    public static final int TRANSACTION_getGoogleReleaseCertificates = 2;
    public static final int TRANSACTION_isGoogleOrPlatformSigned = 5;
    public static final int TRANSACTION_isGoogleReleaseSigned = 3;
    public static final int TRANSACTION_isGoogleSigned = 4;

    public bcr() {
        super(DESCRIPTOR);
    }

    public static bcq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (iInterfaceQueryLocalInterface instanceof bcq) {
            return (bcq) iInterfaceQueryLocalInterface;
        }
        return new bcs(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        blq blsVar;
        blq blsVar2 = null;
        switch (i) {
            case 1:
                blq googleCertificates = getGoogleCertificates();
                parcel2.writeNoException();
                akm.a(parcel2, googleCertificates);
                return true;
            case 2:
                blq googleReleaseCertificates = getGoogleReleaseCertificates();
                parcel2.writeNoException();
                akm.a(parcel2, googleReleaseCertificates);
                return true;
            case 3:
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    blsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface instanceof blq) {
                        blsVar = (blq) iInterfaceQueryLocalInterface;
                    } else {
                        blsVar = new bls(strongBinder);
                    }
                }
                boolean zIsGoogleReleaseSigned = isGoogleReleaseSigned(string, blsVar);
                parcel2.writeNoException();
                akm.a(parcel2, zIsGoogleReleaseSigned);
                return true;
            case 4:
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface2 instanceof blq) {
                        blsVar2 = (blq) iInterfaceQueryLocalInterface2;
                    } else {
                        blsVar2 = new bls(strongBinder2);
                    }
                }
                boolean zIsGoogleSigned = isGoogleSigned(string2, blsVar2);
                parcel2.writeNoException();
                akm.a(parcel2, zIsGoogleSigned);
                return true;
            case 5:
                aqq aqqVar = (aqq) akm.a(parcel, aqq.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface3 instanceof blq) {
                        blsVar2 = (blq) iInterfaceQueryLocalInterface3;
                    } else {
                        blsVar2 = new bls(strongBinder3);
                    }
                }
                boolean zIsGoogleOrPlatformSigned = isGoogleOrPlatformSigned(aqqVar, blsVar2);
                parcel2.writeNoException();
                akm.a(parcel2, zIsGoogleOrPlatformSigned);
                return true;
            default:
                return false;
        }
    }
}
