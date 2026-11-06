package flm;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class any extends bdv {
    public static final Parcelable.Creator CREATOR = new anz();
    public final int a;
    public final Intent b;
    public final int c;
    public String d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public boolean j;
    public boolean k;
    public List l;
    public boolean m;
    public String n;
    public int o;
    public int p;

    any(int i, Intent intent, int i2, String str, int i3, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, List list, boolean z6, String str3) {
        this.e = -1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.j = true;
        this.k = false;
        this.m = true;
        this.a = i;
        this.b = intent;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str2;
        this.j = z4;
        this.k = z5;
        this.l = list;
        this.m = z6;
        this.n = str3;
        this.o = -1;
        this.p = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeParcelable(parcel, 2, this.b, i, false);
        bdy.writeInt(parcel, 3, this.c);
        bdy.writeString(parcel, 4, this.d, false);
        bdy.writeInt(parcel, 6, this.e);
        bdy.writeBoolean(parcel, 7, this.f);
        bdy.writeBoolean(parcel, 8, this.g);
        bdy.writeBoolean(parcel, 9, this.h);
        bdy.writeString(parcel, 10, this.i, false);
        bdy.writeBoolean(parcel, 11, this.j);
        bdy.writeBoolean(parcel, 12, this.k);
        bdy.writeStringList(parcel, 13, this.l, false);
        bdy.writeBoolean(parcel, 14, this.m);
        bdy.writeString(parcel, 15, this.n, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public any(Intent intent, int i, String str) {
        this(3, intent, 2, str, -1, false, false, false, null, true, false, null, true, null);
    }
}
