package flm;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hc {
    public final WeakReference a;
    public int b;
    public boolean c;

    public hc(int i, hb hbVar) {
        this.a = new WeakReference(hbVar);
        this.b = i;
    }

    final boolean a(hb hbVar) {
        return hbVar != null && this.a.get() == hbVar;
    }
}
