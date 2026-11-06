package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.ama;
import flm.bcx;
import flm.bdi;
import flm.bdv;
import flm.bdy;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TokenData extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ama();
    public final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public static TokenData a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.a = i;
        this.b = bdi.checkNotEmpty(str);
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && bcx.equal(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && bcx.equal(this.f, tokenData.f) && bcx.equal(this.g, tokenData.g);
    }

    public int hashCode() {
        return bcx.hashCode(this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeString(parcel, 2, this.b, false);
        bdy.writeLongObject(parcel, 3, this.c, false);
        bdy.writeBoolean(parcel, 4, this.d);
        bdy.writeBoolean(parcel, 5, this.e);
        bdy.writeStringList(parcel, 6, this.f, false);
        bdy.writeString(parcel, 7, this.g, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
