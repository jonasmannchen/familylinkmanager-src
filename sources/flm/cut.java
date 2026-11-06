package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cut extends bdv implements cug {
    public static final Parcelable.Creator CREATOR = new cuu();
    public static final int[] d = {1, 2};
    public final String a;
    public final boolean b;
    public final boolean c;

    public cut(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // flm.cug
    public final boolean a() {
        return this.b;
    }

    @Override // flm.cug
    public final boolean c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeBoolean(parcel, 3, this.b);
        bdy.writeBoolean(parcel, 4, this.c);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
