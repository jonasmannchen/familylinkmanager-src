package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mp();
    public mq[] a;
    public int[] b;
    public ld[] c;
    public int d;
    public int e;

    public mo() {
        this.d = -1;
    }

    public mo(Parcel parcel) {
        this.d = -1;
        this.a = (mq[]) parcel.createTypedArray(mq.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (ld[]) parcel.createTypedArray(ld.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
