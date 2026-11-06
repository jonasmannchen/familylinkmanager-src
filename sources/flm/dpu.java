package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpu {
    public final dps b;
    public final List d;
    public final AtomicInteger a = new AtomicInteger(0);
    public final Map c = new ConcurrentHashMap();

    dpu(String str) {
        new dpw(this);
        this.d = new ArrayList();
        this.b = dps.a(str, dp.R, Thread.currentThread().getId(), dp.V);
    }

    public final dps a() {
        Comparator comparator = dpv.a;
        synchronized (this.d) {
            Collections.sort(this.d, comparator);
            this.b.a(this.d);
        }
        ArrayList arrayList = new ArrayList(this.c.keySet());
        Collections.sort(arrayList, comparator);
        this.b.a(arrayList);
        return this.b;
    }
}
