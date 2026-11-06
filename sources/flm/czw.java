package flm;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class czw extends akl implements czv {
    public czw() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                akm.a(parcel, apx.CREATOR);
                akm.a(parcel, czs.CREATOR);
                a();
                break;
            case 4:
                akm.a(parcel, Status.CREATOR);
                b();
                break;
            case 5:
            default:
                return false;
            case 6:
                akm.a(parcel, Status.CREATOR);
                c();
                break;
            case 7:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel, GoogleSignInAccount.CREATOR);
                d();
                break;
            case 8:
                a((dad) akm.a(parcel, dad.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
