package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dab extends bdv {
    public static final Parcelable.Creator CREATOR = new dac();
    public final int a;
    public final bdj b;

    dab(int i, bdj bdjVar) {
        this.a = i;
        this.b = bdjVar;
    }

    public dab(bdj bdjVar) {
        this(1, bdjVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeParcelable(parcel, 2, this.b, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
