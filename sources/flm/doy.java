package flm;

import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doy extends Thread {
    public final ReferenceQueue a;
    public File b;
    public final dou c;
    public final doz d;
    public final dou e;
    private final dow f;
    private final Deque g = new ArrayDeque(20);
    private final Deque h = new ArrayDeque(3);
    private final boolean i;

    doy(ReferenceQueue referenceQueue, doz dozVar, dow dowVar, boolean z) {
        setName("Primes-Watcher");
        this.a = referenceQueue;
        this.f = dowVar;
        this.d = dozVar;
        this.i = z;
        this.c = new dou("Sentinel", "Sentinel", referenceQueue);
        this.e = new dou("Sentinel", "Sentinel", referenceQueue);
        for (int i = 0; i < 20; i++) {
            this.g.add(new Object());
        }
        for (int i2 = 0; i2 < 3; i2++) {
            this.h.add(new dou("Sentinel", "Sentinel", referenceQueue));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(bbx.DEFAULT_UNBIND_DELAY_MILLIS);
                a();
                b();
            } catch (InterruptedException e) {
                interrupt();
                if (this.b != null) {
                    interrupted();
                    c();
                }
            }
        }
        synchronized (this.c) {
            this.c.c = null;
        }
        this.g.clear();
        this.h.clear();
    }

    private final void a() throws InterruptedException {
        boolean z;
        Object objPoll = this.g.poll();
        this.g.offer(new Object());
        dou douVarA = this.d.a(objPoll, "", this.a);
        boolean z2 = false;
        while (!z2) {
            Reference referenceRemove = null;
            while (referenceRemove == null) {
                try {
                    referenceRemove = this.a.remove();
                } catch (InterruptedException e) {
                    if (this.b != null) {
                        c();
                    } else {
                        throw e;
                    }
                }
            }
            Reference referencePoll = referenceRemove;
            boolean z3 = z2;
            while (referencePoll != null) {
                if (referencePoll == douVarA) {
                    dse.b(!z3, "Only one dummy released at a time.");
                    z = true;
                } else {
                    this.f.a(a((dou) referencePoll));
                    z = z3;
                }
                z3 = z;
                referencePoll = this.a.poll();
            }
            if (!z3) {
                this.f.a(false);
            }
            z2 = z3;
        }
    }

    private final void b() {
        int i = 0;
        dou douVar = (dou) this.h.poll();
        boolean z = douVar.c != null;
        dou douVar2 = this.e.c;
        while (douVar2 != null) {
            douVar2 = douVar2.c;
            i++;
        }
        while (douVar.c != null) {
            dou douVarA = douVar.c.a();
            this.f.b(douVarA.a);
            if (i < 500) {
                douVarA.a(this.e);
                i++;
            }
        }
        this.h.offer(douVar);
        synchronized (this.c) {
            if (this.c.c != null) {
                douVar.c = this.c.c;
                douVar.c.b = douVar;
                this.c.c = null;
            }
        }
        this.f.a(z);
    }

    private final String a(dou douVar) {
        if (douVar.b == this.c) {
            synchronized (this.c) {
                douVar.a();
            }
        } else {
            douVar.a();
        }
        return douVar.a;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00cc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.doy.c():void");
    }
}
