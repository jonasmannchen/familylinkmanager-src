package flm;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkk extends bdv {
    public static final Parcelable.Creator CREATOR = new bkl();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    private aky k;

    public static bkk a(Context context, String str, amn amnVar) {
        return new bkk(amnVar.f != null ? amnVar.f.name : str, context.getPackageName(), Process.myUid(), amnVar.a, bif.a(context, context.getPackageName()), amnVar.b, amnVar.c, amnVar.d, amnVar.e, Process.myPid());
    }

    public bkk(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, int i4, int i5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = i3;
        this.g = str4;
        this.h = str5;
        this.i = i4;
        this.j = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeInt(parcel, 4, this.c);
        bdy.writeString(parcel, 5, this.d, false);
        bdy.writeInt(parcel, 6, this.e);
        bdy.writeInt(parcel, 7, this.f);
        bdy.writeString(parcel, 8, this.g, false);
        bdy.writeString(parcel, 9, this.h, false);
        bdy.writeInt(parcel, 10, this.i);
        bdy.writeInt(parcel, 11, this.j);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        aky akyVar;
        if (this.a == null) {
            akyVar = null;
        } else {
            if (this.k == null) {
                this.k = new aky(this.a);
            }
            akyVar = this.k;
        }
        String strValueOf = String.valueOf(akyVar);
        String str = this.b;
        int i = this.c;
        String str2 = this.d;
        int i2 = this.e;
        String string = Integer.toString(this.f);
        String str3 = this.g;
        String str4 = this.h;
        return new StringBuilder(String.valueOf(strValueOf).length() + 89 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(string).length() + String.valueOf(str3).length() + String.valueOf(str4).length()).append("(accnt=").append(strValueOf).append(", ").append(str).append("(").append(i).append("):").append(str2).append(", vrsn=").append(i2).append(", ").append(string).append(", 3pPkg = ").append(str3).append(" ,  3pMdlId = ").append(str4).append(" ,  pid = ").append(this.j).append(")").toString();
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkk)) {
            return false;
        }
        bkk bkkVar = (bkk) obj;
        return this.c == bkkVar.c && this.e == bkkVar.e && this.f == bkkVar.f && this.i == bkkVar.i && TextUtils.equals(this.a, bkkVar.a) && TextUtils.equals(this.b, bkkVar.b) && TextUtils.equals(this.d, bkkVar.d) && TextUtils.equals(this.g, bkkVar.g) && TextUtils.equals(this.h, bkkVar.h);
    }
}
