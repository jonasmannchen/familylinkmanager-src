package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drs implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new drt();
    public final String a;
    public final long b;
    public final int c;
    public final String d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }

    public final String toString() {
        return this.a;
    }

    drs(String str, long j, int i, String str2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
    }

    drs(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareToIgnoreCase(((drs) obj).a);
    }
}
