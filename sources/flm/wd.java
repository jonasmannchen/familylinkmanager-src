package flm;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wd implements th {
    private final /* synthetic */ wb a;

    wd(wb wbVar) {
        this.a = wbVar;
    }

    @Override // flm.th
    public final tz a(View view, tz tzVar) {
        int iB = tzVar.b();
        int iF = this.a.f(iB);
        if (iB != iF) {
            tzVar = new tz(((WindowInsets) tzVar.a).replaceSystemWindowInsets(tzVar.a(), iF, tzVar.c(), tzVar.d()));
        }
        return ti.a(view, tzVar);
    }
}
