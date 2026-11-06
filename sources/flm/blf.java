package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blf extends bdv {
    public static final Parcelable.Creator CREATOR = new blh();
    public final int a;
    public final int b;
    public final int[] c;

    public blf(int i, int i2, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = iArr;
    }

    private final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof blf)) {
            return false;
        }
        blf blfVar = (blf) obj;
        if (blfVar.b == this.b && blfVar.a == this.a && a() == blfVar.a()) {
            if (!a()) {
                return true;
            }
            if (this.c.length != blfVar.c.length) {
                return false;
            }
            for (int i : blfVar.c) {
                int[] iArr = this.c;
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (iArr[i2] == i) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.c != null) {
            int[] iArr = this.c;
            int length = iArr.length;
            int i2 = 0;
            i = 0;
            while (i2 < length) {
                int i3 = (iArr[i2] * 13) + i;
                i2++;
                i = i3;
            }
        } else {
            i = 0;
        }
        return bcx.hashCode(Integer.valueOf(i), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeInt(parcel, 3, this.b);
        bdy.writeIntArray(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
