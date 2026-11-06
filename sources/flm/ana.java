package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ana extends bdv {
    public static final Parcelable.Creator CREATOR = new anb();
    public final int a;
    public final double b;

    public ana(int i, double d) {
        this.a = i;
        this.b = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeDouble(parcel, 3, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        String string = Integer.toString(this.a);
        return new StringBuilder(String.valueOf(string).length() + 69).append("PowerConnectionState = ").append(string).append(" Battery Percentage = ").append(this.b).toString();
    }
}
