package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqr extends bdv {
    public static final Parcelable.Creator CREATOR = new bqs();
    public GoogleHelp a;
    public String b;
    public String c;

    bqr(GoogleHelp googleHelp, String str, String str2) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 1, this.a, i, false);
        bdy.writeString(parcel, 2, this.b, false);
        bdy.writeString(parcel, 3, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
