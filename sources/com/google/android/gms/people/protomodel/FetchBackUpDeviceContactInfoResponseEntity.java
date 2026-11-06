package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import flm.bcx;
import flm.bdv;
import flm.bdy;
import flm.cxp;
import flm.cxy;
import flm.cxz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FetchBackUpDeviceContactInfoResponseEntity extends bdv implements cxy {
    public static final Parcelable.Creator CREATOR = new cxz();
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeTypedList(parcel, 2, a(), false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // flm.cxy
    public final List a() {
        if (this.b == null && this.a != null) {
            this.b = new ArrayList(this.a.size());
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add((cxp) it.next());
            }
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cxy)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return bcx.equal(a(), ((cxy) obj).a());
    }

    public int hashCode() {
        return bcx.hashCode(a());
    }
}
