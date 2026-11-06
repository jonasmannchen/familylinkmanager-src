package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amy extends bdv {
    public static final Parcelable.Creator CREATOR = new amz();
    public final int a;
    public final int b;

    public amy(int i, int i2) {
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

    public final String toString() {
        String string = Integer.toString(this.a);
        String string2 = Integer.toString(this.b);
        return new StringBuilder(String.valueOf(string).length() + 41 + String.valueOf(string2).length()).append("ConnectionState = ").append(string).append(" NetworkMeteredState = ").append(string2).toString();
    }
}
