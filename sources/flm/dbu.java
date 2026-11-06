package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbu extends bdv {
    public static final Parcelable.Creator CREATOR = new dbv();
    public final List a;
    public final List b;

    public dbu(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeStringList(parcel, 2, this.a, false);
        bdy.writeStringList(parcel, 3, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbu)) {
            return false;
        }
        dbu dbuVar = (dbu) obj;
        return bcx.equal(this.a, dbuVar.a) && bcx.equal(this.b, dbuVar.b);
    }
}
