package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkb extends bdv implements bjo {
    public static final Parcelable.Creator CREATOR = new bka();
    public final ArrayList a;
    public final ArrayList b;
    public final blf c;

    public bkb(ArrayList arrayList, ArrayList arrayList2, blf blfVar) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = blfVar;
    }

    public bkb(HashSet hashSet, HashSet hashSet2, blf blfVar) {
        this(hashSet == null ? null : new ArrayList(hashSet), hashSet2 == null ? null : new ArrayList(hashSet2), (blf) bdi.checkNotNull(blfVar));
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkb)) {
            return false;
        }
        bkb bkbVar = (bkb) obj;
        return bcx.equal(this.a, bkbVar.a) && bcx.equal(this.b, bkbVar.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 2, this.a, false);
        bdy.writeStringList(parcel, 3, this.b, false);
        bdy.writeParcelable(parcel, 4, this.c, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("contexts=[");
        if (this.a != null && this.a.size() > 0) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                sb.append(((bkc) obj).b).append(bdp.WHITELIST_DELIMITER);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
