package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awp implements avh, axj {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final aqf d;
    public final awr e;
    public final Map f;
    public final bba h;
    public final Map i;
    public final asx j;
    public volatile awo k;
    public int l;
    public final awk m;
    public final axk n;
    public final Map g = new HashMap();
    private apx o = null;

    public awp(Context context, awk awkVar, Lock lock, Looper looper, aqf aqfVar, Map map, bba bbaVar, Map map2, asx asxVar, ArrayList arrayList, axk axkVar) {
        this.c = context;
        this.a = lock;
        this.d = aqfVar;
        this.f = map;
        this.h = bbaVar;
        this.i = map2;
        this.j = asxVar;
        this.m = awkVar;
        this.n = axkVar;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((avg) obj).b = this;
        }
        this.e = new awr(this, looper);
        this.b = lock.newCondition();
        this.k = new awj(this);
    }

    @Override // flm.axj
    public final auv a(auv auvVar) {
        auvVar.maybeMarkChain();
        return this.k.a(auvVar);
    }

    @Override // flm.axj
    public final auv b(auv auvVar) {
        auvVar.maybeMarkChain();
        return this.k.b(auvVar);
    }

    @Override // flm.axj
    public final void a() {
        this.k.c();
    }

    @Override // flm.axj
    public final apx b() {
        a();
        while (this.k instanceof avy) {
            try {
                this.b.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new apx(15, null);
            }
        }
        if (d()) {
            return apx.a;
        }
        if (this.o != null) {
            return this.o;
        }
        return new apx(13, null);
    }

    @Override // flm.axj
    public final apx a(long j, TimeUnit timeUnit) {
        a();
        long nanos = timeUnit.toNanos(j);
        while (this.k instanceof avy) {
            if (nanos <= 0) {
                c();
                return new apx(14, null);
            }
            try {
                nanos = this.b.awaitNanos(nanos);
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
        if (this.o != null) {
            return this.o;
        }
        return new apx(13, null);
    }

    @Override // flm.axj
    public final void c() {
        if (this.k.b()) {
            this.g.clear();
        }
    }

    final void a(apx apxVar) {
        this.a.lock();
        try {
            this.o = apxVar;
            this.k = new awj(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // flm.axj
    public final boolean d() {
        return this.k instanceof avv;
    }

    @Override // flm.axj
    public final void e() {
        if (d()) {
            avv avvVar = (avv) this.k;
            if (avvVar.b) {
                avvVar.b = false;
                avvVar.a.m.g.a();
                avvVar.b();
            }
        }
    }

    @Override // flm.avh
    public final void a(apx apxVar, asw aswVar, boolean z) {
        this.a.lock();
        try {
            this.k.a(apxVar, aswVar, z);
        } finally {
            this.a.unlock();
        }
    }

    @Override // flm.atr
    public final void a(Bundle bundle) {
        this.a.lock();
        try {
            this.k.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // flm.atr
    public final void a(int i) {
        this.a.lock();
        try {
            this.k.a(i);
        } finally {
            this.a.unlock();
        }
    }

    final void a(awq awqVar) {
        this.e.sendMessage(this.e.obtainMessage(1, awqVar));
    }

    @Override // flm.axj
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.k);
        for (asw aswVar : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aswVar.a).println(":");
            ((ate) this.f.get(aswVar.c())).dump(strConcat, fileDescriptor, printWriter, strArr);
        }
    }
}
