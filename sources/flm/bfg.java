package flm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.URLUtil;
import com.android.volley.VolleyError;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bfg extends bff {
    private volatile ftt b;
    private String c;
    private int d;
    private SSLSocketFactory e;
    private int f;
    private int g;
    private volatile ftv h;
    private final Object i;
    private bfk j;
    private boolean k;
    private final bfh l;
    private final CronetEngine m;

    public bfg(Context context, String str, int i, int i2, int i3) {
        this(context, str, i, i2, 6656, null);
    }

    private bfg(Context context, String str, int i, int i2, int i3, CronetEngine cronetEngine) {
        super(context);
        this.i = new Object();
        this.k = true;
        this.c = str;
        this.d = i;
        this.j = bfk.a();
        bef befVar = new bef(context, 60000, true, true, null);
        bdi.checkNotNull(befVar);
        if (befVar instanceof bef) {
            bef befVar2 = befVar;
            byte[][] bArr = {"h2".getBytes()};
            if (bArr.length == 0) {
                throw new IllegalArgumentException("items.length == 0");
            }
            int length = 0;
            for (byte[] bArr2 : bArr) {
                if (bArr2.length == 0 || bArr2.length > 255) {
                    throw new IllegalArgumentException(new StringBuilder(44).append("s.length == 0 || s.length > 255: ").append(bArr2.length).toString());
                }
                length += bArr2.length + 1;
            }
            byte[] bArr3 = new byte[length];
            int length2 = bArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                byte[] bArr4 = bArr[i4];
                int i6 = i5 + 1;
                bArr3[i5] = (byte) bArr4.length;
                int length3 = bArr4.length;
                int i7 = 0;
                while (i7 < length3) {
                    bArr3[i6] = bArr4[i7];
                    i7++;
                    i6++;
                }
                i4++;
                i5 = i6;
            }
            befVar2.a = bArr3;
            this.e = befVar;
        } else {
            Log.w("BaseGrpcServer", "Failed to set alpn protocols for gRPC, using the original SSLSocketFactory");
        }
        this.f = i2;
        this.g = i3;
        this.l = bfh.a;
        this.m = null;
    }

    public final void a(String str, String str2) {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = new ftv();
                }
            }
        }
        synchronized (this) {
            this.h.a(fuc.a(str, ftv.a), str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    public final Object a(fuf fufVar, baw bawVar, Object obj, long j, TimeUnit timeUnit) throws Throwable {
        fvc fvcVarA;
        fvc fvcVar;
        Object objA;
        fuf fufVarA = a(fufVar);
        bdi.checkNotNull(this.b, "grpc channel is null, cannot make grpc request");
        try {
            String strB = b(bawVar);
            String strA = a(bawVar);
            frl frlVarA = bfk.a(this.a, this.b, strB, strA, this.h, this.k);
            fvc fvcVar2 = fvc.b;
            fvc fvcVar3 = null;
            try {
                try {
                    objA = bfk.a(frlVarA, fufVarA, obj, a(10000L, timeUnit));
                    this.l.a(fufVarA, fvcVar2);
                    this.l.a();
                } catch (RuntimeException e) {
                    try {
                        if (this.k && fvc.g.m == fvc.a(e).m) {
                            fvcVarA = fvc.a(e);
                            try {
                                try {
                                    objA = bfk.a(bfk.a(this.a, this.b, b(bawVar), strA, this.h, false), fufVarA, obj, a(10000L, timeUnit));
                                    this.l.a(fufVarA, fvcVar2);
                                    if (fvcVarA != null) {
                                        this.l.a(fufVarA, fvcVarA);
                                    }
                                    this.l.a();
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    fvcVar3 = fvcVarA;
                                    try {
                                        fvc fvcVarA2 = fvc.a(e);
                                        try {
                                            throw fvcVarA2.c();
                                        } catch (Throwable th) {
                                            th = th;
                                            fvcVarA = fvcVar3;
                                            fvcVar = fvcVarA2;
                                            this.l.a(fufVarA, fvcVar);
                                            if (fvcVarA != null) {
                                                this.l.a(fufVarA, fvcVarA);
                                            }
                                            this.l.a();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fvcVarA = fvcVar3;
                                        fvcVar = fvcVar2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fvcVar = fvcVar2;
                                    this.l.a(fufVarA, fvcVar);
                                    if (fvcVarA != null) {
                                        this.l.a(fufVarA, fvcVarA);
                                    }
                                    this.l.a();
                                    throw th;
                                }
                            } catch (VolleyError e3) {
                                throw new fvg(fvc.j.a("IOException when getting auth token").b(e3));
                            }
                        } else {
                            throw e;
                        }
                    } catch (RuntimeException e4) {
                        e = e4;
                    }
                }
                return objA;
            } catch (Throwable th4) {
                th = th4;
                fvcVarA = null;
                fvcVar = fvcVar2;
                this.l.a(fufVarA, fvcVar);
                if (fvcVarA != null) {
                    this.l.a(fufVarA, fvcVarA);
                }
                this.l.a();
                throw th;
            }
        } catch (VolleyError e5) {
            throw new fvg(fvc.j.a("IOException when getting auth token").b(e5));
        }
    }

    private final frj a(long j, TimeUnit timeUnit) {
        if (j < 0 || timeUnit == null) {
            return frj.a.a((String) null);
        }
        return frj.a.a(fsl.a(j, timeUnit)).a((String) null);
    }

    private final fuf a(fuf fufVar) throws fvg {
        ftt fttVarB;
        try {
            bfk bfkVar = this.j;
            Context context = this.a;
            bfm bfmVar = new bfm(fufVar, this.c);
            boolean z = this.e != null;
            String authority = bfmVar.b;
            fuf fufVarA = bfmVar.a;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "https://" : "http://").append(authority).append("/").append(fufVarA.b);
            String string = sb.toString();
            Bundle bundleA = new bsb(context).a(string);
            if (bundleA != null) {
                if (bundleA.getString("block") != null) {
                    String string2 = bundleA.getString("name");
                    Log.w("GrpcServerHelper", new StringBuilder(String.valueOf(string2).length() + 13 + String.valueOf(string).length()).append("Blocked by ").append(string2).append(": ").append(string).toString());
                    fvc fvcVar = fvc.j;
                    String strValueOf = String.valueOf(bundleA.getString("name"));
                    throw new fvg(fvcVar.a(strValueOf.length() != 0 ? "Blocked by rule: ".concat(strValueOf) : new String("Blocked by rule: ")));
                }
                String strTrim = bundleA.getString("rewrite").trim();
                if (strTrim != null && (URLUtil.isHttpUrl(strTrim) || URLUtil.isHttpsUrl(strTrim))) {
                    Uri uri = Uri.parse(strTrim);
                    authority = uri.getAuthority();
                    String path = uri.getPath();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    if (!fufVarA.b.equalsIgnoreCase(path)) {
                        fufVarA = fuf.a(fufVarA.a, path, fufVarA.c, fufVarA.d);
                    }
                }
            }
            bfm bfmVar2 = new bfm(fufVarA, authority);
            String str = bfmVar2.b;
            if (this.b == null || !this.c.equalsIgnoreCase(str)) {
                synchronized (this.i) {
                    if (this.b == null || !this.c.equalsIgnoreCase(str)) {
                        this.c = str;
                        if (this.m != null) {
                            String str2 = this.c;
                            int i = this.d;
                            int i2 = this.f;
                            int i3 = this.g;
                            fvw fvwVarA = fvw.a(str2, i, this.m);
                            fvwVarA.c = true;
                            fvwVarA.d = i2;
                            int iA = bfi.a(i3);
                            fvwVarA.a = true;
                            fvwVarA.b = iA;
                            this.b = fvwVarA.b();
                        } else {
                            if (this.e == null) {
                                String str3 = this.c;
                                int i4 = this.d;
                                int i5 = this.f;
                                int i6 = this.g;
                                if (fpa.b()) {
                                    fttVarB = ((fvk) ((fst) fvk.a(str3, i4).c())).a(new bfj(i5, i6)).b();
                                } else {
                                    fttVarB = ((gie) gie.a(str3, i4).c()).transportExecutor(new bfj(i5, i6)).b();
                                }
                            } else {
                                Context context2 = this.a;
                                String str4 = this.c;
                                int i7 = this.d;
                                int i8 = this.f;
                                int i9 = this.g;
                                SSLSocketFactory sSLSocketFactory = this.e;
                                if (fpa.b()) {
                                    fvk fvkVarA = fvk.a(str4, i7).a((SSLSocketFactory) bdi.checkNotNull(sSLSocketFactory)).a(new bfj(i8, i9));
                                    if (((fpb) fpa.a.a()).b()) {
                                        fvkVarA.a = context2.getApplicationContext();
                                    }
                                    fttVarB = fvkVarA.b();
                                } else {
                                    fttVarB = gie.a(str4, i7).sslSocketFactory((SSLSocketFactory) bdi.checkNotNull(sSLSocketFactory)).transportExecutor(new bfj(i8, i9)).b();
                                }
                            }
                            this.b = fttVarB;
                        }
                    }
                }
            }
            return bfmVar2.a;
        } catch (VolleyError e) {
            return fufVar;
        }
    }
}
