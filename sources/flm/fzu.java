package flm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class fzu implements fyz {
    private volatile boolean a;
    public fyz b;
    private fza c;
    private fvc d;
    private List e = new ArrayList();
    private gai f;

    fzu() {
    }

    @Override // flm.fyz
    public final void b(int i) {
        if (this.a) {
            this.b.b(i);
        } else {
            a(new fzv(this, i));
        }
    }

    @Override // flm.fyz
    public final void a(int i) {
        if (this.a) {
            this.b.a(i);
        } else {
            a(new gaa(this, i));
        }
    }

    @Override // flm.fyz
    public final void a(fsl fslVar) {
        a(new gab(this, fslVar));
    }

    final void a(fyz fyzVar) {
        synchronized (this) {
            if (this.b == null) {
                this.b = (fyz) dvl.a(fyzVar, "stream");
                a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050 A[Catch: all -> 0x0069, TRY_ENTER, TryCatch #1 {, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002d, B:26:0x0050, B:27:0x0054), top: B:38:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[LOOP:3: B:29:0x0059->B:31:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r2.hasNext() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        ((java.lang.Runnable) r2.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r4)
            java.util.List r1 = r4.e     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L2f
            r0 = 0
            r4.e = r0     // Catch: java.lang.Throwable -> L48
            r0 = 1
            r4.a = r0     // Catch: java.lang.Throwable -> L48
            flm.gai r2 = r4.f     // Catch: java.lang.Throwable -> L48
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L2e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r1 = r2.c     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L50
            r0 = 0
            r2.c = r0     // Catch: java.lang.Throwable -> L69
            r0 = 1
            r2.b = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
        L2e:
            return
        L2f:
            java.util.List r1 = r4.e     // Catch: java.lang.Throwable -> L48
            r4.e = r0     // Catch: java.lang.Throwable -> L48
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r2 = r1.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r2.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L38
        L48:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            throw r0
        L4b:
            r1.clear()
            r0 = r1
            goto L5
        L50:
            java.util.List r1 = r2.c     // Catch: java.lang.Throwable -> L69
            r2.c = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r3 = r1.iterator()
        L59:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r3.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L59
        L69:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            throw r0
        L6c:
            r1.clear()
            r0 = r1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.fzu.a():void");
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // flm.fyz
    public final void a(String str) {
        dvl.b(this.c == null, "May only be called before start");
        dvl.a(str, "authority");
        a(new gac(this, str));
    }

    @Override // flm.fyz
    public final void a(fza fzaVar) {
        fvc fvcVar;
        boolean z;
        dvl.b(this.c == null, "already started");
        synchronized (this) {
            this.c = (fza) dvl.a(fzaVar, "listener");
            fvcVar = this.d;
            z = this.a;
            if (!z) {
                gai gaiVar = new gai(fzaVar);
                this.f = gaiVar;
                fzaVar = gaiVar;
            }
        }
        if (fvcVar != null) {
            fzaVar.b(fvcVar, new ftv());
        } else if (z) {
            this.b.a(fzaVar);
        } else {
            a(new gad(this, fzaVar));
        }
    }

    @Override // flm.ghe
    public final void a(InputStream inputStream) {
        dvl.a(inputStream, "message");
        if (this.a) {
            this.b.a(inputStream);
        } else {
            a(new gae(this, inputStream));
        }
    }

    @Override // flm.ghe
    public final void f() {
        if (this.a) {
            this.b.f();
        } else {
            a(new gaf(this));
        }
    }

    @Override // flm.fyz
    public void b(fvc fvcVar) {
        dvl.a(fvcVar, "reason");
        boolean z = true;
        fza fzaVar = null;
        synchronized (this) {
            if (this.b == null) {
                this.b = geo.a;
                z = false;
                fzaVar = this.c;
                this.d = fvcVar;
            }
        }
        if (z) {
            a(new gag(this, fvcVar));
            return;
        }
        if (fzaVar != null) {
            fzaVar.b(fvcVar, new ftv());
        }
        a();
    }

    @Override // flm.fyz
    public final void e() {
        a(new gah(this));
    }

    @Override // flm.ghe
    public final void c(int i) {
        if (this.a) {
            this.b.c(i);
        } else {
            a(new fzw(this, i));
        }
    }

    @Override // flm.ghe
    public final void a(fry fryVar) {
        dvl.a(fryVar, "compressor");
        a(new fzx(this, fryVar));
    }

    @Override // flm.fyz
    public final void a(boolean z) {
        a(new fzy(this, z));
    }

    @Override // flm.fyz
    public final void a(fsp fspVar) {
        dvl.a(fspVar, "decompressorRegistry");
        a(new fzz(this, fspVar));
    }
}
