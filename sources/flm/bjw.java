package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjw extends amr {
    public static final Parcelable.Creator CREATOR = new bjx();
    public final int a;
    public final long b;
    public final String c;
    public final int d;
    public final ArrayList e;

    public bjw(int i, long j, String str, int i2, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = i2;
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeLong(parcel, 3, this.b);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.writeInt(parcel, 5, this.d);
        bdy.writeTypedList(parcel, 6, this.e, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
