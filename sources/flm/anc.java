package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anc extends bdv {
    public static final Parcelable.Creator CREATOR = new and();
    public final int a;

    public anc(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        if (this.a == 1) {
            return "ScreenState: SCREEN_OFF";
        }
        if (this.a == 2) {
            return "ScreenState: SCREEN_ON";
        }
        return "ScreenState: UNKNOWN";
    }
}
