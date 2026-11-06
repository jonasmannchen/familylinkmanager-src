package flm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class geb extends WeakReference {
    private static final boolean a = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException b;
    private final ReferenceQueue c;
    private final ConcurrentMap d;
    private final ftt e;
    private final Reference f;
    private volatile boolean g;
    private volatile boolean h;

    geb(gea geaVar, ftt fttVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(geaVar, referenceQueue);
        this.f = new SoftReference(a ? new RuntimeException("ManagedChannel allocation site") : b);
        this.e = fttVar;
        this.c = referenceQueue;
        this.d = concurrentMap;
        this.d.put(this, this);
        a(referenceQueue);
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        a();
        a(this.c);
    }

    private final void a() {
        super.clear();
        this.d.remove(this);
        this.f.clear();
    }

    private static int a(ReferenceQueue referenceQueue) {
        int i = 0;
        while (true) {
            geb gebVar = (geb) referenceQueue.poll();
            if (gebVar != null) {
                RuntimeException runtimeException = (RuntimeException) gebVar.f.get();
                gebVar.a();
                boolean z = gebVar.g;
                i++;
                boolean z2 = gebVar.h;
                Level level = Level.SEVERE;
                if (gea.a.isLoggable(level)) {
                    boolean z3 = gebVar.g;
                    String property = System.getProperty("line.separator");
                    LogRecord logRecord = new LogRecord(level, new StringBuilder(String.valueOf("shutdown").length() + 140 + String.valueOf(property).length()).append("*~*~*~ Channel {0} was not ").append("shutdown").append(" properly!!! ~*~*~*").append(property).append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.").toString());
                    logRecord.setLoggerName(gea.a.getName());
                    logRecord.setParameters(new Object[]{gebVar.e.toString()});
                    logRecord.setThrown(runtimeException);
                    gea.a.log(logRecord);
                }
            } else {
                return i;
            }
        }
    }

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        b = runtimeException;
    }
}
