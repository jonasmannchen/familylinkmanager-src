package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctl extends bdv {
    public static final Parcelable.Creator CREATOR = new ctm();
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final Integer g;
    public final boolean h;

    public ctl(int i, int i2, boolean z, boolean z2, int i3, int i4, Integer num, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = i3;
        this.f = i4;
        this.g = num;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ctl)) {
            return false;
        }
        ctl ctlVar = (ctl) obj;
        return this.a == ctlVar.a && this.b == ctlVar.b && this.c == ctlVar.c && this.d == ctlVar.d && this.e == ctlVar.e && this.f == ctlVar.f && bcx.equal(this.g, ctlVar.g) && this.h == ctlVar.h;
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, Boolean.valueOf(this.h));
    }

    public final String toString() {
        String string;
        if (this.g != null) {
            Integer num = this.g;
            if (num == null) {
                string = "(null)";
            } else {
                string = new StringBuilder(15).append("tag#").append(num.intValue() % 20).toString();
            }
        } else {
            string = "(hidden-from-unauthorized-caller)";
        }
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        return new StringBuilder(String.valueOf(string).length() + 235).append("ReportingState{mReportingEnabled=").append(i).append(", mHistoryEnabled=").append(i2).append(", mAllowed=").append(z).append(", mActive=").append(z2).append(", mExpectedOptInResult=").append(i3).append(", mExpectedOptInResultAssumingLocationEnabled=").append(i4).append(", mDeviceTag=").append(string).append(", mCanAccessSettings=").append(this.h).append('}').toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 99;
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        int i3 = this.a;
        switch (i3) {
            case -2:
            case -1:
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 1:
                break;
            default:
                i3 = !cth.a(i3) ? -3 : 99;
                break;
        }
        bdy.writeInt(parcel, 2, i3);
        int i4 = this.b;
        switch (i4) {
            case -2:
            case -1:
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 1:
                i2 = i4;
                break;
            default:
                if (!cth.a(i4)) {
                    i2 = -3;
                }
                break;
        }
        bdy.writeInt(parcel, 3, i2);
        bdy.writeBoolean(parcel, 4, this.c);
        bdy.writeBoolean(parcel, 5, this.d);
        bdy.writeInt(parcel, 7, ctd.a(this.e));
        bdy.writeIntegerObject(parcel, 8, this.g, false);
        bdy.writeInt(parcel, 9, ctd.a(this.f));
        bdy.writeBoolean(parcel, 10, this.h);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
