package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzk {
    private ArrayList a = new ArrayList();
    private volatile fsa b = fsa.IDLE;

    fzk() {
    }

    final void a(fsa fsaVar) {
        dvl.a(fsaVar, "newState");
        if (this.b != fsaVar && this.b != fsa.SHUTDOWN) {
            this.b = fsaVar;
            if (!this.a.isEmpty()) {
                ArrayList arrayList = this.a;
                this.a = new ArrayList();
                ArrayList arrayList2 = arrayList;
                if (0 < arrayList2.size()) {
                    arrayList2.get(0);
                    throw new NoSuchMethodError();
                }
            }
        }
    }
}
