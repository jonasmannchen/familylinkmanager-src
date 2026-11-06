package flm;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nh implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ Map b;

    nh(ne neVar, ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            ti.a(view, (String) this.b.get(ti.m(view)));
        }
    }
}
