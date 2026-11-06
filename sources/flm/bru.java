package flm;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bru extends bdv {
    public static final Parcelable.Creator CREATOR = new brv();
    public final int a;
    public final String b;
    public final Intent c;

    public bru(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeParcelable(parcel, 4, this.c, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
