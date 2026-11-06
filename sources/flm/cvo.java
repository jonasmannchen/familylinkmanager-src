package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvo extends bdv {
    public static final Parcelable.Creator CREATOR = new cvp();
    public int a;
    public List b;
    public String c;

    public cvo() {
    }

    public cvo(int i, List list, String str) {
        this.a = i;
        this.b = list;
        this.c = str;
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("spamStatus", Integer.valueOf(this.a)).add("person", this.b).add("matchingId", this.c).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List listEmptyList;
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        if (this.b == null) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = this.b;
        }
        bdy.writeTypedList(parcel, 3, listEmptyList, false);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
