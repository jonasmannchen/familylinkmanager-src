package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cui extends bdv {
    public static final Parcelable.Creator CREATOR = new cuk();
    public int a;
    public int b;

    public cui(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeInt(parcel, 3, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
