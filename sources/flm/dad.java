package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dad extends bdv {
    public static final Parcelable.Creator CREATOR = new dae();
    public final int a;
    public final apx b;
    public final bdl c;

    dad(int i, apx apxVar, bdl bdlVar) {
        this.a = i;
        this.b = apxVar;
        this.c = bdlVar;
    }

    public dad(int i) {
        this(new apx(8, null), null);
    }

    private dad(apx apxVar, bdl bdlVar) {
        this(1, apxVar, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeParcelable(parcel, 2, this.b, i, false);
        bdy.writeParcelable(parcel, 3, this.c, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
