package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cxu extends bdv implements cxs {
    public static final Parcelable.Creator CREATOR = new cxt();
    public final cyi a;
    public final Long b;

    public cxu(cyi cyiVar, Long l) {
        this.a = cyiVar;
        this.b = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeLongObject(parcel, 3, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.cxs
    public final cyg a() {
        return this.a;
    }

    @Override // flm.cxs
    public final Long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cxs)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cxs cxsVar = (cxs) obj;
        return bcx.equal(a(), cxsVar.a()) && bcx.equal(b(), cxsVar.b());
    }

    public final int hashCode() {
        return bcx.hashCode(a(), b());
    }
}
