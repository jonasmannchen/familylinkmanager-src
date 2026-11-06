package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anh extends bdv {
    public static final Parcelable.Creator CREATOR = new ani();
    public final int[] a;

    public anh(int[] iArr) {
        this.a = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeIntArray(parcel, 2, this.a, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TimeIntervals=");
        if (this.a == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.a;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
