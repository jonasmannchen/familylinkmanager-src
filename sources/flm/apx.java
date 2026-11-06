package flm;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apx extends bdv {
    public final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final apx a = new apx(0);
    public static final Parcelable.Creator CREATOR = new apy();

    apx(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public apx(int i) {
        this(i, null, null);
    }

    public apx(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    private apx(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, null);
    }

    public final boolean a() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean b() {
        return this.c == 0;
    }

    static String a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                return new StringBuilder(31).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof apx)) {
            return false;
        }
        apx apxVar = (apx) obj;
        return this.c == apxVar.c && bcx.equal(this.d, apxVar.d) && bcx.equal(this.e, apxVar.e);
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.c), this.d, this.e);
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("statusCode", a(this.c)).add("resolution", this.d).add("message", this.e).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.b);
        bdy.writeInt(parcel, 2, this.c);
        bdy.writeParcelable(parcel, 3, this.d, i, false);
        bdy.writeString(parcel, 4, this.e, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
