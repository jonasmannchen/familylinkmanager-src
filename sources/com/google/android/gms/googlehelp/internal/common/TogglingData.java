package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bdv;
import flm.bdy;
import flm.bsa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TogglingData extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bsa();
    public String a;
    public String b;
    public String c;

    public TogglingData(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    private TogglingData() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
