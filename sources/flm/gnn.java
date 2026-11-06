package flm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnn {
    private static final Logger b = Logger.getLogger(gnn.class.getName());
    public static final gnf a = a(gnf.class.getClassLoader());

    private static gnf a(ClassLoader classLoader) {
        try {
            return (gnf) gkv.a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), gnf.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.trace.Tracing", "loadTraceComponent", "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (gnf) gkv.a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), gnf.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.trace.Tracing", "loadTraceComponent", "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", (Throwable) e2);
                return new gng();
            }
        }
    }

    private gnn() {
    }
}
