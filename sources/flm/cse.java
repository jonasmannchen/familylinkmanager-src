package flm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cse extends bdv {
    public static final Parcelable.Creator CREATOR = new csf();
    public int a;
    public csc b;
    public crj c;
    public csk d;

    cse(int i, csc cscVar, IBinder iBinder, IBinder iBinder2) {
        this.a = i;
        this.b = cscVar;
        this.c = iBinder == null ? null : crk.a(iBinder);
        this.d = iBinder2 != null ? csl.a(iBinder2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeParcelable(parcel, 2, this.b, i, false);
        bdy.writeIBinder(parcel, 3, this.c == null ? null : this.c.asBinder(), false);
        bdy.writeIBinder(parcel, 4, this.d != null ? this.d.asBinder() : null, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
