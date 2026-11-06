package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amu extends bdv implements anl {
    public static final Parcelable.Creator CREATOR = new ams();
    public final String a;
    public final String b;
    public final byte[] c;

    public amu(String str, String str2, byte[] bArr) {
        this.a = bdi.checkNotEmpty(str);
        this.b = bdi.checkNotEmpty(str2);
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeByteArray(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        String str = this.c == null ? "<null>" : new String(this.c);
        String str2 = this.a;
        String str3 = this.b;
        return new StringBuilder(String.valueOf(str2).length() + 6 + String.valueOf(str3).length() + String.valueOf(str).length()).append("(").append(str2).append(", ").append(str3).append(", ").append(str).append(")").toString();
    }
}
