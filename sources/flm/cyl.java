package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyl extends bdv implements cyj {
    public static final Parcelable.Creator CREATOR = new cyk();
    public final cyi a;
    public final String b;
    public final String c;

    public cyl(cyi cyiVar, String str, String str2) {
        this.a = cyiVar;
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

    @Override // flm.cyj
    public final cyg a() {
        return this.a;
    }

    @Override // flm.cyj
    public final String b() {
        return this.b;
    }

    @Override // flm.cyj
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cyj cyjVar = (cyj) obj;
        return bcx.equal(a(), cyjVar.a()) && bcx.equal(b(), cyjVar.b()) && bcx.equal(c(), cyjVar.c());
    }

    public final int hashCode() {
        return bcx.hashCode(a(), b(), c());
    }
}
