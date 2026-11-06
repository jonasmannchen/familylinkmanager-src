package flm;

import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class edn extends ecg {
    private static volatile boolean a = false;
    private final Logger b;

    edn(Logger logger) {
        this.b = logger;
    }

    @Override // flm.ecg
    public final String a() {
        return this.b.getName();
    }

    @Override // flm.ecg
    public final boolean a(Level level) {
        return this.b.isLoggable(level);
    }

    final void a(LogRecord logRecord, boolean z) {
        if (!z || this.b.isLoggable(logRecord.getLevel())) {
            this.b.log(logRecord);
            return;
        }
        Filter filter = this.b.getFilter();
        if (filter != null) {
            filter.isLoggable(logRecord);
        }
        if (this.b.getClass() == Logger.class || a) {
            a(this.b, logRecord);
            return;
        }
        Logger logger = Logger.getLogger(String.valueOf(this.b.getName()).concat(".__forced__"));
        try {
            logger.setLevel(Level.ALL);
            logger.log(logRecord);
        } catch (SecurityException e) {
            a = true;
            Logger.getLogger("").logp(Level.SEVERE, "com.google.common.flogger.backend.system.AbstractBackend", "forceLoggingViaChildLogger", "Forcing log statements with Flogger has been partially disabled.\nThe Flogger library cannot modify logger log levels, which is necessary to force log statements. This is likely due to an installed SecurityManager.\nForced log statements will still be published directly to log handlers, but will not be visible to the 'log(LogRecord)' method of Logger sub-classes.\n");
            a(this.b, logRecord);
        }
    }

    private static void a(Logger logger, LogRecord logRecord) {
        do {
            for (Handler handler : logger.getHandlers()) {
                handler.publish(logRecord);
            }
            if (logger.getUseParentHandlers()) {
                logger = logger.getParent();
            } else {
                return;
            }
        } while (logger != null);
    }
}
