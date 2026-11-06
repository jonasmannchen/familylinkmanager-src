package flm;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avm implements axj {
    public final Map b;
    public final awk c;
    public final Lock d;
    public final aqf e;
    public final Condition f;
    public final bba g;
    public final boolean h;
    public final boolean i;
    public boolean j;
    public Map k;
    public Map l;
    public apx m;
    private final awt o;
    private final Looper p;
    private avo r;
    public final Map a = new HashMap();
    private final Map n = new HashMap();
    private final Queue q = new LinkedList();

    public avm(Context context, Lock lock, Looper looper, aqf aqfVar, Map map, bba bbaVar, Map map2, asx asxVar, ArrayList arrayList, awk awkVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.d = lock;
        this.p = looper;
        this.f = lock.newCondition();
        this.e = aqfVar;
        this.c = awkVar;
        this.b = map2;
        this.g = bbaVar;
        this.h = z;
        HashMap map3 = new HashMap();
        for (asw aswVar : map2.keySet()) {
            map3.put(aswVar.c(), aswVar);
        }
        HashMap map4 = new HashMap();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            avg avgVar = (avg) obj;
            map4.put(avgVar.a, avgVar);
        }
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = false;
        for (Map.Entry entry : map.entrySet()) {
            asw aswVar2 = (asw) map3.get(entry.getKey());
            ate ateVar = (ate) entry.getValue();
            if (ateVar.requiresGooglePlayServices()) {
                z2 = true;
                if (((Boolean) this.b.get(aswVar2)).booleanValue()) {
                    z3 = z5;
                    z4 = z6;
                } else {
                    z3 = z5;
                    z4 = true;
                }
            } else {
                z2 = z7;
                z3 = false;
                z4 = z6;
            }
            avl avlVar = new avl(context, aswVar2, looper, ateVar, (avg) map4.get(aswVar2), bbaVar, asxVar);
            this.a.put((asz) entry.getKey(), avlVar);
            if (ateVar.requiresSignIn()) {
                this.n.put((asz) entry.getKey(), avlVar);
            }
            z7 = z2;
            z5 = z3;
            z6 = z4;
        }
        this.i = (!z7 || z5 || z6) ? false : true;
        this.o = awt.a();
    }

    @Override // flm.axj
    public final auv a(auv auvVar) {
        if (!this.h || !c(auvVar)) {
            if (!d()) {
                this.q.add(auvVar);
                return auvVar;
            }
            this.c.g.a(auvVar);
            return ((avl) this.a.get(auvVar.getClientKey())).a(0, auvVar);
        }
        return auvVar;
    }

    @Override // flm.axj
    public final auv b(auv auvVar) {
        asz clientKey = auvVar.getClientKey();
        if (!this.h || !c(auvVar)) {
            this.c.g.a(auvVar);
            return ((avl) this.a.get(clientKey)).a(1, auvVar);
        }
        return auvVar;
    }

    private final boolean c(auv auvVar) {
        PendingIntent activity;
        asz clientKey = auvVar.getClientKey();
        apx apxVarA = a(clientKey);
        if (apxVarA != null && apxVarA.c == 4) {
            awt awtVar = this.o;
            aup aupVar = ((avl) this.a.get(clientKey)).b;
            int iIdentityHashCode = System.identityHashCode(this.c);
            awv awvVar = (awv) awtVar.l.get(aupVar);
            if (awvVar == null) {
                activity = null;
            } else {
                czp czpVar = awvVar.f == null ? null : awvVar.f.f;
                activity = czpVar == null ? null : PendingIntent.getActivity(awtVar.g, iIdentityHashCode, czpVar.getSignInIntent(), 134217728);
            }
            auvVar.setFailedResult(new Status(4, null, activity));
            return true;
        }
        return false;
    }

    @Override // flm.axj
    public final void a() {
        this.d.lock();
        try {
            if (!this.j) {
                this.j = true;
                this.k = null;
                this.l = null;
                this.r = null;
                this.m = null;
                this.o.b();
                awt awtVar = this.o;
                aus ausVar = new aus(this.a.values());
                awtVar.o.sendMessage(awtVar.o.obtainMessage(2, ausVar));
                ausVar.b.a.a(new bje(this.p), new avn(this));
            }
        } finally {
            this.d.unlock();
        }
    }

    @Override // flm.axj
    public final apx b() {
        a();
        while (g()) {
            try {
                this.f.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new apx(15, null);
            }
        }
        if (d()) {
            return apx.a;
        }
        if (this.m != null) {
            return this.m;
        }
        return new apx(13, null);
    }

    @Override // flm.axj
    public final apx a(long j, TimeUnit timeUnit) {
        a();
        long nanos = timeUnit.toNanos(j);
        while (g()) {
            if (nanos <= 0) {
                c();
                return new apx(14, null);
            }
            try {
                nanos = this.f.awaitNanos(nanos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new apx(15, null);
            }
            Thread.currentThread().interrupt();
            return new apx(15, null);
        }
        if (d()) {
            return apx.a;
        }
        if (this.m != null) {
            return this.m;
        }
        return new apx(13, null);
    }

    @Override // flm.axj
    public final void c() {
        this.d.lock();
        try {
            this.j = false;
            this.k = null;
            this.l = null;
            this.m = null;
            while (!this.q.isEmpty()) {
                auv auvVar = (auv) this.q.remove();
                auvVar.setResultConsumedCallback(null);
                auvVar.cancel();
            }
            this.f.signalAll();
        } finally {
            this.d.unlock();
        }
    }

    final apx a(asz aszVar) {
        this.d.lock();
        try {
            avl avlVar = (avl) this.a.get(aszVar);
            if (this.k != null && avlVar != null) {
                return (apx) this.k.get(avlVar.b);
            }
            return null;
        } finally {
            this.d.unlock();
        }
    }

    @Override // flm.axj
    public final boolean d() {
        this.d.lock();
        try {
            return this.k != null && this.m == null;
        } finally {
            this.d.unlock();
        }
    }

    private final boolean g() {
        this.d.lock();
        try {
            return this.k == null && this.j;
        } finally {
            this.d.unlock();
        }
    }

    @Override // flm.axj
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // flm.axj
    public final void e() {
    }

    final void f() {
        while (!this.q.isEmpty()) {
            b((auv) this.q.remove());
        }
        this.c.a((Bundle) null);
    }
}
