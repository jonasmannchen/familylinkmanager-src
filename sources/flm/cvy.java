package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvy extends bdv {
    public static final Parcelable.Creator CREATOR = new cvz();
    public List a;
    public List b;
    public List c;
    public String d;
    public cvg e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    public String j;
    public int k;
    public double l;
    public long m;

    public cvy(List list, List list2, List list3, String str, cvg cvgVar, boolean z, boolean z2, String str2, String str3, String str4, int i, double d, long j) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.c = list3;
        this.a = list;
        this.b = list2;
        this.d = str;
        this.e = cvgVar;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = i;
        this.l = d;
        this.m = j;
    }

    public cvy() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvy)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cvy cvyVar = (cvy) obj;
        return bcx.equal(this.a, cvyVar.a) && bcx.equal(null, null) && bcx.equal(this.b, cvyVar.b) && bcx.equal(null, null) && bcx.equal(this.d, cvyVar.d) && bcx.equal(this.e, cvyVar.e) && bcx.equal(this.c, cvyVar.c) && bcx.equal(Boolean.valueOf(this.f), Boolean.valueOf(cvyVar.f)) && bcx.equal(Boolean.valueOf(this.g), Boolean.valueOf(cvyVar.g)) && bcx.equal(this.h, cvyVar.h) && bcx.equal(this.i, cvyVar.i) && bcx.equal(this.j, cvyVar.j) && bcx.equal(Integer.valueOf(this.k), Integer.valueOf(cvyVar.k)) && bcx.equal(Double.valueOf(this.l), Double.valueOf(cvyVar.l)) && bcx.equal(Long.valueOf(this.m), Long.valueOf(cvyVar.m));
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, null, this.b, this.c, null, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, this.j, Integer.valueOf(this.k), Double.valueOf(this.l), Long.valueOf(this.m));
    }

    public final String toString() {
        return bcx.toStringHelper(this).add("names", this.a).add("emails", null).add("photos", this.b).add("sortedContactMethods", this.c).add("phones", null).add("provenanceReference", this.d).add("metadata", this.e).add("isStarred", Boolean.valueOf(this.f)).add("sendToVoicemail", Boolean.valueOf(this.g)).add("customRingtone", this.h).add("lookupKey", this.i).add("secondaryProvenanceReference", this.j).add("pinnedPosition", Integer.valueOf(this.k)).add("score", Double.valueOf(this.l)).add("lastUpdatedTimestamp", Long.valueOf(this.m)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 3, Collections.unmodifiableList(this.a), false);
        bdy.writeTypedList(parcel, 5, Collections.unmodifiableList(this.b), false);
        bdy.writeTypedList(parcel, 6, this.c, false);
        bdy.writeString(parcel, 7, this.d, false);
        bdy.writeParcelable(parcel, 8, this.e, i, false);
        bdy.writeBoolean(parcel, 9, this.f);
        bdy.writeBoolean(parcel, 10, this.g);
        bdy.writeString(parcel, 11, this.h, false);
        bdy.writeString(parcel, 12, this.i, false);
        bdy.writeString(parcel, 13, this.j, false);
        bdy.writeInt(parcel, 14, this.k);
        bdy.writeDouble(parcel, 15, this.l);
        bdy.writeLong(parcel, 16, this.m);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
