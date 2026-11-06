package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aol extends bdv {
    public static final Parcelable.Creator CREATOR = new aom();
    public final boolean a;
    public final long b;
    public final long c;

    public aol(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aol)) {
            return false;
        }
        aol aolVar = (aol) obj;
        return this.a == aolVar.a && this.b == aolVar.b && this.c == aolVar.c;
    }

    public final int hashCode() {
        return bcx.hashCode(Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.a + ",collectForDebugStartTimeMillis: " + this.b + ",collectForDebugExpiryTimeMillis: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeBoolean(parcel, 1, this.a);
        bdy.writeLong(parcel, 2, this.c);
        bdy.writeLong(parcel, 3, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
