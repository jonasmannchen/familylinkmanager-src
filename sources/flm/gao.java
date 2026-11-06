package flm;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gao extends fui {
    private static String u;
    public final ges g;
    public final Random h = new Random();
    public volatile gap i = gaq.INSTANCE;
    public final AtomicReference j = new AtomicReference();
    public final String k;
    public final int l;
    public boolean m;
    public boolean n;
    public fuk o;
    private final String v;
    private final gha w;
    private ExecutorService x;
    private final Runnable y;
    public static final Logger a = Logger.getLogger(gao.class.getName());
    private static final Set p = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
    private static final String q = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
    private static final String r = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
    private static final String s = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_grpclb", "true");
    private static final String t = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
    public static boolean b = Boolean.parseBoolean(q);
    public static boolean c = Boolean.parseBoolean(r);
    public static boolean d = Boolean.parseBoolean(s);
    public static boolean e = Boolean.parseBoolean(t);
    public static final gau f = a(gao.class.getClassLoader());

    gao(String str, frd frdVar, gha ghaVar, ges gesVar, dvw dvwVar, boolean z) {
        this.w = ghaVar;
        String strValueOf = String.valueOf((String) dvl.a(str, "name"));
        URI uriCreate = URI.create(strValueOf.length() != 0 ? "//".concat(strValueOf) : new String("//"));
        dvl.a(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        this.v = (String) dvl.a(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.k = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            Integer num = (Integer) frdVar.a(fuj.a);
            if (num == null) {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 69).append("name '").append(str).append("' doesn't contain a port, and default port is not set in params").toString());
            }
            this.l = num.intValue();
        } else {
            this.l = uriCreate.getPort();
        }
        this.g = gesVar;
        this.y = new gas(this, dvwVar, a(z));
    }

    @Override // flm.fui
    public final String a() {
        return this.v;
    }

    @Override // flm.fui
    public final synchronized void a(fuk fukVar) {
        dvl.b(this.o == null, "already started");
        this.x = (ExecutorService) ggw.a.a(this.w);
        this.o = (fuk) dvl.a(fukVar, "listener");
        e();
    }

    @Override // flm.fui
    public final synchronized void c() {
        dvl.b(this.o != null, "not started");
        e();
    }

    private final void e() {
        if (!this.n && !this.m) {
            this.x.execute(this.y);
        }
    }

    @Override // flm.fui
    public final synchronized void b() {
        if (!this.m) {
            this.m = true;
            if (this.x != null) {
                this.x = (ExecutorService) ggw.a(this.w, this.x);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9.isEmpty() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static flm.gar a(flm.gap r11, flm.gat r12, boolean r13, boolean r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.gao.a(flm.gap, flm.gat, boolean, boolean, java.lang.String):flm.gar");
    }

    static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("_grpc_config=")) {
                try {
                    Object objA = gco.a(str.substring(13));
                    if (!(objA instanceof List)) {
                        String strValueOf = String.valueOf(objA);
                        throw new IOException(new StringBuilder(String.valueOf(strValueOf).length() + 11).append("wrong type ").append(strValueOf).toString());
                    }
                    List list2 = (List) objA;
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (!(it2.next() instanceof Map)) {
                            String strValueOf2 = String.valueOf(objA);
                            throw new IOException(new StringBuilder(String.valueOf(strValueOf2).length() + 19).append("wrong element type ").append(strValueOf2).toString());
                        }
                    }
                    arrayList.addAll(list2);
                } catch (IOException e2) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String strValueOf3 = String.valueOf(str);
                    logger.logp(level, "io.grpc.internal.DnsNameResolver", "parseTxtResults", strValueOf3.length() != 0 ? "Bad service config: ".concat(strValueOf3) : new String("Bad service config: "), (Throwable) e2);
                }
            } else {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    private static long a(boolean z) {
        long j;
        if (z) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        if (property != null) {
            try {
                j = Long.parseLong(property);
            } catch (NumberFormatException e2) {
                a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                j = 30;
            }
        } else {
            j = 30;
        }
        return j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
    }

    static Map a(Map map, Random random, String str) {
        boolean z;
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            dwh.a(p.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listA = !map.containsKey("clientLanguage") ? null : ggv.a(ggv.a(map, "clientLanguage"));
        if (listA != null && !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if ("java".equalsIgnoreCase((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return null;
            }
        }
        Double dC = !map.containsKey("percentage") ? null : ggv.c(map, "percentage");
        if (dC != null) {
            int iIntValue = dC.intValue();
            dwh.a(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dC);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listA2 = !map.containsKey("clientHostname") ? null : ggv.a(ggv.a(map, "clientHostname"));
        if (listA2 != null && !listA2.isEmpty()) {
            Iterator it2 = listA2.iterator();
            do {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
            } while (!((String) it2.next()).equals(str));
            if (!z2) {
                return null;
            }
        }
        return ggv.b(map, "serviceConfig");
    }

    private static gau a(ClassLoader classLoader) {
        gau gauVar = null;
        try {
            try {
                try {
                    gauVar = (gau) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, classLoader).asSubclass(gau.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (gauVar.b() != null) {
                        a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", gauVar.b());
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassNotFoundException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
        return gauVar;
    }

    static String d() {
        if (u == null) {
            try {
                u = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return u;
    }

    static boolean a(boolean z, boolean z2, String str) {
        if (!z) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z2;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z3 = true;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '.') {
                z3 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return !z3;
    }
}
