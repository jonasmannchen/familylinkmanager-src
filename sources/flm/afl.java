package flm;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afl implements abh {
    private final /* synthetic */ RecyclerView a;

    public afl(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // flm.abh
    public final agm a(int i) {
        agm agmVarC;
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.f.b();
        int i2 = 0;
        agm agmVar = null;
        while (true) {
            if (i2 >= iB) {
                agmVarC = agmVar;
                break;
            }
            agmVarC = RecyclerView.c(recyclerView.f.c(i2));
            if (agmVarC != null && !agmVarC.m() && agmVarC.c == i) {
                if (!recyclerView.f.d(agmVarC.a)) {
                    break;
                }
            } else {
                agmVarC = agmVar;
            }
            i2++;
            agmVar = agmVarC;
        }
        if (agmVarC == null || this.a.f.d(agmVarC.a)) {
            return null;
        }
        return agmVarC;
    }

    @Override // flm.abh
    public final void a(int i, int i2) {
        this.a.a(i, i2, true);
        this.a.E = true;
        this.a.C.c += i2;
    }

    @Override // flm.abh
    public final void b(int i, int i2) {
        this.a.a(i, i2, false);
        this.a.E = true;
    }

    @Override // flm.abh
    public final void a(int i, int i2, Object obj) {
        int i3;
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.f.b();
        int i4 = i + i2;
        for (int i5 = 0; i5 < iB; i5++) {
            View viewC = recyclerView.f.c(i5);
            agm agmVarC = RecyclerView.c(viewC);
            if (agmVarC != null && !agmVarC.b() && agmVarC.c >= i && agmVarC.c < i4) {
                agmVarC.b(2);
                agmVarC.a(obj);
                ((aga) viewC.getLayoutParams()).e = true;
            }
        }
        agf agfVar = recyclerView.d;
        int i6 = i + i2;
        for (int size = agfVar.c.size() - 1; size >= 0; size--) {
            agm agmVar = (agm) agfVar.c.get(size);
            if (agmVar != null && (i3 = agmVar.c) >= i && i3 < i6) {
                agmVar.b(2);
                agfVar.b(size);
            }
        }
        this.a.F = true;
    }

    @Override // flm.abh
    public final void a(abi abiVar) {
        c(abiVar);
    }

    private final void c(abi abiVar) {
        switch (abiVar.a) {
            case 1:
                this.a.k.a();
                break;
            case 2:
                this.a.k.c();
                break;
            case 4:
                this.a.k.a(this.a, abiVar.b, abiVar.d);
                break;
            case 8:
                this.a.k.d();
                break;
        }
    }

    @Override // flm.abh
    public final void b(abi abiVar) {
        c(abiVar);
    }

    @Override // flm.abh
    public final void c(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.f.b();
        for (int i3 = 0; i3 < iB; i3++) {
            agm agmVarC = RecyclerView.c(recyclerView.f.c(i3));
            if (agmVarC != null && !agmVarC.b() && agmVarC.c >= i) {
                agmVarC.a(i2, false);
                recyclerView.C.f = true;
            }
        }
        agf agfVar = recyclerView.d;
        int size = agfVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            agm agmVar = (agm) agfVar.c.get(i4);
            if (agmVar != null && agmVar.c >= i) {
                agmVar.a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.a.E = true;
    }

    @Override // flm.abh
    public final void d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = -1;
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.f.b();
        if (i < i2) {
            i3 = -1;
            i4 = i2;
            i5 = i;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i9 = 0; i9 < iB; i9++) {
            agm agmVarC = RecyclerView.c(recyclerView.f.c(i9));
            if (agmVarC != null && agmVarC.c >= i5 && agmVarC.c <= i4) {
                if (agmVarC.c == i) {
                    agmVarC.a(i2 - i, false);
                } else {
                    agmVarC.a(i3, false);
                }
                recyclerView.C.f = true;
            }
        }
        agf agfVar = recyclerView.d;
        if (i < i2) {
            i6 = i2;
            i7 = i;
        } else {
            i8 = 1;
            i6 = i;
            i7 = i2;
        }
        int size = agfVar.c.size();
        for (int i10 = 0; i10 < size; i10++) {
            agm agmVar = (agm) agfVar.c.get(i10);
            if (agmVar != null && agmVar.c >= i7 && agmVar.c <= i6) {
                if (agmVar.c == i) {
                    agmVar.a(i2 - i, false);
                } else {
                    agmVar.a(i8, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.E = true;
    }
}
