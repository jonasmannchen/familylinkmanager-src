package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwc extends bdv {
    public static final Parcelable.Creator CREATOR = new cwd();
    public boolean a;

    public cwc() {
    }

    public cwc(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeBoolean(parcel, 2, this.a);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
