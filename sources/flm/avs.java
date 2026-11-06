package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class avs extends aux {
    public final rv a;
    public awt e;

    public avs(axm axmVar) {
        super(axmVar);
        this.a = new rv();
        this.f.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // flm.aux, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a() {
        super.a();
        g();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e() {
        super.e();
        g();
    }

    @Override // flm.aux, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b() {
        super.b();
        awt awtVar = this.e;
        synchronized (awt.f) {
            if (awtVar.m == this) {
                awtVar.m = null;
                awtVar.n.clear();
            }
        }
    }

    @Override // flm.aux
    protected final void a(apx apxVar, int i) {
        this.e.b(apxVar, i);
    }

    @Override // flm.aux
    protected final void c() {
        this.e.b();
    }

    private final void g() {
        if (!this.a.isEmpty()) {
            this.e.a(this);
        }
    }
}
