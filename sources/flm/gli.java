package flm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gli {
    private static final Logger b = Logger.getLogger(gli.class.getName());
    public static final glj a = a(glj.class.getClassLoader());

    private static glj a(ClassLoader classLoader) {
        try {
            return (glj) gkv.a(Class.forName("io.opencensus.impl.stats.StatsComponentImpl", true, classLoader), glj.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.stats.Stats", "loadStatsComponent", "Couldn't load full implementation for StatsComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (glj) gkv.a(Class.forName("io.opencensus.impllite.stats.StatsComponentImplLite", true, classLoader), glj.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.stats.Stats", "loadStatsComponent", "Couldn't load lite implementation for StatsComponent, now using default implementation for StatsComponent.", (Throwable) e2);
                return new glf();
            }
        }
    }

    private gli() {
    }
}
