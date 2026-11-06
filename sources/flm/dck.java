package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dck extends bdv {
    public static final Parcelable.Creator CREATOR = new dbw();
    public final boolean a;

    public dck(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeBoolean(parcel, 2, this.a);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof dck) && this.a == ((dck) obj).a;
    }

    public final int hashCode() {
        return bcx.hashCode(Boolean.valueOf(this.a));
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("CanShowValue", Boolean.valueOf(this.a)).toString();
    }
}
