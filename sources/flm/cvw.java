package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvw extends bdv {
    public static final Parcelable.Creator CREATOR = new cvx();
    public String a;
    public String b;
    public String c;
    public cvs d;
    public String e;

    public cvw() {
    }

    public cvw(String str, String str2, String str3, cvs cvsVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cvsVar;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cvw cvwVar = (cvw) obj;
        return bcx.equal(this.a, cvwVar.a) && bcx.equal(this.b, cvwVar.b) && bcx.equal(this.c, cvwVar.c) && bcx.equal(this.d, cvwVar.d) && bcx.equal(this.e, cvwVar.e);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("displayName", this.a).add("givenName", this.b).add("familyName", this.c).add("matchInfo", this.d).add("alternativeDisplayName", this.e).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.writeParcelable(parcel, 5, this.d, i, false);
        bdy.writeString(parcel, 6, this.e, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
