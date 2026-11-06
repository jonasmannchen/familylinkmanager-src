package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bcx;
import flm.bdi;
import flm.bdv;
import flm.bdy;
import flm.cxo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AvatarReference extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cxo();
    public final int a;

    @Deprecated
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Long h;

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        bdi.checkState(i != 0);
        this.a = i;
        this.b = TextUtils.isEmpty(str) ? null : str;
        this.c = TextUtils.isEmpty(str2) ? null : str2;
        this.d = TextUtils.isEmpty(str3) ? null : str3;
        this.e = TextUtils.isEmpty(str4) ? null : str4;
        this.f = TextUtils.isEmpty(str5) ? null : str5;
        this.g = l;
        this.h = l2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeString(parcel, 2, this.b, false);
        bdy.writeString(parcel, 3, this.c, false);
        bdy.writeString(parcel, 4, this.d, false);
        bdy.writeString(parcel, 5, this.e, false);
        bdy.writeString(parcel, 6, this.f, false);
        bdy.writeLongObject(parcel, 7, this.g, false);
        bdy.writeLongObject(parcel, 8, this.h, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvatarReference avatarReference = (AvatarReference) obj;
        return this.a == avatarReference.a && bcx.equal(this.b, avatarReference.b) && bcx.equal(this.c, avatarReference.c) && bcx.equal(this.d, avatarReference.d) && bcx.equal(this.e, avatarReference.e) && bcx.equal(this.f, avatarReference.f) && bcx.equal(this.g, avatarReference.g) && bcx.equal(this.h, avatarReference.h);
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), this.b, this.c, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("source", Integer.valueOf(this.a)).add("location", this.b).add("url", this.c).add("email", this.d).add("account", this.e).add("focusId", this.f).add("contactId", this.g).add("rawContactId", this.h).toString();
    }
}
