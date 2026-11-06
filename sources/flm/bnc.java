package flm;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnc extends bdv {
    public static final Parcelable.Creator CREATOR = new bnf();
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public bnk j;
    public bni k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 2, this.a, false);
        bdy.writeBundle(parcel, 3, this.b, false);
        bdy.writeString(parcel, 5, this.c, false);
        bdy.writeParcelable(parcel, 6, this.d, i, false);
        bdy.writeString(parcel, 7, this.e, false);
        bdy.writeParcelable(parcel, 8, this.f, i, false);
        bdy.writeString(parcel, 9, this.g, false);
        bdy.writeTypedList(parcel, 10, this.h, false);
        bdy.writeBoolean(parcel, 11, this.i);
        bdy.writeParcelable(parcel, 12, this.j, i, false);
        bdy.writeParcelable(parcel, 13, this.k, i, false);
        bdy.writeBoolean(parcel, 14, this.l);
        bdy.writeParcelable(parcel, 15, this.m, i, false);
        bdy.writeString(parcel, 16, this.n, false);
        bdy.writeBoolean(parcel, 17, this.o);
        bdy.writeLong(parcel, 18, this.p);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    bnc(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, bnk bnkVar, bni bniVar, boolean z2, Bitmap bitmap, String str5, boolean z3, long j) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list;
        this.i = z;
        this.j = bnkVar;
        this.k = bniVar;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
    }

    public bnc(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false, 0L);
    }
}
