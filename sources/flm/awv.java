package flm;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awv implements atr, ats, avh {
    public final ate b;
    public final int e;
    public final aya f;
    public boolean g;
    public final /* synthetic */ awt i;
    private final asy j;
    private final aup k;
    private final avp l;
    public final Queue a = new LinkedList();
    public final Set c = new HashSet();
    public final Map d = new HashMap();
    public final List h = new ArrayList();
    private apx m = null;

    public awv(awt awtVar, atm atmVar) {
        this.i = awtVar;
        this.b = atmVar.a(awtVar.o.getLooper(), this);
        if (this.b instanceof bdr) {
            this.j = ((bdr) this.b).getClient();
        } else {
            this.j = this.b;
        }
        this.k = atmVar.b;
        this.l = new avp();
        this.e = atmVar.d;
        if (this.b.requiresSignIn()) {
            this.f = atmVar.a(awtVar.g, awtVar.o);
        } else {
            this.f = null;
        }
    }

    @Override // flm.atr
    public final void a(Bundle bundle) {
        if (Looper.myLooper() == this.i.o.getLooper()) {
            a();
        } else {
            this.i.o.post(new aww(this));
        }
    }

    final void a() {
        e();
        c(apx.a);
        g();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            axw axwVar = (axw) it.next();
            axv axvVar = axwVar.a;
            if (a((aqb[]) null) != null) {
                it.remove();
            } else {
                try {
                    axwVar.a.a(this.j, new dbk());
                } catch (DeadObjectException e) {
                    a(1);
                    this.b.disconnect();
                } catch (RemoteException e2) {
                    it.remove();
                }
            }
        }
        c();
        j();
    }

    @Override // flm.atr
    public final void a(int i) {
        if (Looper.myLooper() == this.i.o.getLooper()) {
            b();
        } else {
            this.i.o.post(new awx(this));
        }
    }

    final void b() {
        e();
        this.g = true;
        this.l.a(true, ayo.a);
        this.i.o.sendMessageDelayed(Message.obtain(this.i.o, 9, this.k), this.i.c);
        this.i.o.sendMessageDelayed(Message.obtain(this.i.o, 11, this.k), this.i.d);
        this.i.i.flush();
    }

    private final boolean b(apx apxVar) {
        boolean z;
        synchronized (awt.f) {
            if (this.i.m == null || !this.i.n.contains(this.k)) {
                z = false;
            } else {
                this.i.m.b(apxVar, this.e);
                z = true;
            }
        }
        return z;
    }

    @Override // flm.avh
    public final void a(apx apxVar, asw aswVar, boolean z) {
        if (Looper.myLooper() == this.i.o.getLooper()) {
            a(apxVar);
        } else {
            this.i.o.post(new awy(this, apxVar));
        }
    }

    @Override // flm.ats
    public final void a(apx apxVar) {
        bdi.checkHandlerThread(this.i.o);
        if (this.f != null) {
            aya ayaVar = this.f;
            if (ayaVar.f != null) {
                ayaVar.f.disconnect();
            }
        }
        e();
        this.i.i.flush();
        c(apxVar);
        if (apxVar.c == 4) {
            a(awt.b);
            return;
        }
        if (this.a.isEmpty()) {
            this.m = apxVar;
            return;
        }
        if (!b(apxVar) && !this.i.a(apxVar, this.e)) {
            if (apxVar.c == 18) {
                this.g = true;
            }
            if (this.g) {
                this.i.o.sendMessageDelayed(Message.obtain(this.i.o, 9, this.k), this.i.c);
            } else {
                String strA = this.k.a();
                a(new Status(17, new StringBuilder(String.valueOf(strA).length() + 38).append("API: ").append(strA).append(" is not available on this device.").toString()));
            }
        }
    }

    final void c() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            auh auhVar = (auh) obj;
            if (this.b.isConnected()) {
                if (b(auhVar)) {
                    this.a.remove(auhVar);
                }
            } else {
                return;
            }
        }
    }

    public final void a(auh auhVar) {
        bdi.checkHandlerThread(this.i.o);
        if (this.b.isConnected()) {
            if (b(auhVar)) {
                j();
                return;
            } else {
                this.a.add(auhVar);
                return;
            }
        }
        this.a.add(auhVar);
        if (this.m != null && this.m.a()) {
            a(this.m);
        } else {
            h();
        }
    }

    public final void d() {
        bdi.checkHandlerThread(this.i.o);
        a(awt.a);
        this.l.a(false, awt.a);
        for (axr axrVar : (axr[]) this.d.keySet().toArray(new axr[this.d.size()])) {
            a(new aun(axrVar, new dbk()));
        }
        c(new apx(4));
        if (this.b.isConnected()) {
            this.b.onUserSignOut(new awz(this));
        }
    }

    public final void e() {
        bdi.checkHandlerThread(this.i.o);
        this.m = null;
    }

    public final apx f() {
        bdi.checkHandlerThread(this.i.o);
        return this.m;
    }

    private final boolean b(auh auhVar) {
        if (!(auhVar instanceof aui)) {
            c(auhVar);
            return true;
        }
        aui auiVar = (aui) auhVar;
        aqb aqbVarA = a(auiVar.b(this));
        if (aqbVarA == null) {
            c(auhVar);
            return true;
        }
        if (!bav.IS_PACKAGE_SIDE && auiVar.c(this)) {
            axb axbVar = new axb(this.k, aqbVarA);
            int iIndexOf = this.h.indexOf(axbVar);
            if (iIndexOf >= 0) {
                axb axbVar2 = (axb) this.h.get(iIndexOf);
                this.i.o.removeMessages(15, axbVar2);
                this.i.o.sendMessageDelayed(Message.obtain(this.i.o, 15, axbVar2), this.i.c);
            } else {
                this.h.add(axbVar);
                this.i.o.sendMessageDelayed(Message.obtain(this.i.o, 15, axbVar), this.i.c);
                this.i.o.sendMessageDelayed(Message.obtain(this.i.o, 16, axbVar), this.i.d);
                apx apxVar = new apx(2, null);
                if (!b(apxVar)) {
                    this.i.a(apxVar, this.e);
                }
            }
        } else {
            auiVar.a(new aug(aqbVarA));
        }
        return false;
    }

    private final void c(auh auhVar) {
        auhVar.a(this.l, i());
        try {
            auhVar.a(this);
        } catch (DeadObjectException e) {
            a(1);
            this.b.disconnect();
        }
    }

    public final void a(Status status) {
        bdi.checkHandlerThread(this.i.o);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((auh) it.next()).a(status);
        }
        this.a.clear();
    }

    final void g() {
        if (this.g) {
            this.i.o.removeMessages(11, this.k);
            this.i.o.removeMessages(9, this.k);
            this.g = false;
        }
    }

    private final void j() {
        this.i.o.removeMessages(12, this.k);
        this.i.o.sendMessageDelayed(this.i.o.obtainMessage(12, this.k), this.i.e);
    }

    final boolean a(boolean z) {
        bdi.checkHandlerThread(this.i.o);
        if (!this.b.isConnected() || this.d.size() != 0) {
            return false;
        }
        avp avpVar = this.l;
        if ((avpVar.a.isEmpty() && avpVar.b.isEmpty()) ? false : true) {
            if (!z) {
                return false;
            }
            j();
            return false;
        }
        this.b.disconnect();
        return true;
    }

    public final void h() {
        bdi.checkHandlerThread(this.i.o);
        if (!this.b.isConnected() && !this.b.isConnecting()) {
            int clientAvailability = this.i.i.getClientAvailability(this.i.g, this.b);
            if (clientAvailability != 0) {
                a(new apx(clientAvailability, null));
                return;
            }
            axc axcVar = new axc(this.i, this.b, this.k);
            if (this.b.requiresSignIn()) {
                aya ayaVar = this.f;
                if (ayaVar.f != null) {
                    ayaVar.f.disconnect();
                }
                ayaVar.e.setClientSessionId(Integer.valueOf(System.identityHashCode(ayaVar)));
                ayaVar.f = (czp) ayaVar.c.buildClient(ayaVar.a, ayaVar.b.getLooper(), ayaVar.e, ayaVar.e.getSignInOptions(), ayaVar, ayaVar);
                ayaVar.g = axcVar;
                if (ayaVar.d == null || ayaVar.d.isEmpty()) {
                    ayaVar.b.post(new ayb(ayaVar));
                } else {
                    ayaVar.f.b();
                }
            }
            this.b.connect(axcVar);
        }
    }

    private final void c(apx apxVar) {
        for (aus ausVar : this.c) {
            String endpointPackageName = null;
            if (bcx.equal(apxVar, apx.a)) {
                endpointPackageName = this.b.getEndpointPackageName();
            }
            ausVar.a(this.k, apxVar, endpointPackageName);
        }
        this.c.clear();
    }

    public final boolean i() {
        return this.b.requiresSignIn();
    }

    private final aqb a(aqb[] aqbVarArr) {
        if (aqbVarArr == null || aqbVarArr.length == 0) {
            return null;
        }
        aqb[] availableFeatures = this.b.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new aqb[0];
        }
        rt rtVar = new rt(availableFeatures.length);
        for (aqb aqbVar : availableFeatures) {
            rtVar.put(aqbVar.a, Long.valueOf(aqbVar.a()));
        }
        for (aqb aqbVar2 : aqbVarArr) {
            if (!rtVar.containsKey(aqbVar2.a) || ((Long) rtVar.get(aqbVar2.a)).longValue() < aqbVar2.a()) {
                return aqbVar2;
            }
        }
        return null;
    }
}
