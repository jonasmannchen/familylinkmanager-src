package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkc extends bdv {
    public static final Parcelable.Creator CREATOR = new bkd();
    public final int a;
    public final int b;
    public final bll c;
    public final blb d;

    public bkc(int i, int i2, bll bllVar, blb blbVar) {
        this.a = i;
        this.b = i2;
        this.c = bllVar;
        this.d = blbVar;
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkc)) {
            return false;
        }
        bkc bkcVar = (bkc) obj;
        return this.a == bkcVar.a && this.b == bkcVar.b && this.c.equals(bkcVar.c) && bcx.equal(this.d, bkcVar.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeInt(parcel, 3, this.b);
        bdy.writeParcelable(parcel, 4, this.c, i, false);
        bdy.writeParcelable(parcel, 5, this.d, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
