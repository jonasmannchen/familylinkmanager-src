package flm;

import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dge {
    public static volatile dge a;
    public final dgf b = new dgf();

    public static dge a(Application application) {
        if (a == null) {
            synchronized (dge.class) {
                if (a == null) {
                    dge dgeVar = new dge();
                    dgf dgfVar = dgeVar.b;
                    application.registerActivityLifecycleCallbacks(dgfVar.a);
                    application.registerComponentCallbacks(dgfVar.a);
                    a = dgeVar;
                }
            }
        }
        return a;
    }

    private dge() {
    }

    public final void a(dft dftVar) {
        dgf dgfVar = this.b;
        dse.a(dftVar);
        dgfVar.a.a.add(dftVar);
    }

    public final void b(dft dftVar) {
        dgf dgfVar = this.b;
        dse.a(dftVar);
        dgfVar.a.a.remove(dftVar);
    }
}
