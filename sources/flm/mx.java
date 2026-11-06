package flm;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mx implements Runnable {
    private final /* synthetic */ ne a;
    private final /* synthetic */ rt b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ my d;
    private final /* synthetic */ ArrayList e;
    private final /* synthetic */ View f;
    private final /* synthetic */ lg g;
    private final /* synthetic */ lg h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ ArrayList j;
    private final /* synthetic */ Object k;
    private final /* synthetic */ Rect l;

    mx(ne neVar, rt rtVar, Object obj, my myVar, ArrayList arrayList, View view, lg lgVar, lg lgVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.a = neVar;
        this.b = rtVar;
        this.c = obj;
        this.d = myVar;
        this.e = arrayList;
        this.f = view;
        this.g = lgVar;
        this.h = lgVar2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rt rtVarA = mt.a(this.a, this.b, this.c, this.d);
        if (rtVarA != null) {
            this.e.addAll(rtVarA.values());
            this.e.add(this.f);
        }
        mt.a(this.g, this.h, this.i, rtVarA, false);
        if (this.c != null) {
            this.a.a(this.c, this.j, this.e);
            View viewA = mt.a(rtVarA, this.d, this.k, this.i);
            if (viewA != null) {
                ne.a(viewA, this.l);
            }
        }
    }
}
