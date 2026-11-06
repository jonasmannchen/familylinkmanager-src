package flm;

import android.app.Activity;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgy implements dhb {
    public final /* synthetic */ dgx a;

    dgy(dgx dgxVar) {
        this.a = dgxVar;
    }

    @Override // flm.dfz
    public final void a(Activity activity) {
        dim dimVar;
        dgx dgxVar = this.a;
        Class<?> cls = activity.getClass();
        if (TextUtils.isEmpty(null)) {
            dimVar = new dim(cls.getSimpleName());
        } else {
            String strValueOf = String.valueOf((Object) null);
            String strValueOf2 = String.valueOf(cls.getSimpleName());
            dimVar = new dim(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        }
        dgxVar.a(dimVar);
    }

    @Override // flm.dgb
    public final void b() {
        this.a.a((dim) null);
        if (this.a.d.get()) {
            this.a.c().submit(new dgz(this));
        }
    }
}
