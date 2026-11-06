package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csc extends bdv {
    public crc c;
    public List d;
    public String e;
    public static final List a = Collections.emptyList();
    public static final crc b = new crc();
    public static final Parcelable.Creator CREATOR = new csd();

    csc(crc crcVar, List list, String str) {
        this.c = crcVar;
        this.d = list;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 1, this.c, i, false);
        bdy.writeTypedList(parcel, 2, this.d, false);
        bdy.writeString(parcel, 3, this.e, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof csc)) {
            return false;
        }
        csc cscVar = (csc) obj;
        return bcx.equal(this.c, cscVar.c) && bcx.equal(this.d, cscVar.d) && bcx.equal(this.e, cscVar.e);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String str = this.e;
        return new StringBuilder(String.valueOf(strValueOf).length() + 77 + String.valueOf(strValueOf2).length() + String.valueOf(str).length()).append("DeviceOrientationRequestInternal{deviceOrientationRequest=").append(strValueOf).append(", clients=").append(strValueOf2).append(", tag='").append(str).append("'}").toString();
    }
}
