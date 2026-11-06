package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.aud;
import flm.bdi;
import flm.bdv;
import flm.bdy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aud();
    public final int a;
    public final String b;

    public Scope(int i, String str) {
        bdi.checkNotEmpty(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeString(parcel, 2, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
