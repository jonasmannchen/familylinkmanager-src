package flm;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afu implements afs {
    private final /* synthetic */ RecyclerView a;

    public afu(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // flm.afs
    public final void a(agm agmVar) {
        boolean z;
        agmVar.a(true);
        if (agmVar.h != null && agmVar.i == null) {
            agmVar.h = null;
        }
        agmVar.i = null;
        if (!((agmVar.j & 16) != 0)) {
            RecyclerView recyclerView = this.a;
            View view = agmVar.a;
            recyclerView.d();
            acw acwVar = recyclerView.f;
            int iA = acwVar.a.a(view);
            if (iA == -1) {
                acwVar.b(view);
                z = true;
            } else if (acwVar.b.c(iA)) {
                acwVar.b.d(iA);
                acwVar.b(view);
                acwVar.a.a(iA);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                agm agmVarC = RecyclerView.c(view);
                recyclerView.d.b(agmVarC);
                recyclerView.d.a(agmVarC);
            }
            recyclerView.a(z ? false : true);
            if (!z && agmVar.n()) {
                this.a.removeDetachedView(agmVar.a, false);
            }
        }
    }
}
