package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class all extends bdv {
    public static final Parcelable.Creator CREATOR = new aln();
    public final int a;
    public final int b;
    public final String c;
    public final byte[][] d;
    public final byte[] e;
    public final byte[] f;

    public all(int i, int i2, String str, byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeInt(parcel, 2, this.b);
        bdy.writeString(parcel, 3, this.c, false);
        bdy.writeByteArrayArray(parcel, 4, this.d, false);
        bdy.writeByteArray(parcel, 5, this.e, false);
        bdy.writeByteArray(parcel, 6, this.f, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
