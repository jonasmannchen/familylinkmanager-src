package flm;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fwp extends ftu {
    private final List A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    public gep f;
    public fuj g;
    public final String h;
    public String i;
    public ftn j;
    public boolean k;
    public fsp l;
    public frz m;
    public long n;
    public int o;
    public int p;
    public long q;
    public long r;
    public boolean s;
    public boolean t;
    public fsz u;
    public int v;
    public ghl w;
    public int x;
    public frg y;
    private static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final long e = TimeUnit.SECONDS.toMillis(1);
    private static final gep b = ghc.a(gbh.m);
    private static final fuj c = ful.b;
    private static final fsp d = fsp.a;
    private static final frz z = frz.a;

    public fwp(String str) {
        this.f = b;
        this.A = new ArrayList();
        this.g = c;
        this.l = d;
        this.m = z;
        this.n = a;
        this.o = 5;
        this.p = 5;
        this.q = 16777216L;
        this.r = 1048576L;
        this.s = false;
        this.u = fsz.b;
        this.w = ghk.a;
        this.x = 4194304;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.h = (String) dvl.a(str, "target");
    }

    public abstract fzd a();

    private static String a(SocketAddress socketAddress) {
        try {
            String strValueOf = String.valueOf(socketAddress);
            return new URI("directaddress", "", new StringBuilder(String.valueOf(strValueOf).length() + 1).append("/").append(strValueOf).toString(), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    public fwp(SocketAddress socketAddress, String str) {
        this.f = b;
        this.A = new ArrayList();
        this.g = c;
        this.l = d;
        this.m = z;
        this.n = a;
        this.o = 5;
        this.p = 5;
        this.q = 16777216L;
        this.r = 1048576L;
        this.s = false;
        this.u = fsz.b;
        this.w = ghk.a;
        this.x = 4194304;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.h = a(socketAddress);
        this.g = new fwq(socketAddress, str);
    }

    @Override // flm.ftu
    public final ftt b() {
        fzd fzdVarA = a();
        gax gaxVar = new gax();
        ghc ghcVarA = ghc.a(gbh.m);
        dvz dvzVar = gbh.o;
        ArrayList arrayList = new ArrayList(this.A);
        this.t = false;
        if (this.B) {
            this.t = true;
            arrayList.add(0, new fxz(new fxv(gbh.o, true), this.C, this.D));
        }
        if (this.E) {
            this.t = true;
            arrayList.add(0, new fyc(gnn.a.a(), gnn.a.b().a()).e);
        }
        return new gea(new gda(this, fzdVarA, gaxVar, ghcVarA, dvzVar, arrayList, ghh.a));
    }

    public frd d() {
        return frd.b;
    }
}
