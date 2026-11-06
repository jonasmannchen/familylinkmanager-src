package flm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzn implements gec {
    public final fyl b;
    public Runnable c;
    public Runnable d;
    public ged e;
    public fvc g;
    private final Executor i;
    private Runnable j;
    private fts k;
    private long l;
    private final ftg h = ftg.a(getClass().getName());
    public final Object a = new Object();
    public Collection f = new LinkedHashSet();

    fzn(Executor executor, fyl fylVar) {
        this.i = executor;
        this.b = fylVar;
    }

    @Override // flm.gec
    public final Runnable a(ged gedVar) {
        this.e = gedVar;
        this.j = new fzo(gedVar);
        this.c = new fzp(gedVar);
        this.d = new fzq(gedVar);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        r8.b.a();
     */
    @Override // flm.fzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final flm.fyz a(flm.fuf r9, flm.ftv r10, flm.frj r11) {
        /*
            r8 = this;
            flm.ger r3 = new flm.ger     // Catch: java.lang.Throwable -> L53
            r3.<init>(r9, r10, r11)     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L53
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L53
            flm.fvc r0 = r8.g     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L42
            flm.fts r0 = r8.k     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L1b
            flm.fzt r0 = r8.a(r3)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
            flm.fyl r1 = r8.b
            r1.a()
        L1a:
            return r0
        L1b:
            flm.fts r2 = r8.k     // Catch: java.lang.Throwable -> L50
            long r0 = r8.l     // Catch: java.lang.Throwable -> L50
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
        L20:
            flm.ftp r2 = r2.a()     // Catch: java.lang.Throwable -> L53
            boolean r4 = r11.h     // Catch: java.lang.Throwable -> L53
            flm.fzb r2 = flm.gbh.a(r2, r4)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L5a
            flm.fuf r0 = r3.c()     // Catch: java.lang.Throwable -> L53
            flm.ftv r1 = r3.b()     // Catch: java.lang.Throwable -> L53
            flm.frj r3 = r3.a()     // Catch: java.lang.Throwable -> L53
            flm.fyz r0 = r2.a(r0, r1, r3)     // Catch: java.lang.Throwable -> L53
            flm.fyl r1 = r8.b
            r1.a()
            goto L1a
        L42:
            flm.gay r0 = new flm.gay     // Catch: java.lang.Throwable -> L50
            flm.fvc r1 = r8.g     // Catch: java.lang.Throwable -> L50
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
            flm.fyl r1 = r8.b
            r1.a()
            goto L1a
        L50:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L53
        L53:
            r0 = move-exception
            flm.fyl r1 = r8.b
            r1.a()
            throw r0
        L5a:
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L53
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L53
            flm.fvc r2 = r8.g     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L6f
            flm.gay r0 = new flm.gay     // Catch: java.lang.Throwable -> L86
            flm.fvc r1 = r8.g     // Catch: java.lang.Throwable -> L86
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L86
            flm.fyl r1 = r8.b
            r1.a()
            goto L1a
        L6f:
            long r6 = r8.l     // Catch: java.lang.Throwable -> L86
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L80
            flm.fzt r0 = r8.a(r3)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L86
            flm.fyl r1 = r8.b
            r1.a()
            goto L1a
        L80:
            flm.fts r2 = r8.k     // Catch: java.lang.Throwable -> L86
            long r0 = r8.l     // Catch: java.lang.Throwable -> L86
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L86
            goto L20
        L86:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L53
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.fzn.a(flm.fuf, flm.ftv, flm.frj):flm.fyz");
    }

    private final fzt a(ftq ftqVar) {
        fzt fztVar = new fzt(this, ftqVar);
        this.f.add(fztVar);
        if (c() == 1) {
            this.b.a(this.j);
        }
        return fztVar;
    }

    @Override // flm.fzb
    public final void a(fzc fzcVar, Executor executor) {
        throw new UnsupportedOperationException("This method is not expected to be called");
    }

    @Override // flm.gec
    public final void a(fvc fvcVar) {
        synchronized (this.a) {
            if (this.g == null) {
                this.g = fvcVar;
                this.b.a(new fzr(this, fvcVar));
                if (!a() && this.d != null) {
                    this.b.a(this.d);
                    this.d = null;
                }
                this.b.a();
            }
        }
    }

    @Override // flm.gec
    public final void b(fvc fvcVar) {
        Collection collection;
        Runnable runnable;
        a(fvcVar);
        synchronized (this.a) {
            collection = this.f;
            runnable = this.d;
            this.d = null;
            if (!this.f.isEmpty()) {
                this.f = Collections.emptyList();
            }
        }
        if (runnable != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((fzt) it.next()).b(fvcVar);
            }
            this.b.a(runnable).a();
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = !this.f.isEmpty();
        }
        return z;
    }

    private final int c() {
        int size;
        synchronized (this.a) {
            size = this.f.size();
        }
        return size;
    }

    final void a(fts ftsVar) {
        synchronized (this.a) {
            this.k = ftsVar;
            this.l++;
            if (ftsVar != null && a()) {
                ArrayList arrayList = new ArrayList(this.f);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    fzt fztVar = (fzt) arrayList3.get(i);
                    ftp ftpVarA = ftsVar.a();
                    frj frjVarA = fztVar.a.a();
                    fzb fzbVarA = gbh.a(ftpVarA, frjVarA.h);
                    if (fzbVarA != null) {
                        Executor executor = this.i;
                        if (frjVarA.c != null) {
                            executor = frjVarA.c;
                        }
                        executor.execute(new fzs(fztVar, fzbVarA));
                        arrayList2.add(fztVar);
                    }
                    i = i2;
                }
                synchronized (this.a) {
                    if (a()) {
                        this.f.removeAll(arrayList2);
                        if (this.f.isEmpty()) {
                            this.f = new LinkedHashSet();
                        }
                        if (!a()) {
                            this.b.a(this.c);
                            if (this.g != null && this.d != null) {
                                this.b.a(this.d);
                                this.d = null;
                            }
                        }
                        this.b.a();
                    }
                }
            }
        }
    }

    @Override // flm.ftk
    public final ftg b() {
        return this.h;
    }
}
