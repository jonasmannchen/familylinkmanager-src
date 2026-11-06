package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.model.AvatarReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwa extends bdv {
    public static final Parcelable.Creator CREATOR = new cwb();
    public AvatarReference a;

    public cwa() {
    }

    public cwa(AvatarReference avatarReference) {
        this.a = avatarReference;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 3, this.a, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cwa)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.a.equals(((cwa) obj).a);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a);
    }
}
