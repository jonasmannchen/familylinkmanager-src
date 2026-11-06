package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cry extends bdv {
    public static final Parcelable.Creator CREATOR = new crz();
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    cry(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeInt(parcel, 2, this.b);
        bdy.writeLong(parcel, 3, this.c);
        bdy.writeLong(parcel, 4, this.d);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cry cryVar = (cry) obj;
        return this.a == cryVar.a && this.b == cryVar.b && this.c == cryVar.c && this.d == cryVar.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkLocationStatus:");
        sb.append(" Wifi status: ").append(this.a).append(" Cell status: ").append(this.b).append(" elapsed time NS: ").append(this.d).append(" system time ms: ").append(this.c);
        return sb.toString();
    }
}
