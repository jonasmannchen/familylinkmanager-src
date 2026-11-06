package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvk extends bdv {
    public static final Parcelable.Creator CREATOR = new cvl();
    public final int a;
    public String b;
    public cvs c;
    public cvg d;
    public int e;
    public String f;
    public boolean g;
    public boolean h;
    public double i;
    private String j;

    public cvk(int i, String str, String str2, cvs cvsVar, cvg cvgVar, int i2, String str3, boolean z, boolean z2, double d) {
        this.a = i;
        this.b = str;
        this.j = str2;
        this.c = cvsVar;
        this.d = cvgVar;
        this.e = i2;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.i = d;
    }

    public final String a() {
        return TextUtils.isEmpty(this.j) ? this.b : this.j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeParcelable(parcel, 4, this.c, i, false);
        bdy.writeParcelable(parcel, 5, this.d, i, false);
        bdy.writeInt(parcel, 6, this.e);
        bdy.writeString(parcel, 7, this.f, false);
        bdy.writeBoolean(parcel, 8, this.g);
        bdy.writeBoolean(parcel, 9, this.h);
        bdy.writeString(parcel, 10, a(), false);
        bdy.writeDouble(parcel, 11, this.i);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvk)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cvk cvkVar = (cvk) obj;
        return bcx.equal(this.b, cvkVar.b) && bcx.equal(a(), cvkVar.a()) && bcx.equal(Integer.valueOf(this.a), Integer.valueOf(cvkVar.a)) && bcx.equal(this.c, cvkVar.c) && bcx.equal(this.d, cvkVar.d) && bcx.equal(Integer.valueOf(this.e), Integer.valueOf(cvkVar.e)) && bcx.equal(this.f, cvkVar.f) && bcx.equal(Boolean.valueOf(this.g), Boolean.valueOf(cvkVar.g)) && bcx.equal(Boolean.valueOf(this.h), Boolean.valueOf(cvkVar.h)) && bcx.equal(Double.valueOf(this.i), Double.valueOf(cvkVar.i));
    }

    public final int hashCode() {
        return bcx.hashCode(this.b, this.j, Integer.valueOf(this.a), this.c, this.d, Integer.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Double.valueOf(this.i));
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("value", this.b).add("canonicalValue", this.j).add("getContactMethodType", Integer.valueOf(this.a)).add("matchInfo", this.c).add("metadata", this.d).add("classificationType", Integer.valueOf(this.e)).add("label", this.f).add("isPrimary", Boolean.valueOf(this.g)).add("isSuperPrimary", Boolean.valueOf(this.h)).add("score", Double.valueOf(this.i)).toString();
    }
}
