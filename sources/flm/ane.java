package flm;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.ActivityRecognitionResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ane extends bdv {
    public static final Parcelable.Creator CREATOR = new ang();
    public final ActivityRecognitionResult a;
    public final amt b;
    public final amw c;
    public final Location d;
    public final amy e;
    public final DataHolder f;
    public final ana g;
    public final anc h;
    public final anj i;
    public final anh j;
    public final bjk k;

    public ane(ActivityRecognitionResult activityRecognitionResult, amt amtVar, amw amwVar, Location location, amy amyVar, DataHolder dataHolder, ana anaVar, anc ancVar, anj anjVar, anh anhVar, bjk bjkVar) {
        this.a = activityRecognitionResult;
        this.b = amtVar;
        this.c = amwVar;
        this.d = location;
        this.e = amyVar;
        this.f = dataHolder;
        this.g = anaVar;
        this.h = ancVar;
        this.i = anjVar;
        this.j = anhVar;
        this.k = bjkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeParcelable(parcel, 3, this.b, i, false);
        bdy.writeParcelable(parcel, 4, this.c, i, false);
        bdy.writeParcelable(parcel, 5, this.d, i, false);
        bdy.writeParcelable(parcel, 6, this.e, i, false);
        bdy.writeParcelable(parcel, 7, this.f, i, false);
        bdy.writeParcelable(parcel, 8, this.g, i, false);
        bdy.writeParcelable(parcel, 9, this.h, i, false);
        bdy.writeParcelable(parcel, 10, this.i, i, false);
        bdy.writeParcelable(parcel, 11, this.j, i, false);
        bdy.writeParcelable(parcel, 12, this.k, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
