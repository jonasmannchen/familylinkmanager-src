package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bcx;
import flm.bdi;
import flm.bdv;
import flm.bdy;
import flm.cqy;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActivityRecognitionResult extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cqy();
    public List a;
    public long b;
    public long c;
    public int d;
    public Bundle e;

    public String toString() {
        String strValueOf = String.valueOf(this.a);
        long j = this.b;
        return new StringBuilder(String.valueOf(strValueOf).length() + 124).append("ActivityRecognitionResult [probableActivities=").append(strValueOf).append(", timeMillis=").append(j).append(", elapsedRealtimeMillis=").append(this.c).append("]").toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.b == activityRecognitionResult.b && this.c == activityRecognitionResult.c && this.d == activityRecognitionResult.d && bcx.equal(this.a, activityRecognitionResult.a) && a(this.e, activityRecognitionResult.e);
    }

    private static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || (bundle != null && bundle2 == null)) {
            return false;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return bcx.hashCode(Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d), this.a, this.e);
    }

    public ActivityRecognitionResult(List list, long j, long j2, int i, Bundle bundle) {
        bdi.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        bdi.checkArgument(j > 0 && j2 > 0, "Must set times");
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 1, this.a, false);
        bdy.writeLong(parcel, 2, this.b);
        bdy.writeLong(parcel, 3, this.c);
        bdy.writeInt(parcel, 4, this.d);
        bdy.writeBundle(parcel, 5, this.e, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
