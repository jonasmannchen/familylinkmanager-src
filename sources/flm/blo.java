package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blo extends bdv {
    public static final Parcelable.Creator CREATOR = new blp();
    public ArrayList a;

    blo(ArrayList arrayList) {
        this.a = arrayList;
    }

    public blo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 3, this.a, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
