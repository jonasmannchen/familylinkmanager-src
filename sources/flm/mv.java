package flm;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mv implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ ne b;
    private final /* synthetic */ View c;
    private final /* synthetic */ lg d;
    private final /* synthetic */ ArrayList e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ ArrayList g;
    private final /* synthetic */ Object h;

    mv(Object obj, ne neVar, View view, lg lgVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.a = obj;
        this.b = neVar;
        this.c = view;
        this.d = lgVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != null) {
            this.b.c(this.a, this.c);
            this.f.addAll(mt.a(this.b, this.a, this.d, this.e, this.c));
        }
        if (this.g != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c);
                this.b.b(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.c);
        }
    }
}
