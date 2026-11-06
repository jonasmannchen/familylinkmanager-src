package flm;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csz extends bdv {
    public static final Parcelable.Creator CREATOR = new cta();
    public int a;
    public csx b;
    public crp c;
    public PendingIntent d;
    public crm e;
    public csk f;

    public static csz a(crm crmVar, csk cskVar) {
        return new csz(2, null, null, null, crmVar.asBinder(), cskVar != null ? cskVar.asBinder() : null);
    }

    public csz(int i, csx csxVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.a = i;
        this.b = csxVar;
        this.c = iBinder == null ? null : crq.a(iBinder);
        this.d = pendingIntent;
        this.e = iBinder2 == null ? null : crn.a(iBinder2);
        this.f = iBinder3 != null ? csl.a(iBinder3) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeParcelable(parcel, 2, this.b, i, false);
        bdy.writeIBinder(parcel, 3, this.c == null ? null : this.c.asBinder(), false);
        bdy.writeParcelable(parcel, 4, this.d, i, false);
        bdy.writeIBinder(parcel, 5, this.e == null ? null : this.e.asBinder(), false);
        bdy.writeIBinder(parcel, 6, this.f != null ? this.f.asBinder() : null, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
