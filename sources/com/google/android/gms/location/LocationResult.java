package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bdv;
import flm.bdy;
import flm.crv;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends bdv implements ReflectedParcelable {
    public final List b;
    public static final List a = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new crv();

    public LocationResult(List list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 1, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        int i = 17;
        Iterator it = this.b.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                long time = ((Location) it.next()).getTime();
                i = ((int) (time ^ (time >>> 32))) + (i2 * 31);
            } else {
                return i2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.b.size() != this.b.size()) {
            return false;
        }
        Iterator it = locationResult.b.iterator();
        Iterator it2 = this.b.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 27).append("LocationResult[locations: ").append(strValueOf).append("]").toString();
    }
}
