package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyf extends bdv implements cyd {
    public static final Parcelable.Creator CREATOR = new cye();
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;

    public cyf(String str, List list, List list2, List list3, List list4, List list5) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeTypedList(parcel, 4, b(), false);
        bdy.writeTypedList(parcel, 5, c(), false);
        bdy.writeTypedList(parcel, 9, f(), false);
        bdy.writeTypedList(parcel, 11, d(), false);
        bdy.writeTypedList(parcel, 13, e(), false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.cyd
    public final String a() {
        return this.a;
    }

    @Override // flm.cyd
    public final List b() {
        if (this.g == null && this.b != null) {
            this.g = new ArrayList(this.b.size());
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                this.g.add((cya) it.next());
            }
        }
        return this.g;
    }

    @Override // flm.cyd
    public final List c() {
        if (this.h == null && this.c != null) {
            this.h = new ArrayList(this.c.size());
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                this.h.add((cym) it.next());
            }
        }
        return this.h;
    }

    @Override // flm.cyd
    public final List d() {
        if (this.i == null && this.d != null) {
            this.i = new ArrayList(this.d.size());
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                this.i.add((cxv) it.next());
            }
        }
        return this.i;
    }

    @Override // flm.cyd
    public final List e() {
        if (this.j == null && this.e != null) {
            this.j = new ArrayList(this.e.size());
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                this.j.add((cyj) it.next());
            }
        }
        return this.j;
    }

    @Override // flm.cyd
    public final List f() {
        if (this.k == null && this.f != null) {
            this.k = new ArrayList(this.f.size());
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                this.k.add((cxs) it.next());
            }
        }
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cyd cydVar = (cyd) obj;
        return bcx.equal(a(), cydVar.a()) && bcx.equal(b(), cydVar.b()) && bcx.equal(c(), cydVar.c()) && bcx.equal(d(), cydVar.d()) && bcx.equal(e(), cydVar.e()) && bcx.equal(f(), cydVar.f());
    }

    public final int hashCode() {
        return bcx.hashCode(a(), b(), c(), d(), e(), f());
    }
}
