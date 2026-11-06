package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqt extends bdv {
    public static final Parcelable.Creator CREATOR = new bqu();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bqt(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.writeString(parcel, 5, this.d, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
