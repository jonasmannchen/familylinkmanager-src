package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aeo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aep();
    public int a;
    public int b;
    public boolean c;

    public aeo() {
    }

    aeo(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() == 1;
    }

    public aeo(aeo aeoVar) {
        this.a = aeoVar.a;
        this.b = aeoVar.b;
        this.c = aeoVar.c;
    }

    final boolean a() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
