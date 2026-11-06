package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyi extends bdv implements cyg {
    public static final Parcelable.Creator CREATOR = new cyh();
    public final Integer a;
    public final Boolean b;

    public cyi(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeIntegerObject(parcel, 3, this.a, false);
        bdy.writeBooleanObject(parcel, 4, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.cyg
    public final Integer a() {
        return this.a;
    }

    @Override // flm.cyg
    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyg)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cyg cygVar = (cyg) obj;
        return bcx.equal(a(), cygVar.a()) && bcx.equal(b(), cygVar.b());
    }

    public final int hashCode() {
        return bcx.hashCode(a(), b());
    }
}
