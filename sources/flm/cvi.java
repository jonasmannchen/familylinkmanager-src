package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvi extends bdv {
    public static final Parcelable.Creator CREATOR = new cvj();
    public cvy a;

    public cvi() {
    }

    public cvi(cvy cvyVar) {
        this.a = cvyVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("person", this.a).toString();
    }
}
