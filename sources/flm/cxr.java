package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cxr extends bdv implements cxp {
    public static final Parcelable.Creator CREATOR = new cxq();
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;
    private final List e;
    private List f;

    public cxr(String str, List list, String str2, Long l, Long l2) {
        this.a = str;
        this.e = list;
        this.b = str2;
        this.c = l;
        this.d = l2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeTypedList(parcel, 3, b(), false);
        bdy.writeString(parcel, 4, this.b, false);
        bdy.writeLongObject(parcel, 5, this.c, false);
        bdy.writeLongObject(parcel, 6, this.d, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.cxp
    public final String a() {
        return this.a;
    }

    @Override // flm.cxp
    public final List b() {
        if (this.f == null && this.e != null) {
            this.f = new ArrayList(this.e.size());
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                this.f.add((cyp) it.next());
            }
        }
        return this.f;
    }

    @Override // flm.cxp
    public final String c() {
        return this.b;
    }

    @Override // flm.cxp
    public final Long d() {
        return this.c;
    }

    @Override // flm.cxp
    public final Long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cxp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cxp cxpVar = (cxp) obj;
        return bcx.equal(a(), cxpVar.a()) && bcx.equal(b(), cxpVar.b()) && bcx.equal(c(), cxpVar.c()) && bcx.equal(d(), cxpVar.d()) && bcx.equal(e(), cxpVar.e());
    }

    public final int hashCode() {
        return bcx.hashCode(a(), b(), c(), d(), e());
    }
}
