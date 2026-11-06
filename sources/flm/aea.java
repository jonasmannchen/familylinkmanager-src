package flm;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aea implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    private static Comparator f = new aeb();
    public long c;
    private long d;
    public ArrayList b = new ArrayList();
    private ArrayList e = new ArrayList();

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.d == 0) {
            this.d = RecyclerView.o();
            recyclerView.post(this);
        }
        aec aecVar = recyclerView.B;
        aecVar.a = i;
        aecVar.b = i2;
    }

    private static agm a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int iB = recyclerView.f.b();
        int i2 = 0;
        while (true) {
            if (i2 >= iB) {
                z = false;
                break;
            }
            agm agmVarC = RecyclerView.c(recyclerView.f.c(i2));
            if (agmVarC.c == i && !agmVarC.j()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        agf agfVar = recyclerView.d;
        try {
            recyclerView.i();
            agm agmVarA = agfVar.a(i, false, j);
            if (agmVarA != null) {
                if (agmVarA.l() && !agmVarA.j()) {
                    agfVar.a(agmVarA.a);
                } else {
                    agfVar.a(agmVarA, false);
                }
            }
            return agmVarA;
        } finally {
            recyclerView.b(false);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x019f */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.aea.run():void");
    }
}
