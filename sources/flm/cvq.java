package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvq extends bdv {
    public static final Parcelable.Creator CREATOR = new cvr();
    public String a;
    public List b;

    public cvq() {
    }

    public cvq(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List listEmptyList;
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        if (this.b == null) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = this.b;
        }
        bdy.writeTypedList(parcel, 3, listEmptyList, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
