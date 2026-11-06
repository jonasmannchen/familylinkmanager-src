package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjk extends bdv {
    public fgl a = null;
    public byte[] b;
    private static ald c = new bjl();
    public static final Parcelable.Creator CREATOR = new bjn();

    public bjk(byte[] bArr) {
        this.b = (byte[]) bdi.checkNotNull(bArr);
        d();
    }

    private final void c() {
        if (!(this.a != null)) {
            try {
                this.a = (fgl) fnb.a(new fgl(), this.b);
                this.b = null;
            } catch (fna e) {
                Log.e("ContextData", "Could not deserialize context bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        d();
    }

    private final void d() {
        if (this.a != null || this.b == null) {
            if (this.a != null && this.b == null) {
                return;
            }
            if (this.a != null && this.b != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (this.a == null && this.b == null) {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
            throw new IllegalStateException("Impossible");
        }
    }

    public final String a() {
        c();
        return this.a.a;
    }

    public final byte[] b() {
        c();
        return a(this.a);
    }

    private static byte[] a(fgl fglVar) {
        if (fglVar.c == null) {
            return null;
        }
        byte[] bArrA = fnb.a(fglVar.c);
        if (bArrA.length == 0) {
            return bArrA;
        }
        fms fmsVarA = fms.a(bArrA, 0, bArrA.length);
        try {
            fmsVarA.a();
            int iD = fmsVarA.d();
            if (iD < 0) {
                throw fna.b();
            }
            if (fmsVarA.d + iD > fmsVarA.e) {
                fmsVarA.f(fmsVarA.e - fmsVarA.d);
                throw fna.a();
            }
            if (iD > fmsVarA.c - fmsVarA.d) {
                throw fna.a();
            }
            byte[] bArr = new byte[iD];
            System.arraycopy(fmsVarA.a, fmsVarA.d, bArr, 0, iD);
            fmsVarA.d = iD + fmsVarA.d;
            return bArr;
        } catch (IOException e) {
            Log.e("ContextData", "Could not read extension.", e);
            return null;
        }
    }

    public final int hashCode() {
        c();
        return bcx.hashCode(a(), Integer.valueOf(this.a.b.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjk)) {
            return false;
        }
        bjk bjkVar = (bjk) obj;
        c();
        bjkVar.c();
        return a().equals(bjkVar.a()) && this.a.b.b == bjkVar.a.b.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArrA;
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        if (this.b != null) {
            bArrA = this.b;
        } else {
            bArrA = fnb.a(this.a);
        }
        bdy.writeByteArray(parcel, 2, bArrA, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        c();
        String strValueOf = String.valueOf(this.a.toString());
        String strValueOf2 = String.valueOf(c.a());
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }
}
