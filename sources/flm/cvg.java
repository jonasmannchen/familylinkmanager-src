package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvg extends bdv {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public long b;
    public String c;

    public cvg(byte[] bArr, long j, String str) {
        this.a = bArr;
        this.b = j;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeByteArray(parcel, 2, this.a, false);
        bdy.writeLong(parcel, 3, this.b);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvg)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cvg cvgVar = (cvg) obj;
        return Arrays.equals(this.a, cvgVar.a) && bcx.equal(Long.valueOf(this.b), Long.valueOf(cvgVar.b)) && bcx.equal(this.c, cvgVar.c);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + bcx.hashCode(Long.valueOf(this.b), this.c);
    }

    static {
        new cvg(null, Long.MIN_VALUE, null);
        CREATOR = new cvh();
    }
}
