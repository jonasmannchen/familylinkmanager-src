package flm;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avi implements axj {
    public final awp a;
    public final awp b;
    public Bundle c;
    public final Lock g;
    private final Context h;
    private final awk i;
    private final Map j;
    private final ate l;
    private final Set k = Collections.newSetFromMap(new WeakHashMap());
    public apx d = null;
    public apx e = null;
    public boolean f = false;
    private int m = 0;

    avi(Context context, awk awkVar, Lock lock, Looper looper, aqf aqfVar, Map map, Map map2, bba bbaVar, asx asxVar, ate ateVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.h = context;
        this.i = awkVar;
        this.g = lock;
        this.l = ateVar;
        this.a = new awp(context, this.i, lock, looper, aqfVar, map2, null, map4, null, arrayList2, new avj(this));
        this.b = new awp(context, this.i, lock, looper, aqfVar, map, bbaVar, map3, asxVar, arrayList, new avk(this));
        rt rtVar = new rt();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            rtVar.put((asz) it.next(), this.a);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            rtVar.put((asz) it2.next(), this.b);
        }
        this.j = Collections.unmodifiableMap(rtVar);
    }

    @Override // flm.axj
    public final auv a(auv auvVar) {
        if (c(auvVar)) {
            if (h()) {
                auvVar.setFailedResult(new Status(4, null, i()));
                return auvVar;
            }
            return this.b.a(auvVar);
        }
        return this.a.a(auvVar);
    }

    @Override // flm.axj
    public final auv b(auv auvVar) {
        if (c(auvVar)) {
            if (h()) {
                auvVar.setFailedResult(new Status(4, null, i()));
                return auvVar;
            }
            return this.b.b(auvVar);
        }
        return this.a.b(auvVar);
    }

    @Override // flm.axj
    public final void a() {
        this.m = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    @Override // flm.axj
    public final apx b() {
        throw new UnsupportedOperationException();
    }

    @Override // flm.axj
    public final apx a(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.axj
    public final void c() {
        this.e = null;
        this.d = null;
        this.m = 0;
        this.a.c();
        this.b.c();
        g();
    }

    @Override // flm.axj
    public final boolean d() {
        boolean z = true;
        this.g.lock();
        try {
            if (!this.a.d() || (!this.b.d() && !h() && this.m != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.g.unlock();
        }
    }

    @Override // flm.axj
    public final void e() {
        this.a.e();
        this.b.e();
    }

    final void f() {
        if (b(this.d)) {
            if (b(this.e) || h()) {
                switch (this.m) {
                    case 2:
                        this.i.a(this.c);
                    case 1:
                        g();
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
                this.m = 0;
                return;
            }
            if (this.e != null) {
                if (this.m == 1) {
                    g();
                    return;
                } else {
                    a(this.e);
                    this.a.c();
                    return;
                }
            }
            return;
        }
        if (this.d != null && b(this.e)) {
            this.b.c();
            a(this.d);
        } else if (this.d != null && this.e != null) {
            apx apxVar = this.d;
            if (this.b.l < this.a.l) {
                apxVar = this.e;
            }
            a(apxVar);
        }
    }

    private final void a(apx apxVar) {
        switch (this.m) {
            case 2:
                this.i.a(apxVar);
            case 1:
                g();
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        this.m = 0;
    }

    private final void g() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((axz) it.next()).a();
        }
        this.k.clear();
    }

    final void a(int i, boolean z) {
        this.i.a(i, z);
        this.e = null;
        this.d = null;
    }

    private final boolean h() {
        return this.e != null && this.e.c == 4;
    }

    private final boolean c(auv auvVar) {
        asz clientKey = auvVar.getClientKey();
        bdi.checkArgument(this.j.containsKey(clientKey), "GoogleApiClient is not configured to use the API required for this call.");
        return ((awp) this.j.get(clientKey)).equals(this.b);
    }

    private final PendingIntent i() {
        if (this.l == null) {
            return null;
        }
        return PendingIntent.getActivity(this.h, System.identityHashCode(this.i), this.l.getSignInIntent(), 134217728);
    }

    private static boolean b(apx apxVar) {
        return apxVar != null && apxVar.b();
    }

    @Override // flm.axj
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.a.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
