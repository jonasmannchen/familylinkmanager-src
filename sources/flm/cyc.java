package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyc extends bdv implements cya {
    public static final Parcelable.Creator CREATOR = new cyb();
    public final cyi a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public cyc(cyi cyiVar, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = cyiVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 17, this.c, false);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeString(parcel, 4, this.g, false);
        bdy.writeString(parcel, 5, this.d, false);
        bdy.writeString(parcel, 6, this.e, false);
        bdy.writeString(parcel, 7, this.f, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.cya
    public final cyg a() {
        return this.a;
    }

    @Override // flm.cya
    public final String b() {
        return this.b;
    }

    @Override // flm.cya
    public final String c() {
        return this.c;
    }

    @Override // flm.cya
    public final String d() {
        return this.d;
    }

    @Override // flm.cya
    public final String e() {
        return this.e;
    }

    @Override // flm.cya
    public final String f() {
        return this.f;
    }

    @Override // flm.cya
    public final String g() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cya)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cya cyaVar = (cya) obj;
        return bcx.equal(a(), cyaVar.a()) && bcx.equal(b(), cyaVar.b()) && bcx.equal(c(), cyaVar.c()) && bcx.equal(d(), cyaVar.d()) && bcx.equal(e(), cyaVar.e()) && bcx.equal(f(), cyaVar.f()) && bcx.equal(g(), cyaVar.g());
    }

    public final int hashCode() {
        return bcx.hashCode(a(), b(), c(), d(), e(), f(), g());
    }
}
