package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqb extends bdv {
    public static final Parcelable.Creator CREATOR = new aqc();
    public final String a;

    @Deprecated
    public final int b;
    private final long c;

    public aqb(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public aqb(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long a() {
        return this.c == -1 ? this.b : this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 1, this.a, false);
        bdy.writeInt(parcel, 2, this.b);
        bdy.writeLong(parcel, 3, a());
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqb)) {
            return false;
        }
        aqb aqbVar = (aqb) obj;
        return ((this.a != null && this.a.equals(aqbVar.a)) || (this.a == null && aqbVar.a == null)) && a() == aqbVar.a();
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, Long.valueOf(a()));
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("name", this.a).add("version", Long.valueOf(a())).toString();
    }
}
