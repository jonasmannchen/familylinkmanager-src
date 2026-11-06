package flm;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avy implements awo {
    public final awp a;
    public final Lock b;
    public final Context c;
    public final aqf d;
    public czp e;
    public boolean f;
    public boolean g;
    public bcd h;
    public boolean i;
    public boolean j;
    public final bba k;
    private apx l;
    private int m;
    private int o;
    private boolean r;
    private final Map s;
    private final asx t;
    private int n = 0;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private ArrayList u = new ArrayList();

    public avy(awp awpVar, bba bbaVar, Map map, aqf aqfVar, asx asxVar, Lock lock, Context context) {
        this.a = awpVar;
        this.k = bbaVar;
        this.s = map;
        this.d = aqfVar;
        this.t = asxVar;
        this.b = lock;
        this.c = context;
    }

    @Override // flm.awo
    public final void a() {
        this.a.g.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.g = false;
        this.i = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (asw aswVar : this.s.keySet()) {
            ate ateVar = (ate) this.a.f.get(aswVar.c());
            boolean z2 = (aswVar.a().getPriority() == 1) | z;
            boolean zBooleanValue = ((Boolean) this.s.get(aswVar)).booleanValue();
            if (ateVar.requiresSignIn()) {
                this.f = true;
                if (zBooleanValue) {
                    this.q.add(aswVar.c());
                } else {
                    this.r = false;
                }
            }
            map.put(ateVar, new awa(this, aswVar, zBooleanValue));
            z = z2;
        }
        if (z) {
            this.f = false;
        }
        if (this.f) {
            this.k.setClientSessionId(Integer.valueOf(System.identityHashCode(this.a.m)));
            awh awhVar = new awh(this);
            this.e = (czp) this.t.buildClient(this.c, this.a.m.a(), this.k, this.k.getSignInOptions(), awhVar, awhVar);
        }
        this.o = this.a.f.size();
        this.u.add(aws.a.submit(new awb(this, map)));
    }

    final boolean d() {
        this.o--;
        if (this.o > 0) {
            return false;
        }
        if (this.o < 0) {
            Log.w("GoogleApiClientConnecting", this.a.m.i());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new apx(8, null));
            return false;
        }
        if (this.l != null) {
            this.a.l = this.m;
            b(this.l);
            return false;
        }
        return true;
    }

    final void e() {
        if (this.o == 0) {
            if (!this.f || this.g) {
                ArrayList arrayList = new ArrayList();
                this.n = 1;
                this.o = this.a.f.size();
                for (asz aszVar : this.a.f.keySet()) {
                    if (this.a.g.containsKey(aszVar)) {
                        if (d()) {
                            g();
                        }
                    } else {
                        arrayList.add((ate) this.a.f.get(aszVar));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(aws.a.submit(new awe(this, arrayList)));
                }
            }
        }
    }

    @Override // flm.awo
    public final void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    @Override // flm.awo
    public final void a(apx apxVar, asw aswVar, boolean z) {
        if (b(1)) {
            b(apxVar, aswVar, z);
            if (d()) {
                g();
            }
        }
    }

    private final void g() {
        awp awpVar = this.a;
        awpVar.a.lock();
        try {
            awpVar.m.g();
            awpVar.k = new avv(awpVar);
            awpVar.k.a();
            awpVar.b.signalAll();
            awpVar.a.unlock();
            aws.a.execute(new avz(this));
            if (this.e != null) {
                if (this.i) {
                    this.e.a(this.h, this.j);
                }
                a(false);
            }
            Iterator it = this.a.g.keySet().iterator();
            while (it.hasNext()) {
                ((ate) this.a.f.get((asz) it.next())).disconnect();
            }
            this.a.n.a(this.p.isEmpty() ? null : this.p);
        } catch (Throwable th) {
            awpVar.a.unlock();
            throw th;
        }
    }

    @Override // flm.awo
    public final auv a(auv auvVar) {
        this.a.m.c.add(auvVar);
        return auvVar;
    }

    @Override // flm.awo
    public final auv b(auv auvVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // flm.awo
    public final void c() {
    }

    @Override // flm.awo
    public final boolean b() {
        h();
        a(true);
        this.a.a((apx) null);
        return true;
    }

    @Override // flm.awo
    public final void a(int i) {
        b(new apx(8, null));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    final void b(apx apxVar, asw aswVar, boolean z) {
        boolean z2 = false;
        int priority = aswVar.a().getPriority();
        if (z) {
            boolean z3 = apxVar.a() || this.d.b(apxVar.c) != null;
            if (z3) {
                if (this.l != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
            }
        } else if (this.l != null || priority < this.m) {
            z2 = true;
        }
        if (z2) {
            this.l = apxVar;
            this.m = priority;
        }
        this.a.g.put(aswVar.c(), apxVar);
    }

    final void f() {
        this.f = false;
        this.a.m.e = Collections.emptySet();
        for (asz aszVar : this.q) {
            if (!this.a.g.containsKey(aszVar)) {
                this.a.g.put(aszVar, new apx(17, null));
            }
        }
    }

    final boolean a(apx apxVar) {
        return this.r && !apxVar.a();
    }

    final void b(apx apxVar) {
        h();
        a(!apxVar.a());
        this.a.a(apxVar);
        this.a.n.a(apxVar);
    }

    private final void a(boolean z) {
        if (this.e != null) {
            if (this.e.isConnected() && z) {
                this.e.a();
            }
            this.e.disconnect();
            if (this.k.isSignInClientDisconnectFixEnabled()) {
                this.e = null;
            }
            this.h = null;
        }
    }

    private final void h() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.u.clear();
    }

    final boolean b(int i) {
        if (this.n == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.a.m.i());
        String strValueOf = String.valueOf(this);
        Log.w("GoogleApiClientConnecting", new StringBuilder(String.valueOf(strValueOf).length() + 23).append("Unexpected callback in ").append(strValueOf).toString());
        Log.w("GoogleApiClientConnecting", new StringBuilder(33).append("mRemainingConnections=").append(this.o).toString());
        String strC = c(this.n);
        String strC2 = c(i);
        Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(strC).length() + 70 + String.valueOf(strC2).length()).append("GoogleApiClient connecting is in step ").append(strC).append(" but received callback for step ").append(strC2).toString(), new Exception());
        b(new apx(8, null));
        return false;
    }

    private static String c(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }
}
