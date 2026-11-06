package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amt extends bdv {
    public static final Parcelable.Creator CREATOR = new amv();
    public final ArrayList a;

    public amt(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 2, this.a, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        if (this.a == null || this.a.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BeaconState: ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append((anl) obj);
        }
        return sb.toString();
    }
}
