package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvs extends bdv {
    public static final Parcelable.Creator CREATOR = new cvt();
    public final List a;
    public final String b;

    public cvs(List list, String str) {
        this.a = list == null ? Collections.emptyList() : list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvs)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cvs cvsVar = (cvs) obj;
        return bcx.equal(this.a, cvsVar.a) && bcx.equal(this.b, cvsVar.b);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 2, this.a, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("matches", this.a).add("query", this.b).toString();
    }

    static {
        new cvs(Collections.emptyList(), null);
    }
}
