package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bqb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PendingCallback implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bqb();
    public final IBinder a;

    public PendingCallback(Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }
}
