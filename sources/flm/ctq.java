package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctq extends bdv {
    public static final Parcelable.Creator CREATOR = new ctr();
    public final int a;
    public final long b;

    public ctq(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final String toString() {
        int i = this.a;
        return new StringBuilder(66).append("Result{, mResultCode=").append(i).append(", mRequestId=").append(this.b).append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ctq)) {
            return false;
        }
        ctq ctqVar = (ctq) obj;
        return this.b == ctqVar.b && this.a == ctqVar.a;
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), Long.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeLong(parcel, 3, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
