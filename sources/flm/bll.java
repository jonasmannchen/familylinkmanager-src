package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bll extends bdv {
    public static final Parcelable.Creator CREATOR = new blk();
    public final ArrayList a;
    public final int[] b;

    public bll(ArrayList arrayList, int[] iArr) {
        this.a = arrayList;
        this.b = iArr;
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bll)) {
            return false;
        }
        bll bllVar = (bll) obj;
        return bcx.equal(this.a, bllVar.a) && bcx.equal(this.b, bllVar.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 2, this.a, false);
        bdy.writeIntArray(parcel, 3, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
