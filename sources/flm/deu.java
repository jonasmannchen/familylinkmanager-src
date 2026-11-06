package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class deu extends bjj {
    private bji b = null;

    @Override // flm.bjj
    public final synchronized bji a(Context context) {
        bji bjiVar;
        if (this.b != null) {
            bjiVar = this.b;
        } else {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            if (biw.d()) {
                this.b = new des(context);
            } else {
                this.b = new det(context);
            }
            bjiVar = this.b;
        }
        return bjiVar;
    }
}
