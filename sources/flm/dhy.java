package flm;

import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhy implements dow {
    private final Map a = new HashMap();
    private final /* synthetic */ dhw b;

    dhy(dhw dhwVar) {
        this.b = dhwVar;
    }

    @Override // flm.dow
    public final void a(String str) {
        dhx dhxVar = (dhx) this.a.get(str);
        if (dhxVar == null) {
            dhxVar = new dhx();
            this.a.put(str, dhxVar);
        }
        dhxVar.a++;
    }

    @Override // flm.dow
    public final void b(String str) {
        dhx dhxVar = (dhx) this.a.get(str);
        if (dhxVar == null) {
            dhxVar = new dhx();
            this.a.put(str, dhxVar);
        }
        dhxVar.b++;
    }

    @Override // flm.dow
    public final void a(boolean z) {
        boolean z2;
        gso gsoVar = (gso) ((fio) gsn.b.a(dp.au, (Object) null));
        for (Map.Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            dhx dhxVar = (dhx) entry.getValue();
            if (dhxVar.b > 0 || dhxVar.a > 0) {
                gss gssVarA = ((gss) ((fio) gsr.g.a(dp.au, (Object) null))).a(str).a(dhxVar.b);
                int i = dhxVar.a;
                gssVarA.c();
                gsr gsrVar = (gsr) gssVarA.a;
                gsrVar.a |= 2;
                gsrVar.c = i;
                gsoVar.a(gssVarA);
                dhxVar.b = 0;
                dhxVar.a = 0;
            }
        }
        if (gsoVar.a() != 0) {
            gtr gtrVar = (gtr) ((fin) ((gts) ((fio) gtr.y.a(dp.au, (Object) null))).a(gsoVar).h());
            if (this.b.h_()) {
                this.b.a(gtrVar);
            }
        }
        if (z) {
            if (this.b.h && !this.b.b && (this.b.g || this.b.f)) {
                long j = this.b.i.get();
                z2 = j == 0 || j + 43200000 <= SystemClock.elapsedRealtime();
            } else {
                z2 = false;
            }
            if (z2 && this.b.j.compareAndSet(false, true)) {
                dkm.a(3, "MemoryLeakService", "Scheduling heap dump %d seconds after the next screen off.", 5);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                this.b.a.registerReceiver(new dhz(this.b), intentFilter);
            }
        }
    }

    @Override // flm.dow
    public final void a(List list) {
        gso gsoVar = (gso) ((fio) gsn.b.a(dp.au, (Object) null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dov dovVar = (dov) it.next();
            String str = dovVar.a;
            int iIndexOf = str.indexOf(10);
            gss gssVarA = ((gss) ((fio) gsr.g.a(dp.au, (Object) null))).a(iIndexOf < 0 ? str : str.substring(0, iIndexOf));
            gssVarA.c();
            gsr gsrVar = (gsr) gssVarA.a;
            if (str == null) {
                throw new NullPointerException();
            }
            gsrVar.a |= 8;
            gsrVar.e = str;
            int i = dovVar.b;
            gssVarA.c();
            gsr gsrVar2 = (gsr) gssVarA.a;
            gsrVar2.a |= 16;
            gsrVar2.f = i;
            gsoVar.a(gssVarA.a(1));
        }
        if (gsoVar.a() != 0) {
            gtr gtrVar = (gtr) ((fin) ((gts) ((fio) gtr.y.a(dp.au, (Object) null))).a(gsoVar).h());
            if (this.b.h_()) {
                this.b.a(gtrVar);
            }
        }
        if (!list.isEmpty()) {
            dkm.a(2, "MemoryLeakService", "Primes found %d leak(s): %s", Integer.valueOf(list.size()), list);
        }
    }
}
