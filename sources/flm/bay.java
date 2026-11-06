package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bay extends bdv {
    public static final Parcelable.Creator CREATOR = new baz();
    public final String packageName;
    public final int uid;

    public bay(int i, String str) {
        this.uid = i;
        this.packageName = str;
    }

    public final int hashCode() {
        return this.uid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof bay)) {
            return false;
        }
        bay bayVar = (bay) obj;
        return bayVar.uid == this.uid && bcx.equal(bayVar.packageName, this.packageName);
    }

    public final String toString() {
        int i = this.uid;
        String str = this.packageName;
        return new StringBuilder(String.valueOf(str).length() + 12).append(i).append(":").append(str).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        baz.writeToParcel(this, parcel, i);
    }
}
