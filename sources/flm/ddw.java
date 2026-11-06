package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddw extends bdv {
    public static final Parcelable.Creator CREATOR = new ddx();
    public int a;
    public boolean b;
    public final List c = new ArrayList();
    public int d;
    public String e;
    public boolean f;

    public ddw(int i, boolean z, List list, int i2, String str, boolean z2) {
        this.a = i;
        this.b = z;
        if (list != null) {
            this.c.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeBoolean(parcel, 3, this.b);
        bdy.writeStringList(parcel, 4, this.c, false);
        bdy.writeInt(parcel, 5, this.d);
        bdy.writeString(parcel, 6, this.e, false);
        bdy.writeBoolean(parcel, 7, this.f);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
