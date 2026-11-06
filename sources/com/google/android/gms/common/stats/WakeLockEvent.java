package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import flm.bdp;
import flm.bdy;
import flm.bgk;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = new bgk();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final long g;
    public int h;
    public final String i;
    public final float j;
    public final boolean k;
    private final long l;
    private int m;
    private final String n;
    private final long o;
    private long p;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.a = i;
        this.l = j;
        this.m = i2;
        this.b = str;
        this.c = str3;
        this.d = str5;
        this.e = i3;
        this.p = -1L;
        this.f = list;
        this.n = str2;
        this.g = j2;
        this.h = i4;
        this.i = str4;
        this.j = f;
        this.o = j3;
        this.k = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    private WakeLockEvent(WakeLockEvent wakeLockEvent) {
        this(wakeLockEvent.a, wakeLockEvent.a(), wakeLockEvent.b(), wakeLockEvent.b, wakeLockEvent.e, wakeLockEvent.f, wakeLockEvent.c(), wakeLockEvent.g, wakeLockEvent.h, wakeLockEvent.c, wakeLockEvent.i, wakeLockEvent.j, wakeLockEvent.e(), wakeLockEvent.d, wakeLockEvent.k);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long a() {
        return this.l;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int b() {
        return this.m;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String c() {
        return this.n;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long d() {
        return this.p;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final StatsEvent a(long j) {
        this.p = j;
        return this;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final StatsEvent a(StatsEvent statsEvent) {
        if (statsEvent instanceof WakeLockEvent) {
            WakeLockEvent wakeLockEvent = (WakeLockEvent) statsEvent;
            WakeLockEvent wakeLockEvent2 = new WakeLockEvent(wakeLockEvent);
            wakeLockEvent2.m = b();
            return wakeLockEvent2.a(this.g - wakeLockEvent.g);
        }
        return statsEvent;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long e() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeLong(parcel, 2, a());
        bdy.writeString(parcel, 4, this.b, false);
        bdy.writeInt(parcel, 5, this.e);
        bdy.writeStringList(parcel, 6, this.f, false);
        bdy.writeLong(parcel, 8, this.g);
        bdy.writeString(parcel, 10, this.c, false);
        bdy.writeInt(parcel, 11, b());
        bdy.writeString(parcel, 12, c(), false);
        bdy.writeString(parcel, 13, this.i, false);
        bdy.writeInt(parcel, 14, this.h);
        bdy.writeFloat(parcel, 15, this.j);
        bdy.writeLong(parcel, 16, e());
        bdy.writeString(parcel, 17, this.d, false);
        bdy.writeBoolean(parcel, 18, this.k);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String f() {
        String strJoin;
        String str = this.b;
        int i = this.e;
        if (this.f == null) {
            strJoin = "";
        } else {
            strJoin = TextUtils.join(bdp.WHITELIST_DELIMITER, this.f);
        }
        int i2 = this.h;
        String str2 = this.c == null ? "" : this.c;
        String str3 = this.i == null ? "" : this.i;
        float f = this.j;
        String str4 = this.d == null ? "" : this.d;
        return new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(strJoin).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length()).append("\t").append(str).append("\t").append(i).append("\t").append(strJoin).append("\t").append(i2).append("\t").append(str2).append("\t").append(str3).append("\t").append(f).append("\t").append(str4).append("\t").append(this.k).toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final /* synthetic */ StatsEvent g() {
        if (this.o != 0) {
            this.p = this.o;
        }
        if (7 == this.m) {
            this.m = 9;
        } else if (10 == this.m) {
            this.m = 12;
        }
        return this;
    }
}
