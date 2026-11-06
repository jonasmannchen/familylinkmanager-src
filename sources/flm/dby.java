package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dby extends bdv {
    public static final Parcelable.Creator CREATOR = new dbz();
    public dca a;
    public String b;
    public String c;

    public dby() {
    }

    public dby(dca dcaVar, String str, String str2) {
        this.a = dcaVar;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dby)) {
            return false;
        }
        dby dbyVar = (dby) obj;
        return bcx.equal(this.b, dbyVar.b) && bcx.equal(this.c, dbyVar.c) && bcx.equal(this.a, dbyVar.a);
    }
}
