package flm;

import android.annotation.TargetApi;
import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Debug;
import android.os.PersistableBundle;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(23)
final class dig extends dfm {
    private static final long k = TimeUnit.DAYS.toMillis(1);
    private static volatile dig l;
    public final dge c;
    public final dmb d;
    public final dpm e;
    public final SharedPreferences f;
    public volatile ScheduledFuture g;
    public final dgb h;
    public final dgb i;
    public final dgc j;
    private final dmb m;
    private final double n;
    private final dnx o;
    private final ReentrantLock p;
    private final AtomicLong q;

    private dig(dpz dpzVar, Application application, dge dgeVar, double d, dpm dpmVar, dnx dnxVar, dmb dmbVar, dmb dmbVar2, SharedPreferences sharedPreferences) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.K);
        this.p = new ReentrantLock();
        this.q = new AtomicLong();
        this.h = new dih(this);
        this.i = new dij(this);
        this.j = new dil(this);
        this.c = dgeVar;
        this.n = d;
        this.e = (dpm) dse.a(dpmVar);
        this.o = (dnx) dse.a(dnxVar);
        this.m = (dmb) dse.a(dmbVar);
        this.d = (dmb) dse.a(dmbVar2);
        this.f = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:7:0x001b, B:9:0x0021, B:14:0x0033, B:16:0x003d, B:17:0x0040, B:19:0x0044, B:21:0x004e, B:22:0x0052, B:24:0x007b, B:26:0x0082, B:28:0x0086, B:29:0x0089, B:30:0x00af, B:40:0x00c6, B:34:0x00b6), top: B:47:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:7:0x001b, B:9:0x0021, B:14:0x0033, B:16:0x003d, B:17:0x0040, B:19:0x0044, B:21:0x004e, B:22:0x0052, B:24:0x007b, B:26:0x0082, B:28:0x0086, B:29:0x0089, B:30:0x00af, B:40:0x00c6, B:34:0x00b6), top: B:47:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    static synchronized dig a(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, SharedPreferences sharedPreferences, double d) {
        boolean z;
        String str;
        int iHashCode;
        dqs dqsVar;
        dqs dqsVar2;
        JobScheduler jobScheduler = (JobScheduler) application.getSystemService("jobscheduler");
        if (Build.VERSION.SDK_INT < 24) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getId() == 184188964) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = jobScheduler.getPendingJob(184188964) != null;
        }
        if (!z) {
            try {
                File fileA = dpn.a(application);
                if (fileA.exists()) {
                    fileA.delete();
                }
            } catch (SecurityException e) {
                dkm.c("SerializedMhdFile", "Error deleting file", e, new Object[0]);
            }
            if (l == null) {
                str = ((die) dmbVar.a()).a;
                if (str != null) {
                    iHashCode = str.hashCode();
                } else {
                    iHashCode = 0;
                }
                dge dgeVarA = dge.a(application);
                dpo dpoVar = new dpo(sharedPreferences);
                dqsVar = (dqs) dpoVar.a("primes.miniheapdump.memorySamples", (fko) dqs.d.a(dp.aw, (Object) null));
                if (dqsVar == null && (dqsVar.a & 1) == 1 && dqsVar.c != iHashCode) {
                    dqsVar2 = dqs.d;
                } else {
                    dqsVar2 = dqsVar;
                }
                l = new dig(dpzVar, application, dgeVarA, 0.95d, new dpm(dpoVar, dqsVar2, 1.2d, iHashCode, new Random()), new dnx(), dmbVar, dmbVar2, sharedPreferences);
            }
        } else {
            if (l == null) {
                str = ((die) dmbVar.a()).a;
                if (str != null) {
                    iHashCode = str.hashCode();
                } else {
                    iHashCode = 0;
                }
                dge dgeVarA2 = dge.a(application);
                dpo dpoVar2 = new dpo(sharedPreferences);
                dqsVar = (dqs) dpoVar2.a("primes.miniheapdump.memorySamples", (fko) dqs.d.a(dp.aw, (Object) null));
                if (dqsVar == null) {
                    dqsVar2 = dqsVar;
                } else {
                    dqsVar2 = dqsVar;
                }
                l = new dig(dpzVar, application, dgeVarA2, 0.95d, new dpm(dpoVar2, dqsVar2, 1.2d, iHashCode, new Random()), new dnx(), dmbVar, dmbVar2, sharedPreferences);
            }
        }
        throw th;
        return l;
    }

    final void e() {
        if (this.g != null) {
            this.g.cancel(true);
            this.g = null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void a(int i) {
        boolean z;
        List listEmptyList;
        this.e.a(i);
        if (this.b || dkj.b(this.a).exists() || dpn.a(this.a).exists()) {
            z = false;
        } else {
            long j = this.q.get();
            z = j == 0 || j + k <= SystemClock.elapsedRealtime();
        }
        if (z) {
            dpm dpmVar = this.e;
            if (dpmVar.a() && dpmVar.b(i) >= this.n) {
                gqr gqrVar = (gqr) ((fio) gqq.d.a(dp.au, (Object) null));
                gqs gqsVar = gqs.BACKGROUND_MEMORY_SAMPLE_THRESHOLD;
                gqrVar.c();
                gqq gqqVar = (gqq) gqrVar.a;
                if (gqsVar == null) {
                    throw new NullPointerException();
                }
                gqqVar.a |= 1;
                gqqVar.b = gqsVar.b;
                gqrVar.c();
                gqq gqqVar2 = (gqq) gqrVar.a;
                gqqVar2.a |= 2;
                gqqVar2.c = i;
                gqq gqqVar3 = (gqq) ((fin) gqrVar.h());
                Collection collection = this.e.a;
                gte gteVar = (gte) ((fio) gtd.e.a(dp.au, (Object) null));
                gteVar.c();
                gtd gtdVar = (gtd) gteVar.a;
                if (!gtdVar.d.a()) {
                    gtdVar.d = fin.a(gtdVar.d);
                }
                List list = gtdVar.d;
                fiv.a(collection);
                if (collection instanceof fjo) {
                    List listD = ((fjo) collection).d();
                    fjo fjoVar = (fjo) list;
                    int size = list.size();
                    for (Object obj : listD) {
                        if (obj == null) {
                            String string = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size).append(" is null.").toString();
                            for (int size2 = fjoVar.size() - 1; size2 >= size; size2--) {
                                fjoVar.remove(size2);
                            }
                            throw new NullPointerException(string);
                        }
                        if (obj instanceof fgy) {
                            fjoVar.a((fgy) obj);
                        } else {
                            fjoVar.add((String) obj);
                        }
                    }
                } else if (collection instanceof fkp) {
                    list.addAll(collection);
                } else {
                    if ((list instanceof ArrayList) && (collection instanceof Collection)) {
                        ((ArrayList) list).ensureCapacity(collection.size() + list.size());
                    }
                    int size3 = list.size();
                    for (Object obj2 : collection) {
                        if (obj2 == null) {
                            String string2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                            for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                                list.remove(size4);
                            }
                            throw new NullPointerException(string2);
                        }
                        list.add(obj2);
                    }
                }
                gtd gtdVar2 = (gtd) ((fin) gteVar.h());
                if (this.p.tryLock()) {
                    this.q.set(SystemClock.elapsedRealtime());
                    try {
                        Debug.dumpHprofData(dkj.b(this.a).getAbsolutePath());
                        dkm.a(3, "MiniHeapDumpMetric", "Hprof data dumped", new Object[0]);
                        File fileB = dkj.b(this.a);
                        File fileA = dpn.a(this.a);
                        dhj dhjVar = new dhj(this.o, (die) this.m.a());
                        if (!fileB.exists()) {
                            listEmptyList = Collections.emptyList();
                        } else {
                            ArrayList arrayList = new ArrayList(2);
                            gtd gtdVarA = dhjVar.a(new dhk(dhjVar, fileB), gqqVar3, fileA);
                            arrayList.add(gtdVarA);
                            gtf gtfVarA = gtf.a(gtdVarA.b);
                            if (gtfVarA == null) {
                                gtfVarA = gtf.UNKNOWN;
                            }
                            if (gtfVarA == gtf.SERIALIZED_HEAP_DUMP_TOO_LARGE) {
                                arrayList.add(dhjVar.a(new dhl(dhjVar, fileB), gqqVar3, fileA));
                            }
                            listEmptyList = arrayList;
                        }
                        a(gtdVar2, listEmptyList);
                        if (!fileA.exists()) {
                            dkm.a(3, "MiniHeapDumpMetric", "Failed to serialize to file.", new Object[0]);
                        } else {
                            dkm.a(3, "MiniHeapDumpMetric", "Scheduling heap dump upload", new Object[0]);
                            Application application = this.a;
                            String absolutePath = fileA.getAbsolutePath();
                            if (dmp.a(application, "com.google.android.libraries.performance.primes.backgroundjobs.logger.LoggerJob")) {
                                PersistableBundle persistableBundle = new PersistableBundle();
                                persistableBundle.putString("file_name", absolutePath);
                                persistableBundle.putString("log_source", "PRIMES_INTERNAL_ANDROID_PRIMES");
                                ((JobScheduler) application.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(184188964, new ComponentName(application, "com.google.android.libraries.performance.primes.backgroundjobs.logger.LoggerJob")).setRequiredNetworkType(2).setRequiresCharging(true).setRequiresDeviceIdle(true).setExtras(persistableBundle).build());
                            }
                        }
                    } catch (IOException e) {
                        dkm.a("MiniHeapDumpMetric", "Failed to dump hprof data", e, new Object[0]);
                    } finally {
                        dkj.c(this.a);
                        this.p.unlock();
                    }
                }
            }
        }
    }

    @Override // flm.dfm
    final void d() {
        e();
        this.c.b(this.h);
        this.c.b(this.j);
        dkj.c(this.a);
    }

    private final void a(gtd gtdVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gtd gtdVar2 = (gtd) it.next();
            try {
                fio fioVar = (fio) gtdVar.a(dp.au, (Object) null);
                fioVar.a((fin) gtdVar);
                gtd gtdVar3 = (gtd) ((fin) ((gte) ((gte) fioVar).a(gtdVar2.b(), fib.b())).h());
                gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
                gti gtiVar = (gti) ((fio) gth.e.a(dp.au, (Object) null));
                gtk gtkVar = (gtk) ((fio) gtj.e.a(dp.au, (Object) null));
                gtkVar.c();
                gtj gtjVar = (gtj) gtkVar.a;
                if (gtdVar3 == null) {
                    throw new NullPointerException();
                }
                gtjVar.c = gtdVar3;
                gtjVar.a |= 2;
                gtsVar.a(gtiVar.a((gtj) ((fin) gtkVar.h())));
                a((gtr) ((fin) gtsVar.h()));
            } catch (fjg e) {
                dkm.a("MiniHeapDumpMetric", "Failed to merge protos: ", e, new Object[0]);
            }
        }
    }

    final void a(gtb gtbVar) {
        gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
        gti gtiVar = (gti) ((fio) gth.e.a(dp.au, (Object) null));
        gtk gtkVar = (gtk) ((fio) gtj.e.a(dp.au, (Object) null));
        gtkVar.c();
        gtj gtjVar = (gtj) gtkVar.a;
        if (gtbVar == null) {
            throw new NullPointerException();
        }
        gtjVar.d = gtbVar;
        gtjVar.a |= 4;
        gtsVar.a(gtiVar.a((gtj) ((fin) gtkVar.h())));
        a((gtr) ((fin) gtsVar.h()));
    }
}
