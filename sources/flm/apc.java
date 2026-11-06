package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apc extends bdv {
    public static final Parcelable.Creator CREATOR = new apd();
    public apq a;
    public byte[] b;
    public int[] c;
    public String[] d;
    public int[] e;
    public byte[][] f;
    public cyt[] g;
    public boolean h;
    public cza[] i;
    public fng j;
    public final aoi k;
    public final aoi l;

    public apc(apq apqVar, fng fngVar, aoi aoiVar, aoi aoiVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, cyt[] cytVarArr, boolean z, cza[] czaVarArr) {
        this.a = apqVar;
        this.j = fngVar;
        this.k = aoiVar;
        this.l = aoiVar2;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr;
        this.g = cytVarArr;
        this.h = z;
        this.i = czaVarArr;
    }

    apc(apq apqVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, cyt[] cytVarArr, cza[] czaVarArr) {
        this.a = apqVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.j = null;
        this.k = null;
        this.l = null;
        this.e = iArr2;
        this.f = bArr2;
        this.g = cytVarArr;
        this.h = z;
        this.i = czaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apc)) {
            return false;
        }
        apc apcVar = (apc) obj;
        return bcx.equal(this.a, apcVar.a) && Arrays.equals(this.b, apcVar.b) && Arrays.equals(this.c, apcVar.c) && Arrays.equals(this.d, apcVar.d) && bcx.equal(this.j, apcVar.j) && bcx.equal(this.k, apcVar.k) && bcx.equal(this.l, apcVar.l) && Arrays.equals(this.e, apcVar.e) && Arrays.deepEquals(this.f, apcVar.f) && Arrays.equals(this.g, apcVar.g) && this.h == apcVar.h && Arrays.equals(this.i, apcVar.i);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b, this.c, this.d, this.j, this.k, this.l, this.e, this.f, this.g, Boolean.valueOf(this.h), this.i);
    }

    public final String toString() {
        return "LogEventParcelable[" + this.a + ", LogEventBytes: " + (this.b == null ? null : new String(this.b)) + ", TestCodes: " + Arrays.toString(this.c) + ", MendelPackages: " + Arrays.toString(this.d) + ", LogEvent: " + this.j + ", ExtensionProducer: " + this.k + ", VeProducer: " + this.l + ", ExperimentIDs: " + Arrays.toString(this.e) + ", ExperimentTokens: " + Arrays.toString(this.f) + ", ExperimentTokensParcelables: " + Arrays.toString(this.g) + ", AddPhenotypeExperimentTokens: " + this.h + "GenericDimensions: " + Arrays.toString(this.i) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeByteArray(parcel, 3, this.b, false);
        bdy.writeIntArray(parcel, 4, this.c, false);
        bdy.writeStringArray(parcel, 5, this.d, false);
        bdy.writeIntArray(parcel, 6, this.e, false);
        bdy.writeByteArrayArray(parcel, 7, this.f, false);
        bdy.writeBoolean(parcel, 8, this.h);
        bdy.writeTypedArray(parcel, 9, this.g, i, false);
        bdy.writeTypedArray(parcel, 10, this.i, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
