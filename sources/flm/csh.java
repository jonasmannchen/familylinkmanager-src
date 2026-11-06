package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csh extends bdv implements aty {
    public static final Parcelable.Creator CREATOR;
    public final Status a;

    public csh(Status status) {
        this.a = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 1, this.a, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.aty
    public final Status b() {
        return this.a;
    }

    static {
        new csh(Status.a);
        CREATOR = new csi();
    }
}
