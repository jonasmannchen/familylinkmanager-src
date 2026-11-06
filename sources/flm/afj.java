package flm;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afj implements aib {
    private final /* synthetic */ RecyclerView a;

    public afj(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // flm.aib
    public final void a(agm agmVar, aft aftVar, aft aftVar2) {
        this.a.d.b(agmVar);
        RecyclerView recyclerView = this.a;
        recyclerView.a(agmVar);
        agmVar.a(false);
        if (recyclerView.y.a(agmVar, aftVar, aftVar2)) {
            recyclerView.l();
        }
    }

    @Override // flm.aib
    public final void b(agm agmVar, aft aftVar, aft aftVar2) {
        RecyclerView recyclerView = this.a;
        agmVar.a(false);
        if (recyclerView.y.b(agmVar, aftVar, aftVar2)) {
            recyclerView.l();
        }
    }

    @Override // flm.aib
    public final void c(agm agmVar, aft aftVar, aft aftVar2) {
        agmVar.a(false);
        if (this.a.t) {
            if (this.a.y.a(agmVar, agmVar, aftVar, aftVar2)) {
                this.a.l();
            }
        } else if (this.a.y.c(agmVar, aftVar, aftVar2)) {
            this.a.l();
        }
    }

    @Override // flm.aib
    public final void a(agm agmVar) {
        afw afwVar = this.a.k;
        View view = agmVar.a;
        agf agfVar = this.a.d;
        acw acwVar = afwVar.e;
        int iA = acwVar.a.a(view);
        if (iA >= 0) {
            if (acwVar.b.d(iA)) {
                acwVar.b(view);
            }
            acwVar.a.a(iA);
        }
        agfVar.a(view);
    }
}
