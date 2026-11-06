package flm;

import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpw extends ThreadLocal {
    private final /* synthetic */ dpu a;

    dpw(dpu dpuVar) {
        this.a = dpuVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        String strConcat;
        long id = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            strConcat = "UI Thread";
        } else {
            String strValueOf = String.valueOf(Thread.currentThread().getName());
            strConcat = strValueOf.length() != 0 ? "Thread: ".concat(strValueOf) : new String("Thread: ");
        }
        dps dpsVarA = dps.a(strConcat, dp.R, id, dp.U);
        dpx dpxVar = new dpx(id, dpsVarA);
        dpxVar.a.push(dpsVarA);
        this.a.a.incrementAndGet();
        this.a.c.put(dpsVarA, dpxVar);
        return new WeakReference(dpxVar);
    }
}
