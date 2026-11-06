package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bni extends bdv {
    public static final Parcelable.Creator CREATOR = new bnj();
    public String a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeBoolean(parcel, 3, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    bni(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
