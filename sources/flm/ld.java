package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ld implements Parcelable {
    public static final Parcelable.Creator CREATOR = new le();
    public final int[] a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final CharSequence g;
    public final int h;
    public final CharSequence i;
    public final ArrayList j;
    public final ArrayList k;
    public final boolean l;

    public ld(lb lbVar) {
        int size = lbVar.b.size();
        this.a = new int[size * 6];
        if (!lbVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            lc lcVar = (lc) lbVar.b.get(i2);
            int i3 = i + 1;
            this.a[i] = lcVar.a;
            int i4 = i3 + 1;
            this.a[i3] = lcVar.b != null ? lcVar.b.g : -1;
            int i5 = i4 + 1;
            this.a[i4] = lcVar.c;
            int i6 = i5 + 1;
            this.a[i5] = lcVar.d;
            int i7 = i6 + 1;
            this.a[i6] = lcVar.e;
            i = i7 + 1;
            this.a[i7] = lcVar.f;
        }
        this.b = lbVar.g;
        this.c = lbVar.h;
        this.d = lbVar.j;
        this.e = lbVar.l;
        this.f = lbVar.m;
        this.g = lbVar.n;
        this.h = lbVar.o;
        this.i = lbVar.p;
        this.j = lbVar.q;
        this.k = lbVar.r;
        this.l = lbVar.s;
    }

    public ld(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        this.l = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        parcel.writeInt(this.l ? 1 : 0);
    }
}
