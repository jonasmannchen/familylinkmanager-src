package flm;

import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class djd implements dgb, dlx {
    public final dmb a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    private final dge d;

    djd(dge dgeVar, dmb dmbVar) {
        this.d = dgeVar;
        this.a = dmbVar;
        dgeVar.a(this);
    }

    @Override // flm.dlx
    public final void g_() {
        this.d.b(this);
    }

    @Override // flm.dgb
    public final void b() {
        synchronized (this.b) {
            if (!this.c) {
                this.c = true;
                this.d.b(this);
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ScheduledExecutorService) this.a.a()).submit((Runnable) arrayList.get(i));
                }
                this.b.clear();
            }
        }
    }
}
