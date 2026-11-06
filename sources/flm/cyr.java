package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyr extends bdv implements cyp {
    public static final Parcelable.Creator CREATOR = new cyq();
    public final String a;
    public final Integer b;

    public cyr(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeIntegerObject(parcel, 3, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.cyp
    public final String a() {
        return this.a;
    }

    @Override // flm.cyp
    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cyp cypVar = (cyp) obj;
        return bcx.equal(a(), cypVar.a()) && bcx.equal(b(), cypVar.b());
    }

    public final int hashCode() {
        return bcx.hashCode(a(), b());
    }
}
