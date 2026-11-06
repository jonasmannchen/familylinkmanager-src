package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyt extends bdv {
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] g;
    public final byte[][] h;
    public final int[] i;
    private static final byte[][] j = new byte[0][];
    public static final Parcelable.Creator CREATOR = new cyy();

    public cyt(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.g = iArr;
        this.h = bArr6;
        this.i = iArr2;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        if (this.a == null) {
            string = "null";
        } else {
            String str = this.a;
            string = new StringBuilder(String.valueOf(str).length() + 2).append("'").append(str).append("'").toString();
        }
        sb.append(string);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append("direct=");
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        a(sb, "GAIA=", this.c);
        sb.append(", ");
        a(sb, "PSEUDO=", this.d);
        sb.append(", ");
        a(sb, "ALWAYS=", this.e);
        sb.append(", ");
        a(sb, "OTHER=", this.f);
        sb.append(", ");
        sb.append("weak=");
        sb.append(Arrays.toString(this.g));
        sb.append(", ");
        a(sb, "directs=", this.h);
        sb.append(", ");
        sb.append("genDims=");
        sb.append(Arrays.toString(b(this.i).toArray()));
        sb.append(")");
        return sb.toString();
    }

    private static void a(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyt)) {
            return false;
        }
        cyt cytVar = (cyt) obj;
        return cze.a(this.a, cytVar.a) && Arrays.equals(this.b, cytVar.b) && cze.a(a(this.c), a(cytVar.c)) && cze.a(a(this.d), a(cytVar.d)) && cze.a(a(this.e), a(cytVar.e)) && cze.a(a(this.f), a(cytVar.f)) && cze.a(a(this.g), a(cytVar.g)) && cze.a(a(this.h), a(cytVar.h)) && cze.a(b(this.i), b(cytVar.i));
    }

    private static List a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length / 2);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new cza(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeByteArray(parcel, 3, this.b, false);
        bdy.writeByteArrayArray(parcel, 4, this.c, false);
        bdy.writeByteArrayArray(parcel, 5, this.d, false);
        bdy.writeByteArrayArray(parcel, 6, this.e, false);
        bdy.writeByteArrayArray(parcel, 7, this.f, false);
        bdy.writeIntArray(parcel, 8, this.g, false);
        bdy.writeByteArrayArray(parcel, 9, this.h, false);
        bdy.writeIntArray(parcel, 10, this.i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    static {
        new cyt("", null, j, j, j, j, null, null, null);
        new cyu();
        new cyv();
        new cyw();
        new cyx();
    }
}
