package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcj extends bdv {
    public static final Parcelable.Creator CREATOR = new dcm();
    public final List a;
    public final int[] b;
    public final boolean c;

    public dcj(List list, int[] iArr, boolean z) {
        this.a = list;
        this.b = iArr;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 2, this.a, false);
        bdy.writeIntArray(parcel, 3, this.b, false);
        bdy.writeBoolean(parcel, 4, this.c);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof dcj)) {
            dcj dcjVar = (dcj) obj;
            return this.a.equals(dcjVar.a) && Arrays.equals(this.b, dcjVar.b) && this.c == dcjVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("Settings", this.a).add("ConsentableSettings", Arrays.toString(this.b)).add("CanMostLikelyStartConsentFlow", Boolean.valueOf(this.c)).toString();
    }
}
