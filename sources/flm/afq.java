package flm;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class afq {
    public afs h = null;
    private ArrayList a = new ArrayList();
    public long i = 120;
    public long j = 120;
    public long k = 250;
    public long l = 250;

    public abstract void a();

    public abstract boolean a(agm agmVar, aft aftVar, aft aftVar2);

    public abstract boolean a(agm agmVar, agm agmVar2, aft aftVar, aft aftVar2);

    public abstract boolean b();

    public abstract boolean b(agm agmVar, aft aftVar, aft aftVar2);

    public abstract void c(agm agmVar);

    public abstract boolean c(agm agmVar, aft aftVar, aft aftVar2);

    public abstract void d();

    public final aft d(agm agmVar) {
        aft aftVar = new aft();
        View view = agmVar.a;
        aftVar.a = view.getLeft();
        aftVar.b = view.getTop();
        view.getRight();
        view.getBottom();
        return aftVar;
    }

    public static int e(agm agmVar) {
        int i = agmVar.j & 14;
        if (agmVar.j()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i2 = agmVar.d;
            int iD = agmVar.d();
            if (i2 != -1 && iD != -1 && i2 != iD) {
                return i | 2048;
            }
            return i;
        }
        return i;
    }

    public final void f(agm agmVar) {
        if (this.h != null) {
            this.h.a(agmVar);
        }
    }

    public boolean g(agm agmVar) {
        return true;
    }

    public boolean a(agm agmVar, List list) {
        return g(agmVar);
    }

    public final void e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((afr) this.a.get(i)).a();
        }
        this.a.clear();
    }
}
