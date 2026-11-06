package flm;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mw implements Runnable {
    private final /* synthetic */ lg a;
    private final /* synthetic */ lg b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ rt d;
    private final /* synthetic */ View e;
    private final /* synthetic */ ne f;
    private final /* synthetic */ Rect g;

    mw(lg lgVar, lg lgVar2, boolean z, rt rtVar, View view, ne neVar, Rect rect) {
        this.a = lgVar;
        this.b = lgVar2;
        this.c = z;
        this.d = rtVar;
        this.e = view;
        this.f = neVar;
        this.g = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mt.a(this.a, this.b, this.c, this.d, false);
        if (this.e != null) {
            ne.a(this.e, this.g);
        }
    }
}
