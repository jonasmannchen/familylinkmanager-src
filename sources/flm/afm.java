package flm;

import android.os.Trace;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class afm {
    public final afn a = new afn();
    public boolean b = false;

    public abstract int a();

    public abstract agm a(ViewGroup viewGroup, int i);

    public abstract void a(agm agmVar, int i);

    public final agm b(ViewGroup viewGroup, int i) {
        try {
            qs.a("RV CreateView");
            agm agmVarA = a(viewGroup, i);
            if (agmVarA.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            agmVarA.f = i;
            Trace.endSection();
            return agmVarA;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public int a(int i) {
        return 0;
    }

    public long b(int i) {
        return -1L;
    }

    public final void a(afo afoVar) {
        this.a.registerObserver(afoVar);
    }
}
