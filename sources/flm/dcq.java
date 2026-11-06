package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcq extends bdv {
    public static final Parcelable.Creator CREATOR = new dct();
    public dcs[] a;

    public dcq(dcs[] dcsVarArr) {
        this.a = dcsVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedArray(parcel, 2, this.a, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
