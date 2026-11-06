package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcl extends bdv {
    public static final Parcelable.Creator CREATOR = new dcp();
    public final int a;
    public final int b;
    public final dck c;

    public dcl(int i, int i2, dck dckVar) {
        this.a = i;
        this.b = i2;
        this.c = dckVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeInt(parcel, 3, this.b);
        bdy.writeParcelable(parcel, 4, this.c, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof dcl)) {
            dcl dclVar = (dcl) obj;
            return this.a == dclVar.a && this.b == dclVar.b && bcx.equal(this.c, dclVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("SettingId", Integer.valueOf(this.a)).add("SettingValue", Integer.valueOf(this.b)).add("SettingAvailability", this.c).toString();
    }
}
