package flm;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ccf {
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public abstract void a(cbw cbwVar, Bundle bundle, ccc cccVar);

    public abstract boolean a();

    public abstract cbw b();

    public final void a(int i, int i2) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((cch) it.next()).a(this, i, i2);
        }
    }
}
