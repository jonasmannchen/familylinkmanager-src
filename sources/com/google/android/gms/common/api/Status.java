package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.atl;
import flm.aty;
import flm.aue;
import flm.bcx;
import flm.bcz;
import flm.bdv;
import flm.bdy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends bdv implements ReflectedParcelable, aty {
    public static final Parcelable.Creator CREATOR;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Status f;
    public final int g;
    public final int h;
    public final String i;
    public final PendingIntent j;

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.g = i;
        this.h = i2;
        this.i = str;
        this.j = pendingIntent;
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean a() {
        return this.h <= 0;
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.g == status.g && this.h == status.h && bcx.equal(this.i, status.i) && bcx.equal(this.j, status.j);
    }

    public final String toString() {
        String strA;
        bcz stringHelper = bcx.toStringHelper(this);
        if (this.i != null) {
            strA = this.i;
        } else {
            strA = atl.a(this.h);
        }
        return stringHelper.add("statusCode", strA).add("resolution", this.j).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.h);
        bdy.writeString(parcel, 2, this.i, false);
        bdy.writeParcelable(parcel, 3, this.j, i, false);
        bdy.writeInt(parcel, 1000, this.g);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.aty
    public final Status b() {
        return this;
    }

    static {
        new Status(17);
        f = new Status(18);
        CREATOR = new aue();
    }
}
