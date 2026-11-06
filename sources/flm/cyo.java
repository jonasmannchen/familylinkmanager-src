package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyo extends bdv implements cym {
    public static final Parcelable.Creator CREATOR = new cyn();
    public final cyi a;
    public final String b;

    public cyo(cyi cyiVar, String str) {
        this.a = cyiVar;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.cym
    public final cyg a() {
        return this.a;
    }

    @Override // flm.cym
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cym)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cym cymVar = (cym) obj;
        return bcx.equal(a(), cymVar.a()) && bcx.equal(b(), cymVar.b());
    }

    public final int hashCode() {
        return bcx.hashCode(a(), b());
    }
}
