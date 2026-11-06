package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvu extends bdv {
    public static final Parcelable.Creator CREATOR = new cvv();
    public final int a;
    public final int b;

    cvu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvu)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cvu cvuVar = (cvu) obj;
        return bcx.equal(Integer.valueOf(this.a), Integer.valueOf(cvuVar.a)) && bcx.equal(Integer.valueOf(this.b), Integer.valueOf(cvuVar.b));
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeInt(parcel, 3, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
