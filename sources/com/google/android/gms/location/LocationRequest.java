package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bbx;
import flm.bcx;
import flm.bdv;
import flm.bdy;
import flm.cru;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cru();
    public int a;
    public long b;
    public long c;
    public boolean d;
    public long e;
    public int f;
    public float g;
    public long h;

    public LocationRequest() {
        this.a = 102;
        this.b = 3600000L;
        this.c = 600000L;
        this.d = false;
        this.e = Long.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0L;
    }

    private final long a() {
        long j = this.h;
        if (j < this.b) {
            return this.b;
        }
        return j;
    }

    public static void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(new StringBuilder(38).append("invalid interval: ").append(j).toString());
        }
    }

    public static void a(int i) {
        switch (i) {
            case bbx.LOG_WTF_CLIENTS_PER_CONNECTION_THRESHOLD /* 100 */:
            case 102:
            case 104:
            case 105:
                return;
            case 101:
            case 103:
            default:
                throw new IllegalArgumentException(new StringBuilder(28).append("invalid quality: ").append(i).toString());
        }
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i2;
        this.g = f;
        this.h = j4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeLong(parcel, 2, this.b);
        bdy.writeLong(parcel, 3, this.c);
        bdy.writeBoolean(parcel, 4, this.d);
        bdy.writeLong(parcel, 5, this.e);
        bdy.writeInt(parcel, 6, this.f);
        bdy.writeFloat(parcel, 7, this.g);
        bdy.writeLong(parcel, 8, this.h);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        StringBuilder sbAppend = sb.append("Request[");
        switch (this.a) {
            case bbx.LOG_WTF_CLIENTS_PER_CONNECTION_THRESHOLD /* 100 */:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 101:
            case 103:
            default:
                str = "???";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
        }
        sbAppend.append(str);
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b).append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c).append("ms");
        if (this.h > this.b) {
            sb.append(" maxWait=");
            sb.append(this.h).append("ms");
        }
        if (this.g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.g).append("m");
        }
        if (this.e != Long.MAX_VALUE) {
            long jElapsedRealtime = this.e - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(jElapsedRealtime).append("ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=").append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && a() == locationRequest.a();
    }
}
