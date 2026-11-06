package flm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mq implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mr();
    public final String a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final Bundle i;
    public final boolean j;
    public Bundle k;
    public lg l;

    mq(lg lgVar) {
        this.a = lgVar.getClass().getName();
        this.b = lgVar.g;
        this.c = lgVar.o;
        this.d = lgVar.z;
        this.e = lgVar.A;
        this.f = lgVar.B;
        this.g = lgVar.E;
        this.h = lgVar.D;
        this.i = lgVar.i;
        this.j = lgVar.C;
    }

    mq(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readBundle();
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
    }
}
