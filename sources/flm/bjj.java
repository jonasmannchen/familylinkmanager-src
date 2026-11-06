package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bjj {
    public static bjj a = new bjj();
    private bji b = null;

    public static void a(bjj bjjVar) {
        a = bjjVar;
    }

    public synchronized bji a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new bji(context);
        }
        return this.b;
    }
}
