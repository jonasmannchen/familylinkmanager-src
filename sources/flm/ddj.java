package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddj extends bdv {
    public static final Parcelable.Creator CREATOR;
    public List a;
    public boolean b;

    ddj(List list, boolean z) {
        this.a = list == null ? new ArrayList(0) : new ArrayList(list);
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 1, new ArrayList(this.a), false);
        bdy.writeBoolean(parcel, 2, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ddj)) {
            return false;
        }
        ddj ddjVar = (ddj) obj;
        return bcx.equal(this.a, ddjVar.a) && bcx.equal(Boolean.valueOf(this.b), Boolean.valueOf(ddjVar.b));
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, Boolean.valueOf(this.b));
    }

    static {
        new ddj(null, false);
        CREATOR = new ddl();
    }
}
