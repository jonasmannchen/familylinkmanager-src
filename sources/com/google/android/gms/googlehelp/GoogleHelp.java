package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import flm.bav;
import flm.bbx;
import flm.bdv;
import flm.bdy;
import flm.bnk;
import flm.bqo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class GoogleHelp extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bqo();
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public String E;
    public boolean F;
    public final int a;
    public String b;
    public Account c;
    public Bundle d;
    public String e;
    public String f;
    public Bitmap g;
    public boolean h;
    public boolean i;
    public List j;

    @Deprecated
    public Bundle k;

    @Deprecated
    public Bitmap l;

    @Deprecated
    public byte[] m;

    @Deprecated
    public int n;

    @Deprecated
    public int o;
    public String p;
    public Uri q;
    public List r;

    @Deprecated
    public int s;
    public bnk t;
    public List u;
    public boolean v;
    public ErrorReport w;
    public TogglingData x;
    public int y;
    public PendingIntent z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, bnk bnkVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6) {
        this.w = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            if (bav.APK_IS_DEBUG_APK || !bav.IS_PACKAGE_SIDE) {
                throw new IllegalStateException("Help requires a non-empty appContext");
            }
            Log.e("gH_GoogleHelp", "Help requires a non-empty appContext. Please fix ASAP.");
        }
        this.a = i;
        this.A = i6;
        this.B = z4;
        this.C = z5;
        this.D = i7;
        this.E = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.F = z6;
        this.j = list;
        this.z = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (this.a < 4) {
            bnk bnkVar2 = new bnk();
            bnkVar2.a = i4;
            this.t = bnkVar2;
        } else {
            this.t = bnkVar == null ? new bnk() : bnkVar;
        }
        this.u = list3;
        this.v = z3;
        this.w = errorReport;
        if (this.w != null) {
            this.w.X = "GoogleHelp";
        }
        this.x = togglingData;
        this.y = i5;
    }

    @Deprecated
    public GoogleHelp(String str) {
        this(13, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 0, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, bbx.LOG_WTF_CONNECTIONS_THRESHOLD, null, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeString(parcel, 2, this.b, false);
        bdy.writeParcelable(parcel, 3, this.c, i, false);
        bdy.writeBundle(parcel, 4, this.d, false);
        bdy.writeBoolean(parcel, 5, this.h);
        bdy.writeBoolean(parcel, 6, this.i);
        bdy.writeStringList(parcel, 7, this.j, false);
        bdy.writeBundle(parcel, 10, this.k, false);
        bdy.writeParcelable(parcel, 11, this.l, i, false);
        bdy.writeString(parcel, 14, this.p, false);
        bdy.writeParcelable(parcel, 15, this.q, i, false);
        bdy.writeTypedList(parcel, 16, this.r, false);
        bdy.writeInt(parcel, 17, this.s);
        bdy.writeTypedList(parcel, 18, this.u, false);
        bdy.writeByteArray(parcel, 19, this.m, false);
        bdy.writeInt(parcel, 20, this.n);
        bdy.writeInt(parcel, 21, this.o);
        bdy.writeBoolean(parcel, 22, this.v);
        bdy.writeParcelable(parcel, 23, this.w, i, false);
        bdy.writeParcelable(parcel, 25, this.t, i, false);
        bdy.writeString(parcel, 28, this.e, false);
        bdy.writeParcelable(parcel, 31, this.x, i, false);
        bdy.writeInt(parcel, 32, this.y);
        bdy.writeParcelable(parcel, 33, this.z, i, false);
        bdy.writeString(parcel, 34, this.f, false);
        bdy.writeParcelable(parcel, 35, this.g, i, false);
        bdy.writeInt(parcel, 36, this.A);
        bdy.writeBoolean(parcel, 37, this.B);
        bdy.writeBoolean(parcel, 38, this.C);
        bdy.writeInt(parcel, 39, this.D);
        bdy.writeString(parcel, 40, this.E, false);
        bdy.writeBoolean(parcel, 41, this.F);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
