package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apq extends bdv {
    public static final Parcelable.Creator CREATOR = new apr();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final int i;

    public apq(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = i3;
    }

    public apq(String str, int i, int i2, String str2, String str3, String str4, boolean z, fnk fnkVar) {
        this.a = (String) bdi.checkNotNull(str);
        this.b = i;
        this.c = i2;
        this.g = str2;
        this.d = str3;
        this.e = str4;
        this.f = !z;
        this.h = z;
        this.i = fnkVar.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeInt(parcel, 3, this.b);
        bdy.writeInt(parcel, 4, this.c);
        bdy.writeString(parcel, 5, this.d, false);
        bdy.writeString(parcel, 6, this.e, false);
        bdy.writeBoolean(parcel, 7, this.f);
        bdy.writeString(parcel, 8, this.g, false);
        bdy.writeBoolean(parcel, 9, this.h);
        bdy.writeInt(parcel, 10, this.i);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apq)) {
            return false;
        }
        apq apqVar = (apq) obj;
        return bcx.equal(this.a, apqVar.a) && this.b == apqVar.b && this.c == apqVar.c && bcx.equal(this.g, apqVar.g) && bcx.equal(this.d, apqVar.d) && bcx.equal(this.e, apqVar.e) && this.f == apqVar.f && this.h == apqVar.h && this.i == apqVar.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayLoggerContext[");
        sb.append("package=").append(this.a).append(',');
        sb.append("packageVersionCode=").append(this.b).append(',');
        sb.append("logSource=").append(this.c).append(',');
        sb.append("logSourceName=").append(this.g).append(',');
        sb.append("uploadAccount=").append(this.d).append(',');
        sb.append("loggingId=").append(this.e).append(',');
        sb.append("logAndroidId=").append(this.f).append(',');
        sb.append("isAnonymous=").append(this.h).append(',');
        sb.append("qosTier=").append(this.i);
        sb.append("]");
        return sb.toString();
    }
}
