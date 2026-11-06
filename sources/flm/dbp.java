package flm;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbp {
    public static Object a(dbh dbhVar, long j, TimeUnit timeUnit) throws TimeoutException {
        bdi.checkNotMainThread();
        bdi.checkNotNull(dbhVar, "Task must not be null");
        bdi.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (dbhVar.a()) {
            return a(dbhVar);
        }
        dbq dbqVar = new dbq();
        a(dbhVar, dbqVar);
        if (dbqVar.a.await(j, timeUnit)) {
            return a(dbhVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Object a(dbh dbhVar) throws ExecutionException {
        if (dbhVar.b()) {
            return dbhVar.d();
        }
        if (dbhVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(dbhVar.e());
    }

    public static void a(dbh dbhVar, dbr dbrVar) {
        dbhVar.a(dbl.b, (dbf) dbrVar);
        dbhVar.a(dbl.b, (dbc) dbrVar);
        dbhVar.a(dbl.b, (daw) dbrVar);
    }
}
