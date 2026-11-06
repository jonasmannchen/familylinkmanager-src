package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import flm.bqc;
import flm.bqd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = new bqc();
    private long c;
    private long d;

    public PeriodicTask(bqd bqdVar) {
        super(bqdVar);
        this.c = -1L;
        this.d = -1L;
        this.c = bqdVar.a;
        this.d = Math.min(bqdVar.b, this.c);
    }

    @Deprecated
    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.c = -1L;
        this.d = -1L;
        this.c = parcel.readLong();
        this.d = Math.min(parcel.readLong(), this.c);
    }

    @Override // com.google.android.gms.gcm.Task
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("period", this.c);
        bundle.putLong("period_flex", this.d);
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }

    public String toString() {
        String string = super.toString();
        long j = this.c;
        return new StringBuilder(String.valueOf(string).length() + 54).append(string).append(" period=").append(j).append(" flex=").append(this.d).toString();
    }
}
