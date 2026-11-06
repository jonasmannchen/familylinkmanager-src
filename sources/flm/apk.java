package flm;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class apk extends akl implements apj {
    public apk() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((Status) akm.a(parcel, Status.CREATOR));
                return true;
            case 2:
                akm.a(parcel, Status.CREATOR);
                a();
                return true;
            case 3:
                akm.a(parcel, Status.CREATOR);
                parcel.readLong();
                b();
                return true;
            case 4:
                akm.a(parcel, Status.CREATOR);
                d();
                return true;
            case 5:
                akm.a(parcel, Status.CREATOR);
                parcel.readLong();
                e();
                return true;
            case 6:
                akm.a(parcel, Status.CREATOR);
                parcel.createTypedArray(apc.CREATOR);
                g();
                return true;
            case 7:
                akm.a(parcel, DataHolder.CREATOR);
                h();
                return true;
            case 8:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel, aol.CREATOR);
                c();
                return true;
            case 9:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel, aol.CREATOR);
                f();
                return true;
            default:
                return false;
        }
    }
}
