package flm;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ng implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ Map b;

    ng(ne neVar, ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            String strM = ti.m(view);
            if (strM != null) {
                Iterator it = this.b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (strM.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                ti.a(view, str);
            }
        }
    }
}
