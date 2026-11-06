package flm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class gfi implements fyz {
    public final fuf c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final ggj f;
    public ggi g;
    public final gfz i;
    public final long j;
    public final long k;
    public final ggh l;
    public boolean n;
    public long o;
    public fza p;
    public Future q;
    public long r;
    private final ftv u;
    private static final fuc t = fuc.a("grpc-previous-rpc-attempts", ftv.a);
    public static final fuc a = fuc.a("grpc-retry-pushback-ms", ftv.a);
    public static final fvc b = fvc.c.a("Stream thrown away because RetriableStream committed");
    public static Random s = new Random();
    public final Object h = new Object();
    public volatile ggb m = new ggb(new ArrayList(8), Collections.emptyList(), null, false, false);

    gfi(fuf fufVar, ftv ftvVar, gfz gfzVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, ggj ggjVar, gbu gbuVar, ggh gghVar) {
        this.c = fufVar;
        this.i = gfzVar;
        this.j = j;
        this.k = j2;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.u = ftvVar;
        this.f = (ggj) dvl.a(ggjVar, "retryPolicyProvider");
        dvl.a(gbuVar, "hedgingPolicyProvider");
        this.l = gghVar;
    }

    abstract fvc a();

    abstract fyz a(fru fruVar, ftv ftvVar);

    abstract void b();

    final Runnable a(ggg gggVar) {
        Collection collectionEmptyList;
        gfl gflVar = null;
        boolean z = true;
        synchronized (this.h) {
            if (this.m.d == null) {
                Collection collection = this.m.c;
                ggb ggbVar = this.m;
                dvl.b(ggbVar.d == null, "Already committed");
                List list = ggbVar.b;
                if (ggbVar.c.contains(gggVar)) {
                    collectionEmptyList = Collections.singleton(gggVar);
                    list = null;
                } else {
                    collectionEmptyList = Collections.emptyList();
                    z = false;
                }
                this.m = new ggb(list, collectionEmptyList, gggVar, ggbVar.e, z);
                this.i.a(-this.o);
                gflVar = new gfl(this, collection, gggVar);
            }
        }
        return gflVar;
    }

    final ggg d(int i) {
        ggg gggVar = new ggg(i);
        gfj gfjVar = new gfj(new gfy(this, gggVar));
        ftv ftvVar = this.u;
        ftv ftvVar2 = new ftv();
        ftvVar2.a(ftvVar);
        if (i > 0) {
            ftvVar2.a(t, String.valueOf(i));
        }
        gggVar.a = a(gfjVar, ftvVar2);
        return gggVar;
    }

    final void b(ggg gggVar) {
        Collection collectionUnmodifiableCollection;
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            synchronized (this.h) {
                ggb ggbVar = this.m;
                if (ggbVar.d == null || ggbVar.d == gggVar) {
                    if (i == ggbVar.b.size()) {
                        dvl.b(!ggbVar.a, "Already passThrough");
                        if (gggVar.b) {
                            collectionUnmodifiableCollection = ggbVar.c;
                        } else if (ggbVar.c.isEmpty()) {
                            collectionUnmodifiableCollection = Collections.singletonList(gggVar);
                        } else {
                            ArrayList arrayList2 = new ArrayList(ggbVar.c);
                            arrayList2.add(gggVar);
                            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList2);
                        }
                        boolean z = ggbVar.d != null;
                        List list = ggbVar.b;
                        if (z) {
                            dvl.b(ggbVar.d == gggVar, "Another RPC attempt has already committed");
                            list = null;
                        }
                        this.m = new ggb(list, collectionUnmodifiableCollection, ggbVar.d, ggbVar.e, z);
                        return;
                    }
                    if (!gggVar.b) {
                        int iMin = Math.min(i + 128, ggbVar.b.size());
                        if (arrayList == null) {
                            arrayList = new ArrayList(ggbVar.b.subList(i, iMin));
                        } else {
                            arrayList.clear();
                            arrayList.addAll(ggbVar.b.subList(i, iMin));
                        }
                        ArrayList arrayList3 = arrayList;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            gfx gfxVar = (gfx) obj;
                            ggb ggbVar2 = this.m;
                            if (ggbVar2.d != null && ggbVar2.d != gggVar) {
                                break;
                            }
                            if (ggbVar2.e) {
                                dvl.b(ggbVar2.d == gggVar, "substream should be CANCELLED_BECAUSE_COMMITTED already");
                                return;
                            }
                            gfxVar.a(gggVar);
                        }
                        i = iMin;
                    } else {
                        return;
                    }
                } else {
                    gggVar.a.b(b);
                    return;
                }
            }
        }
    }

    @Override // flm.fyz
    public final void a(fza fzaVar) {
        this.p = fzaVar;
        fvc fvcVarA = a();
        if (fvcVarA != null) {
            b(fvcVarA);
            return;
        }
        synchronized (this.h) {
            this.m.b.add(new gfw(this));
        }
        b(d(0));
    }

    @Override // flm.fyz
    public final void b(fvc fvcVar) {
        ggg gggVar = new ggg(0);
        gggVar.a = new geo();
        Runnable runnableA = a(gggVar);
        if (runnableA != null) {
            Future future = this.q;
            if (future != null) {
                future.cancel(false);
                this.q = null;
            }
            this.p.b(fvcVar, new ftv());
            runnableA.run();
            return;
        }
        this.m.d.a.b(fvcVar);
        synchronized (this.h) {
            ggb ggbVar = this.m;
            this.m = new ggb(ggbVar.b, ggbVar.c, ggbVar.d, true, ggbVar.a);
        }
    }

    final void a(gfx gfxVar) {
        Collection collection;
        synchronized (this.h) {
            if (!this.m.a) {
                this.m.b.add(gfxVar);
            }
            collection = this.m.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gfxVar.a((ggg) it.next());
        }
    }

    @Override // flm.ghe
    public final void a(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // flm.ghe
    public final void c(int i) {
        ggb ggbVar = this.m;
        if (ggbVar.a) {
            ggbVar.d.a.c(i);
        } else {
            a(new gfu(i));
        }
    }

    @Override // flm.ghe
    public final void f() {
        ggb ggbVar = this.m;
        if (ggbVar.a) {
            ggbVar.d.a.f();
        } else {
            a(new gfp());
        }
    }

    @Override // flm.ghe
    public final void a(fry fryVar) {
        a(new gfm(fryVar));
    }

    @Override // flm.fyz
    public final void a(boolean z) {
        a(new gfq(z));
    }

    @Override // flm.fyz
    public final void e() {
        a(new gfr());
    }

    @Override // flm.fyz
    public final void a(String str) {
        a(new gfk(str));
    }

    @Override // flm.fyz
    public final void a(fsp fspVar) {
        a(new gfo(fspVar));
    }

    @Override // flm.fyz
    public final void b(int i) {
        a(new gfs(i));
    }

    @Override // flm.fyz
    public final void a(int i) {
        a(new gft(i));
    }

    @Override // flm.fyz
    public final void a(fsl fslVar) {
        a(new gfn(fslVar));
    }

    static boolean c() {
        return false;
    }
}
