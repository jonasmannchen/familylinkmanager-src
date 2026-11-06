package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqz extends bdv {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;

    public final int a() {
        int i = this.a;
        if (i > 21 || i < 0) {
            return 4;
        }
        return i;
    }

    public cqz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeInt(parcel, 2, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cqz)) {
            return false;
        }
        cqz cqzVar = (cqz) obj;
        return this.a == cqzVar.a && this.b == cqzVar.b;
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        String string;
        int iA = a();
        switch (iA) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                string = "IN_VEHICLE";
                break;
            case 1:
                string = "ON_BICYCLE";
                break;
            case 2:
                string = "ON_FOOT";
                break;
            case 3:
                string = "STILL";
                break;
            case 4:
                string = "UNKNOWN";
                break;
            case 5:
                string = "TILTING";
                break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                string = Integer.toString(iA);
                break;
            case 7:
                string = "WALKING";
                break;
            case 8:
                string = "RUNNING";
                break;
            case 16:
                string = "IN_ROAD_VEHICLE";
                break;
            case 17:
                string = "IN_RAIL_VEHICLE";
                break;
        }
        return new StringBuilder(String.valueOf(string).length() + 48).append("DetectedActivity [type=").append(string).append(", confidence=").append(this.b).append("]").toString();
    }

    static {
        new cra();
        CREATOR = new crb();
    }
}
