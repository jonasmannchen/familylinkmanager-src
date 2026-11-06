package flm;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gca {
    private final HashSet a = new HashSet();

    public abstract void b();

    public abstract void c();

    public final void a(Object obj, boolean z) {
        int size = this.a.size();
        if (z) {
            this.a.add(obj);
            if (size == 0) {
                b();
                return;
            }
            return;
        }
        if (this.a.remove(obj) && size == 1) {
            c();
        }
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }
}
