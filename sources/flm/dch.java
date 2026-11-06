package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dch extends bdv {
    public static final Parcelable.Creator CREATOR = new dci();
    public final int[] a;

    public dch(int[] iArr) {
        this.a = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeIntArray(parcel, 2, this.a, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dch)) {
            return false;
        }
        return Arrays.equals(this.a, ((dch) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("SettingId", Arrays.toString(this.a)).toString();
    }
}
