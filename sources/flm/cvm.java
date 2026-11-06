package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvm extends bdv {
    public static final Parcelable.Creator CREATOR = new cvn();
    public final boolean a;
    public final String b;
    public final String c;

    cvm(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvm)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cvm cvmVar = (cvm) obj;
        return bcx.equal(Boolean.valueOf(this.a), Boolean.valueOf(cvmVar.a)) && bcx.equal(this.b, cvmVar.b) && bcx.equal(this.c, cvmVar.c);
    }

    public final int hashCode() {
        return bcx.hashCode(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("isLastCallback", Boolean.valueOf(this.a)).add("query", this.b).add("widgetName", this.c).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeBoolean(parcel, 2, this.a);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
