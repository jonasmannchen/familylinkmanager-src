package flm;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awt implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object f = new Object();
    private static awt p;
    public final Context g;
    public final aqd h;
    public final bcc i;
    public final Handler o;
    public long c = bbx.DEFAULT_UNBIND_DELAY_MILLIS;
    public long d = 120000;
    public long e = 10000;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public avs m = null;
    public final Set n = new rv();
    private final Set q = new rv();

    public static awt a(Context context) {
        awt awtVar;
        synchronized (f) {
            if (p == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                p = new awt(context.getApplicationContext(), handlerThread.getLooper(), aqd.a);
            }
            awtVar = p;
        }
        return awtVar;
    }

    public static awt a() {
        awt awtVar;
        synchronized (f) {
            bdi.checkNotNull(p, "Must guarantee manager is non-null before using getInstance");
            awtVar = p;
        }
        return awtVar;
    }

    private awt(Context context, Looper looper, aqd aqdVar) {
        this.g = context;
        this.o = new cqr(looper, this);
        this.h = aqdVar;
        this.i = new bcc(aqdVar);
        this.o.sendMessage(this.o.obtainMessage(6));
    }

    public final void a(atm atmVar) {
        this.o.sendMessage(this.o.obtainMessage(7, atmVar));
    }

    private final void b(atm atmVar) {
        aup aupVar = atmVar.b;
        awv awvVar = (awv) this.l.get(aupVar);
        if (awvVar == null) {
            awvVar = new awv(this, atmVar);
            this.l.put(aupVar, awvVar);
        }
        if (awvVar.i()) {
            this.q.add(aupVar);
        }
        awvVar.h();
    }

    public final void a(avs avsVar) {
        synchronized (f) {
            if (this.m != avsVar) {
                this.m = avsVar;
                this.n.clear();
            }
            this.n.addAll(avsVar.a);
        }
    }

    public final void b() {
        this.o.sendMessage(this.o.obtainMessage(3));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v48 flm.awv, still in use, count: 2, list:
          (r1v48 flm.awv) from 0x0146: IGET (r1v48 flm.awv) A[WRAPPED] (LINE:124) flm.awv.e int
          (r1v48 flm.awv) from 0x014a: PHI (r1 I:??) = (r1v39 flm.awv), (r1v48 flm.awv) binds: [B:129:0x03ab, B:147:0x014a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r10) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.awt.handleMessage(android.os.Message):boolean");
    }

    final boolean a(apx apxVar, int i) {
        PendingIntent pendingIntentA;
        aqd aqdVar = this.h;
        Context context = this.g;
        if (apxVar.a()) {
            pendingIntentA = apxVar.d;
        } else {
            pendingIntentA = aqdVar.a(context, apxVar.c, 0);
        }
        if (pendingIntentA == null) {
            return false;
        }
        aqdVar.a(context, apxVar.c, (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentA, i, true), 134217728));
        return true;
    }

    public final void b(apx apxVar, int i) {
        if (!a(apxVar, i)) {
            this.o.sendMessage(this.o.obtainMessage(5, i, 0, apxVar));
        }
    }
}
