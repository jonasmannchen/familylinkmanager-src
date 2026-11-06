package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csx extends bdv {
    public LocationRequest b;
    public List c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public static final List a = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new csy();

    @Deprecated
    public static csx a(LocationRequest locationRequest) {
        return new csx(locationRequest, a, null, false, false, false, null);
    }

    csx(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.b = locationRequest;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 1, this.b, i, false);
        bdy.writeTypedList(parcel, 5, this.c, false);
        bdy.writeString(parcel, 6, this.d, false);
        bdy.writeBoolean(parcel, 7, this.e);
        bdy.writeBoolean(parcel, 8, this.f);
        bdy.writeBoolean(parcel, 9, this.g);
        bdy.writeString(parcel, 10, this.h, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (this.d != null) {
            sb.append(" tag=").append(this.d);
        }
        if (this.h != null) {
            sb.append(" moduleId=").append(this.h);
        }
        sb.append(" hideAppOps=").append(this.e);
        sb.append(" clients=").append(this.c);
        sb.append(" forceCoarseLocation=").append(this.f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof csx)) {
            return false;
        }
        csx csxVar = (csx) obj;
        return bcx.equal(this.b, csxVar.b) && bcx.equal(this.c, csxVar.c) && bcx.equal(this.d, csxVar.d) && this.e == csxVar.e && this.f == csxVar.f && this.g == csxVar.g && bcx.equal(this.h, csxVar.h);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
