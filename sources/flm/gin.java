package flm;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class gin implements fzj, gia {
    private static final Map F;
    private static final gij[] G;
    public static final Logger a;
    public final Runnable A;
    public final int B;
    public final gex C;
    public Runnable D;
    public ehb E;
    private final String H;
    private final ggl M;
    private final int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private ScheduledExecutorService R;
    private final ghk S;
    public final InetSocketAddress b;
    public final String c;
    public final int d;
    public ged e;
    public gho f;
    public giz g;
    public final Executor j;
    public int k;
    public gis l;
    public fvc n;
    public gbx o;
    public SSLSocketFactory p;
    public HostnameVerifier q;
    public Socket r;
    public final gjf u;
    public gcp v;
    public boolean w;
    public long x;
    public long y;
    public boolean z;
    private final Random I = new Random();
    public final Object h = new Object();
    private final ftg K = ftg.a(getClass().getName());
    public final Map i = new HashMap();
    public frd m = frd.b;
    public int s = 0;
    public LinkedList t = new LinkedList();
    private final gca T = new gio(this);
    private int L = 3;
    private final dvz J = gbh.o;

    gin(InetSocketAddress inetSocketAddress, String str, String str2, Executor executor, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, gjf gjfVar, int i, int i2, gex gexVar, Runnable runnable, int i3, ghk ghkVar) {
        this.b = (InetSocketAddress) dvl.a(inetSocketAddress, "address");
        this.c = str;
        this.N = i;
        this.d = i2;
        this.j = (Executor) dvl.a(executor, "executor");
        this.M = new ggl(executor);
        this.p = sSLSocketFactory;
        this.q = hostnameVerifier;
        this.u = (gjf) dvl.a(gjfVar, "connectionSpec");
        this.H = gbh.a("okhttp", str2);
        this.C = gexVar;
        this.A = (Runnable) dvl.a(runnable, "tooManyPingsRunnable");
        this.B = i3;
        this.S = (ghk) dvl.a(ghkVar);
        synchronized (this.h) {
            ghk ghkVar2 = this.S;
            dvl.a(new gip(this));
        }
    }

    @Override // flm.fzb
    public final void a(fzc fzcVar, Executor executor) {
        gbx gbxVar;
        boolean z = true;
        dvl.b(this.f != null);
        long jNextLong = 0;
        synchronized (this.h) {
            if (this.P) {
                gbx.a(fzcVar, executor, f());
                return;
            }
            if (this.o != null) {
                z = false;
                gbxVar = this.o;
            } else {
                jNextLong = this.I.nextLong();
                dvw dvwVar = (dvw) this.J.a();
                dvwVar.a();
                gbxVar = new gbx(jNextLong, dvwVar);
                this.o = gbxVar;
                this.S.f++;
            }
            if (z) {
                this.f.a(false, (int) (jNextLong >>> 32), (int) jNextLong);
            }
            synchronized (gbxVar) {
                if (!gbxVar.c) {
                    gbxVar.b.put(fzcVar, executor);
                } else {
                    gbx.a(executor, gbxVar.d != null ? gbx.a(fzcVar, gbxVar.d) : gbx.a(fzcVar, gbxVar.e));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fzb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gij a(fuf fufVar, ftv ftvVar, frj frjVar) {
        gij gijVar;
        dvl.a(fufVar, "method");
        dvl.a(ftvVar, "headers");
        ghd ghdVarA = ghd.a(frjVar, ftvVar);
        synchronized (this.h) {
            gijVar = new gij(fufVar, ftvVar, this.f, this, this.g, this.h, this.N, this.d, this.c, this.H, ghdVarA, this.S, frjVar);
        }
        return gijVar;
    }

    final void a(gij gijVar) {
        dvl.b(gijVar.g == -1, "StreamId already assigned");
        this.i.put(Integer.valueOf(this.L), gijVar);
        c(gijVar);
        gim gimVar = gijVar.h;
        int i = this.L;
        if (!(gimVar.h.g == -1)) {
            throw new IllegalStateException(dvy.a("the stream has been started with id %s", Integer.valueOf(i)));
        }
        gimVar.h.g = i;
        gimVar.h.h.a();
        if (gimVar.c != null) {
            gimVar.e.a(gimVar.h.i, false, gimVar.h.g, 0, gimVar.b);
            ghd ghdVar = gimVar.h.d;
            gimVar.b = null;
            boolean z = false;
            while (!gimVar.c.isEmpty()) {
                gik gikVar = (gik) gimVar.c.poll();
                gimVar.f.a(gikVar.b, gimVar.h.g, gikVar.a, false);
                z = gikVar.c ? true : z;
            }
            if (z) {
                gimVar.f.a();
            }
            gimVar.c = null;
        }
        if ((gijVar.g() != fuh.UNARY && gijVar.g() != fuh.SERVER_STREAMING) || gijVar.i) {
            this.f.b();
        }
        if (this.L >= 2147483645) {
            this.L = Integer.MAX_VALUE;
            a(Integer.MAX_VALUE, gjv.NO_ERROR, fvc.j.a("Stream ids exhausted"));
        } else {
            this.L += 2;
        }
    }

    final boolean c() {
        boolean z = false;
        while (!this.t.isEmpty() && this.i.size() < this.s) {
            a((gij) this.t.poll());
            z = true;
        }
        return z;
    }

    @Override // flm.gec
    public final Runnable a(ged gedVar) {
        this.e = (ged) dvl.a(gedVar, "listener");
        if (this.w) {
            this.R = (ScheduledExecutorService) ggw.a.a(gbh.n);
            this.v = new gcp(new gcs(this), this.R, this.x, this.y, this.z);
            this.v.a();
        }
        this.f = new gho(this, this.M);
        this.g = new giz(this, this.f, this.d);
        this.M.execute(new giq(this));
        return null;
    }

    final Socket a(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws fvg {
        Socket socket;
        String strA;
        try {
            if (inetSocketAddress2.getAddress() != null) {
                socket = new Socket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                socket = new Socket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
            socket.setTcpNoDelay(true);
            guq guqVarB = gug.b(socket);
            gud gudVarA = gug.a(gug.a(socket));
            foe foeVar = new foe();
            if ("https".equalsIgnoreCase("http")) {
                foeVar.a = "http";
            } else if ("https".equalsIgnoreCase("https")) {
                foeVar.a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: https");
            }
            String hostName = inetSocketAddress.getHostName();
            if (hostName == null) {
                throw new IllegalArgumentException("host == null");
            }
            String strA2 = fod.a(hostName, 0, hostName.length(), false);
            if (strA2.startsWith("[") && strA2.endsWith("]")) {
                InetAddress inetAddressA = foe.a(strA2, 1, strA2.length() - 1);
                if (inetAddressA == null) {
                    strA = null;
                } else {
                    byte[] address = inetAddressA.getAddress();
                    if (address.length == 16) {
                        int i = -1;
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < address.length) {
                            int i4 = i3;
                            while (i4 < 16 && address[i4] == 0 && address[i4 + 1] == 0) {
                                i4 += 2;
                            }
                            int i5 = i4 - i3;
                            if (i5 <= i2) {
                                i5 = i2;
                                i3 = i;
                            }
                            i = i3;
                            i3 = i4 + 2;
                            i2 = i5;
                        }
                        guc gucVar = new guc();
                        int i6 = 0;
                        while (i6 < address.length) {
                            if (i6 == i) {
                                gum gumVarA = gucVar.a(1);
                                byte[] bArr = gumVarA.a;
                                int i7 = gumVarA.c;
                                gumVarA.c = i7 + 1;
                                bArr[i7] = (byte) 58;
                                gucVar.c++;
                                int i8 = i6 + i2;
                                if (i8 == 16) {
                                    gum gumVarA2 = gucVar.a(1);
                                    byte[] bArr2 = gumVarA2.a;
                                    int i9 = gumVarA2.c;
                                    gumVarA2.c = i9 + 1;
                                    bArr2[i9] = (byte) 58;
                                    gucVar.c++;
                                    i6 = i8;
                                } else {
                                    i6 = i8;
                                }
                            } else {
                                if (i6 > 0) {
                                    gum gumVarA3 = gucVar.a(1);
                                    byte[] bArr3 = gumVarA3.a;
                                    int i10 = gumVarA3.c;
                                    gumVarA3.c = i10 + 1;
                                    bArr3[i10] = (byte) 58;
                                    gucVar.c++;
                                }
                                long j = ((address[i6] & 255) << 8) | (address[i6 + 1] & 255);
                                if (j == 0) {
                                    gum gumVarA4 = gucVar.a(1);
                                    byte[] bArr4 = gumVarA4.a;
                                    int i11 = gumVarA4.c;
                                    gumVarA4.c = i11 + 1;
                                    bArr4[i11] = (byte) 48;
                                    gucVar.c++;
                                } else {
                                    int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
                                    gum gumVarA5 = gucVar.a(iNumberOfTrailingZeros);
                                    byte[] bArr5 = gumVarA5.a;
                                    int i12 = gumVarA5.c;
                                    for (int i13 = (gumVarA5.c + iNumberOfTrailingZeros) - 1; i13 >= i12; i13--) {
                                        bArr5[i13] = guc.a[(int) (15 & j)];
                                        j >>>= 4;
                                    }
                                    gumVarA5.c += iNumberOfTrailingZeros;
                                    gucVar.c += (long) iNumberOfTrailingZeros;
                                }
                                i6 += 2;
                            }
                        }
                        strA = gucVar.g();
                    } else {
                        throw new AssertionError();
                    }
                }
            } else {
                strA = foe.a(strA2);
            }
            if (strA == null) {
                throw new IllegalArgumentException("unexpected host: " + hostName);
            }
            foeVar.d = strA;
            int port = inetSocketAddress.getPort();
            if (port <= 0 || port > 65535) {
                throw new IllegalArgumentException("unexpected port: " + port);
            }
            foeVar.e = port;
            if (foeVar.a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (foeVar.d == null) {
                throw new IllegalStateException("host == null");
            }
            fod fodVar = new fod(foeVar);
            foh fohVar = new foh();
            if (fodVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            fohVar.a = fodVar;
            String str3 = fodVar.a;
            foh fohVarA = fohVar.a("Host", new StringBuilder(String.valueOf(str3).length() + 12).append(str3).append(":").append(fodVar.b).toString()).a("User-Agent", this.H);
            if (str != null && str2 != null) {
                fohVarA.a("Proxy-Authorization", foa.a(str, str2));
            }
            if (fohVarA.a == null) {
                throw new IllegalStateException("url == null");
            }
            fog fogVar = new fog(fohVarA);
            fod fodVar2 = fogVar.a;
            gudVarA.a(String.format("CONNECT %s:%d HTTP/1.1", fodVar2.a, Integer.valueOf(fodVar2.b))).a("\r\n");
            int length = fogVar.b.a.length / 2;
            for (int i14 = 0; i14 < length; i14++) {
                gudVarA.a(fogVar.b.a(i14)).a(": ").a(fogVar.b.b(i14)).a("\r\n");
            }
            gudVarA.a("\r\n");
            gudVarA.flush();
            fok fokVarA = fok.a(a(guqVarB));
            while (!a(guqVarB).equals("")) {
            }
            if (fokVarA.a < 200 || fokVarA.a >= 300) {
                guc gucVar2 = new guc();
                try {
                    socket.shutdownOutput();
                    guqVarB.a(gucVar2, 1024L);
                } catch (IOException e) {
                    String strValueOf = String.valueOf(e.toString());
                    String strConcat = strValueOf.length() != 0 ? "Unable to read body: ".concat(strValueOf) : new String("Unable to read body: ");
                    gucVar2.a(strConcat, 0, strConcat.length());
                }
                try {
                    socket.close();
                } catch (IOException e2) {
                }
                throw fvc.j.a(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(fokVarA.a), fokVarA.b, gucVar2.g())).c();
            }
            return socket;
        } catch (IOException e3) {
            throw fvc.j.a("Failed trying to connect with proxy").b(e3).c();
        }
    }

    private static String a(guq guqVar) throws EOFException {
        gum gumVar;
        long j;
        gum gumVar2;
        long j2;
        guc gucVar = new guc();
        while (guqVar.a(gucVar, 1L) != -1) {
            if (gucVar.b(gucVar.c - 1) == 10) {
                if (Long.MAX_VALUE < 0) {
                    throw new IllegalArgumentException("limit < 0: 9223372036854775807");
                }
                long j3 = Long.MAX_VALUE == Long.MAX_VALUE ? Long.MAX_VALUE : Long.MIN_VALUE;
                if (0 < 0 || j3 < 0) {
                    throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(gucVar.c), 0L, Long.valueOf(j3)));
                }
                long j4 = j3 > gucVar.c ? gucVar.c : j3;
                if (0 != j4 && (gumVar = gucVar.b) != null) {
                    if (gucVar.c < 0) {
                        j = gucVar.c;
                        gumVar2 = gumVar;
                        while (j > 0) {
                            gumVar2 = gumVar2.g;
                            j -= (long) (gumVar2.c - gumVar2.b);
                        }
                    } else {
                        j = 0;
                        gumVar2 = gumVar;
                        while (true) {
                            long j5 = ((long) (gumVar2.c - gumVar2.b)) + j;
                            if (j5 >= 0) {
                                break;
                            }
                            gumVar2 = gumVar2.f;
                            j = j5;
                        }
                    }
                    long j6 = j;
                    long j7 = 0;
                    loop4: while (true) {
                        if (j6 < j4) {
                            byte[] bArr = gumVar2.a;
                            int iMin = (int) Math.min(gumVar2.c, (((long) gumVar2.b) + j4) - j6);
                            for (int i = (int) ((j7 + ((long) gumVar2.b)) - j6); i < iMin; i++) {
                                if (bArr[i] == 10) {
                                    j2 = ((long) (i - gumVar2.b)) + j6;
                                    break loop4;
                                }
                            }
                            j7 = ((long) (gumVar2.c - gumVar2.b)) + j6;
                            gumVar2 = gumVar2.f;
                            j6 = j7;
                        } else {
                            j2 = -1;
                            break;
                        }
                    }
                } else {
                    j2 = -1;
                }
                if (j2 != -1) {
                    return gucVar.d(j2);
                }
                if (j3 < gucVar.c && gucVar.b(j3 - 1) == 13 && gucVar.b(j3) == 10) {
                    return gucVar.d(j3);
                }
                guc gucVar2 = new guc();
                long jMin = Math.min(32L, gucVar.c);
                gut.a(gucVar.c, 0L, jMin);
                if (jMin != 0) {
                    gucVar2.c += jMin;
                    gum gumVar3 = gucVar.b;
                    long j8 = 0;
                    while (j8 >= gumVar3.c - gumVar3.b) {
                        j8 -= (long) (gumVar3.c - gumVar3.b);
                        gumVar3 = gumVar3.f;
                    }
                    while (jMin > 0) {
                        gum gumVar4 = new gum(gumVar3);
                        gumVar4.b = (int) (j8 + ((long) gumVar4.b));
                        gumVar4.c = Math.min(gumVar4.b + ((int) jMin), gumVar4.c);
                        if (gucVar2.b == null) {
                            gumVar4.g = gumVar4;
                            gumVar4.f = gumVar4;
                            gucVar2.b = gumVar4;
                        } else {
                            gucVar2.b.g.a(gumVar4);
                        }
                        jMin -= (long) (gumVar4.c - gumVar4.b);
                        j8 = 0;
                        gumVar3 = gumVar3.f;
                    }
                }
                throw new EOFException("\\n not found: limit=" + Math.min(gucVar.c, Long.MAX_VALUE) + " content=" + gucVar2.f().c() + (char) 8230);
            }
        }
        String strValueOf = String.valueOf(gucVar.f().c());
        throw new EOFException(strValueOf.length() != 0 ? "\\n not found: ".concat(strValueOf) : new String("\\n not found: "));
    }

    public String toString() {
        return dve.a(this).a("logId", this.K.a).a("address", this.b).toString();
    }

    @Override // flm.ftk
    public final ftg b() {
        return this.K;
    }

    @Override // flm.gec
    public final void a(fvc fvcVar) {
        synchronized (this.h) {
            if (this.n == null) {
                this.n = fvcVar;
                this.e.a(this.n);
                e();
            }
        }
    }

    @Override // flm.gec
    public final void b(fvc fvcVar) {
        a(fvcVar);
        synchronized (this.h) {
            Iterator it = this.i.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((gij) entry.getValue()).h.b(fvcVar, false, new ftv());
                b((gij) entry.getValue());
            }
            for (gij gijVar : this.t) {
                gijVar.h.b(fvcVar, true, new ftv());
                b(gijVar);
            }
            this.t.clear();
            e();
        }
    }

    @Override // flm.fzj
    public final frd a() {
        return this.m;
    }

    final gij[] d() {
        gij[] gijVarArr;
        synchronized (this.h) {
            gijVarArr = (gij[]) this.i.values().toArray(G);
        }
        return gijVarArr;
    }

    @Override // flm.gia
    public final void a(Throwable th) {
        dvl.a(th, "failureCause");
        a(0, gjv.INTERNAL_ERROR, fvc.j.b(th));
    }

    final void a(gjv gjvVar, String str) {
        a(0, gjvVar, a(gjvVar).b(str));
    }

    final void a(int i, gjv gjvVar, fvc fvcVar) {
        synchronized (this.h) {
            if (this.n == null) {
                this.n = fvcVar;
                this.e.a(fvcVar);
            }
            if (gjvVar != null && !this.O) {
                this.O = true;
                this.f.a(0, gjvVar, new byte[0]);
            }
            Iterator it = this.i.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((gij) entry.getValue()).h.a(fvcVar, dp.aL, false, new ftv());
                    b((gij) entry.getValue());
                }
            }
            for (gij gijVar : this.t) {
                gijVar.h.a(fvcVar, dp.aL, true, new ftv());
                b(gijVar);
            }
            this.t.clear();
            e();
        }
    }

    final void a(int i, fvc fvcVar, int i2, boolean z, gjv gjvVar, ftv ftvVar) {
        synchronized (this.h) {
            gij gijVar = (gij) this.i.remove(Integer.valueOf(i));
            if (gijVar != null) {
                if (gjvVar != null) {
                    this.f.a(i, gjv.CANCEL);
                }
                if (fvcVar != null) {
                    gim gimVar = gijVar.h;
                    if (ftvVar == null) {
                        ftvVar = new ftv();
                    }
                    gimVar.a(fvcVar, i2, z, ftvVar);
                }
                if (!c()) {
                    e();
                    b(gijVar);
                }
            }
        }
    }

    private final void e() {
        if (this.n != null && this.i.isEmpty() && this.t.isEmpty() && !this.P) {
            this.P = true;
            if (this.v != null) {
                this.v.e();
                this.R = (ScheduledExecutorService) ggw.a(gbh.n, this.R);
            }
            if (this.o != null) {
                gbx gbxVar = this.o;
                Throwable thF = f();
                synchronized (gbxVar) {
                    if (!gbxVar.c) {
                        gbxVar.c = true;
                        gbxVar.d = thF;
                        Map map = gbxVar.b;
                        gbxVar.b = null;
                        for (Map.Entry entry : map.entrySet()) {
                            gbx.a((fzc) entry.getKey(), (Executor) entry.getValue(), thF);
                        }
                    }
                }
                this.o = null;
            }
            if (!this.O) {
                this.O = true;
                this.f.a(0, gjv.NO_ERROR, new byte[0]);
            }
            this.f.close();
        }
    }

    final void b(gij gijVar) {
        if (this.Q && this.t.isEmpty() && this.i.isEmpty()) {
            this.Q = false;
            if (this.v != null) {
                this.v.d();
            }
        }
        if (gijVar.r) {
            this.T.a(gijVar, false);
        }
    }

    final void c(gij gijVar) {
        if (!this.Q) {
            this.Q = true;
            if (this.v != null) {
                this.v.c();
            }
        }
        if (gijVar.r) {
            this.T.a(gijVar, true);
        }
    }

    private final Throwable f() {
        fvg fvgVarC;
        synchronized (this.h) {
            fvgVarC = this.n != null ? this.n.c() : fvc.j.a("Connection closed").c();
        }
        return fvgVarC;
    }

    final boolean a(int i) {
        boolean z;
        synchronized (this.h) {
            z = i < this.L && (i & 1) == 1;
        }
        return z;
    }

    final gij b(int i) {
        gij gijVar;
        synchronized (this.h) {
            gijVar = (gij) this.i.get(Integer.valueOf(i));
        }
        return gijVar;
    }

    static fvc a(gjv gjvVar) {
        fvc fvcVar = (fvc) F.get(gjvVar);
        if (fvcVar != null) {
            return fvcVar;
        }
        return fvc.d.a(new StringBuilder(37).append("Unknown http2 error code: ").append(gjvVar.n).toString());
    }

    static {
        EnumMap enumMap = new EnumMap(gjv.class);
        enumMap.put(gjv.NO_ERROR, fvc.i.a("No error: A GRPC status of OK should have been sent"));
        enumMap.put(gjv.PROTOCOL_ERROR, fvc.i.a("Protocol error"));
        enumMap.put(gjv.INTERNAL_ERROR, fvc.i.a("Internal error"));
        enumMap.put(gjv.FLOW_CONTROL_ERROR, fvc.i.a("Flow control error"));
        enumMap.put(gjv.STREAM_CLOSED, fvc.i.a("Stream closed"));
        enumMap.put(gjv.FRAME_TOO_LARGE, fvc.i.a("Frame too large"));
        enumMap.put(gjv.REFUSED_STREAM, fvc.j.a("Refused stream"));
        enumMap.put(gjv.CANCEL, fvc.c.a("Cancelled"));
        enumMap.put(gjv.COMPRESSION_ERROR, fvc.i.a("Compression error"));
        enumMap.put(gjv.CONNECT_ERROR, fvc.i.a("Connect error"));
        enumMap.put(gjv.ENHANCE_YOUR_CALM, fvc.h.a("Enhance your calm"));
        enumMap.put(gjv.INADEQUATE_SECURITY, fvc.f.a("Inadequate security"));
        F = Collections.unmodifiableMap(enumMap);
        a = Logger.getLogger(gin.class.getName());
        G = new gij[0];
    }
}
