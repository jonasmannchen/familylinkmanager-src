package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anj extends bdv {
    public static final Parcelable.Creator CREATOR = new ank();
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final int[] e;

    public anj(float f, float f2, float f3, int i, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeFloat(parcel, 2, this.a);
        bdy.writeFloat(parcel, 3, this.b);
        bdy.writeFloat(parcel, 4, this.c);
        bdy.writeInt(parcel, 5, this.d);
        bdy.writeIntArray(parcel, 6, this.e, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private final float a(int i) {
        return a(i, this.c);
    }

    private final float b(int i) {
        return a(i, this.b);
    }

    private final float c(int i) {
        return a(i, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temp=").append(c(1)).append("F/").append(c(2)).append("C, Feels=").append(b(1)).append("F/").append(b(2)).append("C, Dew=").append(a(1)).append("F/").append(a(2)).append("C, Humidity=").append(this.d).append(", Condition=");
        if (this.e == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.e;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(bdp.WHITELIST_DELIMITER);
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    private static float a(int i, float f) {
        switch (i) {
            case 1:
                return f;
            case 2:
                return (5.0f * (f - 32.0f)) / 9.0f;
            default:
                Integer numValueOf = Integer.valueOf(i);
                if (alc.a(6)) {
                    Log.e("ctxmgr", alc.a("WeatherImpl", "Invalid temperature unit %s", numValueOf));
                }
                throw new IllegalArgumentException("Invalid temperature unit");
        }
    }
}
