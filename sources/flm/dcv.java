package flm;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dcv extends akl implements dcu {
    public dcv() {
        super("com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                akm.a(parcel, Status.CREATOR);
                parcel.createByteArray();
                a();
                return true;
            case 2:
                akm.a(parcel, Status.CREATOR);
                parcel.createByteArray();
                b();
                return true;
            case 3:
                akm.a(parcel, Status.CREATOR);
                parcel.createByteArray();
                c();
                return true;
            case 4:
                akm.a(parcel, Status.CREATOR);
                parcel.createByteArray();
                d();
                return true;
            case 5:
                akm.a(parcel, Status.CREATOR);
                parcel.createTypedArrayList(dca.CREATOR);
                e();
                return true;
            case 6:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel, PendingIntent.CREATOR);
                f();
                return true;
            case 7:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel, dby.CREATOR);
                akm.a(parcel, PendingIntent.CREATOR);
                g();
                return true;
            case 8:
                a((Status) akm.a(parcel, Status.CREATOR), (dcj) akm.a(parcel, dcj.CREATOR));
                return true;
            case 9:
                akm.a(parcel, Status.CREATOR);
                h();
                return true;
            case 10:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel, dbs.CREATOR);
                i();
                return true;
            case 11:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel, dbu.CREATOR);
                j();
                return true;
            default:
                return false;
        }
    }
}
