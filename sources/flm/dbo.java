package flm;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbo extends dbh {
    private final Object a = new Object();
    private final dbj b = new dbj();
    private boolean c;
    private volatile boolean d;
    private Object e;
    private Exception f;

    @Override // flm.dbh
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // flm.dbh
    public final boolean c() {
        return this.d;
    }

    @Override // flm.dbh
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    @Override // flm.dbh
    public final Object d() {
        Object obj;
        synchronized (this.a) {
            bdi.checkState(this.c, "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (this.f != null) {
                throw new dbg(this.f);
            }
            obj = this.e;
        }
        return obj;
    }

    @Override // flm.dbh
    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // flm.dbh
    public final dbh a(Executor executor, dbf dbfVar) {
        this.b.a(new dbd(executor, dbfVar));
        h();
        return this;
    }

    @Override // flm.dbh
    public final dbh a(Executor executor, dbc dbcVar) {
        this.b.a(new dba(executor, dbcVar));
        h();
        return this;
    }

    @Override // flm.dbh
    public final dbh a(daz dazVar) {
        return a(dbl.a, dazVar);
    }

    @Override // flm.dbh
    public final dbh a(Executor executor, daz dazVar) {
        this.b.a(new dax(executor, dazVar));
        h();
        return this;
    }

    @Override // flm.dbh
    public final dbh a(dap dapVar) {
        return a(dbl.a, dapVar);
    }

    @Override // flm.dbh
    public final dbh a(Executor executor, dap dapVar) {
        dbo dboVar = new dbo();
        this.b.a(new daq(executor, dapVar, dboVar));
        h();
        return dboVar;
    }

    @Override // flm.dbh
    public final dbh a(Executor executor, daw dawVar) {
        this.b.a(new dau(executor, dawVar));
        h();
        return this;
    }

    @Override // flm.dbh
    public final dbh b(Executor executor, dap dapVar) {
        dbo dboVar = new dbo();
        this.b.a(new das(executor, dapVar, dboVar));
        h();
        return dboVar;
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            g();
            this.c = true;
            this.e = obj;
        }
        this.b.a(this);
    }

    public final boolean b(Object obj) {
        boolean z = true;
        synchronized (this.a) {
            if (this.c) {
                z = false;
            } else {
                this.c = true;
                this.e = obj;
                this.b.a(this);
            }
        }
        return z;
    }

    public final void a(Exception exc) {
        bdi.checkNotNull(exc, "Exception must not be null");
        synchronized (this.a) {
            g();
            this.c = true;
            this.f = exc;
        }
        this.b.a(this);
    }

    public final boolean b(Exception exc) {
        boolean z = true;
        bdi.checkNotNull(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                z = false;
            } else {
                this.c = true;
                this.f = exc;
                this.b.a(this);
            }
        }
        return z;
    }

    public final boolean f() {
        boolean z = true;
        synchronized (this.a) {
            if (this.c) {
                z = false;
            } else {
                this.c = true;
                this.d = true;
                this.b.a(this);
            }
        }
        return z;
    }

    private final void g() {
        bdi.checkState(!this.c, "Task is already complete");
    }

    private final void h() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }
}
