package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aus {
    private int d;
    private final rt c = new rt();
    public final dbk b = new dbk();
    private boolean e = false;
    public final rt a = new rt();

    public aus(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((atm) it.next()).b, null);
        }
        this.d = this.a.keySet().size();
    }

    public final void a(aup aupVar, apx apxVar, String str) {
        this.a.put(aupVar, apxVar);
        this.c.put(aupVar, str);
        this.d--;
        if (!apxVar.b()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.b.a((Exception) new atk(this.a));
            } else {
                this.b.a(this.c);
            }
        }
    }
}
