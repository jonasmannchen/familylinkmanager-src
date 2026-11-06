package flm;

import com.google.android.gms.common.api.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aon {
    private static final Charset m = Charset.forName("UTF-8");
    private static final Comparator r = new aop();
    public final int a;
    public aoz b;
    public boolean c;
    public volatile int d;
    public ScheduledExecutorService e;
    public volatile Future f;
    public long g;
    public final ReentrantReadWriteLock h;
    public Map i;
    public byte[] j;
    public Integer k;
    public TreeMap l;
    private final String n;
    private final big o;
    private final aob p;
    private aoy q;

    public aon(aob aobVar, String str, int i) {
        this(aobVar, str, i, bij.a);
    }

    private aon(aon aonVar, boolean z) {
        Object aotVar;
        this(aonVar.p, aonVar.n, aonVar.a, aonVar.o);
        ReentrantReadWriteLock.WriteLock writeLock = aonVar.h.writeLock();
        writeLock.lock();
        try {
            this.j = aonVar.j;
            this.k = aonVar.k;
            this.g = aonVar.g;
            this.b = aonVar.b;
            this.i = new TreeMap();
            for (Map.Entry entry : aonVar.i.entrySet()) {
                Map map = this.i;
                String str = (String) entry.getKey();
                aoq aoqVar = (aoq) entry.getValue();
                if (aoqVar instanceof aov) {
                    aotVar = new aov(this, (aov) aoqVar, true);
                } else if (aoqVar instanceof apb) {
                    aotVar = new apb(this, (apb) aoqVar, true);
                } else if (aoqVar instanceof aox) {
                    aotVar = new aox(this, (aox) aoqVar, true);
                } else if (aoqVar instanceof apa) {
                    aotVar = new apa(this, (apa) aoqVar, true);
                } else if (aoqVar instanceof aot) {
                    aotVar = new aot(this, (aot) aoqVar, true);
                } else {
                    String strValueOf = String.valueOf(aoqVar);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 21).append("Unkown counter type: ").append(strValueOf).toString());
                }
                map.put(str, aotVar);
            }
            TreeMap treeMap = this.l;
            this.l = aonVar.l;
            aonVar.l = treeMap;
            aonVar.k = null;
            aonVar.g = this.o.b();
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    private aon(aob aobVar, String str, int i, big bigVar) {
        this.h = new ReentrantReadWriteLock();
        this.i = new TreeMap();
        this.j = null;
        this.k = null;
        this.l = new TreeMap(r);
        this.q = null;
        bdi.checkNotNull(str);
        bdi.checkArgument(i > 0);
        bdi.checkNotNull(bigVar);
        this.p = aobVar;
        this.n = str;
        this.a = i;
        this.o = bigVar;
        this.g = bigVar.b();
    }

    public final void a() {
        bdi.checkNotNull(this.p);
        this.h.writeLock().lock();
        try {
            this.c = true;
        } finally {
            this.h.writeLock().unlock();
        }
    }

    public final void b() {
        this.h.writeLock().lock();
        try {
            if (this.f != null) {
                this.f.cancel(false);
            }
            this.f = this.e.schedule(new Runnable(this) { // from class: flm.aoo
                private final aon a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aon aonVar = this.a;
                    aonVar.h.writeLock().lock();
                    try {
                        aonVar.f = null;
                        aonVar.h.writeLock().unlock();
                        aonVar.c();
                    } catch (Throwable th) {
                        aonVar.h.writeLock().unlock();
                        throw th;
                    }
                }
            }, this.d, TimeUnit.MILLISECONDS);
        } finally {
            this.h.writeLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.h.readLock().lock();
        try {
            sb.append("{");
            for (Map.Entry entry : this.l.entrySet()) {
                sb.append(entry.getKey() == null ? "null" : new String((byte[]) entry.getKey()));
                sb.append(", ");
            }
            sb.append("}\n");
            Iterator it = this.i.values().iterator();
            while (it.hasNext()) {
                sb.append(((aoq) it.next()).toString());
                sb.append("\n");
            }
            return sb.toString();
        } finally {
            this.h.readLock().unlock();
        }
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(m));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private final aov d(String str) {
        this.h.writeLock().lock();
        try {
            return new aov(this, str);
        } finally {
            this.h.writeLock().unlock();
        }
    }

    private final aox e(String str) {
        this.h.writeLock().lock();
        try {
            return new aox(this, str);
        } finally {
            this.h.writeLock().unlock();
        }
    }

    public final aov b(String str) {
        aov aovVarD;
        this.h.writeLock().lock();
        try {
            aoq aoqVar = (aoq) this.i.get(str);
            if (aoqVar == null) {
                aovVarD = d(str);
                this.h.writeLock().unlock();
            } else {
                try {
                    aovVarD = (aov) aoqVar;
                    this.h.writeLock().unlock();
                } catch (ClassCastException e) {
                    String strValueOf = String.valueOf(str);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "another type of counter exists with name: ".concat(strValueOf) : new String("another type of counter exists with name: "));
                }
            }
            return aovVarD;
        } catch (Throwable th) {
            this.h.writeLock().unlock();
            throw th;
        }
    }

    public final aox c(String str) {
        aox aoxVarE;
        this.h.writeLock().lock();
        try {
            aoq aoqVar = (aoq) this.i.get(str);
            if (aoqVar == null) {
                aoxVarE = e(str);
                this.h.writeLock().unlock();
            } else {
                try {
                    aoxVarE = (aox) aoqVar;
                    this.h.writeLock().unlock();
                } catch (ClassCastException e) {
                    String strValueOf = String.valueOf(str);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "another type of counter exists with name: ".concat(strValueOf) : new String("another type of counter exists with name: "));
                }
            }
            return aoxVarE;
        } catch (Throwable th) {
            this.h.writeLock().unlock();
            throw th;
        }
    }

    private final aon d() {
        this.h.writeLock().lock();
        try {
            return new aon(this, true);
        } finally {
            this.h.writeLock().unlock();
        }
    }

    public final void c() {
        a(this.b);
    }

    public final void a(aoz aozVar) {
        aon aonVarD = d();
        Set setKeySet = aonVarD.l.keySet();
        aoi[] aoiVarArr = new aoi[setKeySet.size()];
        Iterator it = setKeySet.iterator();
        int i = 0;
        while (it.hasNext()) {
            aoiVarArr[i] = new aow(aonVarD, (byte[]) it.next());
            i++;
        }
        att attVarA = null;
        for (aoi aoiVar : aoiVarArr) {
            aog aogVar = new aog(aonVarD.p, aoiVar);
            aogVar.e = aonVarD.n;
            if (aozVar != null) {
                aogVar = aozVar.a();
            }
            attVarA = aogVar.a();
        }
        if (attVarA == null) {
            Status status = Status.a;
            bdi.checkNotNull(status, "Result must not be null");
            new ayf(null).setResult(status);
        }
    }

    static {
        new aou(1);
    }
}
