package flm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cwl extends akl implements cwk {
    public cwl() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.readInt();
                akm.a(parcel, Bundle.CREATOR);
                akm.a(parcel, Bundle.CREATOR);
                a();
                return true;
            case 2:
                a(parcel.readInt(), (Bundle) akm.a(parcel, Bundle.CREATOR), (DataHolder) akm.a(parcel, DataHolder.CREATOR));
                return true;
            case 3:
                parcel.readInt();
                akm.a(parcel, Bundle.CREATOR);
                akm.a(parcel, ParcelFileDescriptor.CREATOR);
                c();
                return true;
            case 4:
                parcel.readInt();
                akm.a(parcel, Bundle.CREATOR);
                parcel.createTypedArray(DataHolder.CREATOR);
                b();
                return true;
            case 5:
                parcel.readInt();
                akm.a(parcel, Bundle.CREATOR);
                akm.a(parcel, ParcelFileDescriptor.CREATOR);
                akm.a(parcel, Bundle.CREATOR);
                d();
                return true;
            case 6:
                parcel.readInt();
                akm.a(parcel, cxr.CREATOR);
                e();
                return true;
            case 7:
                parcel.readInt();
                akm.a(parcel, cyf.CREATOR);
                f();
                return true;
            case 8:
                parcel.readInt();
                g();
                return true;
            case 9:
                parcel.readInt();
                parcel.createTypedArrayList(cvi.CREATOR);
                akm.a(parcel, cvm.CREATOR);
                h();
                return true;
            case 10:
                parcel.readInt();
                parcel.createTypedArrayList(cvq.CREATOR);
                akm.a(parcel, cvm.CREATOR);
                i();
                return true;
            case 11:
                parcel.readInt();
                akm.a(parcel);
                k();
                return true;
            case 12:
                parcel.readInt();
                akm.a(parcel, cww.CREATOR);
                l();
                return true;
            case 13:
                parcel.readInt();
                akm.a(parcel, cvo.CREATOR);
                akm.a(parcel, cvm.CREATOR);
                j();
                return true;
            case 14:
                parcel.readInt();
                akm.a(parcel, cwc.CREATOR);
                m();
                return true;
            case 15:
                parcel.readInt();
                parcel.readString();
                n();
                return true;
            case 16:
                parcel.readInt();
                akm.a(parcel, cwp.CREATOR);
                o();
                return true;
            case 17:
                parcel.readInt();
                parcel.createTypedArrayList(cvo.CREATOR);
                p();
                return true;
            default:
                return false;
        }
    }
}
