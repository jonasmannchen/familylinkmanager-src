package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import flm.bdy;
import flm.bft;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = new bft();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    private final long i;
    private int j;
    private final String k;
    private long l;

    public ConnectionEvent(int i, long j, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this.a = i;
        this.i = j;
        this.j = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.l = -1L;
        this.f = str5;
        this.k = str6;
        this.g = j2;
        this.h = j3;
    }

    public ConnectionEvent(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this(1, j, i, str, str2, str3, str4, str5, str6, j2, j3);
    }

    private ConnectionEvent(ConnectionEvent connectionEvent) {
        this(connectionEvent.a, connectionEvent.a(), connectionEvent.b(), connectionEvent.b, connectionEvent.c, connectionEvent.d, connectionEvent.e, connectionEvent.f, connectionEvent.c(), connectionEvent.g, connectionEvent.h);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long a() {
        return this.i;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int b() {
        return this.j;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String c() {
        return this.k;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long d() {
        return this.l;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final StatsEvent a(StatsEvent statsEvent) {
        if (!(statsEvent instanceof ConnectionEvent)) {
            return statsEvent;
        }
        ConnectionEvent connectionEvent = (ConnectionEvent) statsEvent;
        ConnectionEvent connectionEvent2 = new ConnectionEvent(connectionEvent);
        connectionEvent2.j = b();
        return (ConnectionEvent) connectionEvent2.a(this.g - connectionEvent.g);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long e() {
        return 0L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeLong(parcel, 2, a());
        bdy.writeString(parcel, 4, this.b, false);
        bdy.writeString(parcel, 5, this.c, false);
        bdy.writeString(parcel, 6, this.d, false);
        bdy.writeString(parcel, 7, this.e, false);
        bdy.writeString(parcel, 8, this.f, false);
        bdy.writeLong(parcel, 10, this.g);
        bdy.writeLong(parcel, 11, this.h);
        bdy.writeInt(parcel, 12, b());
        bdy.writeString(parcel, 13, c(), false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String f() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f == null ? "" : this.f;
        return new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length()).append("\t").append(str).append("/").append(str2).append("\t").append(str3).append("/").append(str4).append("\t").append(str5).append("\t").append(this.h).toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final /* synthetic */ StatsEvent g() {
        this.j = 6;
        return this;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final /* synthetic */ StatsEvent a(long j) {
        this.l = j;
        return this;
    }
}
