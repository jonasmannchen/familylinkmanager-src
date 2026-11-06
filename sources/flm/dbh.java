package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dbh {
    public abstract dbh a(Executor executor, dbc dbcVar);

    public abstract dbh a(Executor executor, dbf dbfVar);

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract Object d();

    public abstract Exception e();

    public dbh a(daz dazVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public dbh a(Executor executor, daz dazVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public dbh a(Executor executor, daw dawVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public dbh a(dap dapVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public dbh a(Executor executor, dap dapVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public dbh b(Executor executor, dap dapVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
}
