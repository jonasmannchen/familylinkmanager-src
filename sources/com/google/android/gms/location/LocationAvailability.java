package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bcx;
import flm.bdv;
import flm.bdy;
import flm.crs;
import flm.cry;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new crs();

    @Deprecated
    public int a;

    @Deprecated
    public int b;
    public long c;
    public int d;
    public cry[] e;

    public LocationAvailability(int i, int i2, int i3, long j, cry[] cryVarArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = cryVarArr;
    }

    public final boolean a() {
        return this.d < 1000;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeInt(parcel, 2, this.b);
        bdy.writeLong(parcel, 3, this.c);
        bdy.writeInt(parcel, 4, this.d);
        bdy.writeTypedArray(parcel, 5, this.e, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e);
    }

    public final String toString() {
        return new StringBuilder(48).append("LocationAvailability[isLocationAvailable: ").append(a()).append("]").toString();
    }
}
