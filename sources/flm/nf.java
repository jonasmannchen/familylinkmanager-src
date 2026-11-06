package flm;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nf implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ ArrayList c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ ArrayList e;

    nf(ne neVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a) {
                return;
            }
            ti.a((View) this.b.get(i2), (String) this.c.get(i2));
            ti.a((View) this.d.get(i2), (String) this.e.get(i2));
            i = i2 + 1;
        }
    }
}
