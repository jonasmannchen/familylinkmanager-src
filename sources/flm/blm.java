package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blm extends bdv {
    public static final Parcelable.Creator CREATOR = new bln();
    public final long a;
    public final long b;

    public blm(long j, long j2) {
        bdi.checkArgument(j >= -1);
        bdi.checkArgument(j2 > -1);
        if (j != -1) {
            bdi.checkArgument(j <= j2);
        }
        this.a = j;
        this.b = j2;
    }

    public final int hashCode() {
        return bcx.hashCode(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blm)) {
            return false;
        }
        blm blmVar = (blm) obj;
        return this.a == blmVar.a && this.b == blmVar.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeLong(parcel, 2, this.a);
        bdy.writeLong(parcel, 3, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
