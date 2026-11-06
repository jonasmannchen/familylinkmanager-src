package flm;

import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class brq extends akl implements brp {
    public brq() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((GoogleHelp) akm.a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                akm.a(parcel, TogglingData.CREATOR);
                c();
                parcel2.writeNoException();
                return true;
            case 3:
                d();
                parcel2.writeNoException();
                return true;
            case 4:
                e();
                parcel2.writeNoException();
                return true;
            case 5:
                f();
                parcel2.writeNoException();
                return true;
            case 6:
                g();
                parcel2.writeNoException();
                return true;
            case 7:
                a();
                return true;
            case 8:
                b();
                return true;
            case 9:
                parcel.readInt();
                h();
                parcel2.writeNoException();
                return true;
            case 10:
                i();
                parcel2.writeNoException();
                return true;
            case 11:
                j();
                parcel2.writeNoException();
                return true;
            case 12:
                k();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.createByteArray();
                l();
                parcel2.writeNoException();
                return true;
            case 14:
                m();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.createByteArray();
                n();
                parcel2.writeNoException();
                return true;
            case 16:
                o();
                parcel2.writeNoException();
                return true;
            case 17:
                akm.a(parcel, bqr.CREATOR);
                p();
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.createByteArray();
                q();
                parcel2.writeNoException();
                return true;
            case 19:
                r();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
