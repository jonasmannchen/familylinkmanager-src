package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class bdt extends bdv {
    public static final Parcelable.Creator CREATOR = new bdu();
    public final int mVersionCode;

    bdt(int i) {
        this.mVersionCode = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bdu.writeToParcel(this, parcel, i);
    }
}
