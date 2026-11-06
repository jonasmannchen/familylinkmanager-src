package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import flm.bpz;
import flm.bqa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator CREATOR = new bpz();
    private final long c;
    private final long d;

    public OneoffTask(bqa bqaVar) {
        super(bqaVar);
        this.c = bqaVar.a;
        this.d = bqaVar.b;
    }

    @Deprecated
    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.c = parcel.readLong();
        this.d = parcel.readLong();
    }

    @Override // com.google.android.gms.gcm.Task
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("window_start", this.c);
        bundle.putLong("window_end", this.d);
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
        return new StringBuilder(String.valueOf(string).length() + 64).append(string).append(" windowStart=").append(j).append(" windowEnd=").append(this.d).toString();
    }
}
