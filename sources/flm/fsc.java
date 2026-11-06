package flm;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fsc {
    public static final Logger a = Logger.getLogger(fsc.class.getName());
    private static final fuq f = new fuq();
    private static final fsc g = new fsc(null, f);
    private static final AtomicReference h = new AtomicReference();
    public ArrayList b;
    public fse c = new fsi(this);
    public final fsd d;
    public final fuq e;
    private final int i;

    private static fsj g() {
        fsj fsjVar = (fsj) h.get();
        return fsjVar == null ? h() : fsjVar;
    }

    private static fsj h() {
        try {
            h.compareAndSet(null, (fsj) Class.forName("io.grpc.override.ContextStorageOverride").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException e) {
            if (h.compareAndSet(null, new fvj())) {
                a.logp(Level.FINE, "io.grpc.Context", "createStorage", "Storage override doesn't exist. Using default", (Throwable) e);
            }
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        return (fsj) h.get();
    }

    public static fsh a(String str) {
        return new fsh(str);
    }

    public static fsc a() {
        fsc fscVarA = g().a();
        if (fscVarA == null) {
            return g;
        }
        return fscVarA;
    }

    private fsc(fsc fscVar, fuq fuqVar) {
        fsd fsdVar = null;
        if (0 != 0) {
            if (fsdVar instanceof fsd) {
                fsdVar = (fsd) null;
            } else {
                fsdVar = fsdVar.d;
            }
        }
        this.d = fsdVar;
        this.e = fuqVar;
        this.i = 0;
        if (this.i == 1000) {
            a.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    boolean b() {
        return this.d != null;
    }

    public fsc c() {
        fsc fscVarA = g().a(this);
        if (fscVarA == null) {
            return g;
        }
        return fscVarA;
    }

    public void a(fsc fscVar) {
        a(fscVar, "toAttach");
        g().a(this, fscVar);
    }

    public boolean d() {
        if (this.d == null) {
            return false;
        }
        return this.d.d();
    }

    public Throwable e() {
        if (this.d == null) {
            return null;
        }
        return this.d.e();
    }

    public fsl f() {
        if (this.d == null) {
            return null;
        }
        return this.d.f();
    }

    public final void a(fse fseVar, Executor executor) {
        a(fseVar, "cancellationListener");
        a(executor, "executor");
        if (b()) {
            fsg fsgVar = new fsg(this, executor, fseVar);
            synchronized (this) {
                if (d()) {
                    fsgVar.a();
                } else if (this.b == null) {
                    this.b = new ArrayList();
                    this.b.add(fsgVar);
                    if (this.d != null) {
                        this.d.a(this.c, (Executor) fsf.INSTANCE);
                    }
                } else {
                    this.b.add(fsgVar);
                }
            }
        }
    }

    public final void a(fse fseVar) {
        if (b()) {
            synchronized (this) {
                if (this.b != null) {
                    for (int size = this.b.size() - 1; size >= 0; size--) {
                        if (((fsg) this.b.get(size)).a == fseVar) {
                            this.b.remove(size);
                            break;
                        }
                    }
                    if (this.b.isEmpty()) {
                        if (this.d != null) {
                            this.d.a(this.c);
                        }
                        this.b = null;
                    }
                }
            }
        }
    }

    static Object a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
        return obj;
    }
}
