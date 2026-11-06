package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cza extends bdv implements Comparable {
    public static final Parcelable.Creator CREATOR = new czb();
    public final int a;
    public final int b;

    public cza(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        return "GenericDimension(" + this.a + ", " + this.b + ")";
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cza) && compareTo((cza) obj) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cza czaVar) {
        if (this.a < czaVar.a) {
            return -1;
        }
        if (this.a > czaVar.a) {
            return 1;
        }
        if (this.b >= czaVar.b) {
            return this.b > czaVar.b ? 1 : 0;
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeInt(parcel, 2, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
