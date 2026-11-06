package flm;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czs extends bdv implements aty {
    public static final Parcelable.Creator CREATOR = new czt();
    public final int a;
    public int b;
    public Intent c;

    czs(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public czs() {
        this(0, null);
    }

    private czs(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // flm.aty
    public final Status b() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeInt(parcel, 2, this.b);
        bdy.writeParcelable(parcel, 3, this.c, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
