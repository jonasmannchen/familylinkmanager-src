package flm;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwf implements fzj {
    public final String a;
    public ged b;
    public final Executor e;
    public final int f;
    public final boolean g;
    public final ghk h;
    public boolean i;
    public fvc j;
    public boolean k;
    public fvy l;
    private final InetSocketAddress n;
    private final String o;
    private boolean q;
    private boolean r;
    private final ftg m = ftg.a(getClass().getName());
    public final Object c = new Object();
    public final Set d = new HashSet();
    private final frd p = frd.a().a(gbg.c, fuw.PRIVACY_AND_INTEGRITY).a();

    fwf(fvy fvyVar, InetSocketAddress inetSocketAddress, String str, String str2, Executor executor, int i, boolean z, ghk ghkVar) {
        this.n = (InetSocketAddress) dvl.a(inetSocketAddress, "address");
        this.o = str;
        this.a = gbh.a("cronet", str2);
        this.f = i;
        this.g = z;
        this.e = (Executor) dvl.a(executor, "executor");
        this.l = (fvy) dvl.a(fvyVar, "streamFactory");
        this.h = (ghk) dvl.a(ghkVar, "transportTracer");
    }

    @Override // flm.gec
    public final Runnable a(ged gedVar) {
        this.b = (ged) dvl.a(gedVar, "listener");
        synchronized (this.c) {
            this.k = true;
        }
        return new fwg(this);
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.n);
        return new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strValueOf).length()).append(string).append("(").append(strValueOf).append(")").toString();
    }

    @Override // flm.gec
    public final void a(fvc fvcVar) {
        synchronized (this.c) {
            if (!this.i) {
                synchronized (this.c) {
                    if (!this.q) {
                        this.q = true;
                        this.b.a(fvcVar);
                        synchronized (this.c) {
                            this.i = true;
                            this.j = fvcVar;
                        }
                        c();
                    }
                }
            }
        }
    }

    @Override // flm.gec
    public final void b(fvc fvcVar) {
        ArrayList arrayList;
        a(fvcVar);
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < arrayList.size()) {
                ((fwa) arrayList.get(i2)).b(fvcVar);
                i = i2 + 1;
            } else {
                c();
                return;
            }
        }
    }

    @Override // flm.fzj
    public final frd a() {
        return this.p;
    }

    @Override // flm.fzb
    public final void a(fzc fzcVar, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.ftk
    public final ftg b() {
        return this.m;
    }

    private final void c() {
        synchronized (this.c) {
            if (this.i && !this.r && this.d.size() == 0) {
                this.r = true;
                this.b.b();
            }
        }
    }

    final void a(fwa fwaVar, fvc fvcVar) {
        synchronized (this.c) {
            if (this.d.remove(fwaVar)) {
                fwaVar.n.b(fvcVar, fvcVar.m == fvd.CANCELLED || fvcVar.m == fvd.DEADLINE_EXCEEDED, new ftv());
                c();
            }
        }
    }

    @Override // flm.fzb
    public final /* synthetic */ fyz a(fuf fufVar, ftv ftvVar, frj frjVar) {
        String str;
        dvl.a(fufVar, "method");
        dvl.a(ftvVar, "headers");
        String strValueOf = String.valueOf(fufVar.b);
        if (strValueOf.length() != 0) {
            str = "/".concat(strValueOf);
        } else {
            str = new String("/");
        }
        String str2 = this.o;
        return new fwh(this, new StringBuilder(String.valueOf(str2).length() + 8 + String.valueOf(str).length()).append("https://").append(str2).append(str).toString(), ftvVar, fufVar, ghd.a(frjVar, ftvVar), frjVar).a;
    }
}
