package flm;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aen {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int i;
    public boolean k;
    public boolean a = true;
    public int h = 0;
    public List j = null;

    aen() {
    }

    final boolean a(agk agkVar) {
        return this.d >= 0 && this.d < agkVar.a();
    }

    final View a(agf agfVar) {
        if (this.j != null) {
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                View view = ((agm) this.j.get(i)).a;
                aga agaVar = (aga) view.getLayoutParams();
                if (!agaVar.c.m() && this.d == agaVar.c.c()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = agfVar.a(this.d, false, Long.MAX_VALUE).a;
        this.d += this.e;
        return view2;
    }

    public final void a(View view) {
        View view2;
        int iC;
        View view3;
        int size = this.j.size();
        View view4 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                view2 = view4;
                break;
            }
            view2 = ((agm) this.j.get(i2)).a;
            aga agaVar = (aga) view2.getLayoutParams();
            if (view2 != view && !agaVar.c.m() && (iC = (agaVar.c.c() - this.d) * this.e) >= 0 && iC < i) {
                if (iC == 0) {
                    break;
                } else {
                    view3 = view2;
                }
            } else {
                iC = i;
                view3 = view4;
            }
            i2++;
            view4 = view3;
            i = iC;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((aga) view2.getLayoutParams()).c.c();
        }
    }
}
