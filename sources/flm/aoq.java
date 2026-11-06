package flm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aoq {
    public final String a;
    public Map b;
    private int c;
    private int d;
    private final Object e;
    private final /* synthetic */ aon f;

    protected aoq(aon aonVar, aoq aoqVar, boolean z) {
        this(aonVar, aoqVar.a);
        synchronized (aoqVar.e) {
            this.c = aoqVar.c;
            if (z) {
                Map map = this.b;
                this.b = aoqVar.b;
                aoqVar.b = map;
                aoqVar.c = 0;
                return;
            }
            this.b = new HashMap(aoqVar.b.size());
            for (Map.Entry entry : aoqVar.b.entrySet()) {
                HashMap map2 = new HashMap(((Map) entry.getValue()).size());
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    map2.put((Long) entry2.getKey(), new long[]{((long[]) entry2.getValue())[0]});
                }
                this.b.put((Integer) entry.getKey(), map2);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractCounter");
        sb.append("(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.e) {
            for (Map.Entry entry : this.b.entrySet()) {
                sb.append(entry.getKey());
                sb.append(" -> [");
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    sb.append(entry2.getKey());
                    sb.append(" = ");
                    sb.append(((long[]) entry2.getValue())[0]);
                    sb.append(", ");
                }
                sb.append("], ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected aoq(aon aonVar, String str) {
        this.f = aonVar;
        this.d = this.f.a;
        this.b = new HashMap();
        this.e = new Object();
        if (aonVar.i.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new IllegalStateException(strValueOf.length() != 0 ? "counter/histogram already exists: ".concat(strValueOf) : new String("counter/histogram already exists: "));
        }
        aonVar.i.put(str, this);
        this.a = str;
    }

    public final void a(long j, long j2) {
        boolean z;
        boolean zC = false;
        this.f.h.readLock().lock();
        try {
            if (this.f.k == null) {
                z = true;
            } else {
                z = false;
                zC = c(j, j2);
            }
            if (z) {
                zC = b(j, j2);
            }
            if (zC) {
                this.f.a(this.f.b);
            }
            if (this.f.d > 0 && this.f.f == null) {
                this.f.b();
            }
        } finally {
            this.f.h.readLock().unlock();
        }
    }

    private final boolean b(long j, long j2) {
        Lock lockWriteLock = this.f.h.writeLock();
        lockWriteLock.lock();
        try {
            aon aonVar = this.f;
            aon aonVar2 = this.f;
            byte[] bArr = this.f.j;
            Integer numValueOf = (Integer) aonVar2.l.get(bArr);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(aonVar2.l.size());
                aonVar2.l.put(bArr, numValueOf);
            }
            aonVar.k = numValueOf;
            this.f.h.readLock().lock();
            lockWriteLock.unlock();
            lockWriteLock = this.f.h.readLock();
            return c(j, j2);
        } finally {
            lockWriteLock.unlock();
        }
    }

    private final boolean c(long j, long j2) {
        Map map;
        synchronized (this.e) {
            Map map2 = (Map) this.b.get(this.f.k);
            if (map2 == null) {
                HashMap map3 = new HashMap();
                this.b.put(this.f.k, map3);
                map = map3;
            } else {
                map = map2;
            }
            if (this.c >= this.f.a && !this.f.c) {
                if (this.c == this.f.a) {
                    String strValueOf = String.valueOf(this.a);
                    if (strValueOf.length() != 0) {
                        "exceeded sample count in ".concat(strValueOf);
                    } else {
                        new String("exceeded sample count in ");
                    }
                }
                return false;
            }
            this.c++;
            long[] jArr = (long[]) map.get(Long.valueOf(j));
            if (jArr == null) {
                jArr = new long[]{0};
                map.put(Long.valueOf(j), jArr);
            }
            jArr[0] = jArr[0] + j2;
            return this.f.c && this.c >= this.d;
        }
    }
}
