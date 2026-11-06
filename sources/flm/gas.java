package flm;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gas implements Runnable {
    private final gao a;
    private final dvw b;
    private final long c;
    private gar d = null;

    gas(gao gaoVar, dvw dvwVar, long j) {
        this.a = gaoVar;
        this.b = (dvw) dvl.a(dvwVar, "stopwatch");
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gat gatVarA;
        Map mapA;
        Map map = null;
        if (gao.a.isLoggable(Level.FINER)) {
            Logger logger = gao.a;
            Level level = Level.FINER;
            String strValueOf = String.valueOf(this.a.k);
            logger.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", strValueOf.length() != 0 ? "Attempting DNS resolution of ".concat(strValueOf) : new String("Attempting DNS resolution of "));
        }
        synchronized (this.a) {
            if (!this.a.m) {
                if (this.d == null || this.c == 0 || (this.c > 0 && this.b.a(TimeUnit.NANOSECONDS) > this.c)) {
                    fuk fukVar = this.a.o;
                    this.a.n = true;
                    try {
                        InetSocketAddress inetSocketAddressCreateUnresolved = InetSocketAddress.createUnresolved(this.a.k, this.a.l);
                        try {
                            gex gexVarA = this.a.g.a(inetSocketAddressCreateUnresolved);
                            if (gexVarA != null) {
                                if (gao.a.isLoggable(Level.FINER)) {
                                    Logger logger2 = gao.a;
                                    Level level2 = Level.FINER;
                                    String strValueOf2 = String.valueOf(gexVarA.a);
                                    String str = this.a.k;
                                    logger2.logp(level2, "io.grpc.internal.DnsNameResolver$Resolve", "resolveInternal", new StringBuilder(String.valueOf(strValueOf2).length() + 17 + String.valueOf(str).length()).append("Using proxy ").append(strValueOf2).append(" for ").append(str).toString());
                                }
                                fukVar.a(Collections.singletonList(new fss(new gey(inetSocketAddressCreateUnresolved, gexVarA))), frd.b);
                            } else {
                                try {
                                    if (gao.a(gao.b, gao.c, this.a.k)) {
                                        gatVarA = (gat) this.a.j.get();
                                        if (gatVarA == null && gao.f != null) {
                                            gatVarA = gao.f.a();
                                        }
                                    } else {
                                        gatVarA = null;
                                    }
                                    gar garVarA = gao.a(this.a.i, gatVarA, gao.d, gao.e, this.a.k);
                                    this.d = garVarA;
                                    if (this.c > 0) {
                                        this.b.b().a();
                                    }
                                    if (gao.a.isLoggable(Level.FINER)) {
                                        Logger logger3 = gao.a;
                                        Level level3 = Level.FINER;
                                        String strValueOf3 = String.valueOf(garVarA);
                                        String str2 = this.a.k;
                                        logger3.logp(level3, "io.grpc.internal.DnsNameResolver$Resolve", "resolveInternal", new StringBuilder(String.valueOf(strValueOf3).length() + 23 + String.valueOf(str2).length()).append("Found DNS results ").append(strValueOf3).append(" for ").append(str2).toString());
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = garVarA.a.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new fss(new InetSocketAddress((InetAddress) it.next(), this.a.l)));
                                    }
                                    arrayList.addAll(garVarA.c);
                                    if (arrayList.isEmpty()) {
                                        fvc fvcVar = fvc.j;
                                        String strValueOf4 = String.valueOf(this.a.k);
                                        fukVar.a(fvcVar.a(strValueOf4.length() != 0 ? "No DNS backend or balancer addresses found for ".concat(strValueOf4) : new String("No DNS backend or balancer addresses found for ")));
                                    } else {
                                        fre freVarA = frd.a();
                                        if (!garVarA.b.isEmpty()) {
                                            try {
                                                Iterator it2 = gao.a(garVarA.b).iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        mapA = map;
                                                        break;
                                                    }
                                                    Map map2 = (Map) it2.next();
                                                    try {
                                                        mapA = gao.a(map2, this.a.h, gao.d());
                                                    } catch (RuntimeException e) {
                                                        Logger logger4 = gao.a;
                                                        Level level4 = Level.WARNING;
                                                        String strValueOf5 = String.valueOf(map2);
                                                        logger4.logp(level4, "io.grpc.internal.DnsNameResolver$Resolve", "resolveInternal", new StringBuilder(String.valueOf(strValueOf5).length() + 26).append("Bad service config choice ").append(strValueOf5).toString(), (Throwable) e);
                                                        mapA = map;
                                                    }
                                                    if (mapA != null) {
                                                        break;
                                                    } else {
                                                        map = mapA;
                                                    }
                                                }
                                            } catch (RuntimeException e2) {
                                                gao.a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver$Resolve", "resolveInternal", "Can't parse service Configs", (Throwable) e2);
                                            }
                                            if (mapA != null) {
                                                freVarA.a(gbg.a, mapA);
                                            }
                                        } else {
                                            gao.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver$Resolve", "resolveInternal", "No TXT records found for {0}", new Object[]{this.a.k});
                                        }
                                        fukVar.a(arrayList, freVarA.a());
                                    }
                                } catch (Exception e3) {
                                    fvc fvcVar2 = fvc.j;
                                    String strValueOf6 = String.valueOf(this.a.k);
                                    fukVar.a(fvcVar2.a(strValueOf6.length() != 0 ? "Unable to resolve host ".concat(strValueOf6) : new String("Unable to resolve host ")).b(e3));
                                }
                            }
                        } catch (IOException e4) {
                            fvc fvcVar3 = fvc.j;
                            String strValueOf7 = String.valueOf(this.a.k);
                            fukVar.a(fvcVar3.a(strValueOf7.length() != 0 ? "Unable to resolve host ".concat(strValueOf7) : new String("Unable to resolve host ")).b(e4));
                        }
                        synchronized (this.a) {
                            this.a.n = false;
                        }
                    } catch (Throwable th) {
                        synchronized (this.a) {
                            this.a.n = false;
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
