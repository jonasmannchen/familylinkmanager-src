package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dv {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public dv(dr drVar) {
        this.a = drVar.t;
        this.b = drVar.u;
        this.c = drVar.c();
        this.d = drVar.f();
        ArrayList arrayListL = drVar.l();
        int size = arrayListL.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new dw((dq) arrayListL.get(i)));
        }
    }
}
