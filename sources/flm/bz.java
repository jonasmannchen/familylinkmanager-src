package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bz implements bp {
    private final ca a;

    bz(Context context, String str, bq bqVar) {
        this.a = new ca(context, str, new bx[1], bqVar);
    }

    @Override // flm.bp
    public final bo a() {
        return this.a.a();
    }

    @Override // flm.bp
    public final void b() {
        this.a.close();
    }
}
