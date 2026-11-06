package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddk extends bdv {
    public static final Parcelable.Creator CREATOR = new ddi();
    public final String a;
    public final byte[] b;
    public List c;

    public ddk(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 1, this.a, false);
        bdy.writeByteArray(parcel, 2, this.b, false);
        bdy.writeIntegerList(parcel, 3, new ArrayList(this.c), false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ddk)) {
            return false;
        }
        ddk ddkVar = (ddk) obj;
        return bcx.equal(this.a, ddkVar.a) && bcx.equal(this.b, ddkVar.b) && bcx.equal(this.c, ddkVar.c);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b, this.c);
    }
}
