package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class agx extends afq {
    private boolean a = true;

    public abstract boolean a(agm agmVar);

    public abstract boolean a(agm agmVar, int i, int i2, int i3, int i4);

    public abstract boolean a(agm agmVar, agm agmVar2, int i, int i2, int i3, int i4);

    public abstract boolean b(agm agmVar);

    @Override // flm.afq
    public final boolean g(agm agmVar) {
        return !this.a || agmVar.j();
    }

    @Override // flm.afq
    public final boolean a(agm agmVar, aft aftVar, aft aftVar2) {
        int i = aftVar.a;
        int i2 = aftVar.b;
        View view = agmVar.a;
        int left = aftVar2 == null ? view.getLeft() : aftVar2.a;
        int top = aftVar2 == null ? view.getTop() : aftVar2.b;
        if (!agmVar.m() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return a(agmVar, i, i2, left, top);
        }
        return a(agmVar);
    }

    @Override // flm.afq
    public final boolean b(agm agmVar, aft aftVar, aft aftVar2) {
        return (aftVar == null || (aftVar.a == aftVar2.a && aftVar.b == aftVar2.b)) ? b(agmVar) : a(agmVar, aftVar.a, aftVar.b, aftVar2.a, aftVar2.b);
    }

    @Override // flm.afq
    public final boolean c(agm agmVar, aft aftVar, aft aftVar2) {
        if (aftVar.a != aftVar2.a || aftVar.b != aftVar2.b) {
            return a(agmVar, aftVar.a, aftVar.b, aftVar2.a, aftVar2.b);
        }
        f(agmVar);
        return false;
    }

    @Override // flm.afq
    public final boolean a(agm agmVar, agm agmVar2, aft aftVar, aft aftVar2) {
        int i;
        int i2;
        int i3 = aftVar.a;
        int i4 = aftVar.b;
        if (agmVar2.b()) {
            i = aftVar.a;
            i2 = aftVar.b;
        } else {
            i = aftVar2.a;
            i2 = aftVar2.b;
        }
        return a(agmVar, agmVar2, i3, i4, i, i2);
    }
}
