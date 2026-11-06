package flm;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class efz extends ehg implements egv {
    public static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger b = Logger.getLogger(efz.class.getName());
    public static final ega c;
    public static final Object d;
    public volatile ege listeners;
    public volatile Object value;
    public volatile egm waiters;

    private final void a(egm egmVar) {
        egmVar.thread = null;
        while (true) {
            egm egmVar2 = this.waiters;
            if (egmVar2 == egm.a) {
                return;
            }
            egm egmVar3 = null;
            while (egmVar2 != null) {
                egm egmVar4 = egmVar2.next;
                if (egmVar2.thread == null) {
                    if (egmVar3 != null) {
                        egmVar3.next = egmVar4;
                        if (egmVar3.thread == null) {
                        }
                        egmVar2 = egmVar3;
                    } else {
                        if (!c.a(this, egmVar2, egmVar4)) {
                        }
                        egmVar2 = egmVar3;
                    }
                }
                egmVar3 = egmVar2;
                egmVar2 = egmVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) & (!(obj instanceof egg))) {
            return b(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            egm egmVar = this.waiters;
            if (egmVar != egm.a) {
                egm egmVar2 = new egm((byte) 0);
                while (true) {
                    egmVar2.a(egmVar);
                    if (c.a(this, egmVar, egmVar2)) {
                        long jNanoTime2 = nanos;
                        do {
                            LockSupport.parkNanos(this, jNanoTime2);
                            if (Thread.interrupted()) {
                                a(egmVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof egg))) {
                                return b(obj2);
                            }
                            jNanoTime2 = jNanoTime - System.nanoTime();
                        } while (jNanoTime2 >= 1000);
                        a(egmVar2);
                        nanos = jNanoTime2;
                        break;
                    }
                    egmVar = this.waiters;
                    if (egmVar == egm.a) {
                    }
                }
            }
            return b(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof egg))) {
                return b(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        String string2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28).append("Waited ").append(j).append(" ").append(lowerCase2).toString();
        if (1000 + nanos < 0) {
            String strConcat = String.valueOf(string2).concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                String string3 = new StringBuilder(String.valueOf(strValueOf).length() + 21 + String.valueOf(lowerCase).length()).append(strValueOf).append(jConvert).append(" ").append(lowerCase).toString();
                if (z) {
                    string3 = String.valueOf(string3).concat(bdp.WHITELIST_DELIMITER);
                }
                strConcat = String.valueOf(string3).concat(" ");
            }
            if (z) {
                String strValueOf2 = String.valueOf(strConcat);
                strConcat = new StringBuilder(String.valueOf(strValueOf2).length() + 33).append(strValueOf2).append(nanos2).append(" nanoseconds ").toString();
            }
            string2 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string2).concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(new StringBuilder(String.valueOf(string2).length() + 5 + String.valueOf(string).length()).append(string2).append(" for ").append(string).toString());
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof egg))) {
            return b(obj2);
        }
        egm egmVar = this.waiters;
        if (egmVar != egm.a) {
            egm egmVar2 = new egm((byte) 0);
            do {
                egmVar2.a(egmVar);
                if (c.a(this, egmVar, egmVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            a(egmVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof egg))));
                    return b(obj);
                }
                egmVar = this.waiters;
            } while (egmVar != egm.a);
        }
        return b(this.value);
    }

    private static Object b(Object obj) throws ExecutionException {
        if (obj instanceof egb) {
            Throwable th = ((egb) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof egc) {
            throw new ExecutionException(((egc) obj).b);
        }
        if (obj == d) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (obj instanceof egg ? false : true);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof egb;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        egb egbVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof egg)) {
            return false;
        }
        if (a) {
            egbVar = new egb(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            egbVar = egb.a;
        } else {
            egbVar = egb.b;
        }
        Object obj2 = obj;
        boolean z2 = false;
        while (true) {
            if (c.a(this, obj2, egbVar)) {
                a(this);
                if (!(obj2 instanceof egg)) {
                    return true;
                }
                egv egvVar = ((egg) obj2).b;
                if (egvVar instanceof egi) {
                    efz efzVar = (efz) egvVar;
                    Object obj3 = efzVar.value;
                    if (!(obj3 == null) && !(obj3 instanceof egg)) {
                        return true;
                    }
                    this = efzVar;
                    obj2 = obj3;
                    z2 = true;
                } else {
                    egvVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = this.value;
                if (!(obj2 instanceof egg)) {
                    return z2;
                }
            }
        }
    }

    @Override // flm.egv
    public void a(Runnable runnable, Executor executor) {
        ege egeVar;
        dvl.a(runnable, "Runnable was null.");
        dvl.a(executor, "Executor was null.");
        if (!isDone() && (egeVar = this.listeners) != ege.a) {
            ege egeVar2 = new ege(runnable, executor);
            do {
                egeVar2.next = egeVar;
                if (!c.a(this, egeVar, egeVar2)) {
                    egeVar = this.listeners;
                } else {
                    return;
                }
            } while (egeVar != ege.a);
        }
        b(runnable, executor);
    }

    public boolean a(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!c.a(this, (Object) null, obj)) {
            return false;
        }
        a(this);
        return true;
    }

    public boolean a(Throwable th) {
        if (!c.a(this, (Object) null, new egc((Throwable) dvl.a(th)))) {
            return false;
        }
        a(this);
        return true;
    }

    protected boolean a(egv egvVar) {
        egc egcVar;
        dvl.a(egvVar);
        Object obj = this.value;
        if (obj == null) {
            if (egvVar.isDone()) {
                if (!c.a(this, (Object) null, b(egvVar))) {
                    return false;
                }
                a(this);
                return true;
            }
            egg eggVar = new egg(this, egvVar);
            if (c.a(this, (Object) null, eggVar)) {
                try {
                    egvVar.a(eggVar, egn.INSTANCE);
                } catch (Throwable th) {
                    try {
                        egcVar = new egc(th);
                    } catch (Throwable th2) {
                        egcVar = egc.a;
                    }
                    c.a(this, eggVar, egcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof egb) {
            egvVar.cancel(((egb) obj).c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Object b(egv egvVar) {
        Throwable thB;
        egb egbVar;
        if (egvVar instanceof egi) {
            Object obj = ((efz) egvVar).value;
            if (obj instanceof egb) {
                egb egbVar2 = (egb) obj;
                if (egbVar2.c) {
                    if (egbVar2.d != null) {
                        egbVar = new egb(false, egbVar2.d);
                    } else {
                        egbVar = egb.b;
                    }
                    return egbVar;
                }
                return obj;
            }
            return obj;
        }
        if ((egvVar instanceof ehg) && (thB = ((ehg) egvVar).b()) != null) {
            return new egc(thB);
        }
        boolean zIsCancelled = egvVar.isCancelled();
        if ((!a) & zIsCancelled) {
            return egb.b;
        }
        try {
            Object objA = a((Future) egvVar);
            if (zIsCancelled) {
                String strValueOf = String.valueOf(egvVar);
                objA = new egb(false, new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 84).append("get() did not throw CancellationException, despite reporting isCancelled() == true: ").append(strValueOf).toString()));
            } else if (objA == null) {
                objA = d;
            }
            return objA;
        } catch (CancellationException e) {
            if (!zIsCancelled) {
                String strValueOf2 = String.valueOf(egvVar);
                return new egc(new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf2).length() + 77).append("get() threw CancellationException, despite reporting isCancelled() == false: ").append(strValueOf2).toString(), e));
            }
            return new egb(false, e);
        } catch (ExecutionException e2) {
            if (zIsCancelled) {
                String strValueOf3 = String.valueOf(egvVar);
                return new egb(false, new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf3).length() + 84).append("get() did not throw CancellationException, despite reporting isCancelled() == true: ").append(strValueOf3).toString(), e2));
            }
            return new egc(e2.getCause());
        } catch (Throwable th) {
            return new egc(th);
        }
    }

    private static Object a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static void a(efz efzVar) {
        ege egeVar;
        ege egeVar2 = null;
        while (true) {
            egm egmVar = efzVar.waiters;
            if (c.a(efzVar, egmVar, egm.a)) {
                while (egmVar != null) {
                    Thread thread = egmVar.thread;
                    if (thread != null) {
                        egmVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    egmVar = egmVar.next;
                }
                efzVar.a();
                do {
                    egeVar = efzVar.listeners;
                } while (!c.a(efzVar, egeVar, ege.a));
                ege egeVar3 = egeVar2;
                ege egeVar4 = egeVar;
                ege egeVar5 = egeVar3;
                while (egeVar4 != null) {
                    ege egeVar6 = egeVar4.next;
                    egeVar4.next = egeVar5;
                    egeVar5 = egeVar4;
                    egeVar4 = egeVar6;
                }
                ege egeVar7 = egeVar5;
                while (egeVar7 != null) {
                    egeVar7 = egeVar7.next;
                    Runnable runnable = egeVar7.b;
                    if (runnable instanceof egg) {
                        egg eggVar = (egg) runnable;
                        efzVar = eggVar.a;
                        if (efzVar.value == eggVar) {
                            if (c.a(efzVar, eggVar, b(eggVar.b))) {
                                egeVar2 = egeVar7;
                            }
                        }
                    } else {
                        b(runnable, egeVar7.c);
                    }
                }
                return;
            }
        }
    }

    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ehg
    public final Throwable b() {
        if (this instanceof egi) {
            Object obj = this.value;
            if (obj instanceof egc) {
                return ((egc) obj).b;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sbAppend = new StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled()) {
            sbAppend.append("CANCELLED");
        } else if (isDone()) {
            a(sbAppend);
        } else {
            try {
                Object obj = this.value;
                if (obj instanceof egg) {
                    String strC = c(((egg) obj).b);
                    string = new StringBuilder(String.valueOf(strC).length() + 12).append("setFuture=[").append(strC).append("]").toString();
                } else if (this instanceof ScheduledFuture) {
                    string = new StringBuilder(41).append("remaining delay=[").append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS)).append(" ms]").toString();
                } else {
                    string = null;
                }
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(e.getClass());
                string = new StringBuilder(String.valueOf(strValueOf).length() + 38).append("Exception thrown from implementation: ").append(strValueOf).toString();
            }
            if (string != null && !string.isEmpty()) {
                sbAppend.append("PENDING, info=[").append(string).append("]");
            } else if (isDone()) {
                a(sbAppend);
            } else {
                sbAppend.append("PENDING");
            }
        }
        return sbAppend.append("]").toString();
    }

    private final void a(StringBuilder sb) {
        try {
            sb.append("SUCCESS, result=[").append(c(a((Future) this))).append("]");
        } catch (CancellationException e) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[").append(e2.getClass()).append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[").append(e3.getCause()).append("]");
        }
    }

    private final String c(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = b;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length()).append("RuntimeException while executing runnable ").append(strValueOf).append(" with executor ").append(strValueOf2).toString(), (Throwable) e);
        }
    }

    static {
        Throwable th;
        ega eghVar;
        Throwable th2 = null;
        try {
            eghVar = new egk();
            th = null;
        } catch (Throwable th3) {
            try {
                eghVar = new egf(AtomicReferenceFieldUpdater.newUpdater(egm.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(egm.class, egm.class, "next"), AtomicReferenceFieldUpdater.newUpdater(efz.class, egm.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(efz.class, ege.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(efz.class, Object.class, "value"));
                th = th3;
            } catch (Throwable th4) {
                th2 = th4;
                th = th3;
                eghVar = new egh();
            }
        }
        c = eghVar;
        if (th2 != null) {
            b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        d = new Object();
    }
}
