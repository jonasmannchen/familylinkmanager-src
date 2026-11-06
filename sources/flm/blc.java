package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blc extends bdv {
    public static final Parcelable.Creator CREATOR = new ble();
    public final String[] a;
    public final String[] b;
    public final String[] c;

    public blc(String[] strArr, String[] strArr2, String[] strArr3) {
        this.a = strArr;
        this.b = strArr2;
        this.c = strArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeStringArray(parcel, 2, this.a, false);
        bdy.writeStringArray(parcel, 3, this.b, false);
        bdy.writeStringArray(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + Arrays.hashCode(this.b) + Arrays.hashCode(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blc)) {
            return false;
        }
        blc blcVar = (blc) obj;
        return Arrays.equals(this.a, blcVar.a) && Arrays.equals(this.b, blcVar.b) && Arrays.equals(this.c, blcVar.c);
    }
}
