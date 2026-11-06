package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crc extends bdv {
    public static final Parcelable.Creator CREATOR = new crd();
    public boolean a;
    public long b;
    public float c;
    public long d;
    public int e;

    crc(boolean z, long j, float f, long j2, int i) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
    }

    public crc() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeBoolean(parcel, 1, this.a);
        bdy.writeLong(parcel, 2, this.b);
        bdy.writeFloat(parcel, 3, this.c);
        bdy.writeLong(parcel, 4, this.d);
        bdy.writeInt(parcel, 5, this.e);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=").append(this.a);
        sb.append(" mMinimumSamplingPeriodMs=").append(this.b);
        sb.append(" mSmallestAngleChangeRadians=").append(this.c);
        if (this.d != Long.MAX_VALUE) {
            long jElapsedRealtime = this.d - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(jElapsedRealtime).append("ms");
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(" num=").append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int hashCode() {
        return bcx.hashCode(Boolean.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crc)) {
            return false;
        }
        crc crcVar = (crc) obj;
        return this.a == crcVar.a && this.b == crcVar.b && Float.compare(this.c, crcVar.c) == 0 && this.d == crcVar.d && this.e == crcVar.e;
    }
}
