package flm;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bkx extends akl implements bkw {
    public bkx() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((Status) akm.a(parcel, Status.CREATOR));
                break;
            case 2:
                Status status = (Status) akm.a(parcel, Status.CREATOR);
                DataHolder dataHolder = (DataHolder) akm.a(parcel, DataHolder.CREATOR);
                akm.a(parcel, DataHolder.CREATOR);
                a(status, dataHolder);
                break;
            case 3:
                a((Status) akm.a(parcel, Status.CREATOR), (blo) akm.a(parcel, blo.CREATOR));
                break;
            case 4:
            default:
                return false;
            case 5:
                b((Status) akm.a(parcel, Status.CREATOR), (DataHolder) akm.a(parcel, DataHolder.CREATOR));
                break;
            case 6:
                a((Status) akm.a(parcel, Status.CREATOR), (ane) akm.a(parcel, ane.CREATOR));
                break;
            case 7:
                a((Status) akm.a(parcel, Status.CREATOR), (bjy) akm.a(parcel, bjy.CREATOR));
                break;
            case 8:
                a((Status) akm.a(parcel, Status.CREATOR), (bjw) akm.a(parcel, bjw.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
