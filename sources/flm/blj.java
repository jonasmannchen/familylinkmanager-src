package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blj extends bdv {
    public static final Parcelable.Creator CREATOR = new bli();

    blj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bdy.finishObjectHeader(parcel, bdy.beginObjectHeader(parcel));
    }
}
