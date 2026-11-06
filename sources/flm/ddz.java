package flm;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ddz extends akl implements ddy {
    public ddz() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                a((Status) akm.a(parcel, Status.CREATOR), (ddw) akm.a(parcel, ddw.CREATOR));
                return true;
            case 3:
                akm.a(parcel, Status.CREATOR);
                a();
                return true;
            case 4:
                akm.a(parcel, Status.CREATOR);
                b();
                return true;
            case 5:
                a((Status) akm.a(parcel, Status.CREATOR));
                return true;
            case 6:
                akm.a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                c();
                return true;
            case 7:
                akm.a(parcel, Status.CREATOR);
                d();
                return true;
            case 8:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel);
                akm.a(parcel, ddj.CREATOR);
                e();
                return true;
            case 9:
                akm.a(parcel, Status.CREATOR);
                akm.a(parcel, ddj.CREATOR);
                f();
                return true;
            default:
                return false;
        }
    }
}
