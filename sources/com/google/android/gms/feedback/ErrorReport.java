package com.google.android.gms.feedback;

import android.annotation.SuppressLint;
import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bdv;
import flm.bdy;
import flm.bmu;
import flm.bnc;
import flm.bng;
import flm.bni;
import flm.bnk;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ErrorReport extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bmu();
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;

    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public bng[] U;
    public String[] V;
    public boolean W;
    public String X;
    public bnk Y;
    public bni Z;

    @SuppressLint({"NewApi"})
    public ApplicationErrorReport a;

    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, bng[] bngVarArr, String[] strArr4, boolean z3, String str29, bnk bnkVar, bni bniVar, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31) {
        this.a = new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = bngVarArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = bnkVar;
        this.Z = bniVar;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
    }

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    public ErrorReport(bnc bncVar, File file) {
        this.a = new ApplicationErrorReport();
        if (bncVar != null) {
            if (bncVar.b != null && bncVar.b.size() > 0) {
                this.D = bncVar.b;
            }
            if (!TextUtils.isEmpty(bncVar.a)) {
                this.B = bncVar.a;
            }
            if (!TextUtils.isEmpty(bncVar.c)) {
                this.b = bncVar.c;
            }
            ApplicationErrorReport.CrashInfo crashInfo = bncVar.d == null ? null : bncVar.d.crashInfo;
            if (crashInfo != null) {
                this.M = crashInfo.throwMethodName;
                this.K = crashInfo.throwLineNumber;
                this.L = crashInfo.throwClassName;
                this.N = crashInfo.stackTrace;
                this.I = crashInfo.exceptionClassName;
                this.O = crashInfo.exceptionMessage;
                this.J = crashInfo.throwFileName;
            }
            if (bncVar.j != null) {
                this.Y = bncVar.j;
            }
            if (!TextUtils.isEmpty(bncVar.e)) {
                this.P = bncVar.e;
            }
            if (!TextUtils.isEmpty(bncVar.g)) {
                this.a.packageName = bncVar.g;
            }
            if (!TextUtils.isEmpty(bncVar.n)) {
                this.ag = bncVar.n;
            }
            if (bncVar.m != null) {
                this.af = bncVar.m;
            }
            if (file != null) {
                if (bncVar.f != null) {
                    this.S = bncVar.f;
                    BitmapTeleporter bitmapTeleporter = this.S;
                    if (file == null) {
                        throw new NullPointerException("Cannot set null temp directory");
                    }
                    bitmapTeleporter.d = file;
                }
                List list = bncVar.h;
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((bng) it.next()).a(file);
                    }
                    this.U = (bng[]) list.toArray(new bng[bncVar.h.size()]);
                }
            }
            if (bncVar.k != null) {
                this.Z = bncVar.k;
            }
            this.W = bncVar.i;
            this.ae = bncVar.l;
            this.E = bncVar.o;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeInt(parcel, 4, this.c);
        bdy.writeString(parcel, 5, this.d, false);
        bdy.writeString(parcel, 6, this.e, false);
        bdy.writeString(parcel, 7, this.f, false);
        bdy.writeString(parcel, 8, this.g, false);
        bdy.writeString(parcel, 9, this.h, false);
        bdy.writeString(parcel, 10, this.i, false);
        bdy.writeString(parcel, 11, this.j, false);
        bdy.writeInt(parcel, 12, this.k);
        bdy.writeString(parcel, 13, this.l, false);
        bdy.writeString(parcel, 14, this.m, false);
        bdy.writeString(parcel, 15, this.n, false);
        bdy.writeString(parcel, 16, this.o, false);
        bdy.writeString(parcel, 17, this.p, false);
        bdy.writeStringArray(parcel, 18, this.q, false);
        bdy.writeStringArray(parcel, 19, this.r, false);
        bdy.writeStringArray(parcel, 20, this.s, false);
        bdy.writeString(parcel, 21, this.t, false);
        bdy.writeString(parcel, 22, this.u, false);
        bdy.writeByteArray(parcel, 23, this.v, false);
        bdy.writeInt(parcel, 24, this.w);
        bdy.writeInt(parcel, 25, this.x);
        bdy.writeInt(parcel, 26, this.y);
        bdy.writeInt(parcel, 27, this.z);
        bdy.writeString(parcel, 28, this.A, false);
        bdy.writeString(parcel, 29, this.B, false);
        bdy.writeString(parcel, 30, this.C, false);
        bdy.writeBundle(parcel, 31, this.D, false);
        bdy.writeBoolean(parcel, 32, this.E);
        bdy.writeInt(parcel, 33, this.F);
        bdy.writeInt(parcel, 34, this.G);
        bdy.writeBoolean(parcel, 35, this.H);
        bdy.writeString(parcel, 36, this.I, false);
        bdy.writeString(parcel, 37, this.J, false);
        bdy.writeInt(parcel, 38, this.K);
        bdy.writeString(parcel, 39, this.L, false);
        bdy.writeString(parcel, 40, this.M, false);
        bdy.writeString(parcel, 41, this.N, false);
        bdy.writeString(parcel, 42, this.O, false);
        bdy.writeString(parcel, 43, this.P, false);
        bdy.writeString(parcel, 44, this.Q, false);
        bdy.writeString(parcel, 45, this.R, false);
        bdy.writeParcelable(parcel, 46, this.S, i, false);
        bdy.writeString(parcel, 47, this.T, false);
        bdy.writeTypedArray(parcel, 48, this.U, i, false);
        bdy.writeStringArray(parcel, 49, this.V, false);
        bdy.writeBoolean(parcel, 50, this.W);
        bdy.writeString(parcel, 51, this.X, false);
        bdy.writeParcelable(parcel, 52, this.Y, i, false);
        bdy.writeParcelable(parcel, 53, this.Z, i, false);
        bdy.writeString(parcel, 54, this.aa, false);
        bdy.writeBoolean(parcel, 55, this.ab);
        bdy.writeBundle(parcel, 56, this.ac, false);
        bdy.writeTypedList(parcel, 57, this.ad, false);
        bdy.writeBoolean(parcel, 58, this.ae);
        bdy.writeParcelable(parcel, 59, this.af, i, false);
        bdy.writeString(parcel, 60, this.ag, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
