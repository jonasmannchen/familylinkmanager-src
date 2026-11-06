package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dca extends bdv {
    public static final Parcelable.Creator CREATOR = new dcb();
    public int a;
    public int b;

    public dca() {
    }

    public dca(int i, int i2) {
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

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dca)) {
            return false;
        }
        dca dcaVar = (dca) obj;
        return bcx.equal(Integer.valueOf(this.a), Integer.valueOf(dcaVar.a)) && bcx.equal(Integer.valueOf(this.b), Integer.valueOf(dcaVar.b));
    }
}
