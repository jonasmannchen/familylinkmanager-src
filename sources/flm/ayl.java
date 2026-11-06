package flm;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayl extends auf implements atz {
    public final WeakReference f;
    public final ayn g;
    public auc a = null;
    public ayl b = null;
    public volatile aua c = null;
    public att d = null;
    public final Object e = new Object();
    private Status h = null;
    private boolean i = false;

    public ayl(WeakReference weakReference) {
        bdi.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.f = weakReference;
        atp atpVar = (atp) this.f.get();
        this.g = new ayn(this, atpVar != null ? atpVar.a() : Looper.getMainLooper());
    }

    public final auf a(auc aucVar) {
        ayl aylVar;
        synchronized (this.e) {
            bdi.checkState(this.a == null, "Cannot call then() twice.");
            aua auaVar = this.c;
            bdi.checkState(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.a = aucVar;
            aylVar = new ayl(this.f);
            this.b = aylVar;
            a();
        }
        return aylVar;
    }

    @Override // flm.atz
    public final void a(aty atyVar) {
        synchronized (this.e) {
            if (atyVar.b().a()) {
                if (this.a != null) {
                    axx.a.submit(new aym(this, atyVar));
                } else if (b()) {
                    this.c.a();
                }
            } else {
                a(atyVar.b());
                b(atyVar);
            }
        }
    }

    final void a() {
        if (this.a != null) {
            atp atpVar = (atp) this.f.get();
            if (!this.i && this.a != null && atpVar != null) {
                atpVar.a(this);
                this.i = true;
            }
            if (this.h != null) {
                b(this.h);
                return;
            } else {
                if (this.d != null) {
                    this.d.setResultCallback(this);
                    return;
                }
                return;
            }
        }
        aua auaVar = this.c;
    }

    final void a(Status status) {
        synchronized (this.e) {
            this.h = status;
            b(this.h);
        }
    }

    private final void b(Status status) {
        synchronized (this.e) {
            if (this.a != null) {
                throw new NoSuchMethodError();
            }
            if (b()) {
                this.c.b();
            }
        }
    }

    private final boolean b() {
        this.f.get();
        aua auaVar = this.c;
        return false;
    }

    static void b(aty atyVar) {
        if (atyVar instanceof atv) {
            try {
                ((atv) atyVar).a();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(atyVar);
                Log.w("TransformedResultImpl", new StringBuilder(String.valueOf(strValueOf).length() + 18).append("Unable to release ").append(strValueOf).toString(), e);
            }
        }
    }
}
