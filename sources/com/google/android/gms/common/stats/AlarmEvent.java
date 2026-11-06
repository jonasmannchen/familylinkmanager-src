package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bdp;
import flm.bdv;
import flm.bdy;
import flm.bfq;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AlarmEvent extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bfq();
    public final int a;
    public final long b;
    public int c;
    public final String d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final int i;
    public int j;
    public final String k;
    public final float l;

    public AlarmEvent(int i, long j, int i2, String str, long j2, long j3, long j4, List list, int i3, int i4, String str2, float f) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
        this.i = i3;
        this.j = i4;
        this.k = str2;
        this.l = f;
    }

    public AlarmEvent(long j, int i, String str, long j2, long j3, long j4, List list, int i2, int i3, String str2, float f) {
        this(1, j, i, str, j2, j3, j4, list, i2, i3, str2, f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeLong(parcel, 2, this.b);
        bdy.writeInt(parcel, 3, this.c);
        bdy.writeString(parcel, 4, this.d, false);
        bdy.writeLong(parcel, 5, this.e);
        bdy.writeLong(parcel, 6, this.f);
        bdy.writeLong(parcel, 7, this.g);
        bdy.writeStringList(parcel, 8, this.h, false);
        bdy.writeInt(parcel, 9, this.i);
        bdy.writeInt(parcel, 10, this.j);
        bdy.writeString(parcel, 11, this.k, false);
        bdy.writeFloat(parcel, 12, this.l);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        String strJoin;
        long j = this.b;
        int i = this.c;
        String str = this.d;
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        int i2 = this.i;
        if (this.h == null) {
            strJoin = "";
        } else {
            strJoin = TextUtils.join(bdp.WHITELIST_DELIMITER, this.h);
        }
        int i3 = this.j;
        String str2 = this.k == null ? "" : this.k;
        return new StringBuilder(String.valueOf(str).length() + 138 + String.valueOf(strJoin).length() + String.valueOf(str2).length()).append(j).append("\t").append(i).append("\t").append(str).append("\t").append(j2).append("\t").append(j3).append("\t").append(j4).append("\t").append(i2).append("\t").append(strJoin).append("\t").append(i3).append("\t").append(str2).append("\t").append(this.l).toString();
    }
}
