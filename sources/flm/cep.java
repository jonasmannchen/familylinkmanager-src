package flm;

import android.content.Context;
import android.database.CursorWindow;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cep {
    private static ExecutorService c = bur.a;
    public final Context a;
    public final KidSetupViewModel b;
    private final big d = bij.a;
    private Future e = null;
    private as f;

    cep(KidSetupViewModel kidSetupViewModel) {
        this.b = (KidSetupViewModel) dvl.a(kidSetupViewModel);
        this.a = kidSetupViewModel.a.getApplicationContext();
    }

    protected abstract String a();

    protected abstract Object b();

    public final synchronized void a(as asVar) {
        synchronized (this) {
            dvl.b(this.e == null, "Task already scheduled.");
            this.f = asVar;
            if (asVar != null) {
                asVar.b(new cgu(cgv.PENDING, 0.0f, null, null));
            }
            btv.c("KidSetup", "%s scheduled.", a());
            this.e = c.submit(new Callable(this) { // from class: flm.ceq
                private final cep a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c();
                }
            });
        }
    }

    final cgu c() {
        cgu cguVar;
        if (this.f != null) {
            this.f.a(new cgu(cgv.STARTED, 0.0f, null, null));
        }
        btv.c("KidSetup", "%s started.", a());
        try {
            cguVar = new cgu(cgv.SUCCESSFUL, 0.0f, b(), null);
            btv.c("KidSetup", "%s finished.", a());
        } catch (Exception e) {
            btv.c("KidSetup", e, "%s failed in background.", a());
            cguVar = new cgu(cgv.FAILED, 0.0f, null, (Exception) dvl.a(e));
        }
        if (this.f != null) {
            this.f.a(cguVar);
        }
        return cguVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[SYNTHETIC] */
    protected final void a(elz elzVar) throws Throwable {
        Throwable th;
        cij cijVarD = this.b.d();
        CursorWindow cursorWindowA = btc.a(elzVar);
        try {
            this.b.b().logToClearcutFromUi(302, cursorWindowA, cijVarD.e, this.d.a(), this.d.b());
            if (cursorWindowA != null) {
                cursorWindowA.close();
            }
        } catch (Throwable th2) {
            th = th2;
            th = null;
            if (cursorWindowA != null) {
                throw th;
            }
            if (th == null) {
                cursorWindowA.close();
                throw th;
            }
            cursorWindowA.close();
            throw th;
        }
    }
}
