package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmc implements bmh {
    @Override // flm.bmh
    public final bmj a(Context context, String str, bmi bmiVar) {
        bmj bmjVar = new bmj();
        bmjVar.a = bmiVar.a(context, str);
        if (bmjVar.a != 0) {
            bmjVar.b = bmiVar.a(context, str, false);
        } else {
            bmjVar.b = bmiVar.a(context, str, true);
        }
        if (bmjVar.a == 0 && bmjVar.b == 0) {
            bmjVar.c = 0;
        } else if (bmjVar.b >= bmjVar.a) {
            bmjVar.c = 1;
        } else {
            bmjVar.c = -1;
        }
        return bmjVar;
    }
}
