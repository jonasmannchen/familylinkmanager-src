package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awk extends atp implements axk {
    public axj b = null;
    public final Queue c = new LinkedList();
    public final Map d;
    public Set e;
    public Set f;
    public final ayo g;
    private final Lock h;
    private boolean i;
    private final bbt j;
    private final int k;
    private final Context l;
    private final Looper m;
    private volatile boolean n;
    private long o;
    private long p;
    private final awm q;
    private final aqd r;
    private axf s;
    private final bba t;
    private final Map u;
    private final asx v;
    private final axt w;
    private final ArrayList x;
    private Integer y;
    private final bbu z;

    public awk(Context context, Lock lock, Looper looper, bba bbaVar, aqd aqdVar, asx asxVar, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList, boolean z) {
        this.o = bif.a() ? 10000L : 120000L;
        this.p = bbx.DEFAULT_UNBIND_DELAY_MILLIS;
        this.e = new HashSet();
        this.w = new axt();
        this.y = null;
        this.f = null;
        this.z = new awl(this);
        this.l = context;
        this.h = lock;
        this.i = z;
        this.j = new bbt(looper, this.z);
        this.m = looper;
        this.q = new awm(this, looper);
        this.r = aqdVar;
        this.k = i;
        if (this.k >= 0) {
            this.y = Integer.valueOf(i2);
        }
        this.u = map;
        this.d = map2;
        this.x = arrayList;
        this.g = new ayo(this.d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.j.registerConnectionCallbacks((atr) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.j.registerConnectionFailedListener((ats) it2.next());
        }
        this.t = bbaVar;
        this.v = asxVar;
    }

    @Override // flm.atp
    public final auv a(auv auvVar) {
        String str;
        bdi.checkArgument(auvVar.getClientKey() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean zContainsKey = this.d.containsKey(auvVar.getClientKey());
        if (auvVar.getApi() != null) {
            str = auvVar.getApi().a;
        } else {
            str = "the API";
        }
        bdi.checkArgument(zContainsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.h.lock();
        try {
            if (this.b == null) {
                this.c.add(auvVar);
            } else {
                auvVar = this.b.a(auvVar);
            }
            return auvVar;
        } finally {
            this.h.unlock();
        }
    }

    @Override // flm.atp
    public final auv b(auv auvVar) {
        String str;
        bdi.checkArgument(auvVar.getClientKey() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean zContainsKey = this.d.containsKey(auvVar.getClientKey());
        if (auvVar.getApi() != null) {
            str = auvVar.getApi().a;
        } else {
            str = "the API";
        }
        bdi.checkArgument(zContainsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.h.lock();
        try {
            if (this.b == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.n) {
                this.c.add(auvVar);
                while (!this.c.isEmpty()) {
                    auv auvVar2 = (auv) this.c.remove();
                    this.g.a(auvVar2);
                    auvVar2.setFailedResult(Status.c);
                }
                this.h.unlock();
            } else {
                auvVar = this.b.b(auvVar);
                this.h.unlock();
            }
            return auvVar;
        } catch (Throwable th) {
            this.h.unlock();
            throw th;
        }
    }

    @Override // flm.atp
    public final void b() {
        this.h.lock();
        try {
            if (this.k >= 0) {
                bdi.checkState(this.y != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.y == null) {
                this.y = Integer.valueOf(a((Iterable) this.d.values(), false));
            } else if (this.y.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.y.intValue());
            this.h.unlock();
        } catch (Throwable th) {
            this.h.unlock();
            throw th;
        }
    }

    @Override // flm.atp
    public final void a(int i) {
        boolean z = true;
        this.h.lock();
        if (i != 3 && i != 1 && i != 2) {
            z = false;
        }
        try {
            bdi.checkArgument(z, new StringBuilder(33).append("Illegal sign-in mode: ").append(i).toString());
            b(i);
            j();
        } finally {
            this.h.unlock();
        }
    }

    @Override // flm.atp
    public final apx c() {
        bdi.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.h.lock();
        try {
            if (this.k >= 0) {
                bdi.checkState(this.y != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.y == null) {
                this.y = Integer.valueOf(a((Iterable) this.d.values(), false));
            } else if (this.y.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.y.intValue());
            this.j.enableCallbacks();
            apx apxVarB = this.b.b();
            this.h.unlock();
            return apxVarB;
        } catch (Throwable th) {
            this.h.unlock();
            throw th;
        }
    }

    @Override // flm.atp
    public final apx a(long j, TimeUnit timeUnit) {
        bdi.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        bdi.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.h.lock();
        try {
            if (this.y == null) {
                this.y = Integer.valueOf(a((Iterable) this.d.values(), false));
            } else if (this.y.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.y.intValue());
            this.j.enableCallbacks();
            apx apxVarA = this.b.a(j, timeUnit);
            this.h.unlock();
            return apxVarA;
        } catch (Throwable th) {
            this.h.unlock();
            throw th;
        }
    }

    @Override // flm.atp
    public final void d() {
        this.h.lock();
        try {
            this.g.a();
            if (this.b != null) {
                this.b.c();
            }
            axt axtVar = this.w;
            Iterator it = axtVar.a.iterator();
            while (it.hasNext()) {
                ((axp) it.next()).a = null;
            }
            axtVar.a.clear();
            for (auv auvVar : this.c) {
                auvVar.setResultConsumedCallback(null);
                auvVar.cancel();
            }
            this.c.clear();
            if (this.b != null) {
                g();
                this.j.disableCallbacks();
            }
        } finally {
            this.h.unlock();
        }
    }

    private final void b(int i) {
        boolean z;
        if (this.y == null) {
            this.y = Integer.valueOf(i);
        } else if (this.y.intValue() != i) {
            String strC = c(i);
            String strC2 = c(this.y.intValue());
            throw new IllegalStateException(new StringBuilder(String.valueOf(strC).length() + 51 + String.valueOf(strC2).length()).append("Cannot use sign-in mode: ").append(strC).append(". Mode was already set to ").append(strC2).toString());
        }
        if (this.b == null) {
            boolean z2 = false;
            Iterator it = this.d.values().iterator();
            boolean z3 = false;
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                ate ateVar = (ate) it.next();
                if (ateVar.requiresSignIn()) {
                    z3 = true;
                }
                z2 = ateVar.providesSignIn() ? true : z;
            }
            switch (this.y.intValue()) {
                case 1:
                    if (!z3) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    if (z) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z3) {
                        if (this.i) {
                            this.b = new avm(this.l, this.h, this.m, this.r, this.d, this.t, this.u, this.v, this.x, this, true);
                            return;
                        }
                        Context context = this.l;
                        Lock lock = this.h;
                        Looper looper = this.m;
                        aqd aqdVar = this.r;
                        Map map = this.d;
                        bba bbaVar = this.t;
                        Map map2 = this.u;
                        asx asxVar = this.v;
                        ArrayList arrayList = this.x;
                        ate ateVar2 = null;
                        rt rtVar = new rt();
                        rt rtVar2 = new rt();
                        for (Map.Entry entry : map.entrySet()) {
                            ate ateVar3 = (ate) entry.getValue();
                            if (ateVar3.providesSignIn()) {
                                ateVar2 = ateVar3;
                            }
                            if (ateVar3.requiresSignIn()) {
                                rtVar.put((asz) entry.getKey(), ateVar3);
                            } else {
                                rtVar2.put((asz) entry.getKey(), ateVar3);
                            }
                        }
                        bdi.checkState(!rtVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        rt rtVar3 = new rt();
                        rt rtVar4 = new rt();
                        for (asw aswVar : map2.keySet()) {
                            asz aszVarC = aswVar.c();
                            if (rtVar.containsKey(aszVarC)) {
                                rtVar3.put(aswVar, (Boolean) map2.get(aswVar));
                            } else if (rtVar2.containsKey(aszVarC)) {
                                rtVar4.put(aswVar, (Boolean) map2.get(aswVar));
                            } else {
                                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = arrayList;
                        int size = arrayList4.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList4.get(i2);
                            i2++;
                            avg avgVar = (avg) obj;
                            if (rtVar3.containsKey(avgVar.a)) {
                                arrayList2.add(avgVar);
                            } else if (rtVar4.containsKey(avgVar.a)) {
                                arrayList3.add(avgVar);
                            } else {
                                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            }
                        }
                        this.b = new avi(context, this, lock, looper, aqdVar, rtVar, rtVar2, bbaVar, asxVar, ateVar2, arrayList2, arrayList3, rtVar3, rtVar4);
                        return;
                    }
                    break;
            }
            if (this.i && !z) {
                this.b = new avm(this.l, this.h, this.m, this.r, this.d, this.t, this.u, this.v, this.x, this, false);
            } else {
                this.b = new awp(this.l, this, this.h, this.m, this.r, this.d, this.t, this.u, this.v, this.x, this);
            }
        }
    }

    private final void j() {
        this.j.enableCallbacks();
        this.b.a();
    }

    final void e() {
        this.h.lock();
        try {
            if (this.n) {
                j();
            }
        } finally {
            this.h.unlock();
        }
    }

    final void f() {
        this.h.lock();
        try {
            if (g()) {
                j();
            }
        } finally {
            this.h.unlock();
        }
    }

    final boolean g() {
        if (!this.n) {
            return false;
        }
        this.n = false;
        this.q.removeMessages(2);
        this.q.removeMessages(1);
        if (this.s != null) {
            this.s.a();
            this.s = null;
        }
        return true;
    }

    @Override // flm.atp
    public final void a(ats atsVar) {
        this.j.registerConnectionFailedListener(atsVar);
    }

    @Override // flm.atp
    public final void b(ats atsVar) {
        this.j.unregisterConnectionFailedListener(atsVar);
    }

    @Override // flm.axk
    public final void a(Bundle bundle) {
        while (!this.c.isEmpty()) {
            b((auv) this.c.remove());
        }
        this.j.onConnectionSuccess(bundle);
    }

    @Override // flm.axk
    public final void a(apx apxVar) {
        if (!this.r.c(this.l, apxVar.c)) {
            g();
        }
        if (!this.n) {
            this.j.onConnectionFailure(apxVar);
            this.j.disableCallbacks();
        }
    }

    @Override // flm.axk
    public final void a(int i, boolean z) {
        if (i == 1 && !z && !this.n) {
            this.n = true;
            if (this.s == null && !bif.a()) {
                this.s = this.r.a(this.l.getApplicationContext(), new awn(this));
            }
            this.q.sendMessageDelayed(this.q.obtainMessage(1), this.o);
            this.q.sendMessageDelayed(this.q.obtainMessage(2), this.p);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.g.c.toArray(ayo.b)) {
            basePendingResult.forceFailureUnlessReady(ayo.a);
        }
        this.j.onUnintentionalDisconnection(i);
        this.j.disableCallbacks();
        if (i == 2) {
            j();
        }
    }

    @Override // flm.atp
    public final Looper a() {
        return this.m;
    }

    @Override // flm.atp
    public final void a(ayl aylVar) {
        this.h.lock();
        try {
            if (this.f == null) {
                this.f = new HashSet();
            }
            this.f.add(aylVar);
        } finally {
            this.h.unlock();
        }
    }

    @Override // flm.atp
    public final void b(ayl aylVar) {
        this.h.lock();
        try {
            if (this.f == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f.remove(aylVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!h()) {
                this.b.e();
            }
        } finally {
            this.h.unlock();
        }
    }

    final boolean h() {
        boolean z = false;
        this.h.lock();
        try {
            if (this.f != null) {
                z = this.f.isEmpty() ? false : true;
            }
            return z;
        } finally {
            this.h.unlock();
        }
    }

    final String i() {
        StringWriter stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // flm.atp
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.l);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.n);
        printWriter.append(" mWorkQueue.size()=").print(this.c.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.g.c.size());
        if (this.b != null) {
            this.b.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static int a(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            ate ateVar = (ate) it.next();
            if (ateVar.requiresSignIn()) {
                z3 = true;
            }
            z2 = ateVar.providesSignIn() ? true : z2;
        }
        if (z3) {
            return (z2 && z) ? 2 : 1;
        }
        return 3;
    }

    private static String c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }
}
